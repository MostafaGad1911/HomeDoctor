package homedoctor.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.appizona.yehiahd.fastsave.FastSave
import homedoctor.models.Detail
import homedoctor.viewmodel.HomeDoctorViewModel
import homedoctor.views.results_view
import mostafa.projects.dagger2.Component.DaggerMainComponent
import mostafa.projects.dagger2.Component.MainComponent
import projects.mostafagad.Diploma.R
import projects.mostafagad.Diploma.databinding.ActivityResultsBinding

class Results : AppCompatActivity() , results_view , View.OnClickListener{

    lateinit var mail:TextView
    lateinit var glucose:EditText
    lateinit var blood:EditText
    lateinit var respiration:EditText
    lateinit var heart:EditText
    lateinit var temp:EditText
    lateinit var logout:ImageView
    lateinit var loading_lyt:LinearLayout

    var mails:String = ""
    var glucoseV:String = ""
    var bloodV:String = ""
    var respirationV:String = ""
    lateinit var mainComponent: MainComponent

    var heartV:String = ""
    var tempV:String = ""
    var doubleBackToExitPressedOnce: Boolean = false
    private lateinit var binding: ActivityResultsBinding
    lateinit var submitBtn:Button
    lateinit var homeDoctorViewModel: HomeDoctorViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_results)
        binding.details = Detail("" , "" , "" , "" , "" , "" , "")
        initViews()
        initObjects()
        submitBtn.setOnClickListener(this)
        logout.setOnClickListener(this)
        observeResults()

    }

    override fun initViews() {
        mail = findViewById(R.id.mail)
        glucose = findViewById(R.id.glucose)
        blood = findViewById(R.id.blood)
        respiration = findViewById(R.id.respiration)
        heart = findViewById(R.id.heart)
        temp = findViewById(R.id.temp)
        loading_lyt = findViewById(R.id.loading_lyt)
        submitBtn = findViewById(R.id.submitBtn)
        logout = findViewById(R.id.logout)
    }

    override fun initObjects() {
        mainComponent = DaggerMainComponent.create()
        homeDoctorViewModel = mainComponent.connect().provideViewModel(this)
        mails = intent.getStringExtra("email")
        mail.text = mails
    }

    override fun observeResults() {
        homeDoctorViewModel.UResults_result.observe(this , Observer {
            hideLoading()
            if(it == 0){
                Toast.makeText(this , "Request failed .. " , Toast.LENGTH_SHORT).show()
            }else if(it == 1){
                Toast.makeText(this , "Request success .. " , Toast.LENGTH_SHORT).show()
            }else if(it == 2){
                Toast.makeText(this , "Email not found .. " , Toast.LENGTH_SHORT).show()
            }
        })
    }

    override fun observeResultsError() {
        homeDoctorViewModel.EResults_result.observe(this , Observer {
            hideLoading()
            Toast.makeText(this , it , Toast.LENGTH_SHORT).show()
        })
    }

    override fun onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            this.finishAffinity()
            return
        } else {
            this.doubleBackToExitPressedOnce = true
            Toast.makeText(this , "Click again to exit" , Toast.LENGTH_SHORT).show()
            Handler().postDelayed(Runnable { doubleBackToExitPressedOnce = false } , 2000)
        }
    }
    override fun sendResults() {
        glucoseV = glucose.text.toString().trim()
        bloodV = blood.text.toString().trim()
        respirationV = respiration.text.toString().trim()
        heartV = heart.text.toString().trim()
        tempV = temp.text.toString().trim()

        if(glucoseV.isNullOrBlank()){
            glucoseV = ""
        }else if(bloodV.isNullOrBlank()){
            bloodV = ""
        }else if(respirationV.isNullOrBlank()){
            respirationV = ""
        }else if(heartV.isNullOrBlank()){
            heartV = ""
        }else if(tempV.isNullOrBlank()){
            tempV = ""
        }

        if(mail.text.toString().isNullOrBlank()){
            Toast.makeText(this , "fill empty mail.." , Toast.LENGTH_SHORT).show()
        }else if(glucose.text.toString().isNullOrBlank() && blood.text.toString().isNullOrBlank() && respiration.text.toString().isNullOrBlank() && heart.text.toString().isNullOrBlank() && temp.text.toString().isNullOrBlank()){
            Toast.makeText(this , "You should fill one field at least" , Toast.LENGTH_SHORT).show()
        }else{
            showLoading()
            homeDoctorViewModel.sendResults(email = mails , glucose = glucoseV , temperature = tempV , heart = heartV , respire = respirationV , pressure = bloodV)
        }
    }

    override fun showLoading() {
        loading_lyt.visibility = View.VISIBLE
    }

    override fun hideLoading() {
        loading_lyt.visibility = View.GONE
    }

    override fun onClick(p0: View?) {
        when(p0!!.id){
            R.id.submitBtn -> {
                 sendResults()

            }
            R.id.logout -> {
                FastSave.getInstance().deleteValue("mail")
                FastSave.getInstance().deleteValue("password")
                startActivity(Intent(this , Login::class.java))
            }
        }
    }
}

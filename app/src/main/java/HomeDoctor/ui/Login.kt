package HomeDoctor.ui

import HomeDoctor.ViewModel.HomeDoctorViewModel
import HomeDoctor.Views.login_view
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.appizona.yehiahd.fastsave.FastSave
import com.jaredrummler.materialspinner.MaterialSpinner
import projects.mostafagad.Diploma.R

class Login : AppCompatActivity(), login_view  , View.OnClickListener{

    lateinit var maillogin: EditText
    lateinit var passwordlogin: EditText
    lateinit var special_spinner: MaterialSpinner
    lateinit var register_txt: TextView
    lateinit var loading_lyt:LinearLayout

    lateinit var specialists: Array<String>
    lateinit var homeDoctorViewModel: HomeDoctorViewModel
    var mail: String = ""
    var password: String = ""
    var doubleBackToExitPressedOnce: Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initViews()
        initObjects()
        fill_spinner()
        special_spinner.setOnItemSelectedListener(MaterialSpinner.OnItemSelectedListener<Any?> { view, position, id, item ->
            mail = maillogin.text.toString().trim()
            password = passwordlogin.text.toString().trim()
            if (position == 1) {
                if (mail.isNullOrBlank()) {
                    Toast.makeText(this@Login, "fill empty mail", Toast.LENGTH_SHORT).show()
                } else if (password.isNullOrBlank()) {
                    Toast.makeText(this@Login, "fill empty password", Toast.LENGTH_SHORT).show()
                } else {
                    showLoading()
                    observerError()
                    homeDoctorViewModel.Ulogin(mail = mail, password = password)
                }
                observeULogin()
            } else if (position == 2) {
                if (mail.isNullOrBlank()) {
                    Toast.makeText(this@Login, "fill empty mail", Toast.LENGTH_SHORT).show()
                } else if (password.isNullOrBlank()) {
                    Toast.makeText(this@Login, "fill empty password", Toast.LENGTH_SHORT).show()
                } else {
                    showLoading()
                    observerError()
                    homeDoctorViewModel.Dlogin(mail = mail, password = password)
                }
                observeDLogin()
            }

        })



    }

    override fun initViews() {
        maillogin = findViewById(R.id.maillogin)
        passwordlogin = findViewById(R.id.passwordlogin)
        special_spinner = findViewById(R.id.spinner)
        register_txt = findViewById(R.id.register_txt)
        loading_lyt = findViewById(R.id.loading_lyt)
        register_txt.setOnClickListener(this)

    }

    override fun initObjects() {
        homeDoctorViewModel = ViewModelProviders.of(this).get(HomeDoctorViewModel::class.java)
        if(FastSave.getInstance().isKeyExists("mail") && FastSave.getInstance().isKeyExists("password") ){
            maillogin.setText(FastSave.getInstance().getString("mail" , ""))
            passwordlogin.setText(FastSave.getInstance().getString("password" , ""))
        }
    }

    override fun observeULogin() {
        homeDoctorViewModel.Ulogin_result.observe(this, Observer {
            hideLoading()
            special_spinner.selectedIndex = 0
            if (it == 0) {
                Toast.makeText(this@Login, "Login failed", Toast.LENGTH_SHORT).show()
            } else if (it == 1) {
                Toast.makeText(this@Login, "Login successfully", Toast.LENGTH_SHORT).show()
                FastSave.getInstance().saveString("mail" , maillogin.text.toString().trim())
                FastSave.getInstance().saveString("password" , passwordlogin.text.toString().trim())
                startActivity(Intent(this@Login , Results::class.java))
            } else if (it == 2) {
                Toast.makeText(this@Login, "User not found", Toast.LENGTH_SHORT).show()
            }
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

    override fun observeDLogin() {
        homeDoctorViewModel.Dlogin_result.observe(this, Observer {
            hideLoading()
            special_spinner.selectedIndex = 0
            if (it == 0) {
                Toast.makeText(this@Login, "Login failed", Toast.LENGTH_SHORT).show()
            } else if (it == 1) {
                Toast.makeText(this@Login, "Login successfully", Toast.LENGTH_SHORT).show()
                FastSave.getInstance().saveString("mail" , maillogin.text.toString().trim())
                FastSave.getInstance().saveString("password" , passwordlogin.text.toString().trim())
                startActivity(Intent(this@Login , Details::class.java))
            } else if (it == 2) {
                Toast.makeText(this@Login, "User not found", Toast.LENGTH_SHORT).show()
            }
        })
    }

    override fun observerError() {
        homeDoctorViewModel.Elogin_result.observe(this , Observer {
            hideLoading()
            special_spinner.selectedIndex = 0
            Toast.makeText(this , it , Toast.LENGTH_SHORT).show()
        })
    }


    override fun onResume() {
        super.onResume()
        mail = FastSave.getInstance().getString("mail" , "")
        password = FastSave.getInstance().getString("password" , "")
        if(mail.isNullOrBlank() && password.isNullOrBlank() ){
            maillogin.setText(mail)
            passwordlogin.setText(password)
        }
    }
    override fun fill_spinner() {
        special_spinner.setItems("Account Type", "User", "Doctor")
    }

    override fun showLoading() {
        loading_lyt.visibility = View.VISIBLE
    }

    override fun hideLoading() {
        loading_lyt.visibility = View.GONE
    }

    override fun onClick(p0: View?) {
        when(p0!!.id){
            R.id.register_txt -> {
                startActivity(Intent(this , Register::class.java))
            }
        }
    }
}

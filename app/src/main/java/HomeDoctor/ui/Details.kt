package HomeDoctor.ui

import HomeDoctor.ViewModel.HomeDoctorViewModel
import HomeDoctor.Views.details_view
import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import com.karumi.dexter.Dexter
import mostafa.projects.dagger2.Component.DaggerMainComponent
import mostafa.projects.dagger2.Component.MainComponent
import projects.mostafagad.Diploma.R

class Details : AppCompatActivity() , details_view{

    lateinit var recyclerUsers:RecyclerView
    lateinit var loading_lyt:LinearLayout

    lateinit var mainComponent: MainComponent
    var doubleBackToExitPressedOnce: Boolean = false
    lateinit var homeDoctorViewModel: HomeDoctorViewModel
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_userdetails)
        initViews()
        initObjects()
        prepareRecycler()
        getDetails()
        observeDetails()
        observeDetailsError()
    }

    override fun initViews() {
        recyclerUsers = findViewById(R.id.recyclerUsers)
        loading_lyt = findViewById(R.id.loading_lyt)
    }

    override fun initObjects() {
        homeDoctorViewModel = ViewModelProviders.of(this).get(HomeDoctorViewModel::class.java)
        mainComponent = DaggerMainComponent.create()

    }

    override fun prepareRecycler() {

        recyclerUsers.layoutManager = mainComponent.connect().provideLinearLayoutManager(this)
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

    override fun getDetails() {
        showLoading()
        homeDoctorViewModel.getDetails()
    }

    override fun observeDetails() {
        homeDoctorViewModel.Details_result.observe(this , Observer {
            hideLoading()
            recyclerUsers.adapter = mainComponent.connect().provideDetailsAdapter(this , it)
        })
    }

    override fun observeDetailsError() {
        homeDoctorViewModel.EDetails_result.observe(this , Observer {
            Toast.makeText(this , it , Toast.LENGTH_SHORT).show()
        })
    }

    override fun showLoading() {
        loading_lyt.visibility = View.VISIBLE
    }

    override fun hideLoading() {
        loading_lyt.visibility = View.GONE
    }
}
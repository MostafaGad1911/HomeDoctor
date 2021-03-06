package homedoctor.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.jaredrummler.materialspinner.MaterialSpinner
import homedoctor.viewmodel.HomeDoctorViewModel
import homedoctor.views.register_view
import mostafa.projects.dagger2.Component.DaggerMainComponent
import mostafa.projects.dagger2.Component.MainComponent
import projects.mostafagad.Diploma.R

class Register : AppCompatActivity(), register_view {

    lateinit var mailRegister: EditText
    lateinit var passwordRegister: EditText
    lateinit var RepasswordRegister: EditText
    lateinit var usernameRegister: EditText
    lateinit var phoneRegister: EditText
    lateinit var special_spinner: MaterialSpinner
    lateinit var loading_lyt: LinearLayout

    lateinit var specialists: Array<String>
    lateinit var homeDoctorViewModel: HomeDoctorViewModel
    var doubleBackToExitPressedOnce: Boolean = false
    var mail: String = ""
    var password: String = ""
    var re_password: String = ""
    var u_name: String = ""
    var phone: String = ""
    lateinit var mainComponent: MainComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        initViews()
        initObjects()
        fill_spinner()
        special_spinner.setOnItemSelectedListener(MaterialSpinner.OnItemSelectedListener<Any?> { view, position, id, item ->
            mail = mailRegister.text.toString().trim()
            password = passwordRegister.text.toString().trim()
            re_password = RepasswordRegister.text.toString().trim()
            phone = phoneRegister.text.toString().trim()
            u_name = usernameRegister.text.toString().trim()
            if (position == 1) {
                if (mail.isNullOrBlank()) {
                    Toast.makeText(this@Register, "fill empty mail", Toast.LENGTH_SHORT).show()
                } else if (u_name.isNullOrBlank()) {
                    Toast.makeText(this@Register, "fill empty user name", Toast.LENGTH_SHORT).show()
                } else if (password.isNullOrBlank()) {
                    Toast.makeText(this@Register, "fill empty password", Toast.LENGTH_SHORT).show()
                } else if (re_password.isNullOrBlank()) {
                    Toast.makeText(this@Register, "confirm your password", Toast.LENGTH_SHORT).show()
                } else if (phone.isNullOrBlank()) {
                    Toast.makeText(this@Register, "fill empty phone", Toast.LENGTH_SHORT).show()
                } else {
                    showLoading()
                    observerError()
                    homeDoctorViewModel.URegister(name = u_name, email = mail, mobile = phone, password = password, c_password = re_password)
                }
                observeURegister()
            } else if (position == 2) {
                if (mail.isNullOrBlank()) {
                    Toast.makeText(this@Register, "fill empty mail", Toast.LENGTH_SHORT).show()
                } else if (u_name.isNullOrBlank()) {
                    Toast.makeText(this@Register, "fill empty user name", Toast.LENGTH_SHORT).show()
                } else if (password.isNullOrBlank()) {
                    Toast.makeText(this@Register, "fill empty password", Toast.LENGTH_SHORT).show()
                } else if (re_password.isNullOrBlank()) {
                    Toast.makeText(this@Register, "confirm your password", Toast.LENGTH_SHORT).show()
                } else if (phone.isNullOrBlank()) {
                    Toast.makeText(this@Register, "fill empty phone", Toast.LENGTH_SHORT).show()
                } else {
                    showLoading()
                    observerError()
                    homeDoctorViewModel.DRegister(name = u_name, email = mail, mobile = phone, password = password, c_password = re_password)
                }
                observeDRegister()
            }
        })


    }

    override fun initViews() {
        mailRegister = findViewById(R.id.mailRegister)
        passwordRegister = findViewById(R.id.passwordRegister)
        RepasswordRegister = findViewById(R.id.RepasswordRegister)
        usernameRegister = findViewById(R.id.usernameRegister)
        mailRegister = findViewById(R.id.mailRegister)
        phoneRegister = findViewById(R.id.phoneRegister)
        special_spinner = findViewById(R.id.special_spinner)
        loading_lyt = findViewById(R.id.loading_lyt)
    }

    override fun initObjects() {
        mainComponent = DaggerMainComponent.create()
        homeDoctorViewModel = mainComponent.connect().provideViewModel(this)
    }

    override fun onBackPressed() {
        startActivity(Intent(this , Login::class.java))
    }

    override fun observeURegister() {
        homeDoctorViewModel.URegister_result.observe(this, Observer {
            hideLoading()
            if (it == 0) {
                Toast.makeText(this@Register, "Registration failed", Toast.LENGTH_SHORT).show()
            } else if (it == 1) {
                Toast.makeText(this@Register, "Registration success ", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this , Results::class.java))
            } else if (it == 2) {
                Toast.makeText(this@Register, "Duplicated email ", Toast.LENGTH_SHORT).show()
            } else if (it == 3) {
                Toast.makeText(this@Register, "Invalid phone number ", Toast.LENGTH_SHORT).show()
            } else if (it == 4) {
                Toast.makeText(this@Register, "Invalid email", Toast.LENGTH_SHORT).show()
            } else if (it == 5) {
                Toast.makeText(this@Register, "Confirm password not matching password", Toast.LENGTH_SHORT).show()
            }
        })
    }

    override fun observeDRegister() {
        homeDoctorViewModel.DRegister_result.observe(this, Observer {
            hideLoading()
            if (it == 0) {
                Toast.makeText(this@Register, "Registration failed", Toast.LENGTH_SHORT).show()
            } else if (it == 1) {
                Toast.makeText(this@Register, "Registration success ", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this , Details::class.java))
            } else if (it == 2) {
                Toast.makeText(this@Register, "Duplicated email ", Toast.LENGTH_SHORT).show()
            } else if (it == 3) {
                Toast.makeText(this@Register, "Invalid phone number ", Toast.LENGTH_SHORT).show()
            } else if (it == 4) {
                Toast.makeText(this@Register, "Invalid email", Toast.LENGTH_SHORT).show()
            } else if (it == 5) {
                Toast.makeText(this@Register, "Confirm password not matching password", Toast.LENGTH_SHORT).show()
            }
        })
    }

    override fun observerError() {
        homeDoctorViewModel.ERegister_result.observe(this, Observer {
            hideLoading()
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        })
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
}

package HomeDoctor.ui

import HomeDoctor.ViewModel.HomeDoctorViewModel
import HomeDoctor.Views.register_view
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import projects.mostafagad.Diploma.R

class Register : AppCompatActivity(), register_view {

    lateinit var mailRegister: EditText
    lateinit var passwordRegister: EditText
    lateinit var RepasswordRegister: EditText
    lateinit var usernameRegister: EditText
    lateinit var phoneRegister: EditText
    lateinit var special_spinner: Spinner
    lateinit var loading_lyt: LinearLayout

    lateinit var specialists: Array<String>
    lateinit var homeDoctorViewModel: HomeDoctorViewModel
    var doubleBackToExitPressedOnce: Boolean = false
    var mail: String = ""
    var password: String = ""
    var re_password: String = ""
    var u_name: String = ""
    var phone: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        initViews()
        initObjects()
        fill_spinner()
        special_spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>, view: View, i: Int, l: Long) {
                mail = mailRegister.text.toString().trim()
                password = passwordRegister.text.toString().trim()
                re_password = RepasswordRegister.text.toString().trim()
                phone = phoneRegister.text.toString().trim()
                u_name = usernameRegister.text.toString().trim()
                if (i == 1) {
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
                } else if (i == 2) {
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
            }

            override fun onNothingSelected(adapterView: AdapterView<*>) {
            }
        }
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
        homeDoctorViewModel = ViewModelProviders.of(this).get(HomeDoctorViewModel::class.java)
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
        specialists = arrayOf<String>("Account Type", "User", "Doctor")
        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, specialists)
        special_spinner.adapter = adapter
    }

    override fun showLoading() {
        loading_lyt.visibility = View.VISIBLE
    }

    override fun hideLoading() {
        loading_lyt.visibility = View.GONE
    }
}

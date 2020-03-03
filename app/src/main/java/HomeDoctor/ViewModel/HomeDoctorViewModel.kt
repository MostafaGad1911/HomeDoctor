package homedoctor.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import homedoctor.models.Detail
import mostafa.projects.dagger2.Component.DaggerMainComponent
import mostafa.projects.dagger2.Component.MainComponent
import okhttp3.ResponseBody
import org.json.JSONArray
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class HomeDoctorViewModel : @Inject ViewModel() {

    var mainComponent: MainComponent
    var Ulogin_result: MutableLiveData<Int> = MutableLiveData()
    var Dlogin_result: MutableLiveData<Int> = MutableLiveData()
    var URegister_result: MutableLiveData<Int> = MutableLiveData()
    var DRegister_result: MutableLiveData<Int> = MutableLiveData()
    var UResults_result: MutableLiveData<Int> = MutableLiveData()
    var Elogin_result: MutableLiveData<String> = MutableLiveData()
    var EResults_result: MutableLiveData<String> = MutableLiveData()
    var EDetails_result: MutableLiveData<String> = MutableLiveData()
    var ERegister_result: MutableLiveData<String> = MutableLiveData()
    var email: MutableLiveData<String> = MutableLiveData()
    var Details_result: MutableLiveData<ArrayList<Detail>> = MutableLiveData()

    init {
        mainComponent = DaggerMainComponent.create()
    }

    fun Ulogin(mail: String, password: String) {
        mainComponent.connect().getService().UserLogin(mail, password)
                .enqueue(object : Callback<ResponseBody> {
                    override fun onResponse(
                            call: Call<ResponseBody>,
                            response: Response<ResponseBody>
                    ) {
                        if (response.isSuccessful) {
                            try {
                                val result: String = response.body()!!.string()
                                if (result == "1") {
                                    Ulogin_result.value = 1
                                } else if (result == "0") {
                                    Ulogin_result.value = 0
                                } else if (result == "2") {
                                    Ulogin_result.value = 2
                                }
                            } catch (e: Exception) {
                                println(e.message)
                                Elogin_result.value = e.message
                            }
                        } else {
                            println("failed")
                        }
                    }

                    override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                        print(toString())
                        Elogin_result.value = t.message

                    }
                })
    }

    fun Dlogin(mail: String, password: String) {
        mainComponent.connect().getService().DoctorLogin(mail, password)
                .enqueue(object : Callback<ResponseBody> {
                    override fun onResponse(
                            call: Call<ResponseBody>,
                            response: Response<ResponseBody>
                    ) {
                        if (response.isSuccessful) {
                            try {
                                val result: String = response.body()!!.string()
                                if (result == "1") {
                                    Dlogin_result.value = 1
                                } else if (result == "0") {
                                    Dlogin_result.value = 0
                                } else if (result == "2") {
                                    Dlogin_result.value = 2
                                }
                            } catch (e: Exception) {
                                println(e.message)
                                Elogin_result.value = e.message
                            }
                        } else {
                            println("failed")
                        }
                    }

                    override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                        print(toString())
                        Elogin_result.value = t.message
                    }
                })


    }

    fun URegister(name: String, email: String, mobile: String, password: String, c_password: String) {
        mainComponent.connect().getService().UserRegister(name, email, mobile, password, c_password)
                .enqueue(object : Callback<ResponseBody> {
                    override fun onResponse(
                            call: Call<ResponseBody>,
                            response: Response<ResponseBody>
                    ) {
                        if (response.isSuccessful) {
                            try {
                                val result: String = response.body()!!.string()
                                if (result == "1") {
                                    URegister_result.value = 1
                                } else if (result == "0") {
                                    URegister_result.value = 0
                                } else if (result == "2") {
                                    URegister_result.value = 2
                                } else if (result == "3") {
                                    URegister_result.value = 3
                                } else if (result == "4") {
                                    URegister_result.value = 4
                                } else if (result == "5") {
                                    URegister_result.value = 5
                                }
                            } catch (e: Exception) {
                                println(e.message)
                                ERegister_result.value = e.message
                            }
                        } else {
                            println("failed")
                        }
                    }

                    override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                        print(toString())
                        ERegister_result.value = t.message

                    }
                })
    }

    fun DRegister(name: String, email: String, mobile: String, password: String, c_password: String) {
        mainComponent.connect().getService().DoctorRegister(name, email, mobile, password, c_password)
                .enqueue(object : Callback<ResponseBody> {
                    override fun onResponse(
                            call: Call<ResponseBody>,
                            response: Response<ResponseBody>
                    ) {
                        if (response.isSuccessful) {
                            try {
                                val result: String = response.body()!!.string()
                                if (result == "1") {
                                    DRegister_result.value = 1
                                } else if (result == "0") {
                                    DRegister_result.value = 0
                                } else if (result == "2") {
                                    DRegister_result.value = 2
                                } else if (result == "3") {
                                    DRegister_result.value = 3
                                } else if (result == "4") {
                                    DRegister_result.value = 4
                                } else if (result == "5") {
                                    DRegister_result.value = 5
                                }
                            } catch (e: Exception) {
                                println(e.message)
                                ERegister_result.value = e.message
                            }
                        } else {
                            println("failed")
                        }
                    }

                    override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                        print(toString())
                        ERegister_result.value = t.message

                    }
                })
    }

    fun sendResults(email: String,
                    glucose: String,
                    temperature: String,
                    respire: String,
                    heart: String,
                    pressure: String) {

        mainComponent.connect().getService().SendResults(email, glucose, temperature, respire, heart, pressure)
                .enqueue(object : Callback<ResponseBody> {
                    override fun onResponse(
                            call: Call<ResponseBody>,
                            response: Response<ResponseBody>
                    ) {
                        if (response.isSuccessful) {
                            try {
                                val result: String = response.body()!!.string()
                                if (result == "1") {
                                    UResults_result.value = 1
                                } else if (result == "0") {
                                    UResults_result.value = 0
                                } else if (result == "2") {
                                    UResults_result.value = 2
                                }
                            } catch (e: Exception) {
                                println(e.message)
                                EResults_result.value = e.message
                            }
                        } else {
                            println("failed")
                        }
                    }

                    override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                        print(toString())
                        EResults_result.value = t.message
                    }
                })
    }

    fun setEmail(mail: String){
        email.value = mail
    }

    fun getEmail():String{
        return email.value.toString()
    }
    fun getDetails() {
        mainComponent.connect().getService().getDetails().enqueue(object : Callback<ResponseBody> {
            override fun onResponse(
                    call: Call<ResponseBody>,
                    response: Response<ResponseBody>
            ) {
                if (response.isSuccessful) {
                    try {
                        val detailsArr = JSONArray(response.body()!!.string())
                        val detailList = ArrayList<Detail>()
                        for (i in 0 until detailsArr.length()) {
                            val detail =  mainComponent.connect().provideDetails()
                                    .email(detailsArr.getJSONObject(i).getString("email"))
                                    .phone(detailsArr.getJSONObject(i).getString("phone"))
                                    .temperature(detailsArr.getJSONObject(i).getString("BodyTemperature"))
                                    .glucose(detailsArr.getJSONObject(i).getString("Gluocose"))
                                    .bloodP(detailsArr.getJSONObject(i).getString("BloodPressure"))
                                    .respiration(detailsArr.getJSONObject(i).getString("Respirationrate"))
                                    .heart(detailsArr.getJSONObject(i).getString("HeartRate"))
                                    .build()
                            detailList.add(detail)
                        }
                        Details_result.value = detailList

                    } catch (e: Exception) {
                        println(e.message)
                        EDetails_result.value = e.message
                    }
                } else {
                    println("failed")
                }
            }

            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                print(toString())
                EDetails_result.value = t.message
            }
        })
    }

}
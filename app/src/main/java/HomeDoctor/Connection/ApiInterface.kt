package mostafa.projects.doctorjobs.Connection

import okhttp3.MultipartBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*

interface ApiInterface {

    @POST("UserLogin.php")
    @FormUrlEncoded
    fun UserLogin(
        @Field("email") email: String ,
        @Field("password") password: String
    ): Call<ResponseBody>

    @POST("DoctorLogin.php")
    @FormUrlEncoded
    fun DoctorLogin(
            @Field("email") email: String ,
            @Field("password") password: String
    ): Call<ResponseBody>

    @POST("UserRegister.php")
    @FormUrlEncoded
    fun UserRegister(
            @Field("name") name: String ,
            @Field("email") email: String ,
            @Field("mobile") mobile: String ,
            @Field("password") password: String ,
            @Field("c_password") c_password: String
    ): Call<ResponseBody>

    @POST("DoctorRegister.php")
    @FormUrlEncoded
    fun DoctorRegister(
            @Field("name") name: String ,
            @Field("email") email: String ,
            @Field("mobile") mobile: String ,
            @Field("password") password: String ,
            @Field("c_password") c_password: String
    ): Call<ResponseBody>

    @POST("UserResults.php")
    @FormUrlEncoded
    fun SendResults(
            @Field("email") email: String ,
            @Field("glucose") glucose: String ,
            @Field("temperature") temperature: String ,
            @Field("respire") respire: String ,
            @Field("heart") heart: String ,
            @Field("pressure") pressure: String
    ): Call<ResponseBody>

    @GET("Details.php")
    fun getDetails(): Call<ResponseBody>

}




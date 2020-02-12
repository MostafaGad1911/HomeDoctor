package mostafa.projects.doctorjobs.Connection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J@\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0006H\'JJ\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0006H\'J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'J@\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0006H\'J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\u0015"}, d2 = {"Lmostafa/projects/doctorjobs/Connection/ApiInterface;", "", "DoctorLogin", "Lretrofit2/Call;", "Lokhttp3/ResponseBody;", "email", "", "password", "DoctorRegister", "name", "mobile", "c_password", "SendResults", "glucose", "temperature", "respire", "heart", "pressure", "UserLogin", "UserRegister", "getDetails", "app_debug"})
public abstract interface ApiInterface {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "UserLogin.php")
    public abstract retrofit2.Call<okhttp3.ResponseBody> UserLogin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "email")
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "password")
    java.lang.String password);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "DoctorLogin.php")
    public abstract retrofit2.Call<okhttp3.ResponseBody> DoctorLogin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "email")
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "password")
    java.lang.String password);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "UserRegister.php")
    public abstract retrofit2.Call<okhttp3.ResponseBody> UserRegister(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "name")
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "email")
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "mobile")
    java.lang.String mobile, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "password")
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "c_password")
    java.lang.String c_password);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "DoctorRegister.php")
    public abstract retrofit2.Call<okhttp3.ResponseBody> DoctorRegister(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "name")
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "email")
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "mobile")
    java.lang.String mobile, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "password")
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "c_password")
    java.lang.String c_password);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "UserResults.php")
    public abstract retrofit2.Call<okhttp3.ResponseBody> SendResults(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "email")
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "glucose")
    java.lang.String glucose, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "temperature")
    java.lang.String temperature, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "respire")
    java.lang.String respire, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "heart")
    java.lang.String heart, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "pressure")
    java.lang.String pressure);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "Details.php")
    public abstract retrofit2.Call<okhttp3.ResponseBody> getDetails();
}
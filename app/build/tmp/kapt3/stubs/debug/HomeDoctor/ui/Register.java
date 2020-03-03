package homedoctor.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010M\u001a\u00020NH\u0016J\b\u0010O\u001a\u00020NH\u0016J\b\u0010P\u001a\u00020NH\u0016J\b\u0010Q\u001a\u00020NH\u0016J\b\u0010R\u001a\u00020NH\u0016J\b\u0010S\u001a\u00020NH\u0016J\b\u0010T\u001a\u00020NH\u0016J\b\u0010U\u001a\u00020NH\u0016J\u0012\u0010V\u001a\u00020N2\b\u0010W\u001a\u0004\u0018\u00010XH\u0014J\b\u0010Y\u001a\u00020NH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR\u001a\u0010%\u001a\u00020&X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010!R\u001a\u0010.\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0007\"\u0004\b0\u0010\tR\u001a\u00101\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u0010!R\u001a\u00104\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0007\"\u0004\b6\u0010\tR\u001a\u00107\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001f\"\u0004\b9\u0010!R\u001a\u0010:\u001a\u00020;X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001d0AX\u0086.\u00a2\u0006\u0010\n\u0002\u0010F\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010G\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u001f\"\u0004\bI\u0010!R\u001a\u0010J\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u0007\"\u0004\bL\u0010\t\u00a8\u0006Z"}, d2 = {"Lhomedoctor/ui/Register;", "Landroidx/appcompat/app/AppCompatActivity;", "Lhomedoctor/views/register_view;", "()V", "RepasswordRegister", "Landroid/widget/EditText;", "getRepasswordRegister", "()Landroid/widget/EditText;", "setRepasswordRegister", "(Landroid/widget/EditText;)V", "doubleBackToExitPressedOnce", "", "getDoubleBackToExitPressedOnce", "()Z", "setDoubleBackToExitPressedOnce", "(Z)V", "homeDoctorViewModel", "Lhomedoctor/viewmodel/HomeDoctorViewModel;", "getHomeDoctorViewModel", "()Lhomedoctor/viewmodel/HomeDoctorViewModel;", "setHomeDoctorViewModel", "(Lhomedoctor/viewmodel/HomeDoctorViewModel;)V", "loading_lyt", "Landroid/widget/LinearLayout;", "getLoading_lyt", "()Landroid/widget/LinearLayout;", "setLoading_lyt", "(Landroid/widget/LinearLayout;)V", "mail", "", "getMail", "()Ljava/lang/String;", "setMail", "(Ljava/lang/String;)V", "mailRegister", "getMailRegister", "setMailRegister", "mainComponent", "Lmostafa/projects/dagger2/Component/MainComponent;", "getMainComponent", "()Lmostafa/projects/dagger2/Component/MainComponent;", "setMainComponent", "(Lmostafa/projects/dagger2/Component/MainComponent;)V", "password", "getPassword", "setPassword", "passwordRegister", "getPasswordRegister", "setPasswordRegister", "phone", "getPhone", "setPhone", "phoneRegister", "getPhoneRegister", "setPhoneRegister", "re_password", "getRe_password", "setRe_password", "special_spinner", "Lcom/jaredrummler/materialspinner/MaterialSpinner;", "getSpecial_spinner", "()Lcom/jaredrummler/materialspinner/MaterialSpinner;", "setSpecial_spinner", "(Lcom/jaredrummler/materialspinner/MaterialSpinner;)V", "specialists", "", "getSpecialists", "()[Ljava/lang/String;", "setSpecialists", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "u_name", "getU_name", "setU_name", "usernameRegister", "getUsernameRegister", "setUsernameRegister", "fill_spinner", "", "hideLoading", "initObjects", "initViews", "observeDRegister", "observeURegister", "observerError", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showLoading", "app_debug"})
public final class Register extends androidx.appcompat.app.AppCompatActivity implements homedoctor.views.register_view {
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText mailRegister;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText passwordRegister;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText RepasswordRegister;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText usernameRegister;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText phoneRegister;
    @org.jetbrains.annotations.NotNull()
    public com.jaredrummler.materialspinner.MaterialSpinner special_spinner;
    @org.jetbrains.annotations.NotNull()
    public android.widget.LinearLayout loading_lyt;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String[] specialists;
    @org.jetbrains.annotations.NotNull()
    public homedoctor.viewmodel.HomeDoctorViewModel homeDoctorViewModel;
    private boolean doubleBackToExitPressedOnce;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mail;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String password;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String re_password;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String u_name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String phone;
    @org.jetbrains.annotations.NotNull()
    public mostafa.projects.dagger2.Component.MainComponent mainComponent;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getMailRegister() {
        return null;
    }
    
    public final void setMailRegister(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getPasswordRegister() {
        return null;
    }
    
    public final void setPasswordRegister(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getRepasswordRegister() {
        return null;
    }
    
    public final void setRepasswordRegister(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getUsernameRegister() {
        return null;
    }
    
    public final void setUsernameRegister(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getPhoneRegister() {
        return null;
    }
    
    public final void setPhoneRegister(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jaredrummler.materialspinner.MaterialSpinner getSpecial_spinner() {
        return null;
    }
    
    public final void setSpecial_spinner(@org.jetbrains.annotations.NotNull()
    com.jaredrummler.materialspinner.MaterialSpinner p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getLoading_lyt() {
        return null;
    }
    
    public final void setLoading_lyt(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String[] getSpecialists() {
        return null;
    }
    
    public final void setSpecialists(@org.jetbrains.annotations.NotNull()
    java.lang.String[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final homedoctor.viewmodel.HomeDoctorViewModel getHomeDoctorViewModel() {
        return null;
    }
    
    public final void setHomeDoctorViewModel(@org.jetbrains.annotations.NotNull()
    homedoctor.viewmodel.HomeDoctorViewModel p0) {
    }
    
    public final boolean getDoubleBackToExitPressedOnce() {
        return false;
    }
    
    public final void setDoubleBackToExitPressedOnce(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMail() {
        return null;
    }
    
    public final void setMail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRe_password() {
        return null;
    }
    
    public final void setRe_password(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getU_name() {
        return null;
    }
    
    public final void setU_name(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhone() {
        return null;
    }
    
    public final void setPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final mostafa.projects.dagger2.Component.MainComponent getMainComponent() {
        return null;
    }
    
    public final void setMainComponent(@org.jetbrains.annotations.NotNull()
    mostafa.projects.dagger2.Component.MainComponent p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void initViews() {
    }
    
    @java.lang.Override()
    public void initObjects() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public void observeURegister() {
    }
    
    @java.lang.Override()
    public void observeDRegister() {
    }
    
    @java.lang.Override()
    public void observerError() {
    }
    
    @java.lang.Override()
    public void fill_spinner() {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void hideLoading() {
    }
    
    public Register() {
        super();
    }
}
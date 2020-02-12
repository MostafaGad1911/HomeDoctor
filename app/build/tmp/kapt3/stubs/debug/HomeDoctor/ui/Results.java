package HomeDoctor.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010P\u001a\u00020QH\u0016J\b\u0010R\u001a\u00020QH\u0016J\b\u0010S\u001a\u00020QH\u0016J\b\u0010T\u001a\u00020QH\u0016J\b\u0010U\u001a\u00020QH\u0016J\b\u0010V\u001a\u00020QH\u0016J\u0012\u0010W\u001a\u00020Q2\b\u0010X\u001a\u0004\u0018\u00010YH\u0016J\u0012\u0010Z\u001a\u00020Q2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0014J\b\u0010]\u001a\u00020QH\u0016J\b\u0010^\u001a\u00020QH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001d\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR\u001a\u0010 \u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R\u001a\u0010#\u001a\u00020$X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010)\u001a\u00020*X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u000200X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\u000206X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010;\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u000e\"\u0004\b=\u0010\u0010R\u001a\u0010>\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\b\"\u0004\b@\u0010\nR\u001a\u0010A\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u000e\"\u0004\bC\u0010\u0010R\u001a\u0010D\u001a\u00020EX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u0010J\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\b\"\u0004\bL\u0010\nR\u001a\u0010M\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u000e\"\u0004\bO\u0010\u0010\u00a8\u0006_"}, d2 = {"LHomeDoctor/ui/Results;", "Landroidx/appcompat/app/AppCompatActivity;", "LHomeDoctor/Views/results_view;", "Landroid/view/View$OnClickListener;", "()V", "blood", "Landroid/widget/EditText;", "getBlood", "()Landroid/widget/EditText;", "setBlood", "(Landroid/widget/EditText;)V", "bloodV", "", "getBloodV", "()Ljava/lang/String;", "setBloodV", "(Ljava/lang/String;)V", "doubleBackToExitPressedOnce", "", "getDoubleBackToExitPressedOnce", "()Z", "setDoubleBackToExitPressedOnce", "(Z)V", "glucose", "getGlucose", "setGlucose", "glucoseV", "getGlucoseV", "setGlucoseV", "heart", "getHeart", "setHeart", "heartV", "getHeartV", "setHeartV", "homeDoctorViewModel", "LHomeDoctor/ViewModel/HomeDoctorViewModel;", "getHomeDoctorViewModel", "()LHomeDoctor/ViewModel/HomeDoctorViewModel;", "setHomeDoctorViewModel", "(LHomeDoctor/ViewModel/HomeDoctorViewModel;)V", "loading_lyt", "Landroid/widget/LinearLayout;", "getLoading_lyt", "()Landroid/widget/LinearLayout;", "setLoading_lyt", "(Landroid/widget/LinearLayout;)V", "logout", "Landroid/widget/ImageView;", "getLogout", "()Landroid/widget/ImageView;", "setLogout", "(Landroid/widget/ImageView;)V", "mail", "Landroid/widget/TextView;", "getMail", "()Landroid/widget/TextView;", "setMail", "(Landroid/widget/TextView;)V", "mails", "getMails", "setMails", "respiration", "getRespiration", "setRespiration", "respirationV", "getRespirationV", "setRespirationV", "submitBtn", "Landroid/widget/Button;", "getSubmitBtn", "()Landroid/widget/Button;", "setSubmitBtn", "(Landroid/widget/Button;)V", "temp", "getTemp", "setTemp", "tempV", "getTempV", "setTempV", "hideLoading", "", "initObjects", "initViews", "observeResults", "observeResultsError", "onBackPressed", "onClick", "p0", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "sendResults", "showLoading", "app_debug"})
public final class Results extends androidx.appcompat.app.AppCompatActivity implements HomeDoctor.Views.results_view, android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView mail;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText glucose;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText blood;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText respiration;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText heart;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText temp;
    @org.jetbrains.annotations.NotNull()
    public android.widget.ImageView logout;
    @org.jetbrains.annotations.NotNull()
    public android.widget.LinearLayout loading_lyt;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mails;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String glucoseV;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String bloodV;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String respirationV;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String heartV;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String tempV;
    private boolean doubleBackToExitPressedOnce;
    @org.jetbrains.annotations.NotNull()
    public android.widget.Button submitBtn;
    @org.jetbrains.annotations.NotNull()
    public HomeDoctor.ViewModel.HomeDoctorViewModel homeDoctorViewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getMail() {
        return null;
    }
    
    public final void setMail(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getGlucose() {
        return null;
    }
    
    public final void setGlucose(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getBlood() {
        return null;
    }
    
    public final void setBlood(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getRespiration() {
        return null;
    }
    
    public final void setRespiration(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getHeart() {
        return null;
    }
    
    public final void setHeart(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getTemp() {
        return null;
    }
    
    public final void setTemp(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getLogout() {
        return null;
    }
    
    public final void setLogout(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getLoading_lyt() {
        return null;
    }
    
    public final void setLoading_lyt(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMails() {
        return null;
    }
    
    public final void setMails(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGlucoseV() {
        return null;
    }
    
    public final void setGlucoseV(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBloodV() {
        return null;
    }
    
    public final void setBloodV(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRespirationV() {
        return null;
    }
    
    public final void setRespirationV(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHeartV() {
        return null;
    }
    
    public final void setHeartV(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTempV() {
        return null;
    }
    
    public final void setTempV(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getDoubleBackToExitPressedOnce() {
        return false;
    }
    
    public final void setDoubleBackToExitPressedOnce(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Button getSubmitBtn() {
        return null;
    }
    
    public final void setSubmitBtn(@org.jetbrains.annotations.NotNull()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final HomeDoctor.ViewModel.HomeDoctorViewModel getHomeDoctorViewModel() {
        return null;
    }
    
    public final void setHomeDoctorViewModel(@org.jetbrains.annotations.NotNull()
    HomeDoctor.ViewModel.HomeDoctorViewModel p0) {
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
    public void observeResults() {
    }
    
    @java.lang.Override()
    public void observeResultsError() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public void sendResults() {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void hideLoading() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    public Results() {
        super();
    }
}
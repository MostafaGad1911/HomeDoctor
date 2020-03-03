package homedoctor.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010X\u001a\u00020YH\u0016J\b\u0010Z\u001a\u00020YH\u0016J\b\u0010[\u001a\u00020YH\u0016J\b\u0010\\\u001a\u00020YH\u0016J\b\u0010]\u001a\u00020YH\u0016J\b\u0010^\u001a\u00020YH\u0016J\u0012\u0010_\u001a\u00020Y2\b\u0010`\u001a\u0004\u0018\u00010aH\u0016J\u0012\u0010b\u001a\u00020Y2\b\u0010c\u001a\u0004\u0018\u00010dH\u0014J\b\u0010e\u001a\u00020YH\u0016J\b\u0010f\u001a\u00020YH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\n\"\u0004\b\u001b\u0010\fR\u001a\u0010\u001c\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\fR\u001a\u0010\"\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R\u001a\u0010%\u001a\u00020&X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020,X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00101\u001a\u000202X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u000208X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010=\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0010\"\u0004\b?\u0010\u0012R\u001a\u0010@\u001a\u00020AX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010F\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\n\"\u0004\bH\u0010\fR\u001a\u0010I\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0010\"\u0004\bK\u0010\u0012R\u001a\u0010L\u001a\u00020MX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010R\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\n\"\u0004\bT\u0010\fR\u001a\u0010U\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u0010\"\u0004\bW\u0010\u0012\u00a8\u0006g"}, d2 = {"Lhomedoctor/ui/Results;", "Landroidx/appcompat/app/AppCompatActivity;", "Lhomedoctor/views/results_view;", "Landroid/view/View$OnClickListener;", "()V", "binding", "Lprojects/mostafagad/Diploma/databinding/ActivityResultsBinding;", "blood", "Landroid/widget/EditText;", "getBlood", "()Landroid/widget/EditText;", "setBlood", "(Landroid/widget/EditText;)V", "bloodV", "", "getBloodV", "()Ljava/lang/String;", "setBloodV", "(Ljava/lang/String;)V", "doubleBackToExitPressedOnce", "", "getDoubleBackToExitPressedOnce", "()Z", "setDoubleBackToExitPressedOnce", "(Z)V", "glucose", "getGlucose", "setGlucose", "glucoseV", "getGlucoseV", "setGlucoseV", "heart", "getHeart", "setHeart", "heartV", "getHeartV", "setHeartV", "homeDoctorViewModel", "Lhomedoctor/viewmodel/HomeDoctorViewModel;", "getHomeDoctorViewModel", "()Lhomedoctor/viewmodel/HomeDoctorViewModel;", "setHomeDoctorViewModel", "(Lhomedoctor/viewmodel/HomeDoctorViewModel;)V", "loading_lyt", "Landroid/widget/LinearLayout;", "getLoading_lyt", "()Landroid/widget/LinearLayout;", "setLoading_lyt", "(Landroid/widget/LinearLayout;)V", "logout", "Landroid/widget/ImageView;", "getLogout", "()Landroid/widget/ImageView;", "setLogout", "(Landroid/widget/ImageView;)V", "mail", "Landroid/widget/TextView;", "getMail", "()Landroid/widget/TextView;", "setMail", "(Landroid/widget/TextView;)V", "mails", "getMails", "setMails", "mainComponent", "Lmostafa/projects/dagger2/Component/MainComponent;", "getMainComponent", "()Lmostafa/projects/dagger2/Component/MainComponent;", "setMainComponent", "(Lmostafa/projects/dagger2/Component/MainComponent;)V", "respiration", "getRespiration", "setRespiration", "respirationV", "getRespirationV", "setRespirationV", "submitBtn", "Landroid/widget/Button;", "getSubmitBtn", "()Landroid/widget/Button;", "setSubmitBtn", "(Landroid/widget/Button;)V", "temp", "getTemp", "setTemp", "tempV", "getTempV", "setTempV", "hideLoading", "", "initObjects", "initViews", "observeResults", "observeResultsError", "onBackPressed", "onClick", "p0", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "sendResults", "showLoading", "app_debug"})
public final class Results extends androidx.appcompat.app.AppCompatActivity implements homedoctor.views.results_view, android.view.View.OnClickListener {
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
    public mostafa.projects.dagger2.Component.MainComponent mainComponent;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String heartV;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String tempV;
    private boolean doubleBackToExitPressedOnce;
    private projects.mostafagad.Diploma.databinding.ActivityResultsBinding binding;
    @org.jetbrains.annotations.NotNull()
    public android.widget.Button submitBtn;
    @org.jetbrains.annotations.NotNull()
    public homedoctor.viewmodel.HomeDoctorViewModel homeDoctorViewModel;
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
    public final mostafa.projects.dagger2.Component.MainComponent getMainComponent() {
        return null;
    }
    
    public final void setMainComponent(@org.jetbrains.annotations.NotNull()
    mostafa.projects.dagger2.Component.MainComponent p0) {
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
    public final homedoctor.viewmodel.HomeDoctorViewModel getHomeDoctorViewModel() {
        return null;
    }
    
    public final void setHomeDoctorViewModel(@org.jetbrains.annotations.NotNull()
    homedoctor.viewmodel.HomeDoctorViewModel p0) {
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
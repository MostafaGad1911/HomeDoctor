package homedoctor.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020*H\u0016J\b\u0010,\u001a\u00020*H\u0016J\b\u0010-\u001a\u00020*H\u0016J\b\u0010.\u001a\u00020*H\u0016J\b\u0010/\u001a\u00020*H\u0016J\b\u00100\u001a\u00020*H\u0016J\u0012\u00101\u001a\u00020*2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0012\u00104\u001a\u00020*2\b\u00105\u001a\u0004\u0018\u000106H\u0014J\b\u00107\u001a\u00020*H\u0016J\b\u00108\u001a\u00020*H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u00069"}, d2 = {"Lhomedoctor/ui/Details;", "Landroidx/appcompat/app/AppCompatActivity;", "Lhomedoctor/views/details_view;", "Landroid/view/View$OnClickListener;", "()V", "doubleBackToExitPressedOnce", "", "getDoubleBackToExitPressedOnce", "()Z", "setDoubleBackToExitPressedOnce", "(Z)V", "homeDoctorViewModel", "Lhomedoctor/viewmodel/HomeDoctorViewModel;", "getHomeDoctorViewModel", "()Lhomedoctor/viewmodel/HomeDoctorViewModel;", "setHomeDoctorViewModel", "(Lhomedoctor/viewmodel/HomeDoctorViewModel;)V", "loading_lyt", "Landroid/widget/LinearLayout;", "getLoading_lyt", "()Landroid/widget/LinearLayout;", "setLoading_lyt", "(Landroid/widget/LinearLayout;)V", "logout", "Landroid/widget/ImageView;", "getLogout", "()Landroid/widget/ImageView;", "setLogout", "(Landroid/widget/ImageView;)V", "mainComponent", "Lmostafa/projects/dagger2/Component/MainComponent;", "getMainComponent", "()Lmostafa/projects/dagger2/Component/MainComponent;", "setMainComponent", "(Lmostafa/projects/dagger2/Component/MainComponent;)V", "recyclerUsers", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerUsers", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerUsers", "(Landroidx/recyclerview/widget/RecyclerView;)V", "getDetails", "", "hideLoading", "initObjects", "initViews", "observeDetails", "observeDetailsError", "onBackPressed", "onClick", "p0", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "prepareRecycler", "showLoading", "app_debug"})
public final class Details extends androidx.appcompat.app.AppCompatActivity implements homedoctor.views.details_view, android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    public androidx.recyclerview.widget.RecyclerView recyclerUsers;
    @org.jetbrains.annotations.NotNull()
    public android.widget.LinearLayout loading_lyt;
    @org.jetbrains.annotations.NotNull()
    public android.widget.ImageView logout;
    @org.jetbrains.annotations.NotNull()
    public mostafa.projects.dagger2.Component.MainComponent mainComponent;
    private boolean doubleBackToExitPressedOnce;
    @org.jetbrains.annotations.NotNull()
    public homedoctor.viewmodel.HomeDoctorViewModel homeDoctorViewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getRecyclerUsers() {
        return null;
    }
    
    public final void setRecyclerUsers(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.LinearLayout getLoading_lyt() {
        return null;
    }
    
    public final void setLoading_lyt(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ImageView getLogout() {
        return null;
    }
    
    public final void setLogout(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final mostafa.projects.dagger2.Component.MainComponent getMainComponent() {
        return null;
    }
    
    public final void setMainComponent(@org.jetbrains.annotations.NotNull()
    mostafa.projects.dagger2.Component.MainComponent p0) {
    }
    
    public final boolean getDoubleBackToExitPressedOnce() {
        return false;
    }
    
    public final void setDoubleBackToExitPressedOnce(boolean p0) {
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
    public void prepareRecycler() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public void getDetails() {
    }
    
    @java.lang.Override()
    public void observeDetails() {
    }
    
    @java.lang.Override()
    public void observeDetailsError() {
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
    
    public Details() {
        super();
    }
}
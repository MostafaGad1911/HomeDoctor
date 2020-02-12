package HomeDoctor.ViewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J.\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00142\u0006\u00102\u001a\u00020\u00142\u0006\u00103\u001a\u00020\u00142\u0006\u00104\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u0014J\u0016\u00106\u001a\u0002002\u0006\u00107\u001a\u00020\u00142\u0006\u00104\u001a\u00020\u0014J.\u00108\u001a\u0002002\u0006\u00101\u001a\u00020\u00142\u0006\u00102\u001a\u00020\u00142\u0006\u00103\u001a\u00020\u00142\u0006\u00104\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u0014J\u0016\u00109\u001a\u0002002\u0006\u00107\u001a\u00020\u00142\u0006\u00104\u001a\u00020\u0014J\u0006\u0010:\u001a\u000200J6\u0010;\u001a\u0002002\u0006\u00102\u001a\u00020\u00142\u0006\u0010<\u001a\u00020\u00142\u0006\u0010=\u001a\u00020\u00142\u0006\u0010>\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u00142\u0006\u0010@\u001a\u00020\u0014R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR0\u0010\n\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\tR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\tR \u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0007\"\u0004\b(\u0010\tR\u001a\u0010)\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.\u00a8\u0006A"}, d2 = {"LHomeDoctor/ViewModel/HomeDoctorViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "DRegister_result", "Landroidx/lifecycle/MutableLiveData;", "", "getDRegister_result", "()Landroidx/lifecycle/MutableLiveData;", "setDRegister_result", "(Landroidx/lifecycle/MutableLiveData;)V", "Details_result", "Ljava/util/ArrayList;", "LHomeDoctor/Models/Detail;", "Lkotlin/collections/ArrayList;", "getDetails_result", "setDetails_result", "Dlogin_result", "getDlogin_result", "setDlogin_result", "EDetails_result", "", "getEDetails_result", "setEDetails_result", "ERegister_result", "getERegister_result", "setERegister_result", "EResults_result", "getEResults_result", "setEResults_result", "Elogin_result", "getElogin_result", "setElogin_result", "URegister_result", "getURegister_result", "setURegister_result", "UResults_result", "getUResults_result", "setUResults_result", "Ulogin_result", "getUlogin_result", "setUlogin_result", "mainComponent", "Lmostafa/projects/dagger2/Component/MainComponent;", "getMainComponent", "()Lmostafa/projects/dagger2/Component/MainComponent;", "setMainComponent", "(Lmostafa/projects/dagger2/Component/MainComponent;)V", "DRegister", "", "name", "email", "mobile", "password", "c_password", "Dlogin", "mail", "URegister", "Ulogin", "getDetails", "sendResults", "glucose", "temperature", "respire", "heart", "pressure", "app_debug"})
public final class HomeDoctorViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private mostafa.projects.dagger2.Component.MainComponent mainComponent;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> Ulogin_result;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> Dlogin_result;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> URegister_result;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> DRegister_result;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> UResults_result;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> Elogin_result;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> EResults_result;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> EDetails_result;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> ERegister_result;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<HomeDoctor.Models.Detail>> Details_result;
    
    @org.jetbrains.annotations.NotNull()
    public final mostafa.projects.dagger2.Component.MainComponent getMainComponent() {
        return null;
    }
    
    public final void setMainComponent(@org.jetbrains.annotations.NotNull()
    mostafa.projects.dagger2.Component.MainComponent p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getUlogin_result() {
        return null;
    }
    
    public final void setUlogin_result(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getDlogin_result() {
        return null;
    }
    
    public final void setDlogin_result(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getURegister_result() {
        return null;
    }
    
    public final void setURegister_result(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getDRegister_result() {
        return null;
    }
    
    public final void setDRegister_result(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getUResults_result() {
        return null;
    }
    
    public final void setUResults_result(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getElogin_result() {
        return null;
    }
    
    public final void setElogin_result(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEResults_result() {
        return null;
    }
    
    public final void setEResults_result(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEDetails_result() {
        return null;
    }
    
    public final void setEDetails_result(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getERegister_result() {
        return null;
    }
    
    public final void setERegister_result(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<HomeDoctor.Models.Detail>> getDetails_result() {
        return null;
    }
    
    public final void setDetails_result(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<HomeDoctor.Models.Detail>> p0) {
    }
    
    public final void Ulogin(@org.jetbrains.annotations.NotNull()
    java.lang.String mail, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public final void Dlogin(@org.jetbrains.annotations.NotNull()
    java.lang.String mail, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public final void URegister(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String mobile, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String c_password) {
    }
    
    public final void DRegister(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String mobile, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String c_password) {
    }
    
    public final void sendResults(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String glucose, @org.jetbrains.annotations.NotNull()
    java.lang.String temperature, @org.jetbrains.annotations.NotNull()
    java.lang.String respire, @org.jetbrains.annotations.NotNull()
    java.lang.String heart, @org.jetbrains.annotations.NotNull()
    java.lang.String pressure) {
    }
    
    public final void getDetails() {
    }
    
    public HomeDoctorViewModel() {
        super();
    }
}
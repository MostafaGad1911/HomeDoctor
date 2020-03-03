package mostafa.projects.doctorjobs.Modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\nH\u0007J\b\u0010\u0010\u001a\u00020\u0004H\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0007J(\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u001dH\u0007J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\""}, d2 = {"Lmostafa/projects/doctorjobs/Modules/Settings;", "", "()V", "apiInterface", "Lmostafa/projects/doctorjobs/Connection/ApiInterface;", "getApiInterface", "()Lmostafa/projects/doctorjobs/Connection/ApiInterface;", "setApiInterface", "(Lmostafa/projects/doctorjobs/Connection/ApiInterface;)V", "retrofit", "Lretrofit2/Retrofit;", "getRetrofit", "()Lretrofit2/Retrofit;", "setRetrofit", "(Lretrofit2/Retrofit;)V", "getClient", "getService", "provideDetails", "Lhomedoctor/models/Detail$Builder;", "provideDetailsAdapter", "Lhomedoctor/adapters/Details_adapter;", "context", "Landroid/app/Activity;", "detailList", "Ljava/util/ArrayList;", "Lhomedoctor/models/Detail;", "Lkotlin/collections/ArrayList;", "provideLinearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "provideViewModel", "Lhomedoctor/viewmodel/HomeDoctorViewModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "app_debug"})
@dagger.Module()
public final class Settings {
    @org.jetbrains.annotations.NotNull()
    public mostafa.projects.doctorjobs.Connection.ApiInterface apiInterface;
    @org.jetbrains.annotations.NotNull()
    public retrofit2.Retrofit retrofit;
    
    @org.jetbrains.annotations.NotNull()
    public final mostafa.projects.doctorjobs.Connection.ApiInterface getApiInterface() {
        return null;
    }
    
    public final void setApiInterface(@org.jetbrains.annotations.NotNull()
    mostafa.projects.doctorjobs.Connection.ApiInterface p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit getRetrofit() {
        return null;
    }
    
    public final void setRetrofit(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final mostafa.projects.doctorjobs.Connection.ApiInterface getService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final androidx.recyclerview.widget.LinearLayoutManager provideLinearLayoutManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final homedoctor.models.Detail.Builder provideDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final homedoctor.viewmodel.HomeDoctorViewModel provideViewModel(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final homedoctor.adapters.Details_adapter provideDetailsAdapter(@org.jetbrains.annotations.NotNull()
    android.app.Activity context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<homedoctor.models.Detail> detailList) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final retrofit2.Retrofit getClient() {
        return null;
    }
    
    @javax.inject.Inject()
    public Settings() {
        super();
    }
}
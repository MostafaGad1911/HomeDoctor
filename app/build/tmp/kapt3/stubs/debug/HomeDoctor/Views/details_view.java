package HomeDoctor.Views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&\u00a8\u0006\u000b"}, d2 = {"LHomeDoctor/Views/details_view;", "", "getDetails", "", "hideLoading", "initObjects", "initViews", "observeDetails", "observeDetailsError", "prepareRecycler", "showLoading", "app_debug"})
public abstract interface details_view {
    
    public abstract void initViews();
    
    public abstract void initObjects();
    
    public abstract void prepareRecycler();
    
    public abstract void getDetails();
    
    public abstract void observeDetails();
    
    public abstract void observeDetailsError();
    
    public abstract void showLoading();
    
    public abstract void hideLoading();
}
package HomeDoctor.Views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&\u00a8\u0006\n"}, d2 = {"LHomeDoctor/Views/results_view;", "", "hideLoading", "", "initObjects", "initViews", "observeResults", "observeResultsError", "sendResults", "showLoading", "app_debug"})
public abstract interface results_view {
    
    public abstract void initViews();
    
    public abstract void initObjects();
    
    public abstract void observeResults();
    
    public abstract void observeResultsError();
    
    public abstract void sendResults();
    
    public abstract void showLoading();
    
    public abstract void hideLoading();
}
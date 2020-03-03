package projects.mostafagad.Diploma.databinding;
import projects.mostafagad.Diploma.R;
import projects.mostafagad.Diploma.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityResultsBindingImpl extends ActivityResultsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.submitBtn, 7);
        sViewsWithIds.put(R.id.logout, 8);
        sViewsWithIds.put(R.id.loading_lyt, 9);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityResultsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivityResultsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatEditText) bindings[3]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[2]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[5]
            , (android.widget.LinearLayout) bindings[9]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[4]
            , (androidx.appcompat.widget.AppCompatButton) bindings[7]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[6]
            );
        this.blood.setTag(null);
        this.glucose.setTag(null);
        this.heart.setTag(null);
        this.mail.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.respiration.setTag(null);
        this.temp.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.details == variableId) {
            setDetails((homedoctor.models.Detail) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDetails(@Nullable homedoctor.models.Detail Details) {
        this.mDetails = Details;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.details);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        homedoctor.models.Detail details = mDetails;
        java.lang.String detailsGlucose = null;
        java.lang.String detailsTemperature = null;
        java.lang.String detailsEmail = null;
        java.lang.String detailsHeart = null;
        java.lang.String detailsBloodP = null;
        java.lang.String detailsRespiration = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (details != null) {
                    // read details.glucose
                    detailsGlucose = details.getGlucose();
                    // read details.temperature
                    detailsTemperature = details.getTemperature();
                    // read details.email
                    detailsEmail = details.getEmail();
                    // read details.heart
                    detailsHeart = details.getHeart();
                    // read details.bloodP
                    detailsBloodP = details.getBloodP();
                    // read details.respiration
                    detailsRespiration = details.getRespiration();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.blood, detailsBloodP);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.glucose, detailsGlucose);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.heart, detailsHeart);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mail, detailsEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.respiration, detailsRespiration);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.temp, detailsTemperature);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): details
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}
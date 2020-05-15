package p000;

import android.view.View;
import android.widget.CompoundButton;
import com.felicanetworks.mfc.C0126R;

/* renamed from: apwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apwi extends svj {

    /* renamed from: y */
    private final CompoundButton f85014y;

    public apwi(View view) {
        super(view);
        CompoundButton compoundButton = (CompoundButton) view.findViewById(C0126R.C0129id.toggle);
        this.f85014y = compoundButton;
        compoundButton.setVisibility(4);
    }

    /* renamed from: a */
    public final void mo23819a(svc svc) {
        if (svc instanceof apwk) {
            apwk apwk = (apwk) svc;
            super.mo23819a((svc) apwk);
            this.f85014y.setEnabled(apwk.f45237k);
            this.f85014y.setChecked(((svm) apwk).f45239a);
            return;
        }
        throw new IllegalArgumentException("settingItem must be FindMyDeviceToggleItem");
    }
}

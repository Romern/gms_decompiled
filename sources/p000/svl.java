package p000;

import android.view.View;
import android.widget.CompoundButton;
import com.felicanetworks.mfc.C0126R;

/* renamed from: svl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class svl extends svj {

    /* renamed from: y */
    private final CompoundButton f45238y = ((CompoundButton) this.f45230x.findViewById(C0126R.C0129id.toggle));

    public svl(View view) {
        super(view);
    }

    /* renamed from: a */
    public final void mo23819a(svc svc) {
        if (svc instanceof svm) {
            svm svm = (svm) svc;
            super.mo23819a((svc) svm);
            this.f45238y.setEnabled(svm.mo26162h());
            this.f45238y.setChecked(svm.f45239a);
            this.f45228v.setSingleLine(svm.f45240b);
            return;
        }
        throw new IllegalArgumentException("settingItem must be DefaultToggleSettingItem");
    }
}

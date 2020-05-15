package p000;

import android.view.View;
import android.widget.CompoundButton;
import com.felicanetworks.mfc.C0126R;

/* renamed from: pzs */
final /* synthetic */ class pzs implements suh {

    /* renamed from: a */
    private final pzv f40754a;

    public pzs(pzv pzv) {
        this.f40754a = pzv;
    }

    /* renamed from: a */
    public final void mo7099a(View view, sui sui) {
        pzv pzv = this.f40754a;
        CompoundButton compoundButton = (CompoundButton) view.findViewById(C0126R.C0129id.toggle);
        compoundButton.toggle();
        compoundButton.sendAccessibilityEvent(1);
        boolean isChecked = compoundButton.isChecked();
        pzv.mo23831b().edit().putBoolean("googlecast-isEnabled", isChecked).apply();
        pzv.f40759c.mo24732b(new pqm("googlecast-isEnabled", isChecked));
    }
}

package p000;

import android.widget.RadioGroup;

/* renamed from: aaul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aaul implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a */
    final /* synthetic */ aaun f56607a;

    public aaul(aaun aaun) {
        this.f56607a = aaun;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        aave aave = this.f56607a.f56609a;
        if (aave != null) {
            aave.mo31824a();
        }
    }
}

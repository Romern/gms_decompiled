package p000;

import android.view.View;

/* renamed from: jei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jei implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ jem f22284a;

    public jei(jem jem) {
        this.f22284a = jem;
    }

    public void onClick(View view) {
        View view2 = this.f22284a.f22290g;
        if (view2 == null) {
            return;
        }
        if (view2.isEnabled()) {
            this.f22284a.mo7729c();
        } else {
            this.f22284a.mo7730f();
        }
    }
}

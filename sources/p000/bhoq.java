package p000;

import android.view.View;

/* renamed from: bhoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhoq implements View.OnFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ bhou f119204a;

    public bhoq(bhou bhou) {
        this.f119204a = bhou;
    }

    public final void onFocusChange(View view, boolean z) {
        this.f119204a.f119220k.f151339m.setActivated(z);
        if (!z) {
            this.f119204a.mo64099b(false);
            this.f119204a.f119211c = false;
        }
    }
}

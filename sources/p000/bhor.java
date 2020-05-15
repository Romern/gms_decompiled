package p000;

import android.widget.AutoCompleteTextView;

/* renamed from: bhor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhor implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ bhou f119205a;

    public bhor(bhou bhou) {
        this.f119205a = bhou;
    }

    public final void onDismiss() {
        bhou bhou = this.f119205a;
        bhou.f119211c = true;
        bhou.f119213e = System.currentTimeMillis();
        this.f119205a.mo64099b(false);
    }
}

package p000;

import android.view.WindowInsets;

/* renamed from: qf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1294qf extends C1293qe {

    /* renamed from: c */
    private C1166ln f26853c = null;

    public C1294qf(C1296qh qhVar, WindowInsets windowInsets) {
        super(qhVar, windowInsets);
    }

    /* renamed from: a */
    public final C1296qh mo15719a(int i, int i2, int i3, int i4) {
        return C1296qh.m19996a(this.f26850a.inset(i, i2, i3, i4));
    }

    /* renamed from: i */
    public final C1166ln mo15730i() {
        if (this.f26853c == null) {
            this.f26853c = C1166ln.m19402a(this.f26850a.getSystemGestureInsets());
        }
        return this.f26853c;
    }

    public C1294qf(C1296qh qhVar, C1294qf qfVar) {
        super(qhVar, qfVar);
    }
}

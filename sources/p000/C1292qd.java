package p000;

import android.view.WindowInsets;

/* renamed from: qd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class C1292qd extends C1291qc {

    /* renamed from: c */
    private C1166ln f26852c = null;

    public C1292qd(C1296qh qhVar, WindowInsets windowInsets) {
        super(qhVar, windowInsets);
    }

    /* renamed from: c */
    public final boolean mo15722c() {
        return this.f26850a.isConsumed();
    }

    /* renamed from: d */
    public final C1296qh mo15723d() {
        return C1296qh.m19996a(this.f26850a.consumeStableInsets());
    }

    /* renamed from: e */
    public final C1296qh mo15724e() {
        return C1296qh.m19996a(this.f26850a.consumeSystemWindowInsets());
    }

    /* renamed from: f */
    public final C1166ln mo15725f() {
        if (this.f26852c == null) {
            this.f26852c = C1166ln.m19401a(this.f26850a.getStableInsetLeft(), this.f26850a.getStableInsetTop(), this.f26850a.getStableInsetRight(), this.f26850a.getStableInsetBottom());
        }
        return this.f26852c;
    }

    public C1292qd(C1296qh qhVar, C1292qd qdVar) {
        super(qhVar, qdVar);
    }
}

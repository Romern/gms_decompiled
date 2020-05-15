package p000;

import android.view.WindowInsets;

/* renamed from: qc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class C1291qc extends C1295qg {

    /* renamed from: a */
    final WindowInsets f26850a;

    /* renamed from: c */
    private C1166ln f26851c;

    public C1291qc(C1296qh qhVar, WindowInsets windowInsets) {
        super(qhVar);
        this.f26851c = null;
        this.f26850a = windowInsets;
    }

    /* renamed from: a */
    public C1296qh mo15719a(int i, int i2, int i3, int i4) {
        C1289qa qaVar = new C1289qa(C1296qh.m19996a(this.f26850a));
        qaVar.mo15718a(C1296qh.m19995a(mo15721b(), i, i2, i3, i4));
        qaVar.f26848a.f26849a.setStableInsets(C1296qh.m19995a(mo15725f(), i, i2, i3, i4).mo15280a());
        return qaVar.mo15717a();
    }

    /* renamed from: b */
    public final C1166ln mo15721b() {
        if (this.f26851c == null) {
            this.f26851c = C1166ln.m19401a(this.f26850a.getSystemWindowInsetLeft(), this.f26850a.getSystemWindowInsetTop(), this.f26850a.getSystemWindowInsetRight(), this.f26850a.getSystemWindowInsetBottom());
        }
        return this.f26851c;
    }

    public C1291qc(C1296qh qhVar, C1291qc qcVar) {
        this(qhVar, new WindowInsets(qcVar.f26850a));
    }

    /* renamed from: a */
    public final boolean mo15720a() {
        return this.f26850a.isRound();
    }
}

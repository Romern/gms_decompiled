package p000;

/* renamed from: sp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1358sp implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1372tc f27033a;

    public C1358sp(C1372tc tcVar) {
        this.f27033a = tcVar;
    }

    public final void run() {
        C1372tc tcVar = this.f27033a;
        tcVar.f27108m.showAtLocation(tcVar.f27107l, 55, 0, 0);
        this.f27033a.mo16002u();
        if (this.f27033a.mo16001t()) {
            this.f27033a.f27107l.setAlpha(0.0f);
            C1372tc tcVar2 = this.f27033a;
            C1285px m = C1280ps.m19931m(tcVar2.f27107l);
            m.mo15708a(1.0f);
            tcVar2.f27110o = m;
            this.f27033a.f27110o.mo15711a(new C1357so(this));
            return;
        }
        this.f27033a.f27107l.setAlpha(1.0f);
        this.f27033a.f27107l.setVisibility(0);
    }
}

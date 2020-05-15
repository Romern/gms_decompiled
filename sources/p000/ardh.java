package p000;

/* renamed from: ardh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ardh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ardn f87421a;

    public ardh(ardn ardn) {
        this.f87421a = ardn;
    }

    public final void run() {
        ardn ardn = this.f87421a;
        ardn.f87446j.mo48650c(asbs.m73758a(ardn.f87445i).mo33916a("com.google").length);
        aucb aucb = ardn.f87459w;
        if (aucb != null) {
            sty sty = new sty(ardn.f87077f);
            aucb.mo50379a(sty, new ardd(ardn));
            aucb.mo50380a(sty, new arde(ardn));
        }
        aucb aucb2 = ardn.f87460x;
        if (aucb2 != null) {
            aucb2.mo50380a(new sty(ardn.f87077f), new ardf(ardn));
        }
        if (asbu.m73761a(ardn.f87453q)) {
            ardn.f87438h.mo25409a("Starting account transfer (3p mfm)", new Object[0]);
            ardn.f87458v = ardn.f87450n.mo48204a(ardn.f87445i, ardn.f87446j, ardn.f87461y, ardn.f87454r.booleanValue(), ardn.f87453q.f107836i);
            ardn.f87458v.mo48334a();
            return;
        }
        ardn.f87438h.mo25409a("Starting account transfer", new Object[0]);
        ardn.f87457u = ardn.f87450n.mo48205a(ardn.f87445i, ardn.f87446j, ardn.f87461y, ardn.f87455s, ardn.f87454r.booleanValue(), ardn.f87448l.f107816h);
        ardn.f87457u.mo48344a();
    }
}

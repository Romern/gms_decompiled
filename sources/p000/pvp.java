package p000;

/* renamed from: pvp */
final /* synthetic */ class pvp implements Runnable {

    /* renamed from: a */
    private final pvq f40372a;

    public pvp(pvq pvq) {
        this.f40372a = pvq;
    }

    public final void run() {
        pvq pvq = this.f40372a;
        pvq.f40378D = null;
        pjc pjc = pvq.f40388w;
        if (pjc != null) {
            double d = pjc.f39317f.f39566k;
            pvq.f40379n.mo23670a("updateVolume from %f to %f", Double.valueOf(pvq.f40389x), Double.valueOf(d));
            pvq.f40389x = d;
            pvq.f40383r.mo23453a(pvq.f40388w.f39230a.mo17494a(), pvq.f40389x);
        }
    }
}

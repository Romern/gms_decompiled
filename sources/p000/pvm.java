package p000;

/* renamed from: pvm */
final /* synthetic */ class pvm implements Runnable {

    /* renamed from: a */
    private final pvq f40367a;

    /* renamed from: b */
    private final int f40368b;

    public pvm(pvq pvq, int i) {
        this.f40367a = pvq;
        this.f40368b = i;
    }

    public final void run() {
        pvq pvq = this.f40367a;
        int i = this.f40368b;
        pvq.f40379n.mo23670a("onSetVolume() volume=%d", Integer.valueOf(i));
        if (pvq.f40388w != null) {
            double d = (double) i;
            double d2 = pvq.f40386u;
            Double.isNaN(d);
            pvq.mo23742b(d / d2);
        }
    }
}

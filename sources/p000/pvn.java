package p000;

/* renamed from: pvn */
final /* synthetic */ class pvn implements Runnable {

    /* renamed from: a */
    private final pvq f40369a;

    /* renamed from: b */
    private final int f40370b;

    public pvn(pvq pvq, int i) {
        this.f40369a = pvq;
        this.f40370b = i;
    }

    public final void run() {
        pvq pvq = this.f40369a;
        int i = this.f40370b;
        pvq.f40379n.mo23670a("onUpdateVolume() delta=%d", Integer.valueOf(i));
        if (pvq.f40388w != null) {
            double d = pvq.f40389x;
            double d2 = (double) i;
            double d3 = pvq.f40386u;
            Double.isNaN(d2);
            pvq.mo23742b(d + (d2 / d3));
        }
    }
}

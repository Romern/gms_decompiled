package p000;

/* renamed from: spq */
final /* synthetic */ class spq implements Runnable {

    /* renamed from: a */
    private final sps f44945a;

    /* renamed from: b */
    private final int f44946b;

    /* renamed from: c */
    private final boolean f44947c;

    public spq(sps sps, int i, boolean z) {
        this.f44945a = sps;
        this.f44946b = i;
        this.f44947c = z;
    }

    public final void run() {
        spr spr;
        sps sps = this.f44945a;
        int i = this.f44946b;
        boolean z = this.f44947c;
        synchronized (sps.f44949b) {
            spr = sps.f44950c;
        }
        if (spr != null) {
            spr.mo25943a(i, z);
        }
    }
}

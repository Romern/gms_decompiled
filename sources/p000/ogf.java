package p000;

/* renamed from: ogf */
final /* synthetic */ class ogf implements Runnable {

    /* renamed from: a */
    private final ogr f37550a;

    public ogf(ogr ogr) {
        this.f37550a = ogr;
    }

    public final void run() {
        ojq ojq = (ojq) this.f37550a;
        ojl ojl = ojq.f37796f;
        if (ojl != null) {
            int i = ojq.f37795e - 1;
            ojq.f37795e = i;
            if (i == 0) {
                ojq.f37796f = null;
                ojl.mo21210a();
            }
        }
    }
}

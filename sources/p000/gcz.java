package p000;

/* renamed from: gcz */
final /* synthetic */ class gcz implements Runnable {

    /* renamed from: a */
    private final gdd f17907a;

    /* renamed from: b */
    private final int f17908b;

    public gcz(gdd gdd, int i) {
        this.f17907a = gdd;
        this.f17908b = i;
    }

    public final void run() {
        gdd gdd = this.f17907a;
        int i = this.f17908b;
        gdd.f17927g[i] = false;
        gdd.mo11673b();
        gdc gdc = gdd.f17925e;
        if (gdc != null) {
            gdc.mo11669a(i);
            if (gdd.f17931k && !gdd.mo11672a()) {
                gdd.f17925e.mo11668a();
            }
        }
    }
}

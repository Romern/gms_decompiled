package p000;

/* renamed from: poy */
final /* synthetic */ class poy implements Runnable {

    /* renamed from: a */
    private final ppa f39961a;

    public poy(ppa ppa) {
        this.f39961a = ppa;
    }

    public final void run() {
        ppa ppa = this.f39961a;
        if (ppa.f39963a.mo23551a()) {
            for (pqd pqd : ppz.f40045d.mo23548c().values()) {
                pes pes = pes.f38974a;
                long currentTimeMillis = System.currentTimeMillis();
                long j = pqd.f40056b;
                if (j == 0 || j > currentTimeMillis || currentTimeMillis - j > cczq.f180312a.mo6606a().mo77116k()) {
                    ppa.f39964b.mo23535a(pqd.f40055a);
                }
            }
        }
    }
}

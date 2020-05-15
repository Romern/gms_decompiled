package p000;

/* renamed from: jld */
final /* synthetic */ class jld implements Runnable {

    /* renamed from: a */
    private final jle f22737a;

    public jld(jle jle) {
        this.f22737a = jle;
    }

    public final void run() {
        jle jle = this.f22737a;
        synchronized (jle.f22740c) {
            if (!jle.f22743f) {
                if (!jle.f22744g) {
                    jle.f22738a.mo25412b("Successfully fetched data for local device. Notifying callbacks.", new Object[0]);
                    for (jmg jmg : jle.f22739b) {
                        jmg.mo13877a(true, jle.f22741d, jle.f22742e);
                    }
                    jle.f22739b.clear();
                    jle.f22745h = false;
                }
            }
            jle.f22738a.mo25416d("Could not fetch data for local device. Notifying callbacks of failure.", new Object[0]);
            for (jmg jmg2 : jle.f22739b) {
                jmg2.mo13877a(false, null, null);
            }
            jle.f22739b.clear();
            jle.f22745h = false;
        }
    }
}

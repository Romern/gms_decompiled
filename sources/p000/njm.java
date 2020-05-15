package p000;

/* renamed from: njm */
final /* synthetic */ class njm {

    /* renamed from: a */
    private final njp f35837a;

    public njm(njp njp) {
        this.f35837a = njp;
    }

    /* renamed from: a */
    public final void mo20910a(njk njk) {
        njp njp = this.f35837a;
        synchronized (njp.f35844a) {
            if (njp.f35844a.contains(njk)) {
                njk.mo20897b();
            }
            njp.f35844a.remove(njk);
        }
    }
}

package p000;

/* renamed from: ahpp */
final /* synthetic */ class ahpp implements Runnable {

    /* renamed from: a */
    private final ahpq f67740a;

    /* renamed from: b */
    private final aipa f67741b;

    public ahpp(ahpq ahpq, aipa aipa) {
        this.f67740a = ahpq;
        this.f67741b = aipa;
    }

    public final void run() {
        ahpq ahpq = this.f67740a;
        aipa aipa = this.f67741b;
        ahms a = ahms.m56191a(aipa);
        if (a != null) {
            srn srn = ahkm.f67363a;
            ahkm.m55981a(ahpq.f67743b);
        } else {
            srz.m36171a(aipa);
        }
        ahpq.f67744c.mo36844a(ahpq.f67742a, aipa.f69126a, a, bvif.BLUETOOTH);
    }
}

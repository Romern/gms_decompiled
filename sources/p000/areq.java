package p000;

/* renamed from: areq */
final /* synthetic */ class areq implements aubq {

    /* renamed from: a */
    private final arez f87543a;

    /* renamed from: b */
    private final String f87544b;

    public areq(arez arez, String str) {
        this.f87543a = arez;
        this.f87544b = str;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        arez arez = this.f87543a;
        rod a = arez.f87554a.mo48606a(arez, this.f87544b);
        rob rob = a.f43429b;
        sdo.m34966a(rob, "Key should not be null");
        arez.f87554a.mo48608a(arez, new arev(a), new arew(rob));
    }
}

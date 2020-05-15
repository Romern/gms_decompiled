package p000;

/* renamed from: ahpv */
final /* synthetic */ class ahpv implements Runnable {

    /* renamed from: a */
    private final ahpw f67755a;

    /* renamed from: b */
    private final aiwf f67756b;

    public ahpv(ahpw ahpw, aiwf aiwf) {
        this.f67755a = ahpw;
        this.f67756b = aiwf;
    }

    public final void run() {
        ahpw ahpw = this.f67755a;
        aiwf aiwf = this.f67756b;
        String str = aiwf.f69126a;
        ahrn a = ahrn.m56434a(aiwf);
        if (a != null) {
            srn srn = ahkm.f67363a;
            ahkm.m55981a(ahpw.f67758b);
        } else {
            srz.m36171a(aiwf);
        }
        ahpw.f67759c.mo36844a(ahpw.f67757a, str, a, bvif.WIFI_LAN);
    }
}

package p000;

/* renamed from: trl */
final /* synthetic */ class trl implements aubq {

    /* renamed from: a */
    private final trs f46544a;

    /* renamed from: b */
    private final bngx f46545b;

    public trl(trs trs, bngx bngx) {
        this.f46544a = trs;
        this.f46545b = bngx;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        trs trs = this.f46544a;
        bngx bngx = this.f46545b;
        bngx e = bngx.m109376e();
        if (aucb.mo50384b()) {
            e = (bngx) aucb.mo50386d();
        }
        trs.mo26747a(e, bngx);
    }
}

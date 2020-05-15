package p000;

/* renamed from: ivm */
final /* synthetic */ class ivm implements aubq {

    /* renamed from: a */
    private final bqgy f21871a;

    public ivm(bqgy bqgy) {
        this.f21871a = bqgy;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        bqgy bqgy = this.f21871a;
        if (aucb.mo50384b()) {
            aups aups = (aups) aucb.mo50386d();
            bqgy.mo69138b(new ivn(true, aups.f92289b, aups.f92290c));
            return;
        }
        bqgy.mo69136a((Throwable) aucb.mo50387e());
    }
}

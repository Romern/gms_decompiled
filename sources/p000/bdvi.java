package p000;

/* renamed from: bdvi */
final /* synthetic */ class bdvi implements aubq {

    /* renamed from: a */
    private final bqgy f106503a;

    public bdvi(bqgy bqgy) {
        this.f106503a = bqgy;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        bqgy bqgy = this.f106503a;
        if (((auck) aucb).f91396d) {
            bqgy.cancel(false);
        } else if (aucb.mo50384b()) {
            bqgy.mo69138b(aucb.mo50386d());
        } else {
            Exception e = aucb.mo50387e();
            if (e != null) {
                bqgy.mo69136a((Throwable) e);
                return;
            }
            throw new IllegalStateException();
        }
    }
}

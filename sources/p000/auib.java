package p000;

/* renamed from: auib */
public final /* synthetic */ class auib implements aubq {

    /* renamed from: a */
    private final bqgy f91866a;

    public auib(bqgy bqgy) {
        this.f91866a = bqgy;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        bqgy bqgy = this.f91866a;
        if (((auck) aucb).f91396d) {
            bqgy.cancel(false);
        } else if (aucb.mo50384b()) {
            bqgy.mo69138b(aucb.mo50386d());
        } else {
            Throwable e = aucb.mo50387e();
            if (e == null) {
                e = new AssertionError();
            }
            bqgy.mo69136a(e);
        }
    }
}

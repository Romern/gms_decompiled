package p000;

/* renamed from: aeru */
public final /* synthetic */ class aeru implements aubq {

    /* renamed from: a */
    private final bqgy f63696a;

    public aeru(bqgy bqgy) {
        this.f63696a = bqgy;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        bqgy bqgy = this.f63696a;
        if (((auck) aucb).f91396d) {
            bqgy.cancel(false);
        } else if (aucb.mo50384b()) {
            bqgy.mo69138b(aucb.mo50386d());
        } else {
            Throwable e = aucb.mo50387e();
            if (e == null) {
                e = new IllegalStateException();
            }
            bqgy.mo69136a(e);
        }
    }
}

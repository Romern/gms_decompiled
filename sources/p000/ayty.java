package p000;

/* renamed from: ayty */
public final /* synthetic */ class ayty implements rkl {

    /* renamed from: a */
    private final bqgy f98487a;

    public ayty(bqgy bqgy) {
        this.f98487a = bqgy;
    }

    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        bqgy bqgy = this.f98487a;
        if (rkk.mo7183bo().f30115i == 16) {
            bqgy.cancel(false);
        } else if (rkk.mo7183bo().mo17710c()) {
            bqgy.mo69138b(rkk);
        } else if (rkk.mo7183bo().f30117k != null) {
            bqgy.mo69136a((Throwable) new rki(rkk.mo7183bo()));
        } else {
            bqgy.mo69136a((Throwable) new rjp(rkk.mo7183bo()));
        }
    }
}

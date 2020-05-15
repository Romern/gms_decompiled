package p000;

/* renamed from: mfu */
final /* synthetic */ class mfu implements Runnable {

    /* renamed from: a */
    private final mfv f33606a;

    /* renamed from: b */
    private final bxvd f33607b;

    public mfu(mfv mfv, bxvd bxvd) {
        this.f33606a = mfv;
        this.f33607b = bxvd;
    }

    public final void run() {
        mfv mfv = this.f33606a;
        bxvd bxvd = this.f33607b;
        mib mib = mfv.f33608a;
        mib.mo20034a(mpl.HEALTH_REPORT);
        mib.mo20032a((mpd) bxvd.mo74062i());
    }
}

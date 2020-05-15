package p000;

/* renamed from: zhq */
final /* synthetic */ class zhq implements Runnable {

    /* renamed from: a */
    private final zhr f55097a;

    public zhq(zhr zhr) {
        this.f55097a = zhr;
    }

    public final void run() {
        zhr zhr = this.f55097a;
        ((bnsl) zhr.f55098a.mo68388c()).mo68423a("BLE request timed out: holder=%s, timeoutSecs=%s", zhr.f55100c, cdzd.m135476e());
        zhr.mo31139a();
    }
}

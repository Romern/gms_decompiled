package p000;

/* renamed from: ahlc */
final /* synthetic */ class ahlc implements Runnable {

    /* renamed from: a */
    private final ahna f67421a;

    public ahlc(ahna ahna) {
        this.f67421a = ahna;
    }

    public final void run() {
        ahna ahna = this.f67421a;
        ((bnsl) ahkm.f67363a.mo68387b()).mo68418a("In BandwidthUpgradeManager, failed to read the ClientIntroductionFrame after %d ms. Timing out and closing EndpointChannel %s.", cfnv.m140797u(), ahna.mo36795a());
        ahna.mo36805g();
    }
}

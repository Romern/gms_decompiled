package p000;

/* renamed from: ahlr */
final /* synthetic */ class ahlr implements Runnable {

    /* renamed from: a */
    private final ahna f67475a;

    public ahlr(ahna ahna) {
        this.f67475a = ahna;
    }

    public final void run() {
        ahna ahna = this.f67475a;
        ((bnsl) ahkm.f67363a.mo68387b()).mo68418a("In BasePCPHandler, failed to read the ConnectionRequestFrame after %d ms. Timing out and closing EndpointChannel %s.", cfnv.m140798v(), ahna.mo36795a());
        ahna.mo36805g();
    }
}

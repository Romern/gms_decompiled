package p000;

/* renamed from: ahls */
final /* synthetic */ class ahls implements Runnable {

    /* renamed from: a */
    private final ahna f67476a;

    public ahls(ahna ahna) {
        this.f67476a = ahna;
    }

    public final void run() {
        ahna ahna = this.f67476a;
        ((bnsl) ahkm.f67363a.mo68387b()).mo68418a("In BasePCPHandler, failed to read the PairedKeyEncryption after %d ms. Timing out and closing EndpointChannel %s.", cfnv.m140750L(), ahna.mo36795a());
        ahna.mo36805g();
    }
}

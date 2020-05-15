package p000;

/* renamed from: ahmw */
final /* synthetic */ class ahmw implements Runnable {

    /* renamed from: a */
    private final ahkv f67583a;

    /* renamed from: b */
    private final String f67584b;

    /* renamed from: c */
    private final ahna f67585c;

    public ahmw(ahkv ahkv, String str, ahna ahna) {
        this.f67583a = ahkv;
        this.f67584b = str;
        this.f67585c = ahna;
    }

    public final void run() {
        ahkv ahkv = this.f67583a;
        String str = this.f67584b;
        ahna ahna = this.f67585c;
        bysc bysc = ahmz.f67589a;
        ((bnsl) ahkm.f67363a.mo68390d()).mo68425a("Timing out encryption for client %s to endpoint %s after %d ms", Long.valueOf(ahkv.mo36706b()), str, Long.valueOf(cfnv.m140740B()));
        ahna.mo36805g();
    }
}

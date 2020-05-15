package p000;

/* renamed from: ahmx */
final /* synthetic */ class ahmx implements Runnable {

    /* renamed from: a */
    private final ahkv f67586a;

    /* renamed from: b */
    private final String f67587b;

    /* renamed from: c */
    private final ahna f67588c;

    public ahmx(ahkv ahkv, String str, ahna ahna) {
        this.f67586a = ahkv;
        this.f67587b = str;
        this.f67588c = ahna;
    }

    public final void run() {
        ahkv ahkv = this.f67586a;
        String str = this.f67587b;
        ahna ahna = this.f67588c;
        bysc bysc = ahmz.f67589a;
        ((bnsl) ahkm.f67363a.mo68390d()).mo68425a("Timing out encryption for client %s to endpoint %s after %d ms", Long.valueOf(ahkv.mo36706b()), str, Long.valueOf(cfnv.m140740B()));
        ahna.mo36805g();
    }
}

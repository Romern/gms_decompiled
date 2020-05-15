package p000;

/* renamed from: ahlp */
final /* synthetic */ class ahlp implements Runnable {

    /* renamed from: a */
    private final ahmn f67468a;

    /* renamed from: b */
    private final String f67469b;

    /* renamed from: c */
    private final ahkv f67470c;

    public ahlp(ahmn ahmn, String str, ahkv ahkv) {
        this.f67468a = ahmn;
        this.f67469b = str;
        this.f67470c = ahkv;
    }

    public final void run() {
        ahmn ahmn = this.f67468a;
        String str = this.f67469b;
        ahkv ahkv = this.f67470c;
        ((bnsl) ahkm.f67363a.mo68390d()).mo68423a("Closing the connection to endpoint %s after %d ms", str, cfnv.m140751M());
        ahmn.f67545b.mo36892a(ahkv, str);
    }
}

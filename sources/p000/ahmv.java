package p000;

import java.io.IOException;

/* renamed from: ahmv */
final /* synthetic */ class ahmv implements Runnable {

    /* renamed from: a */
    private final ahmz f67578a;

    /* renamed from: b */
    private final ahkv f67579b;

    /* renamed from: c */
    private final String f67580c;

    /* renamed from: d */
    private final ahna f67581d;

    /* renamed from: e */
    private final ahmy f67582e;

    public ahmv(ahmz ahmz, ahkv ahkv, String str, ahna ahna, ahmy ahmy) {
        this.f67578a = ahmz;
        this.f67579b = ahkv;
        this.f67580c = str;
        this.f67581d = ahna;
        this.f67582e = ahmy;
    }

    public final void run() {
        ahmz ahmz = this.f67578a;
        ahkv ahkv = this.f67579b;
        String str = this.f67580c;
        ahna ahna = this.f67581d;
        ahmy ahmy = this.f67582e;
        srn srn = ahkm.f67363a;
        ahfi b = ahfi.m55635b(new ahmw(ahkv, str, ahna), cfnv.m140740B(), ahmz.f67590b);
        try {
            byse a = byse.m125241a(ahmz.f67589a);
            ahna.mo36799a(a.mo74493a());
            a.mo74492a(ahna.mo36803e());
            ahna.mo36799a(a.mo74493a());
            b.mo36396b();
            ahmz.m56197a(str, a, ahmy);
        } catch (byrq | bysb | IOException | IllegalStateException e) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68420a("In startClient(), UKEY2 failed with endpoint %s", str);
            if (e instanceof bysb) {
                try {
                    ahna.mo36799a(((bysb) e).mo74491a());
                } catch (IOException e2) {
                    bnsl bnsl2 = (bnsl) ahkm.f67363a.mo68388c();
                    bnsl2.mo68437a(e2);
                    bnsl2.mo68418a("Client %d failed to pass the alert error message to endpoint %s", ahkv.mo36706b(), str);
                }
            }
            b.mo36396b();
            ahmy.mo36848a(str, ahna);
        }
    }
}

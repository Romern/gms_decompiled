package p000;

import java.io.IOException;

/* renamed from: ahmu */
final /* synthetic */ class ahmu implements Runnable {

    /* renamed from: a */
    private final ahmz f67573a;

    /* renamed from: b */
    private final ahkv f67574b;

    /* renamed from: c */
    private final String f67575c;

    /* renamed from: d */
    private final ahna f67576d;

    /* renamed from: e */
    private final ahmy f67577e;

    public ahmu(ahmz ahmz, ahkv ahkv, String str, ahna ahna, ahmy ahmy) {
        this.f67573a = ahmz;
        this.f67574b = ahkv;
        this.f67575c = str;
        this.f67576d = ahna;
        this.f67577e = ahmy;
    }

    public final void run() {
        ahmz ahmz = this.f67573a;
        ahkv ahkv = this.f67574b;
        String str = this.f67575c;
        ahna ahna = this.f67576d;
        ahmy ahmy = this.f67577e;
        srn srn = ahkm.f67363a;
        ahfi b = ahfi.m55635b(new ahmx(ahkv, str, ahna), cfnv.m140740B(), ahmz.f67590b);
        try {
            byse b2 = byse.m125248b(ahmz.f67589a);
            b2.mo74492a(ahna.mo36803e());
            ahna.mo36799a(b2.mo74493a());
            b2.mo74492a(ahna.mo36803e());
            b.mo36396b();
            ahmz.m56197a(str, b2, ahmy);
        } catch (byrq | bysb | IOException | IllegalStateException e) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68420a("In startServer(), UKEY2 failed with endpoint %s", str);
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

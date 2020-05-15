package p000;

/* renamed from: tjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tjq {

    /* renamed from: a */
    public final bxhx f46204a;

    /* renamed from: b */
    public final doh f46205b;

    /* renamed from: c */
    private tka f46206c;

    /* renamed from: d */
    private tju f46207d;

    public tjq(doh doh, bxhx bxhx) {
        sdo.m34959a(bxhx);
        this.f46204a = bxhx;
        this.f46206c = null;
        this.f46207d = null;
        this.f46205b = doh;
    }

    /* renamed from: a */
    public static tjq m37091a(int i, bxxc bxxc) {
        tjo tjo = new tjo(null, i);
        tjo.mo26590a(bxxc.mo73642k());
        return tjo.mo26587a();
    }

    /* renamed from: a */
    public final int mo26591a() {
        return this.f46204a.f163482b;
    }

    /* renamed from: b */
    public final tka mo26592b() {
        tka tka = this.f46206c;
        if (tka != null) {
            return tka;
        }
        bxhx bxhx = this.f46204a;
        if ((bxhx.f163481a & 2) == 0) {
            return null;
        }
        bxeu bxeu = bxhx.f163483c;
        if (bxeu == null) {
            bxeu = bxeu.f163125e;
        }
        tka tka2 = new tka(bxeu);
        this.f46206c = tka2;
        return tka2;
    }

    /* renamed from: c */
    public final byte[] mo26593c() {
        return this.f46204a.f163484d.mo73780k();
    }

    /* renamed from: d */
    public final tju mo26594d() {
        tju tju = this.f46207d;
        if (tju != null) {
            return tju;
        }
        bxhx bxhx = this.f46204a;
        if ((bxhx.f163481a & 8) == 0) {
            return null;
        }
        bxdj bxdj = bxhx.f163485e;
        if (bxdj == null) {
            bxdj = bxdj.f163036e;
        }
        tju tju2 = new tju(bxdj);
        this.f46207d = tju2;
        return tju2;
    }

    public tjq(byte[] bArr, int i, doh doh) {
        bxhx bxhx;
        try {
            bxhx = (bxhx) bxvk.m124016a(bxhx.f163479f, bArr, bxus.m123744c());
        } catch (bxwf e) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("tjq", "<init>", 59, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[Feature] Could not parse feature proto.");
            bxhx = null;
        }
        this.f46204a = bxhx;
        this.f46206c = null;
        this.f46207d = null;
        this.f46205b = doh;
    }

    /* renamed from: a */
    public static tjq m37092a(doh doh, int i, bxxc bxxc) {
        tjo tjo = new tjo(doh, i);
        tjo.mo26590a(bxxc.mo73642k());
        return tjo.mo26587a();
    }
}

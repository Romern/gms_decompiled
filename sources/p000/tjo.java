package p000;

/* renamed from: tjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tjo {

    /* renamed from: a */
    private final doh f46201a;

    /* renamed from: b */
    private final bxvd f46202b;

    public tjo(doh doh, int i) {
        bxvd da = bxhx.f163479f.mo74144da();
        this.f46202b = da;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxhx bxhx = (bxhx) da.f164949b;
        bxhx.f163481a |= 1;
        bxhx.f163482b = i;
        this.f46201a = doh;
    }

    /* renamed from: a */
    public final tjq mo26587a() {
        bxvd bxvd = this.f46202b;
        if ((((bxhx) bxvd.f164949b).f163481a & 2) == 0) {
            bxeu c = tka.m37120c(dwq.m9665i().mo20505a());
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bxhx bxhx = (bxhx) bxvd.f164949b;
            bxhx bxhx2 = bxhx.f163479f;
            c.getClass();
            bxhx.f163483c = c;
            bxhx.f163481a |= 2;
        }
        return new tjq(this.f46201a, (bxhx) this.f46202b.mo74062i());
    }

    /* renamed from: a */
    public final void mo26588a(tju tju) {
        bxvd bxvd = this.f46202b;
        bxdj bxdj = tju.f46219a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bxhx bxhx = (bxhx) bxvd.f164949b;
        bxhx bxhx2 = bxhx.f163479f;
        bxdj.getClass();
        bxhx.f163485e = bxdj;
        bxhx.f163481a |= 8;
    }

    /* renamed from: a */
    public final void mo26589a(tka tka) {
        sdo.m34959a(tka);
        bxvd bxvd = this.f46202b;
        bxeu bxeu = tka.f46221a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bxhx bxhx = (bxhx) bxvd.f164949b;
        bxhx bxhx2 = bxhx.f163479f;
        bxeu.getClass();
        bxhx.f163483c = bxeu;
        bxhx.f163481a |= 2;
    }

    /* renamed from: a */
    public final void mo26590a(byte[] bArr) {
        bxvd bxvd = this.f46202b;
        ByteString a = ByteString.m123261a(bArr);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bxhx bxhx = (bxhx) bxvd.f164949b;
        bxhx bxhx2 = bxhx.f163479f;
        a.getClass();
        bxhx.f163481a |= 4;
        bxhx.f163484d = a;
    }
}

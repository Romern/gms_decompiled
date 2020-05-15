package p000;

/* renamed from: bdve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdve {

    /* renamed from: a */
    private final bmzi f106491a;

    /* renamed from: b */
    private final bxpp f106492b;

    /* renamed from: c */
    private final bbis f106493c;

    public bdve(bmzi bmzi, bbis bbis, bxpp bxpp) {
        this.f106491a = bmzn.m108681a(bmzi);
        this.f106493c = bbis;
        this.f106492b = bxpp;
    }

    /* renamed from: a */
    public final void mo58394a(int i, long j, int i2) {
        mo58395a(i, false, j, i2, null, null, null);
    }

    /* renamed from: a */
    public final void mo58395a(int i, boolean z, long j, int i2, bxom bxom, Boolean bool, Boolean bool2) {
        if (chbb.f188227a.mo6606a().mo84902c()) {
            long d = chbb.f188227a.mo6606a().mo84903d();
            if (this.f106493c.mo35048a(d)) {
                bxvd da = bxon.f164173h.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxon bxon = (bxon) da.f164949b;
                int i3 = bxon.f164175a | 1;
                bxon.f164175a = i3;
                bxon.f164176b = z;
                int i4 = i3 | 4;
                bxon.f164175a = i4;
                bxon.f164178d = j;
                if (i2 != 0) {
                    bxon.f164177c = i2 - 1;
                    i4 |= 2;
                    bxon.f164175a = i4;
                }
                if (bxom != null) {
                    bxon.f164179e = bxom.f164172e;
                    bxon.f164175a = i4 | 8;
                }
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bxon bxon2 = (bxon) da.f164949b;
                    bxon2.f164175a |= 16;
                    bxon2.f164180f = booleanValue;
                }
                if (bool2 != null) {
                    boolean booleanValue2 = bool2.booleanValue();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bxon bxon3 = (bxon) da.f164949b;
                    bxon3.f164175a |= 32;
                    bxon3.f164181g = booleanValue2;
                }
                bdrk bdrk = (bdrk) this.f106491a.mo6606a();
                bxvd da2 = bxpw.f164324h.mo74144da();
                int i5 = (int) d;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bxpw bxpw = (bxpw) da2.f164949b;
                int i6 = bxpw.f164326a | 64;
                bxpw.f164326a = i6;
                bxpw.f164329d = i5;
                bxpp bxpp = this.f106492b;
                bxpp.getClass();
                bxpw.f164330e = bxpp;
                bxpw.f164326a = i6 | 128;
                bxon bxon4 = (bxon) da.mo74062i();
                bxon4.getClass();
                bxpw.f164328c = bxon4;
                bxpw.f164327b = 8;
                bdrk.mo58311a(i, (bxpw) da2.mo74062i());
            }
        }
    }
}

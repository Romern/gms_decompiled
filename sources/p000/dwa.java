package p000;

import java.io.PrintWriter;

/* renamed from: dwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dwa implements sqt {

    /* renamed from: a */
    public bxcx f14241a;

    /* renamed from: b */
    public final dvz f14242b;

    /* renamed from: c */
    public drb f14243c;

    /* renamed from: d */
    public tlr f14244d;

    /* renamed from: e */
    public dvq f14245e;

    /* renamed from: f */
    private dwj f14246f;

    /* renamed from: g */
    private dwk f14247g;

    /* renamed from: h */
    private dwl f14248h;

    public dwa(bxcx bxcx, dvz dvz) {
        sdo.m34959a(dvz);
        this.f14242b = dvz;
        sdo.m34959a(bxcx);
        bxvd bxvd = (bxvd) bxcx.mo74142c(5);
        bxvd.mo73625a((bxvk) bxcx);
        bxvd da = bxcw.f162994e.mo74144da();
        String a = dvz.mo9738a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxcw bxcw = (bxcw) da.f164949b;
        a.getClass();
        bxcw.f162996a |= 1;
        bxcw.f162997b = a;
        String b = dvz.mo9739b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxcw bxcw2 = (bxcw) da.f164949b;
        b.getClass();
        bxcw2.f162996a |= 2;
        bxcw2.f162998c = b;
        String c = dvz.mo9740c();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxcw bxcw3 = (bxcw) da.f164949b;
        c.getClass();
        bxcw3.f162996a |= 4;
        bxcw3.f162999d = c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bxcx bxcx2 = (bxcx) bxvd.f164949b;
        bxcw bxcw4 = (bxcw) da.mo74062i();
        bxcx bxcx3 = bxcx.f163000i;
        bxcw4.getClass();
        bxcx2.f163009h = bxcw4;
        bxcx2.f163002a |= 64;
        this.f14241a = (bxcx) bxvd.mo74062i();
    }

    /* renamed from: a */
    public static long m9588a(dwa dwa) {
        if (!m9591b(dwa)) {
            return Long.MAX_VALUE;
        }
        if (dwa.mo9753g() == null || dwa.mo9753g().mo9780a() != 6) {
            return dwa.mo9744a() + Math.min(dwa.mo9750e().mo9778e(), cdgp.f180782a.mo6606a().mo77574as());
        }
        return dwa.mo9744a() + Math.min(dwa.mo9750e().mo9778e(), cdgp.m133214w());
    }

    /* renamed from: b */
    public static boolean m9591b(dwa dwa) {
        return dwa.mo9749d() && dwa.mo9750e().mo9777d() == 1;
    }

    /* renamed from: a */
    public final long mo9744a() {
        return this.f14241a.f163003b;
    }

    /* renamed from: c */
    public final boolean mo9748c() {
        return this.f14243c != null;
    }

    /* renamed from: d */
    public final boolean mo9749d() {
        return (this.f14241a.f163002a & 4) != 0;
    }

    /* renamed from: e */
    public final dwj mo9750e() {
        if (!mo9749d()) {
            return null;
        }
        if (this.f14246f == null) {
            bxda bxda = this.f14241a.f163005d;
            if (bxda == null) {
                bxda = bxda.f163011d;
            }
            this.f14246f = new dwj(bxda);
        }
        return this.f14246f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dwa) {
            return this.f14242b.equals(((dwa) obj).f14242b);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo9752f() {
        return (this.f14241a.f163002a & 8) != 0;
    }

    /* renamed from: g */
    public final dwk mo9753g() {
        if (!mo9752f()) {
            return null;
        }
        if (this.f14247g == null) {
            bxdf bxdf = this.f14241a.f163006e;
            if (bxdf == null) {
                bxdf = bxdf.f163018j;
            }
            this.f14247g = new dwk(bxdf);
        }
        return this.f14247g;
    }

    /* renamed from: h */
    public final boolean mo9754h() {
        return (this.f14241a.f163002a & 32) != 0;
    }

    public final int hashCode() {
        return this.f14242b.hashCode();
    }

    /* renamed from: i */
    public final dvq mo9756i() {
        if (!mo9754h()) {
            return null;
        }
        if (this.f14245e == null) {
            bxcv bxcv = this.f14241a.f163008g;
            if (bxcv == null) {
                bxcv = bxcv.f162989d;
            }
            this.f14245e = new dvq(bxcv);
        }
        return this.f14245e;
    }

    /* renamed from: j */
    public final int mo9757j() {
        return this.f14242b.f14239b;
    }

    /* renamed from: k */
    public final String mo9758k() {
        return this.f14242b.mo9738a();
    }

    /* renamed from: l */
    public final String mo9759l() {
        return null;
    }

    /* renamed from: m */
    public final String[] mo9760m() {
        return doi.m8937a(mo9747b().f162973bD, false);
    }

    /* renamed from: n */
    public final boolean mo9761n() {
        return false;
    }

    public final String toString() {
        dwl dwl;
        sdf a = sdg.m34948a(this);
        a.mo25396a("key", this.f14242b);
        a.mo25396a("t", Long.valueOf(mo9744a()));
        a.mo25396a("name", Integer.toString(mo9747b().f162973bD));
        a.mo25396a("lifetime", mo9750e());
        a.mo25396a("production", mo9753g());
        bxcx bxcx = this.f14241a;
        if ((bxcx.f163002a & 16) != 0) {
            if (this.f14248h == null) {
                bxdi bxdi = bxcx.f163007f;
                if (bxdi == null) {
                    bxdi = bxdi.f163030e;
                }
                this.f14248h = new dwl(bxdi);
            }
            dwl = this.f14248h;
        } else {
            dwl = null;
        }
        a.mo25396a("retention", dwl);
        a.mo25396a("dispatch", mo9756i());
        a.mo25396a("consumer", this.f14243c);
        return a.toString();
    }

    /* renamed from: b */
    public final bxco mo9747b() {
        bxco a = bxco.m122577a(this.f14241a.f163004c);
        return a == null ? bxco.UNKNOWN_CONTEXT_NAME : a;
    }

    /* renamed from: a */
    public static boolean m9589a(dwa dwa, int i) {
        return dwa.mo9752f() && dwa.mo9753g().mo9780a() == i;
    }

    /* renamed from: a */
    public static boolean m9590a(dwa dwa, long j) {
        return m9588a(dwa) <= j;
    }

    /* renamed from: a */
    public final void mo9745a(long j) {
        bxcx bxcx = this.f14241a;
        bxvd bxvd = (bxvd) bxcx.mo74142c(5);
        bxvd.mo73625a((bxvk) bxcx);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bxcx bxcx2 = (bxcx) bxvd.f164949b;
        bxcx bxcx3 = bxcx.f163000i;
        bxcx2.f163002a |= 1;
        bxcx2.f163003b = j;
        this.f14241a = (bxcx) bxvd.mo74062i();
    }

    /* renamed from: a */
    public final void mo9746a(PrintWriter printWriter) {
        printWriter.println(toString());
    }
}

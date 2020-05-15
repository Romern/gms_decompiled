package p000;

/* renamed from: bdjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdjq extends bdjt {

    /* renamed from: a */
    public static final bdjq f105762a = new bdjq();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo58090a(bxxc bxxc, bxxc bxxc2) {
        cimm cimm = (cimm) bxxc;
        cimm cimm2 = (cimm) bxxc2;
        if (cimm == null || cimm2 == null) {
            return cimm;
        }
        if ((cimm.f190750a & 1) == 0) {
            return null;
        }
        bxvd da = cimm.f190748d.mo74144da();
        cimn cimn = cimm.f190752c;
        if (cimn == null) {
            cimn = cimn.f190753d;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cimm cimm3 = (cimm) da.f164949b;
        cimn.getClass();
        cimm3.f190752c = cimn;
        int i = cimm3.f190750a | 2;
        cimm3.f190750a = i;
        int i2 = cimm.f190751b - cimm2.f190751b;
        if (i2 == 0) {
            return null;
        }
        cimm3.f190750a = i | 1;
        cimm3.f190751b = i2;
        return (cimm) da.mo74062i();
    }

    private bdjq() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo58091a(String str, Object obj) {
        int intValue = ((Long) obj).intValue();
        if (intValue == 0) {
            return null;
        }
        bxvd da = cimm.f190748d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cimm cimm = (cimm) da.f164949b;
        cimm.f190750a |= 1;
        cimm.f190751b = intValue;
        if (str != null) {
            cimn a = bdjw.m90935a(str);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cimm cimm2 = (cimm) da.f164949b;
            a.getClass();
            cimm2.f190752c = a;
            cimm2.f190750a |= 2;
        }
        return (cimm) da.mo74062i();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo58092a(bxxc bxxc) {
        cimn cimn = ((cimm) bxxc).f190752c;
        if (cimn == null) {
            cimn = cimn.f190753d;
        }
        return cimn.f190757c;
    }
}

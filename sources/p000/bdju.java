package p000;

import android.os.health.HealthStats;

/* renamed from: bdju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdju extends bdjt {

    /* renamed from: a */
    public static final bdju f105765a = new bdju();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo58090a(bxxc bxxc, bxxc bxxc2) {
        int i;
        int i2;
        cims cims = (cims) bxxc;
        cims cims2 = (cims) bxxc2;
        if (cims == null || cims2 == null) {
            return cims;
        }
        bxvd da = cims.f190776e.mo74144da();
        if (!((cims.f190778a & 1) == 0 || (i2 = cims.f190779b - cims2.f190779b) == 0)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cims cims3 = (cims) da.f164949b;
            cims3.f190778a |= 1;
            cims3.f190779b = i2;
        }
        if (!((cims.f190778a & 2) == 0 || (i = cims.f190780c - cims2.f190780c) == 0)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cims cims4 = (cims) da.f164949b;
            cims4.f190778a |= 2;
            cims4.f190780c = i;
        }
        cimn cimn = cims.f190781d;
        if (cimn == null) {
            cimn = cimn.f190753d;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cims cims5 = (cims) da.f164949b;
        cimn.getClass();
        cims5.f190781d = cimn;
        cims5.f190778a |= 4;
        cims cims6 = (cims) da.mo74062i();
        if (bdjw.m90941a(cims6)) {
            return null;
        }
        return cims6;
    }

    private bdju() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo58091a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        bxvd da = cims.f190776e.mo74144da();
        int a = (int) bdjw.m90934a(healthStats, 50001);
        if (a != 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cims cims = (cims) da.f164949b;
            cims.f190778a |= 1;
            cims.f190779b = a;
        }
        int a2 = (int) bdjw.m90934a(healthStats, 50002);
        if (a2 != 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cims cims2 = (cims) da.f164949b;
            cims2.f190778a |= 2;
            cims2.f190780c = a2;
        }
        if (str != null) {
            cimn a3 = bdjw.m90935a(str);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cims cims3 = (cims) da.f164949b;
            a3.getClass();
            cims3.f190781d = a3;
            cims3.f190778a |= 4;
        }
        cims cims4 = (cims) da.mo74062i();
        if (!bdjw.m90941a(cims4)) {
            return cims4;
        }
        return null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo58092a(bxxc bxxc) {
        cimn cimn = ((cims) bxxc).f190781d;
        if (cimn == null) {
            cimn = cimn.f190753d;
        }
        return cimn.f190757c;
    }
}

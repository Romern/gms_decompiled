package p000;

import android.os.health.HealthStats;

/* renamed from: bdjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdjs extends bdjt {

    /* renamed from: a */
    public static final bdjs f105764a = new bdjs();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo58090a(bxxc bxxc, bxxc bxxc2) {
        cimr cimr = (cimr) bxxc;
        cimr cimr2 = (cimr) bxxc2;
        if (cimr == null || cimr2 == null) {
            return cimr;
        }
        bxvd da = cimr.f190766i.mo74144da();
        if ((cimr.f190768a & 1) != 0) {
            long j = cimr.f190769b - cimr2.f190769b;
            if (j != 0) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cimr cimr3 = (cimr) da.f164949b;
                cimr3.f190768a |= 1;
                cimr3.f190769b = j;
            }
        }
        if ((cimr.f190768a & 2) != 0) {
            long j2 = cimr.f190770c - cimr2.f190770c;
            if (j2 != 0) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cimr cimr4 = (cimr) da.f164949b;
                cimr4.f190768a |= 2;
                cimr4.f190770c = j2;
            }
        }
        if ((cimr.f190768a & 4) != 0) {
            long j3 = cimr.f190771d - cimr2.f190771d;
            if (j3 != 0) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cimr cimr5 = (cimr) da.f164949b;
                cimr5.f190768a |= 4;
                cimr5.f190771d = j3;
            }
        }
        if ((cimr.f190768a & 8) != 0) {
            long j4 = cimr.f190772e - cimr2.f190772e;
            if (j4 != 0) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cimr cimr6 = (cimr) da.f164949b;
                cimr6.f190768a |= 8;
                cimr6.f190772e = j4;
            }
        }
        if ((cimr.f190768a & 16) != 0) {
            long j5 = cimr.f190773f - cimr2.f190773f;
            if (j5 != 0) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cimr cimr7 = (cimr) da.f164949b;
                cimr7.f190768a |= 16;
                cimr7.f190773f = j5;
            }
        }
        if ((cimr.f190768a & 32) != 0) {
            long j6 = cimr.f190774g - cimr2.f190774g;
            if (j6 != 0) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cimr cimr8 = (cimr) da.f164949b;
                cimr8.f190768a |= 32;
                cimr8.f190774g = j6;
            }
        }
        cimn cimn = cimr.f190775h;
        if (cimn == null) {
            cimn = cimn.f190753d;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cimr cimr9 = (cimr) da.f164949b;
        cimn.getClass();
        cimr9.f190775h = cimn;
        cimr9.f190768a |= 64;
        cimr cimr10 = (cimr) da.mo74062i();
        if (bdjw.m90940a(cimr10)) {
            return null;
        }
        return cimr10;
    }

    private bdjs() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo58091a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        bxvd da = cimr.f190766i.mo74144da();
        long a = bdjw.m90934a(healthStats, 30001);
        if (a != 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cimr cimr = (cimr) da.f164949b;
            cimr.f190768a |= 1;
            cimr.f190769b = a;
        }
        long a2 = bdjw.m90934a(healthStats, 30002);
        if (a2 != 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cimr cimr2 = (cimr) da.f164949b;
            cimr2.f190768a |= 2;
            cimr2.f190770c = a2;
        }
        long a3 = bdjw.m90934a(healthStats, 30003);
        if (a3 != 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cimr cimr3 = (cimr) da.f164949b;
            cimr3.f190768a |= 4;
            cimr3.f190771d = a3;
        }
        long a4 = bdjw.m90934a(healthStats, 30004);
        if (a4 != 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cimr cimr4 = (cimr) da.f164949b;
            cimr4.f190768a |= 8;
            cimr4.f190772e = a4;
        }
        long a5 = bdjw.m90934a(healthStats, 30005);
        if (a5 != 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cimr cimr5 = (cimr) da.f164949b;
            cimr5.f190768a |= 16;
            cimr5.f190773f = a5;
        }
        long a6 = bdjw.m90934a(healthStats, 30006);
        if (a6 != 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cimr cimr6 = (cimr) da.f164949b;
            cimr6.f190768a |= 32;
            cimr6.f190774g = a6;
        }
        if (str != null) {
            cimn a7 = bdjw.m90935a(str);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cimr cimr7 = (cimr) da.f164949b;
            a7.getClass();
            cimr7.f190775h = a7;
            cimr7.f190768a |= 64;
        }
        cimr cimr8 = (cimr) da.mo74062i();
        if (!bdjw.m90940a(cimr8)) {
            return cimr8;
        }
        return null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo58092a(bxxc bxxc) {
        cimn cimn = ((cimr) bxxc).f190775h;
        if (cimn == null) {
            cimn = cimn.f190753d;
        }
        return cimn.f190757c;
    }
}

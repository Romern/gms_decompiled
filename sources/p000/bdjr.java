package p000;

import android.os.health.HealthStats;
import java.util.Collections;

/* renamed from: bdjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdjr extends bdjt {

    /* renamed from: a */
    public static final bdjr f105763a = new bdjr();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo58090a(bxxc bxxc, bxxc bxxc2) {
        cimp cimp = (cimp) bxxc;
        cimp cimp2 = (cimp) bxxc2;
        if (cimp == null || cimp2 == null) {
            return cimp;
        }
        cimo cimo = (cimo) cimp.f190758e.mo74144da();
        cimo.mo86228a(bdju.f105765a.mo58093a(cimp.f190761b, cimp2.f190761b));
        cimo.mo86229b(bdjq.f105762a.mo58093a(cimp.f190762c, cimp2.f190762c));
        cimn cimn = cimp.f190763d;
        if (cimn == null) {
            cimn = cimn.f190753d;
        }
        if (cimo.f164950c) {
            cimo.mo74035c();
            cimo.f164950c = false;
        }
        cimp cimp3 = (cimp) cimo.f164949b;
        cimn.getClass();
        cimp3.f190763d = cimn;
        cimp3.f190760a |= 1;
        cimp cimp4 = (cimp) cimo.mo74062i();
        if (bdjw.m90939a(cimp4)) {
            return null;
        }
        return cimp4;
    }

    private bdjr() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo58091a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        cimo cimo = (cimo) cimp.f190758e.mo74144da();
        cimo.mo86228a(bdju.f105765a.mo58094a(bdjw.m90945d(healthStats, 40001)));
        cimo.mo86229b(bdjq.f105762a.mo58094a((healthStats != null && healthStats.hasMeasurements(40002)) ? healthStats.getMeasurements(40002) : Collections.emptyMap()));
        if (str != null) {
            cimn a = bdjw.m90935a(str);
            if (cimo.f164950c) {
                cimo.mo74035c();
                cimo.f164950c = false;
            }
            cimp cimp = (cimp) cimo.f164949b;
            a.getClass();
            cimp.f190763d = a;
            cimp.f190760a |= 1;
        }
        cimp cimp2 = (cimp) cimo.mo74062i();
        if (!bdjw.m90939a(cimp2)) {
            return cimp2;
        }
        return null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo58092a(bxxc bxxc) {
        cimn cimn = ((cimp) bxxc).f190763d;
        if (cimn == null) {
            cimn = cimn.f190753d;
        }
        return cimn.f190757c;
    }
}

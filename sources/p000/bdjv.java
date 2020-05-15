package p000;

import android.os.health.TimerStat;

/* renamed from: bdjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdjv extends bdjt {

    /* renamed from: a */
    public static final bdjv f105766a = new bdjv();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo58090a(bxxc bxxc, bxxc bxxc2) {
        return bdjw.m90936a((cimt) bxxc, (cimt) bxxc2);
    }

    private bdjv() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxxc mo58091a(String str, Object obj) {
        return bdjw.m90937a(str, (TimerStat) obj);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo58092a(bxxc bxxc) {
        cimt cimt = (cimt) bxxc;
        cimn cimn = cimt.f190787d;
        if (cimn == null) {
            cimn = cimn.f190753d;
        }
        if ((cimn.f190755a & 2) == 0) {
            cimn cimn2 = cimt.f190787d;
            if (cimn2 == null) {
                cimn2 = cimn.f190753d;
            }
            return Long.toHexString(cimn2.f190756b);
        }
        cimn cimn3 = cimt.f190787d;
        if (cimn3 == null) {
            cimn3 = cimn.f190753d;
        }
        return cimn3.f190757c;
    }
}

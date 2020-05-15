package p000;

import java.math.BigDecimal;

/* renamed from: bnwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnwt {

    /* renamed from: a */
    public static final /* synthetic */ int f132324a = 0;

    static {
        double d = bnvr.f132238a;
        new bnvo(Math.min(4.0d, 2.0d - bnvr.f132239b));
        new BigDecimal("0.25");
        new BigDecimal("0.5");
        new BigDecimal("2");
        new BigDecimal("4");
    }

    /* renamed from: a */
    public static int m110685a(bnwk bnwk, bnwk bnwk2, bnwk bnwk3) {
        int i;
        double a = bnwk.m110661a(bnwk3, bnwk, bnwk2);
        if (a < 1.6E-15d) {
            i = a <= -1.6E-15d ? -1 : 0;
        } else {
            i = 1;
        }
        return i == 0 ? bnws.m110684a(bnwk, bnwk2, bnwk3) : i;
    }

    /* renamed from: a */
    public static bnvc m110686a(bnwk bnwk) {
        return new bnvc(bnvh.m110492a(bnwk.f132306h), bnvh.m110492a(bnwk.f132307i), bnvh.m110492a(bnwk.f132308j));
    }

    /* renamed from: a */
    public static boolean m110687a(bnwk bnwk, bnwk bnwk2, bnwk bnwk3, bnwk bnwk4) {
        int i;
        if (m110685a(bnwk2, bnwk4, bnwk) >= 0) {
            i = 1;
        } else {
            i = 0;
        }
        if (m110685a(bnwk3, bnwk4, bnwk2) >= 0) {
            i++;
        }
        if (m110685a(bnwk, bnwk4, bnwk3) > 0) {
            i++;
        }
        return i >= 2;
    }
}

package p000;

import java.util.HashMap;

/* renamed from: bscq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bscq {

    /* renamed from: a */
    private static final HashMap f144106a;

    static {
        HashMap hashMap = new HashMap();
        f144106a = hashMap;
        Float valueOf = Float.valueOf(2.4f);
        hashMap.put("bullhead", valueOf);
        f144106a.put("angler", valueOf);
        HashMap hashMap2 = f144106a;
        Float valueOf2 = Float.valueOf(2.0f);
        hashMap2.put("sailfish", valueOf2);
        f144106a.put("marlin", valueOf2);
    }

    /* renamed from: a */
    public static float m115245a(String str) {
        if (str == null || !f144106a.containsKey(str)) {
            return 1.0f;
        }
        return ((Float) f144106a.get(str)).floatValue();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    /* renamed from: a */
    static bsbl m115246a(bsbl bsbl, float f) {
        bsbl bsbl2;
        float f2;
        float f3 = 10000.0f;
        if (bsbl.mo70190e()) {
            bsbj n = bsbl.mo70201n();
            n.mo70178a(bsbl.f143966b, bsbl.f143967c, (int) Math.max(((float) bsbl.f143968d) * f, 10000.0f));
            bsbl2 = n.mo70174a();
        } else {
            bsbl2 = bsbl;
        }
        if (!bsbl.mo70192f()) {
            return bsbl2;
        }
        bsbj n2 = bsbl.mo70201n();
        int i = bsbl.f143966b;
        int i2 = bsbl.f143967c;
        float f4 = (float) bsbl2.f143968d;
        if (f4 >= 50000.0f) {
            f3 = f4;
        } else {
            if (f4 >= 26000.0f) {
                f4 = (f4 - 1.7249584E-4f) * 0.85f;
                f2 = 28000.0f;
            } else if (f4 >= 22000.0f) {
                f3 = ((f4 - 2.0229816E-4f) * 2.6f) + 22000.0f;
            } else if (f4 >= 15000.0f) {
                f2 = -4000.0f;
            }
            f3 = f2 + f4;
        }
        n2.mo70178a(i, i2, (int) f3);
        return n2.mo70174a();
    }
}

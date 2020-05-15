package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: buix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buix implements buiw {

    /* renamed from: a */
    private final bulq f153989a;

    /* renamed from: b */
    private final bukn f153990b;

    /* renamed from: c */
    private final int f153991c;

    /* renamed from: d */
    private final int f153992d;

    /* renamed from: e */
    private final boolean f153993e;

    public buix(bulq bulq, bukn bukn, int i, int i2, boolean z) {
        this.f153989a = bulq;
        this.f153990b = bukn;
        this.f153991c = i;
        this.f153992d = i2;
        this.f153993e = z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(long, long):long}
      ClspMth{java.lang.Math.max(float, float):float} */
    /* renamed from: a */
    static int m119587a(float f) {
        double min = (double) Math.min(Math.max(f, -100.0f) + 60.0f, 0.0f);
        Double.isNaN(min);
        Double.isNaN(min);
        return (int) ((100.0d * min * min) + 20000.0d);
    }

    /* renamed from: a */
    private static Set m119588a(Map map, Long l) {
        Set set = (Set) map.get(l);
        if (set != null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        map.put(l, hashSet);
        return hashSet;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x04ba  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0543  */
    /* renamed from: a */
    public final bfni mo72716a(Set set, bukm bukm) {
        int i;
        int i2;
        int i3;
        bfni bfni;
        bfni bfni2;
        bfni bfni3;
        bfni bfni4;
        double d;
        buix buix;
        bukh bukh;
        String str;
        String str2;
        int i4;
        bukh bukh2;
        String str3;
        bukm bukm2 = bukm;
        int size = set.size();
        int i5 = 2;
        if (size != 0) {
            char c = 0;
            char c2 = 1;
            if (size == 1) {
                buje buje = (buje) set.iterator().next();
                int[] iArr = new int[2];
                ayvd.m84904a(buje.f154009b, iArr);
                if (this.f153993e) {
                    i = m119587a(buje.f154013f);
                } else {
                    i = this.f153991c;
                }
                return new bfni(iArr[0], iArr[1], i);
            } else if (size != 2) {
                HashMap hashMap = new HashMap();
                Iterator it = set.iterator();
                while (true) {
                    i3 = 18;
                    if (!it.hasNext()) {
                        break;
                    }
                    buje buje2 = (buje) it.next();
                    m119588a(hashMap, Long.valueOf(ayvd.m84899a(buje2.f154009b, 18))).add(buje2);
                }
                long[] jArr = new long[8];
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : hashMap.entrySet()) {
                    Long valueOf = Long.valueOf(((Long) entry.getKey()).longValue());
                    m119588a(hashMap2, valueOf).addAll((Collection) entry.getValue());
                    if (ayvd.m84906a(valueOf.longValue()) && ayvd.m84910b(valueOf.longValue()) == 18) {
                        ayvd.m84902a(valueOf.longValue(), 18, jArr);
                        for (int i6 = 0; i6 < 8; i6++) {
                            long j = jArr[i6];
                            if (ayvd.m84906a(j)) {
                                m119588a(hashMap2, Long.valueOf(j)).addAll((Collection) entry.getValue());
                            }
                        }
                    }
                }
                bukn bukn = this.f153990b;
                for (Map.Entry entry2 : hashMap2.entrySet()) {
                    Set set2 = (Set) entry2.getValue();
                    if (!set2.isEmpty()) {
                        int b = bukn.f154098a.mo72851b();
                        ((bukh[]) bukn.f154098a.f154233a)[b].mo72764a();
                        ((bukh[]) bukn.f154098a.f154233a)[b].f154084b = ((Long) entry2.getKey()).longValue();
                        ((bukh[]) bukn.f154098a.f154233a)[b].f154085c = set2;
                    }
                }
                bulp bulp = (bulp) this.f153989a;
                bulp.f154178s.mo72709a("ld_").mo72708b(bulp.f154162c);
                if (this.f153990b.mo72788a() == 0) {
                    buix = this;
                } else if (this.f153989a.mo72825e()) {
                    buix = this;
                } else {
                    bulp bulp2 = (bulp) this.f153989a;
                    String str4 = "cbc_";
                    bulp2.f154178s.mo72709a(str4).mo72707a(bulp2.f154162c);
                    bukn bukn2 = this.f153990b;
                    bukh bukh3 = new bukh();
                    int i7 = 50000;
                    while (true) {
                        if (i3 <= 22) {
                            int i8 = bukn2.f154098a.f154234b;
                            if (i8 == 0) {
                                bukh = bukh3;
                                str = str4;
                                break;
                            }
                            int i9 = 0;
                            while (i9 < i8) {
                                bukh bukh4 = ((bukh[]) bukn2.f154098a.f154233a)[i9];
                                bumh bumh = bukh4.f154086d;
                                double[] dArr = new double[i5];
                                ayvd.m84914b(bukh4.f154084b, dArr);
                                double d2 = dArr[c];
                                double d3 = dArr[c2];
                                double d4 = 0.0d;
                                for (buje buje3 : bukh4.f154085c) {
                                    d4 += bukn2.f154099b.mo72791a(d2, d3, buje3);
                                }
                                bumh.f154236a = d4;
                                bukh4.f154086d.f154237b = bukh4.f154085c.size();
                                i9++;
                                i5 = 2;
                                c = 0;
                                c2 = 1;
                            }
                            Arrays.sort((bukh[]) bukn2.f154098a.f154233a, 0, i8, bukh.f154083e);
                            bukh bukh5 = ((bukh[]) bukn2.f154098a.f154233a)[0];
                            if (!bukh3.mo72766b() || bukh5.f154086d.f154236a >= bukh3.f154086d.f154236a) {
                                bukh3.mo72765a(bukh5);
                            }
                            if (i3 != 20) {
                                bukh2 = bukh3;
                                str3 = str4;
                            } else if (bukh3.mo72766b()) {
                                int[] iArr2 = new int[2];
                                ayvd.m84904a(bukh3.f154084b, iArr2);
                                int i10 = bukh3.f154086d.f154237b;
                                if (i10 >= 3) {
                                    int[] iArr3 = new int[2];
                                    int i11 = 0;
                                    double d5 = 0.0d;
                                    double d6 = 0.0d;
                                    for (int a = bukn2.mo72788a(); i11 < a; a = a) {
                                        double d7 = bukn2.mo72789a(i11).f154086d.f154236a;
                                        double d8 = (double) i10;
                                        Double.isNaN(d8);
                                        double exp = Math.exp(d7 / d8);
                                        ayvd.m84904a(bukn2.mo72789a(i11).f154084b, iArr3);
                                        d5 += Math.min(ayuo.m84843a(iArr2[0], iArr2[1], iArr3[0], iArr3[1]), 200.0d) * exp;
                                        d6 += exp;
                                        i11++;
                                        str4 = str4;
                                        bukh3 = bukh3;
                                        i10 = i10;
                                    }
                                    bukh2 = bukh3;
                                    str3 = str4;
                                    i7 = (int) Math.max(Math.min(Math.round(Math.pow(d5 / d6, 1.0d) * 1000.0d), 50000L), 5000L);
                                } else {
                                    bukh2 = bukh3;
                                    str3 = str4;
                                    i7 = 50000;
                                }
                            } else {
                                bukh2 = bukh3;
                                str3 = str4;
                            }
                            if (i3 != 22) {
                                bukn2.f154098a.mo72852b(40);
                                boolean z = false;
                                for (int min = Math.min(bukn2.f154098a.f154234b, 10) - 1; min >= 0; min--) {
                                    bukh bukh6 = ((bukh[]) bukn2.f154098a.f154233a)[min];
                                    int i12 = 3;
                                    while (i12 >= 0) {
                                        int i13 = (min * 4) + i12;
                                        bukh bukh7 = ((bukh[]) bukn2.f154098a.f154233a)[i13];
                                        bukh7.mo72765a(bukh6);
                                        bukh7.f154084b = ayvd.m84912b(bukh6.f154084b, i12);
                                        bukh7.f154086d.mo72853a();
                                        if (!z) {
                                            bukn2.f154098a.f154234b = i13 + 1;
                                        }
                                        i12--;
                                        z = true;
                                    }
                                }
                            }
                            i3++;
                            str4 = str3;
                            bukh3 = bukh2;
                            i5 = 2;
                            c = 0;
                            c2 = 1;
                        } else {
                            bukh = bukh3;
                            str = str4;
                            break;
                        }
                    }
                    bfne a2 = bfne.m97311a(bukh, Integer.valueOf(i7));
                    bukh bukh8 = (bukh) a2.f114467a;
                    if (bukh8.mo72766b()) {
                        int intValue = ((Integer) a2.f114468b).intValue();
                        int[] iArr4 = new int[2];
                        ayvd.m84904a(bukh8.f154084b, iArr4);
                        int i14 = bukh8.f154086d.f154237b;
                        if (i14 < 3) {
                            str2 = str;
                            i4 = intValue;
                        } else if (!bukn.m119749b(iArr4[0])) {
                            int a3 = bukn2.mo72788a();
                            int[] iArr5 = new int[2];
                            double a4 = ayuo.m84842a(iArr4[0]);
                            double a5 = ayuo.m84842a(iArr4[1]);
                            int i15 = 0;
                            int i16 = 0;
                            double d9 = 0.0d;
                            double d10 = 0.0d;
                            double d11 = 0.0d;
                            while (i15 < a3) {
                                int i17 = a3;
                                int i18 = i16;
                                double d12 = bukn2.mo72789a(i15).f154086d.f154236a;
                                int i19 = intValue;
                                double d13 = d9;
                                double d14 = (double) i14;
                                Double.isNaN(d14);
                                double exp2 = Math.exp(d12 / d14);
                                ayvd.m84904a(bukn2.mo72789a(i15).f154084b, iArr5);
                                double d15 = ayuo.m84853d(ayuo.m84842a(iArr5[0]) - a4);
                                int[] iArr6 = iArr5;
                                String str5 = str;
                                double a6 = ayuo.m84840a(ayuo.m84850c(ayuo.m84842a(iArr5[1]) - a5), a4);
                                if ((d15 * d15) + (a6 * a6) < 10000.0d) {
                                    d10 += d15 * exp2;
                                    d11 += a6 * exp2;
                                    d13 += exp2;
                                    i16 = i18 + 1;
                                } else {
                                    i16 = i18;
                                }
                                i15++;
                                intValue = i19;
                                iArr5 = iArr6;
                                a3 = i17;
                                d9 = d13;
                                str = str5;
                            }
                            int i20 = i16;
                            str2 = str;
                            i4 = intValue;
                            double d16 = d9;
                            if (d16 > 0.0d && i20 >= 3) {
                                bfni = bukn.m119748a(a4, a5, i4, d10 / d16, d11 / d16);
                            }
                        } else {
                            str2 = str;
                            i4 = intValue;
                        }
                        int[] iArr7 = new int[2];
                        ayvd.m84904a(bukh8.f154084b, iArr7);
                        bfni = new bfni(iArr7[0], iArr7[1], i4);
                    } else {
                        str2 = str;
                        bfni = null;
                    }
                    bulp bulp3 = (bulp) this.f153989a;
                    bulp3.f154178s.mo72709a(str2).mo72708b(bulp3.f154162c);
                    if (bfni == null) {
                        bukm.mo72781a(4, ((bulp) this.f153989a).f154162c.mo62775b());
                        bfni = null;
                    }
                    if (!set.isEmpty()) {
                        bfni2 = bfni;
                        bfni3 = null;
                    } else if (bfni == null || bukn.m119749b(bfni.f114480b)) {
                        bfni2 = bfni;
                        bfni3 = null;
                    } else {
                        int i21 = bfni.f114480b;
                        int i22 = bfni.f114481c;
                        int[] iArr8 = new int[2];
                        double a7 = ayuo.m84842a(i21);
                        double a8 = ayuo.m84842a(i22);
                        Iterator it2 = set.iterator();
                        double d17 = 0.0d;
                        double d18 = 0.0d;
                        double d19 = 0.0d;
                        while (it2.hasNext()) {
                            buje buje4 = (buje) it2.next();
                            ayvd.m84904a(buje4.f154009b, iArr8);
                            double c3 = ayuo.m84852c(iArr8[0] - i21);
                            double a9 = ayuo.m84840a(ayuo.m84850c(ayuo.m84842a(iArr8[1]) - a8), a7);
                            double d20 = (double) buje4.f154013f;
                            Double.isNaN(d20);
                            double min2 = Math.min(Math.max(((d20 * 0.025d) + 2.406d) * Math.pow((double) buje4.f154011d, 3.0d), 0.0d), 1.0d);
                            d18 += min2;
                            d17 += c3 * min2;
                            d19 += a9 * min2;
                            it2 = it2;
                            bfni = bfni;
                            iArr8 = iArr8;
                            i21 = i21;
                            a8 = a8;
                            a7 = a7;
                        }
                        bfni2 = bfni;
                        bfni3 = bukn.m119748a(a7, a8, Integer.MAX_VALUE, d17 / d18, d19 / d18);
                    }
                    if (bfni3 == null) {
                        bfni4 = bfni2;
                        double a10 = ayuo.m84843a(bfni3.f114480b, bfni3.f114481c, bfni4.f114480b, bfni4.f114481c);
                        if (a10 <= 1000.0d) {
                            if (a10 < 75.0d) {
                                d = 1.0d / ((Math.exp((a10 / 75.0d) * -8.0d) * 20.0d) + 1.0d);
                            } else {
                                d = 1.0d;
                            }
                            double d21 = (double) bfni4.f114482d;
                            double d22 = a10 * d;
                            Double.isNaN(d21);
                            Double.isNaN(d21);
                            int min3 = Math.min(100000, (int) Math.round(Math.sqrt((d21 * d21) + (1000000.0d * d22 * d22))));
                            int i23 = bfni4.f114480b;
                            int i24 = bfni4.f114481c;
                            int i25 = bfni3.f114480b;
                            int i26 = bfni3.f114481c;
                            double a11 = ayuo.m84842a(i23);
                            double a12 = ayuo.m84842a(i24);
                            return bukn.m119748a(a11, a12, min3, d * ayuo.m84852c(i25 - i23), d * ayuo.m84840a(ayuo.m84850c(ayuo.m84842a(i26) - a12), a11));
                        }
                    } else {
                        bfni4 = bfni2;
                    }
                    return bfni4;
                }
                buix.f153990b.mo72790b();
                bfni = null;
                if (!set.isEmpty()) {
                }
                if (bfni3 == null) {
                }
                return bfni4;
            } else {
                Iterator it3 = set.iterator();
                buje buje5 = (buje) it3.next();
                buje buje6 = (buje) it3.next();
                if (buje5.f154013f <= buje6.f154013f) {
                    buje5 = buje6;
                }
                int[] iArr9 = new int[2];
                ayvd.m84904a(buje5.f154009b, iArr9);
                if (this.f153993e) {
                    i2 = m119587a(buje5.f154013f);
                } else {
                    i2 = this.f153992d;
                }
                return new bfni(iArr9[0], iArr9[1], i2);
            }
        } else {
            bukm2.mo72781a(2, ((bulp) this.f153989a).f154162c.mo62775b());
            return null;
        }
    }
}

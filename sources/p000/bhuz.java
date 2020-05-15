package p000;

import java.util.Arrays;
import java.util.List;

/* renamed from: bhuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhuz implements bhve {

    /* renamed from: a */
    private static final double f119676a = (Math.sqrt(2.0d) * 8.0d);

    /* renamed from: a */
    static double m101592a(double d) {
        if (d < 0.0d) {
            return -m101592a(-d);
        }
        if (d > 40.0d) {
            return 1.0d;
        }
        double d2 = (d * ((((((0.078108d * d) + 9.72E-4d) * d) + 0.230389d) * d) + 0.278393d)) + 1.0d;
        return 1.0d - (1.0d / (((d2 * d2) * d2) * d2));
    }

    /* renamed from: a */
    public final String mo64340a() {
        return "Beacon";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0172, code lost:
        r11 = r25;
     */
    /* renamed from: a */
    public final bhvi mo64339a(bhtx bhtx, List list) {
        int i;
        List list2;
        bhtv[] bhtvArr;
        int i2;
        float f;
        int i3;
        int i4;
        List list3;
        bhtx bhtx2 = bhtx;
        List list4 = list;
        if (bhtx2.f119582c == null) {
            bhuj.m101555a().mo64358a("No beacon scan available - ignoring candidates.");
            return null;
        }
        bhuj.m101555a();
        List a = bhvc.m101600a(list.size());
        List list5 = bhtx2.f119582c.f119573a;
        C1245ok okVar = new C1245ok();
        int size = list5.size();
        for (int i5 = 0; i5 < size; i5++) {
            bhtv bhtv = (bhtv) list5.get(i5);
            bhtv bhtv2 = (bhtv) okVar.get(bhtv.f119574a);
            if (bhtv2 == null) {
                okVar.put(bhtv.f119574a, bhtv);
            } else if (bhtv2.f119577d < bhtv.f119577d) {
                okVar.put(bhtv.f119574a, bhtv);
            }
        }
        int i6 = okVar.f26809h;
        bhtv[] bhtvArr2 = new bhtv[i6];
        for (int i7 = 0; i7 < okVar.f26809h; i7++) {
            bhtvArr2[i7] = (bhtv) okVar.mo15621c(i7);
        }
        int i8 = 0;
        while (i8 < list.size()) {
            bhue bhue = (bhue) a.get(i8);
            bxwc bxwc = ((bhsu) list4.get(i8)).f119498a.f157005j;
            if (!bxwc.isEmpty()) {
                int size2 = bxwc.size();
                int i9 = 0;
                int i10 = 0;
                while (i9 < size2) {
                    int i11 = i6;
                    List list6 = a;
                    int i12 = i8;
                    bhtv[] bhtvArr3 = bhtvArr2;
                    if ((((bvnc) bxwc.get(i9)).f156849a & 2) == 0) {
                        i10++;
                    }
                    i9++;
                    i6 = i11;
                    bhtvArr2 = bhtvArr3;
                    a = list6;
                    i8 = i12;
                }
                int i13 = Integer.MIN_VALUE;
                double d = 0.0d;
                double d2 = 0.0d;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                boolean z = false;
                while (i15 < i6) {
                    bhtv bhtv3 = bhtvArr2[i15];
                    int i17 = i6;
                    int i18 = bhtv3.f119574a.f119571a;
                    bhtv[] bhtvArr4 = bhtvArr2;
                    if (i18 != 1) {
                        i3 = i18 != 3 ? i18 != 5 ? 1 : 4 : 2;
                    } else {
                        i3 = 3;
                    }
                    if (i3 == 1) {
                        list3 = a;
                        i4 = i8;
                    } else {
                        Integer num = bhtv3.f119576c;
                        list3 = a;
                        if (num == null || num.intValue() <= -41) {
                            i16++;
                        }
                        byte[] bArr = bhtv3.f119574a.f119572b;
                        int size3 = bxwc.size();
                        int i19 = i16;
                        int i20 = 0;
                        while (true) {
                            if (i20 >= size3) {
                                i4 = i8;
                                break;
                            }
                            int i21 = size3;
                            bvnc bvnc = (bvnc) bxwc.get(i20);
                            i4 = i8;
                            bvnf bvnf = bvnc.f156850b;
                            if (bvnf == null) {
                                bvnf = bvnf.f156854d;
                            }
                            if ((bvnf.f156856a & 1) != 0) {
                                bvnf bvnf2 = bvnc.f156850b;
                                if (bvnf2 == null) {
                                    bvnf2 = bvnf.f156854d;
                                }
                                int a2 = bvne.m121282a(bvnf2.f156857b);
                                if (a2 == 0) {
                                    a2 = 1;
                                }
                                if (a2 != i3) {
                                    continue;
                                } else {
                                    bvnf bvnf3 = bvnc.f156850b;
                                    if (bvnf3 == null) {
                                        bvnf3 = bvnf.f156854d;
                                    }
                                    if (Arrays.equals(bvnf3.f156858c.getKey(), bArr)) {
                                        if ((bvnc.f156849a & 2) != 0) {
                                            double intValue = (double) (bhtv3.f119575b.intValue() - bvnc.f156851c);
                                            double d3 = f119676a;
                                            Double.isNaN(intValue);
                                            double a3 = (m101592a(intValue / d3) + 1.0d) * 0.5d;
                                            double max = Math.max(d, a3);
                                            if (a3 > 0.5d) {
                                                d2 += Math.log(a3) - Math.log1p(-a3);
                                            }
                                            d = max;
                                            i16 = i19;
                                            z = true;
                                        } else {
                                            Integer num2 = bhtv3.f119576c;
                                            if (num2 == null || num2.intValue() <= -41) {
                                                i14++;
                                                i13 = Math.max(i13, bhtv3.f119575b.intValue());
                                                i16 = i19;
                                            }
                                        }
                                    }
                                }
                            }
                            i20++;
                            size3 = i21;
                            i8 = i4;
                        }
                    }
                    i15++;
                    i6 = i17;
                    bhtvArr2 = bhtvArr4;
                    a = list3;
                    i8 = i4;
                }
                i2 = i6;
                list2 = a;
                i = i8;
                bhtvArr = bhtvArr2;
                if (i14 > 0) {
                    bhue.mo64306a(0, Float.valueOf(1.0f));
                    bhue.mo64306a(2, Float.valueOf((((float) i13) + 120.0f) / 120.0f));
                    float f2 = (float) i14;
                    bhue.mo64306a(4, Float.valueOf(f2 / ((float) i10)));
                    bhue.mo64306a(5, Float.valueOf(f2 / ((float) i16)));
                } else if (i10 > 0) {
                    bhue.mo64306a(3, Float.valueOf(1.0f));
                    Float valueOf = Float.valueOf(0.0f);
                    bhue.mo64306a(4, valueOf);
                    bhue.mo64306a(5, valueOf);
                }
                if (z) {
                    if (d > 0.5d) {
                        f = (float) (1.0d / (Math.exp(-d2) + 1.0d));
                    } else {
                        f = (float) d;
                    }
                    bhue.mo64306a(1, Float.valueOf((f + f) - 4.0f));
                }
            } else {
                i2 = i6;
                list2 = a;
                i = i8;
                bhtvArr = bhtvArr2;
            }
            i8 = i + 1;
            list4 = list;
            i6 = i2;
            bhtvArr2 = bhtvArr;
            a = list2;
        }
        return new bhvi(list, a);
    }
}

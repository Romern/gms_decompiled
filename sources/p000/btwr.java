package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: btwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btwr {

    /* renamed from: a */
    private static final double f152751a = (-Math.log10(0.01d));

    /* renamed from: b */
    private static final double f152752b = (-Math.log10(0.15d));

    /* renamed from: c */
    private static final double f152753c = (-Math.log10(0.19d));

    /* renamed from: d */
    private static final double f152754d = (-Math.log10(1.0E-11d));

    /* renamed from: e */
    private final btxh f152755e;

    /* renamed from: f */
    private final btwv f152756f;

    public btwr() {
        this(btwy.m118969b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03fb, code lost:
        if ((r9 - r6) >= r11.f152774b) goto L_0x0405;
     */
    /* renamed from: a */
    public final List mo72452a(List list) {
        double d;
        int size;
        int i;
        boolean z;
        List list2;
        double[] dArr;
        double d2;
        int[][] iArr;
        double d3;
        int i2;
        double d4;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        btwu btwu;
        ArrayList arrayList = list;
        if (!list.isEmpty()) {
            btwv btwv = this.f152756f;
            int i5 = 0;
            char c = 1;
            if (!list.isEmpty() && btwv.f152760a.f152780h) {
                ArrayList arrayList2 = new ArrayList();
                int i6 = 0;
                while (i6 < list.size()) {
                    btxc btxc = (btxc) arrayList.get(i6);
                    if (btxc.mo72462b()) {
                        if (btxc.mo72463c() >= btwv.f152760a.f152782j) {
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        int i7 = i6 + 1;
                        while (true) {
                            if (i7 >= list.size()) {
                                btwu = new btwu(i6, list.size() - 1, i4);
                                break;
                            }
                            btxc btxc2 = (btxc) arrayList.get(i7);
                            if (!btxc2.mo72462b()) {
                                btwu = new btwu(i6, i7 - 1, i4);
                                break;
                            }
                            if (btxc2.mo72463c() >= btwv.f152760a.f152782j) {
                                i4++;
                            }
                            i7++;
                        }
                        if (btwu.f152759c >= btwv.f152760a.f152781i) {
                            break;
                        }
                        arrayList2.add(btwu);
                        i6 = btwu.f152758b + 1;
                    } else {
                        i6++;
                    }
                }
                ArrayList arrayList3 = new ArrayList(list.size());
                for (int i8 = 0; i8 < list.size(); i8++) {
                    btxc btxc3 = (btxc) arrayList.get(i8);
                    if (!btwv.m118963a(i8, arrayList2)) {
                        arrayList3.add(btxc3);
                    } else {
                        List<btxa> a = btxc3.mo72461a();
                        ArrayList arrayList4 = new ArrayList(a.size());
                        for (btxa btxa : a) {
                            int i9 = btxa.f152784a;
                            if (i9 == 4) {
                                arrayList4.add(new btxa(1, btxa.f152785b));
                            } else if (i9 == 1) {
                                arrayList4.add(new btxa(4, btxa.f152785b));
                            } else {
                                arrayList4.add(btxa);
                            }
                        }
                        arrayList3.add(new btxc(new btxb(arrayList4, btxc3.mo72465e()), Double.valueOf(Double.MIN_VALUE)));
                    }
                }
                arrayList = arrayList3;
            }
            int i10 = btxf.f152797c;
            char c2 = 2;
            int[] iArr2 = new int[2];
            iArr2[1] = arrayList.size() + 1;
            iArr2[0] = i10;
            int[][] iArr3 = (int[][]) Array.newInstance(int.class, iArr2);
            int i11 = btxf.f152797c;
            int[] iArr4 = new int[2];
            iArr4[1] = arrayList.size() + 1;
            iArr4[0] = i11;
            int[][] iArr5 = (int[][]) Array.newInstance(int.class, iArr4);
            int[] iArr6 = btxf.f152796b;
            int length = iArr6.length;
            int i12 = 0;
            while (i12 < length) {
                Arrays.fill(iArr5[iArr6[i12]], -1);
                i12++;
                arrayList = arrayList;
                i5 = 0;
                c = 1;
                c2 = 2;
            }
            double[] dArr2 = new double[btxf.f152797c];
            double[] dArr3 = new double[btxf.f152797c];
            long[] jArr = new long[btxf.f152797c];
            long[] jArr2 = new long[btxf.f152797c];
            long[] jArr3 = new long[arrayList.size()];
            long[] jArr4 = new long[arrayList.size()];
            jArr3[i5] = ((btxc) arrayList.get(i5)).mo72465e();
            int[] iArr7 = btxf.f152796b;
            int length2 = iArr7.length;
            int i13 = 0;
            while (i13 < length2) {
                int i14 = iArr7[i13];
                iArr3[i14][0] = i14;
                i13++;
                arrayList = arrayList;
                jArr3 = jArr3;
                i5 = 0;
                c = 1;
                c2 = 2;
            }
            double d5 = f152752b;
            dArr2[i5] = d5;
            double d6 = f152751a;
            dArr2[c] = d6;
            dArr2[c2] = d5;
            int i15 = 3;
            dArr2[3] = d6;
            dArr2[4] = d5;
            int i16 = 5;
            dArr2[5] = d5;
            double d7 = f152753c;
            dArr2[6] = d7;
            dArr2[7] = d7;
            long j = -1;
            boolean z4 = false;
            int i17 = 0;
            while (true) {
                d = Double.MAX_VALUE;
                if (i17 >= arrayList.size()) {
                    break;
                }
                btxc btxc4 = (btxc) arrayList.get(i17);
                jArr3[i17] = btxc4.mo72465e();
                if (j == -1 || !btxc4.f152789a.mo72457a() || btxc4.f152789a.mo72458b().f152784a != i15) {
                    j = btxc4.mo72465e();
                }
                if (i17 != 0) {
                    jArr4[i17] = jArr3[i17] - jArr3[i17 - 1];
                }
                if (btxc4.f152789a.mo72457a()) {
                    z = btxc4.f152789a.mo72458b().f152784a == i16;
                } else {
                    z = false;
                }
                List a2 = btww.m118965a(btxc4.mo72461a());
                int[] iArr8 = btxf.f152796b;
                long[] jArr5 = jArr3;
                int length3 = iArr8.length;
                List list3 = arrayList;
                int i18 = 0;
                while (i18 < length3) {
                    int i19 = length3;
                    int i20 = iArr8[i18];
                    if (!z) {
                        list2 = a2;
                        dArr = dArr2;
                        d2 = -Math.log10(btww.m118964a(i20, btxc4, a2));
                    } else {
                        list2 = a2;
                        dArr = dArr2;
                        d2 = 0.0d;
                    }
                    int[] iArr9 = iArr8;
                    btxg a3 = this.f152755e.mo72471a(i20);
                    boolean z5 = z4;
                    int[] iArr10 = btxf.f152796b;
                    btxc btxc5 = btxc4;
                    int length4 = iArr10.length;
                    int i21 = i18;
                    int[] iArr11 = iArr10;
                    double d8 = Double.MAX_VALUE;
                    int i22 = 0;
                    int i23 = -1;
                    while (i22 < length4) {
                        int[][] iArr12 = iArr5;
                        int i24 = iArr11[i22];
                        if (!z) {
                            d3 = d2;
                            i2 = i23;
                            z2 = z5;
                            d4 = btxi.m118980a(i24, i20, z2, btxc5.mo72465e() - j);
                        } else {
                            i2 = i23;
                            d3 = d2;
                            z2 = z5;
                            d4 = i24 != i20 ? f152754d : 0.0d;
                        }
                        double d9 = d4 + dArr[i24];
                        if (!z) {
                            i3 = i20;
                            btxg a4 = this.f152755e.mo72471a(i24);
                            if (a4 == a3) {
                                z3 = z2;
                            } else if (a4 != null) {
                                long j2 = jArr[i24];
                                z3 = z2;
                                if (a4.f152799b == i24) {
                                    j2 += jArr4[i17];
                                }
                                if (j2 < a4.f152798a) {
                                    d9 += btxh.f152800a;
                                }
                            }
                            if (d9 >= d8 && d8 != Double.MAX_VALUE) {
                                i23 = i2;
                            } else {
                                i23 = i24;
                                d8 = d9;
                            }
                            i22++;
                            i20 = i3;
                            z5 = z3;
                            iArr5 = iArr12;
                            d2 = d3;
                        } else {
                            i3 = i20;
                        }
                        z3 = z2;
                        if (d9 >= d8) {
                            i23 = i2;
                            i22++;
                            i20 = i3;
                            z5 = z3;
                            iArr5 = iArr12;
                            d2 = d3;
                        }
                        i23 = i24;
                        d8 = d9;
                        i22++;
                        i20 = i3;
                        z5 = z3;
                        iArr5 = iArr12;
                        d2 = d3;
                    }
                    int[] iArr13 = iArr3[i23];
                    int[] iArr14 = iArr5[i20];
                    int i25 = i17;
                    while (true) {
                        if (i25 < 0) {
                            iArr = iArr5;
                            break;
                        }
                        int i26 = iArr13[i25];
                        iArr = iArr5;
                        if (i26 == iArr14[i25] && i25 < i17) {
                            break;
                        }
                        iArr14[i25] = i26;
                        i25--;
                        iArr5 = iArr;
                    }
                    iArr14[i17 + 1] = i20;
                    dArr3[i20] = d8 + d2;
                    if (!z) {
                        if (a3 == null) {
                            jArr2[i20] = 0;
                        } else if (this.f152755e.mo72471a(i23) == a3) {
                            long j3 = jArr[i23];
                            jArr2[i20] = j3;
                            if (a3.f152799b == i23) {
                                jArr2[i20] = j3 + jArr4[i17];
                            }
                        } else {
                            jArr2[i20] = 0;
                        }
                    }
                    i18 = i21 + 1;
                    length3 = i19;
                    iArr8 = iArr9;
                    z4 = z5;
                    dArr2 = dArr;
                    a2 = list2;
                    btxc4 = btxc5;
                    iArr5 = iArr;
                }
                i17++;
                z4 = z;
                jArr3 = jArr5;
                arrayList = list3;
                i16 = 5;
                i15 = 3;
                iArr3 = iArr5;
                iArr5 = iArr3;
                dArr3 = dArr2;
                dArr2 = dArr3;
                jArr2 = jArr;
                jArr = jArr2;
            }
            List list4 = arrayList;
            long[] jArr6 = jArr3;
            double[] dArr4 = dArr2;
            int[] iArr15 = btxf.f152796b;
            int length5 = iArr15.length;
            int i27 = -1;
            int i28 = 0;
            while (i28 < length5) {
                int i29 = iArr15[i28];
                double d10 = dArr4[i29];
                double d11 = d10 < d ? d10 : d;
                if (d10 < d) {
                    i27 = i29;
                }
                i28++;
                d = d11;
            }
            if (i27 == -1) {
                return new ArrayList();
            }
            int[] iArr16 = iArr3[i27];
            ArrayList arrayList5 = new ArrayList(list4.size());
            int i30 = 0;
            while (i30 < list4.size()) {
                List list5 = list4;
                if (((btxa) ((btxc) list5.get(i30)).mo72461a().get(0)).f152784a != 5 || i30 + 1 >= list5.size()) {
                    i = iArr16[i30 + 1];
                } else {
                    i = iArr16[i30 + 2];
                }
                arrayList5.add(new btwq(jArr6[i30], i));
                i30++;
                list4 = list5;
            }
            btwv btwv2 = this.f152756f;
            if (arrayList5.isEmpty()) {
                return arrayList5;
            }
            ArrayList arrayList6 = new ArrayList();
            long j4 = -1;
            int i31 = 0;
            while (i31 < arrayList5.size()) {
                btwq btwq = (btwq) arrayList5.get(i31);
                int i32 = btwq.f152749b;
                long j5 = btwq.f152748a;
                if (i32 == 0 || i32 == 1) {
                    i31++;
                    j4 = j5;
                } else if (i32 == 2 || i32 == 3) {
                    int i33 = i31 + 1;
                    while (true) {
                        if (i33 >= arrayList5.size()) {
                            size = arrayList5.size() - 1;
                            break;
                        }
                        int i34 = ((btwq) arrayList5.get(i33)).f152749b;
                        if (i34 != 2 && i34 != 3) {
                            size = i33 - 1;
                            break;
                        }
                        i33++;
                    }
                    if (!btwv2.f152760a.f152778f || ((btwq) arrayList5.get(size)).f152748a - ((btwq) arrayList5.get(i31)).f152748a >= btwv2.f152760a.f152779g) {
                        btwy btwy = btwv2.f152760a;
                        if (btwy.f152773a) {
                            if (j4 != -1) {
                            }
                        }
                        i31 = size + 1;
                    }
                    arrayList6.add(new btwu(i31, size));
                    i31 = size + 1;
                } else {
                    i31++;
                }
            }
            if (arrayList6.isEmpty()) {
                return arrayList5;
            }
            ArrayList arrayList7 = new ArrayList(arrayList5.size());
            for (int i35 = 0; i35 < arrayList5.size(); i35++) {
                btwq btwq2 = (btwq) arrayList5.get(i35);
                if (btwv.m118963a(i35, arrayList6)) {
                    arrayList7.add(new btwq(btwq2.f152748a, 7));
                } else {
                    arrayList7.add(btwq2);
                }
            }
            return arrayList7;
        }
        throw new IllegalArgumentException("Need at least 1 observation");
    }

    public btwr(btwy btwy) {
        if (btwy == null) {
            btwy.m118969b();
        }
        this.f152755e = new btxh(btwy);
        this.f152756f = new btwv(btwy);
    }
}

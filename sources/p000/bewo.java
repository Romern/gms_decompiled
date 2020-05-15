package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bewo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bewo {

    /* renamed from: a */
    public final bewj f112834a;

    /* renamed from: b */
    public final bewl f112835b = new bewl();

    /* renamed from: c */
    private final double[][] f112836c;

    /* renamed from: d */
    private final double[] f112837d;

    /* renamed from: e */
    private final int f112838e;

    /* renamed from: f */
    private final bewp[] f112839f;

    /* renamed from: g */
    private final bewi f112840g;

    @Deprecated
    public bewo(double[] dArr, double[][] dArr2, double[][] dArr3, double[][][] dArr4, int[] iArr, double[] dArr5, int[] iArr2, int[] iArr3, bfnl bfnl) {
        int i;
        double d;
        double[] dArr6 = dArr;
        this.f112838e = dArr6.length;
        this.f112834a = new bewj(bfnl);
        int i2 = this.f112838e;
        this.f112837d = new double[i2];
        int[] iArr4 = new int[2];
        iArr4[1] = i2;
        iArr4[0] = i2;
        this.f112836c = (double[][]) Array.newInstance(double.class, iArr4);
        int i3 = 0;
        while (true) {
            i = this.f112838e;
            if (i3 >= i) {
                break;
            }
            double[] dArr7 = this.f112837d;
            double d2 = dArr6[i3];
            if (d2 > 0.0d) {
                d = Math.log(d2);
            } else {
                d = -1.0E20d;
            }
            dArr7[i3] = d;
            for (int i4 = 0; i4 < this.f112838e; i4++) {
                double[] dArr8 = this.f112836c[i3];
                double d3 = dArr2[i3][i4];
                dArr8[i4] = d3 > 0.0d ? Math.log(d3) : -1.0E20d;
            }
            i3++;
        }
        this.f112839f = new bewp[i];
        this.f112840g = new bewi(dArr3, dArr4);
        for (int i5 = 0; i5 < this.f112838e; i5++) {
            this.f112839f[i5] = new bewp(iArr[i5], dArr5[i5], iArr2[i5], iArr3[i5]);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.reflect.Array.newInstance(java.lang.Class<?>, int[]):java.lang.Object VARARG throws java.lang.IllegalArgumentException, java.lang.NegativeArraySizeException}
     arg types: [java.lang.Class<double>, int[]]
     candidates:
      ClspMth{java.lang.reflect.Array.newInstance(java.lang.Class<?>, int):java.lang.Object throws java.lang.NegativeArraySizeException}
      ClspMth{java.lang.reflect.Array.newInstance(java.lang.Class<?>, int[]):java.lang.Object VARARG throws java.lang.IllegalArgumentException, java.lang.NegativeArraySizeException} */
    /* renamed from: a */
    public final List mo61201a(long j) {
        int length;
        int i;
        int i2;
        double d;
        bewi bewi;
        int i3;
        bewp[] bewpArr;
        double[][] dArr;
        bewj bewj;
        int i4;
        int i5;
        double[][] dArr2;
        double[][] dArr3;
        double d2;
        double d3;
        double d4;
        double d5;
        double[][] dArr4;
        long j2;
        int i6;
        double[][] dArr5;
        Class<double> cls;
        int i7;
        int i8;
        double[][] dArr6;
        Class<double> cls2 = double.class;
        int a = this.f112834a.mo61193a();
        ArrayList arrayList = new ArrayList();
        long j3 = j - (((long) a) * 360000);
        bewj bewj2 = this.f112834a;
        bewp[] bewpArr2 = this.f112839f;
        bewi bewi2 = this.f112840g;
        double[][] dArr7 = this.f112836c;
        double[] dArr8 = this.f112837d;
        int length2 = bewpArr2.length;
        bewi2.mo61191a();
        int a2 = bewj2.mo61193a();
        int a3 = bewj2.mo61193a();
        int[] iArr = new int[2];
        iArr[1] = length2;
        iArr[0] = a3 + 1;
        double[][] dArr9 = (double[][]) Array.newInstance((Class<?>) cls2, iArr);
        int i9 = 0;
        while (i9 < a3) {
            int i10 = ((bewj2.f112812b - i9) + 240) % 240;
            bewi2.mo61191a();
            int i11 = a3;
            int length3 = bewpArr2.length;
            double[] dArr10 = dArr8;
            double[] dArr11 = new double[length3];
            ArrayList arrayList2 = arrayList;
            for (int i12 = 0; i12 < length3; i12++) {
                dArr11[i12] = -1.0E20d;
            }
            int i13 = 1;
            while (true) {
                j2 = j3;
                if (i13 > bewj.m95984a(bewpArr2)) {
                    cls = cls2;
                    i6 = i10;
                    dArr5 = dArr9;
                    i7 = 0;
                    break;
                }
                int i14 = ((i10 + i13) + 240) % 240;
                bewi2.mo61192a(bewj2.f112815e[i14]);
                int i15 = 0;
                while (i15 < length3) {
                    bewp bewp = bewpArr2[i15];
                    Class<double> cls3 = cls2;
                    if (i13 < bewp.f112841a) {
                        i8 = i10;
                        dArr6 = dArr9;
                    } else if (i13 <= bewp.f112842b) {
                        i8 = i10;
                        dArr6 = dArr9;
                        dArr11[i15] = bewk.m95991a(dArr11[i15], (i14 != bewj2.f112811a ? dArr9[i14][i15] : 0.0d) + bewi2.mo61190a(i15));
                    } else {
                        i8 = i10;
                        dArr6 = dArr9;
                    }
                    i15++;
                    cls2 = cls3;
                    dArr9 = dArr6;
                    i10 = i8;
                }
                cls = cls2;
                i6 = i10;
                dArr5 = dArr9;
                if (i14 != bewj2.f112811a) {
                    i13++;
                    j3 = j2;
                    cls2 = cls;
                    dArr9 = dArr5;
                    i10 = i6;
                } else {
                    for (int i16 = 0; i16 < length3; i16++) {
                        if (i13 < bewpArr2[i16].f112841a) {
                            dArr11[i16] = bewk.m95991a(dArr11[i16], bewi2.mo61190a(i16));
                        }
                    }
                    i7 = 0;
                }
            }
            while (i7 < length2) {
                double d6 = -1.0E20d;
                for (int i17 = 0; i17 < length2; i17++) {
                    d6 = bewk.m95991a(d6, dArr11[i17] + dArr7[i7][i17]);
                }
                dArr5[i6][i7] = d6;
                i7++;
            }
            i9++;
            a3 = i11;
            dArr8 = dArr10;
            arrayList = arrayList2;
            j3 = j2;
            cls2 = cls;
            dArr9 = dArr5;
        }
        ArrayList arrayList3 = arrayList;
        long j4 = j3;
        double[][] dArr12 = dArr9;
        double[] dArr13 = dArr8;
        int i18 = a2 + 1;
        int[] iArr2 = new int[2];
        iArr2[1] = length2;
        iArr2[0] = i18;
        Class<double> cls4 = cls2;
        double[][] dArr14 = (double[][]) Array.newInstance((Class<?>) cls4, iArr2);
        int[] iArr3 = new int[2];
        iArr3[1] = length2;
        iArr3[0] = i18;
        double[][] dArr15 = (double[][]) Array.newInstance((Class<?>) cls4, iArr3);
        int i19 = a2;
        while (i19 >= 0) {
            int i20 = bewj2.f112811a;
            int i21 = ((i20 - i19) + 240) % 240;
            int i22 = a2 - i19;
            int i23 = i22 + 1;
            int a4 = bewj.m95984a(bewpArr2);
            int length4 = bewpArr2.length;
            double[][] dArr16 = dArr7;
            int i24 = a2;
            int[] iArr4 = new int[2];
            iArr4[1] = a4 + 1;
            iArr4[0] = length4;
            double[][] dArr17 = (double[][]) Array.newInstance((Class<?>) cls4, iArr4);
            bewi2.mo61191a();
            int i25 = 1;
            while (i25 <= a4) {
                double[][] dArr18 = dArr17;
                Class<double> cls5 = cls4;
                bewp[] bewpArr3 = bewpArr2;
                bewi bewi3 = bewi2;
                int i26 = length2;
                if (i25 <= i23) {
                    bewi = bewi3;
                    bewi.mo61192a(bewj2.f112815e[(((i21 + 240) - i25) + 1) % 240]);
                    i3 = 0;
                } else {
                    bewi = bewi3;
                    i3 = 0;
                }
                while (true) {
                    bewpArr = bewpArr3;
                    if (i3 >= bewpArr.length) {
                        break;
                    }
                    bewp bewp2 = bewpArr[i3];
                    int i27 = ((i21 + 240) - i25) % 240;
                    if (i25 <= bewp2.f112842b && (i21 == i20 || i25 >= bewp2.f112841a)) {
                        double a5 = bewi.mo61190a(i3);
                        if (i25 >= i23) {
                            dArr2 = dArr15;
                            i4 = i19;
                            dArr = dArr16;
                            d2 = dArr13[i3];
                            bewj = bewj2;
                            i5 = a4;
                            dArr3 = dArr14;
                        } else {
                            dArr2 = dArr15;
                            i4 = i19;
                            d2 = -1.0E20d;
                            int i28 = 0;
                            while (true) {
                                bewj = bewj2;
                                dArr4 = dArr16;
                                i5 = a4;
                                if (i28 >= dArr4.length) {
                                    break;
                                }
                                d2 = bewk.m95991a(d2, dArr14[i27][i28] + dArr4[i28][i3]);
                                i28++;
                                dArr14 = dArr14;
                                a4 = i5;
                                bewj2 = bewj;
                                dArr16 = dArr4;
                            }
                            dArr = dArr4;
                            dArr3 = dArr14;
                        }
                        double d7 = a5 + d2;
                        if (i21 != i20) {
                            if (i25 < bewp2.f112841a || i25 > bewp2.f112842b) {
                                d5 = -1.0E20d;
                            } else {
                                if (bewp2.f112843c == null) {
                                    bewp2.mo61202a();
                                }
                                d5 = bewp2.f112843c[i25];
                            }
                            d3 = d7 + d5;
                        } else {
                            if (i25 <= bewp2.f112842b) {
                                if (bewp2.f112844d == null) {
                                    bewp2.mo61202a();
                                }
                                int i29 = bewp2.f112841a;
                                if (i25 < i29) {
                                    d4 = bewp2.f112844d[i29];
                                } else {
                                    d4 = bewp2.f112844d[i25];
                                }
                            } else {
                                d4 = -1.0E20d;
                            }
                            d3 = d7 + d4;
                        }
                        dArr18[i3][i25] = d3;
                    } else {
                        dArr18[i3][i25] = -1.0E20d;
                        dArr2 = dArr15;
                        i4 = i19;
                        bewj = bewj2;
                        dArr = dArr16;
                        i5 = a4;
                        dArr3 = dArr14;
                    }
                    i3++;
                    dArr14 = dArr3;
                    dArr15 = dArr2;
                    a4 = i5;
                    i19 = i4;
                    bewj2 = bewj;
                    dArr16 = dArr;
                    bewpArr3 = bewpArr;
                }
                i25++;
                bewpArr2 = bewpArr;
                a4 = a4;
                length2 = i26;
                dArr17 = dArr18;
                dArr16 = dArr16;
                bewi2 = bewi;
                cls4 = cls5;
            }
            int i30 = 0;
            while (i30 < length2) {
                dArr15[i21][i30] = -1.0E20d;
                bewp bewp3 = bewpArr2[i30];
                int i31 = bewp3.f112841a;
                int i32 = bewp3.f112842b;
                if (i21 == bewj2.f112811a) {
                    i2 = 1;
                } else {
                    i2 = i31;
                }
                bewp[] bewpArr4 = bewpArr2;
                bewi bewi4 = bewi2;
                double d8 = -1.0E20d;
                while (i2 <= i32) {
                    d8 = bewk.m95991a(d8, dArr17[i30][i2]);
                    i2++;
                    cls4 = cls4;
                    dArr17 = dArr17;
                    bewp3 = bewp3;
                }
                dArr14[i21][i30] = d8;
                double[] dArr19 = new double[(i32 + 1)];
                dArr19[i32] = dArr17[i30][i32];
                while (i32 > 1) {
                    int i33 = i32 - 1;
                    dArr19[i33] = bewk.m95991a(dArr17[i30][i33], dArr19[i32]);
                    i32 = i33;
                    length2 = length2;
                    cls4 = cls4;
                    dArr17 = dArr17;
                }
                double[][] dArr20 = dArr17;
                Class<double> cls6 = cls4;
                int i34 = length2;
                int i35 = 0;
                while (i35 < bewp3.f112842b && i35 <= i22) {
                    int i36 = ((i21 - i35) + 240) % 240;
                    if (i21 != bewj2.f112811a) {
                        int i37 = i35 + 1;
                        d = dArr12[i21][i30] + (i31 < i37 ? dArr19[i37] : dArr19[i31]);
                    } else {
                        d = dArr19[i35 + 1];
                    }
                    double[] dArr21 = dArr15[i36];
                    dArr21[i30] = bewk.m95991a(dArr21[i30], d);
                    i35++;
                    dArr19 = dArr19;
                    bewp3 = bewp3;
                }
                i30++;
                bewpArr2 = bewpArr4;
                bewi2 = bewi4;
                length2 = i34;
                cls4 = cls6;
                dArr17 = dArr20;
            }
            i19--;
            a2 = i24;
            dArr7 = dArr16;
        }
        double[][] dArr22 = (double[][]) bfne.m97311a(dArr15, dArr14).f114467a;
        int length5 = dArr22.length;
        int a6 = this.f112834a.mo61193a();
        StringBuilder sb = new StringBuilder(71);
        sb.append("posterior length: ");
        sb.append(length5);
        sb.append("; session length in hours: ");
        sb.append((((float) a6) * 6.0f) / 60.0f);
        sb.toString();
        ArrayList arrayList4 = new ArrayList(2);
        double d9 = -1.0d;
        int i38 = 0;
        while (true) {
            length = dArr22.length;
            if (i38 >= length) {
                break;
            }
            bewj bewj3 = this.f112834a;
            if (bewj3.f112816f) {
                i = (bewj3.f112811a + i38) % 240;
            } else {
                i = i38;
            }
            double[] dArr23 = dArr22[i];
            double d10 = dArr23[1] - dArr23[0];
            if (d9 < 0.0d && d10 >= 0.0d) {
                arrayList4.add(Integer.valueOf(Math.max(0, i38 - 1)));
            } else if (d9 >= 0.0d && d10 < 0.0d) {
                arrayList4.add(Integer.valueOf(i38));
            }
            i38++;
            d9 = d10;
        }
        if (arrayList4.size() % 2 == 1) {
            arrayList4.add(Integer.valueOf(length - 1));
        }
        ArrayList arrayList5 = new ArrayList(arrayList4.size() / 2);
        int i39 = 0;
        for (int i40 = 2; i39 < arrayList4.size() / i40; i40 = 2) {
            int i41 = i39 + i39;
            arrayList5.add(new bfla(j4 + (((long) ((Integer) arrayList4.get(i41)).intValue()) * 360000), j4 + (((long) ((Integer) arrayList4.get(i41 + 1)).intValue()) * 360000)));
            i39++;
        }
        int size = arrayList5.size();
        for (int i42 = 0; i42 < size; i42++) {
            bfla bfla = (bfla) arrayList5.get(i42);
            arrayList3.add(new bfne(Long.valueOf(bfla.f114327a), Long.valueOf(bfla.f114328b)));
        }
        return arrayList3;
    }
}

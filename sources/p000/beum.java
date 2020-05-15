package p000;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: beum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beum {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053 A[LOOP:3: B:23:0x0051->B:24:0x0053, LOOP_END] */
    /* renamed from: a */
    public static float m95909a(boolean z, double[][] dArr, boolean z2) {
        int i;
        int i2;
        int i3;
        int length = dArr[0].length;
        int i4 = 3;
        if (!z) {
            i = 3;
        } else {
            i = 4;
        }
        int i5 = length / i;
        double[] dArr2 = new double[3];
        double[] dArr3 = new double[3];
        int i6 = 0;
        while (i6 < i4) {
            int i7 = length;
            int i8 = i5;
            int i9 = 0;
            double d = 0.0d;
            double d2 = 0.0d;
            while (true) {
                i3 = i8;
                if (i9 >= i3) {
                    break;
                }
                double d3 = dArr[i6][i9];
                d += d3;
                d2 += d3 * d3;
                i9++;
                i8 = i3;
            }
            dArr2[i6] = d;
            dArr3[i6] = d2;
            i6++;
            i5 = i3;
            length = i7;
            i4 = 3;
        }
        double d4 = Double.POSITIVE_INFINITY;
        int i10 = 0;
        double d5 = 0.0d;
        while (true) {
            double d6 = 0.0d;
            for (int i11 = 0; i11 < i4; i11++) {
                double d7 = dArr3[i11];
                double d8 = (double) i5;
                double d9 = dArr2[i11];
                Double.isNaN(d8);
                double d10 = d9 / d8;
                Double.isNaN(d8);
                d6 += (d7 / d8) - (d10 * d10);
            }
            if (d6 > d5) {
                d5 = d6;
            }
            if (d6 < d4) {
                d4 = d6;
            }
            int i12 = i10 + i5;
            if (!z2) {
                if (i12 == length) {
                    break;
                }
                i2 = 0;
                while (i2 < i4) {
                }
                i10++;
                i4 = 3;
            } else if (i12 == length - 1) {
                break;
            } else {
                i2 = 0;
                while (i2 < i4) {
                    double d11 = dArr2[i2];
                    double[] dArr4 = dArr[i2];
                    dArr2[i2] = d11 + (-dArr4[i10]) + dArr4[i12];
                    double d12 = dArr3[i2];
                    double d13 = dArr4[i10];
                    double d14 = dArr4[i12];
                    dArr3[i2] = d12 + ((-d13) * d13) + (d14 * d14);
                    i2++;
                    i5 = i5;
                    length = length;
                    i4 = 3;
                }
                i10++;
                i4 = 3;
            }
        }
        float f = (float) (d4 / d5);
        if (Float.isNaN(f)) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: b */
    private static float m95912b(double[] dArr) {
        int length = dArr.length;
        int i = 0;
        for (double d : dArr) {
            if (d > 0.0d) {
                i++;
            }
        }
        return ((float) i) / ((float) length);
    }

    /* renamed from: a */
    public static float m95910a(double[] dArr) {
        int length;
        float f;
        float f2;
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = dArr.length;
            if (i >= length - 1) {
                break;
            }
            double d = dArr[i - 1];
            double d2 = dArr[i];
            int i5 = i + 1;
            if ((d < d2) != (d2 < dArr[i5])) {
                if (i2 == 0) {
                    i4 = i;
                }
                i2++;
                i3 = i;
            }
            i = i5;
        }
        if (i2 > 1) {
            f = (float) (i2 - 1);
            f2 = (float) (i3 - i4);
        } else {
            f = (float) i2;
            f2 = (float) (length - 2);
        }
        return f / f2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v17, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v28, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v56, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v29, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v15, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v58, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: double[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v60, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v61, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v63, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v8, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v11, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v4, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v9, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v16, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v8, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v11, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v11, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v12, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v12, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v14, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v19, resolved type: double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: double[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v46, resolved type: double[]} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: beum.a(boolean, double[][], boolean):float
     arg types: [int, double[][], int]
     candidates:
      beum.a(beup, double[][], boolean):double[]
      beum.a(boolean, double[][], boolean):float */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    public static double[] m95911a(beup beup, double[][] dArr, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        double[] dArr2;
        int i2;
        double[] dArr3;
        int length;
        int i3;
        float f;
        double[] dArr4;
        double sqrt;
        boolean z5;
        beup beup2 = beup;
        double[][] dArr5 = dArr;
        char c = 0;
        char c2 = 1;
        int length2 = dArr5[0].length + 1;
        double[] dArr6 = new double[length2];
        int i4 = 0;
        while (true) {
            i = 3;
            if (i4 >= 3) {
                break;
            }
            bevb.m95936a(dArr5[i4], 0.01d, dArr6);
            i4++;
        }
        if (dArr5.length == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        bxbm.m122544b(z2);
        int length3 = dArr5[0].length;
        if (dArr5[1].length == length3) {
            z3 = true;
        } else {
            z3 = false;
        }
        bxbm.m122544b(z3);
        char c3 = 2;
        if (dArr5[2].length == length3) {
            z4 = true;
        } else {
            z4 = false;
        }
        bxbm.m122544b(z4);
        double[] dArr7 = new double[3];
        int i5 = 0;
        while (i5 < i) {
            dArr7[i5] = bevb.m95935a(dArr5[i5]);
            i5++;
            length2 = length2;
            c = 0;
            c2 = 1;
            i = 3;
            c3 = 2;
        }
        double d = dArr7[c];
        double d2 = dArr7[c2];
        double d3 = dArr7[c3];
        double sqrt2 = Math.sqrt((d * d) + (d2 * d2) + (d3 * d3));
        long j = 0;
        if (sqrt2 == 0.0d) {
            dArr3 = new double[i];
            // fill-array-data instruction
            dArr3[0] = 0;
            dArr3[1] = 0;
            dArr3[2] = 0;
            i2 = length2;
            dArr2 = dArr6;
        } else {
            double[] dArr8 = new double[i];
            int i6 = 0;
            while (i6 < i) {
                dArr8[i6] = dArr7[i6] / sqrt2;
                i6++;
                length2 = length2;
                j = j;
                c = 0;
                c2 = 1;
                i = 3;
                c3 = 2;
            }
            while (true) {
                dArr4 = new double[i];
                dArr4[c] = Math.random() - 8.0d;
                dArr4[c2] = Math.random() - 8.0d;
                double random = Math.random() - 8.0d;
                dArr4[c3] = random;
                double d4 = (dArr8[c] * dArr4[c]) + (dArr8[c2] * dArr4[c2]) + (dArr8[c3] * random);
                int i7 = 0;
                while (i7 < i) {
                    dArr4[i7] = dArr4[i7] - (dArr8[i7] * d4);
                    i7++;
                    length2 = length2;
                    j = j;
                    c = 0;
                    c2 = 1;
                    i = 3;
                    c3 = 2;
                }
                double d5 = dArr4[c];
                double d6 = dArr4[c2];
                double d7 = dArr4[c3];
                sqrt = Math.sqrt((d5 * d5) + (d6 * d6) + (d7 * d7));
                if (sqrt > 0.1d) {
                    break;
                }
                length2 = length2;
                c = 0;
                c2 = 1;
                i = 3;
                c3 = 2;
            }
            int i8 = 0;
            while (i8 < i) {
                dArr4[i8] = dArr4[i8] / sqrt;
                i8++;
                length2 = length2;
                j = j;
                c = 0;
                c2 = 1;
                i = 3;
                c3 = 2;
            }
            double[] dArr9 = new double[i];
            double d8 = dArr8[c2];
            double d9 = dArr4[c3];
            double d10 = dArr8[c3];
            double d11 = dArr4[c2];
            dArr9[c] = (d8 * d9) - (d10 * d11);
            double d12 = dArr4[c];
            double d13 = dArr8[c];
            dArr9[c2] = (d10 * d12) - (d9 * d13);
            dArr9[c3] = (d13 * d11) - (d8 * d12);
            double[] dArr10 = dArr5[c];
            double[] dArr11 = dArr5[c2];
            double[] dArr12 = new double[i];
            double[] dArr13 = dArr5[c3];
            int i9 = 0;
            while (i9 < length3) {
                double d14 = (dArr8[c] * dArr5[c][i9]) + (dArr8[c2] * dArr5[c2][i9]) + (dArr8[c3] * dArr5[c3][i9]);
                for (int i10 = 0; i10 < 3; i10++) {
                    dArr12[i10] = dArr5[i10][i9] - (dArr8[i10] * d14);
                }
                dArr13[i9] = d14;
                double d15 = dArr12[c];
                double d16 = dArr4[c];
                double d17 = dArr12[1];
                double d18 = dArr4[1];
                double d19 = dArr12[2];
                dArr10[i9] = (d16 * d15) + (d18 * d17) + (dArr4[2] * d19);
                dArr11[i9] = (d15 * dArr9[c]) + (d17 * dArr9[1]) + (d19 * dArr9[2]);
                i9++;
                c2 = 1;
                c3 = 2;
            }
            int length4 = dArr10.length;
            if (dArr11.length == length4) {
                z5 = true;
            } else {
                z5 = false;
            }
            bxbm.m122544b(z5);
            double d20 = 0.0d;
            double d21 = 0.0d;
            double d22 = 0.0d;
            for (int i11 = 0; i11 < length4; i11++) {
                double d23 = dArr10[i11];
                d21 += d23 * d23;
                double d24 = dArr11[i11];
                d20 += d23 * d24;
                d22 += d24 * d24;
            }
            i2 = length2;
            dArr2 = dArr6;
            double atan2 = Math.atan2(d20 + d20, d21 - d22) / 2.0d;
            double[] dArr14 = {atan2, atan2 + 1.5707963267948966d};
            double[][] dArr15 = (double[][]) Array.newInstance(double.class, 2, 2);
            double[] dArr16 = new double[2];
            int i12 = 0;
            for (int i13 = 2; i12 < i13; i13 = 2) {
                dArr15[i12][0] = Math.cos(dArr14[i12]);
                dArr15[i12][1] = Math.sin(dArr14[i12]);
                double[] dArr17 = dArr15[i12];
                double d25 = (dArr17[0] * d20) + (dArr17[1] * d22);
                double d26 = new double[]{(dArr17[0] * d21) + (dArr17[1] * d20), d25}[0];
                dArr16[i12] = (d26 * d26) + (d25 * d25);
                i12++;
            }
            char c4 = 0;
            char c5 = 1;
            if (dArr16[0] <= dArr16[1]) {
                dArr15 = new double[][]{dArr15[1], dArr15[0]};
            }
            double[] dArr18 = dArr5[1];
            double[] dArr19 = dArr5[0];
            int i14 = 0;
            while (i14 < length3) {
                double d27 = dArr10[i14];
                double[] dArr20 = dArr15[c4];
                double d28 = dArr20[c4];
                double d29 = dArr11[i14];
                double d30 = dArr20[c5];
                double[] dArr21 = dArr15[c5];
                double d31 = dArr21[c4];
                double d32 = dArr21[c5];
                dArr18[i14] = (d28 * d27) + (d30 * d29);
                dArr19[i14] = (d27 * d31) + (d29 * d32);
                i14++;
                c4 = 0;
                c5 = 1;
            }
            dArr3 = dArr8;
        }
        double[] dArr22 = dArr5[0];
        double[] dArr23 = dArr5[1];
        double[] dArr24 = dArr5[2];
        double a = bevb.m95935a(dArr24);
        int i15 = 0;
        while (true) {
            length = dArr24.length;
            if (i15 >= length) {
                break;
            }
            dArr24[i15] = dArr24[i15] - a;
            i15++;
        }
        double c6 = bevb.m95940c(dArr22);
        double c7 = bevb.m95940c(dArr23);
        double c8 = bevb.m95940c(dArr24);
        beup2.f112498a = (float) (c6 + c7 + c8);
        beup2.f112516s = (float) c7;
        beup2.f112500c = (float) c8;
        if (z) {
            beup2.f112499b = m95909a(true, dArr5, false);
        } else {
            beup2.f112499b = m95909a(false, dArr5, true);
        }
        beup2.f112508k = m95912b(dArr24);
        beup2.f112509l = Math.abs(m95912b(dArr23) - 8.0f);
        int length5 = dArr23.length;
        bxbm.m122544b(length5 == length);
        bxbm.m122544b(i2 >= length5 + 1);
        double[] dArr25 = new double[length5];
        int i16 = 0;
        while (i16 < 4) {
            double d33 = (double) (1 << i16);
            Double.isNaN(d33);
            double d34 = d33 * 0.02d;
            double[] dArr26 = dArr3;
            System.arraycopy(dArr23, 0, dArr25, 0, dArr23.length);
            double[] dArr27 = dArr2;
            bevb.m95936a(dArr25, d34, dArr27);
            double[] dArr28 = dArr22;
            double[] dArr29 = dArr23;
            float b = (float) (bevb.m95939b(dArr25) / c7);
            float[] fArr = beup2.f112511n;
            float f2 = 0.0f;
            if (Float.isNaN(b)) {
                b = 0.0f;
            }
            fArr[i16] = b;
            beup2.f112514q[i16] = m95910a(dArr25);
            System.arraycopy(dArr24, 0, dArr25, 0, dArr24.length);
            bevb.m95936a(dArr25, d34, dArr27);
            float b2 = (float) (bevb.m95939b(dArr25) / c8);
            float[] fArr2 = beup2.f112510m;
            if (!Float.isNaN(b2)) {
                f2 = b2;
            }
            fArr2[i16] = f2;
            float[] fArr3 = beup2.f112512o;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            while (true) {
                i3 = length5 - 1;
                if (i17 >= i3) {
                    break;
                }
                int i21 = i17 + 1;
                double[] dArr30 = dArr27;
                if ((dArr25[i17] > 0.0d) != (dArr25[i21] > 0.0d)) {
                    if (i18 == 0) {
                        i20 = i17;
                    }
                    i18++;
                    i19 = i17;
                }
                i17 = i21;
                dArr27 = dArr30;
            }
            double[] dArr31 = dArr27;
            if (i18 > 1) {
                f = ((float) (i18 - 1)) / ((float) (i19 - i20));
            } else {
                f = ((float) i18) / ((float) i3);
            }
            fArr3[i16] = f;
            beup2.f112513p[i16] = m95910a(dArr25);
            if (i16 == 1) {
                int i22 = 0;
                for (int i23 = 1; i23 < length5; i23++) {
                    if (dArr25[i23] > dArr25[i23 - 1]) {
                        i22++;
                    }
                }
                beup2.f112515r = ((float) i22) / ((float) i3);
            }
            i16++;
            dArr22 = dArr28;
            dArr3 = dArr26;
            dArr23 = dArr29;
            dArr2 = dArr31;
        }
        double[] dArr32 = dArr22;
        double[] dArr33 = dArr23;
        double[] dArr34 = dArr3;
        int length6 = dArr32.length;
        double[] dArr35 = new double[length6];
        for (int i24 = 0; i24 < length6; i24++) {
            dArr35[i24] = Math.hypot(dArr32[i24], dArr33[i24]);
        }
        Arrays.sort(dArr35);
        beup2.f112517t = (float) bevb.m95934a(0.94d, dArr35);
        beup2.f112518u = (float) bevb.m95934a(0.75d, dArr35);
        beup2.f112519v = (float) bevb.m95934a(0.44d, dArr35);
        Arrays.sort(dArr24);
        beup2.f112501d = (float) bevb.m95934a(0.5d, dArr24);
        beup2.f112502e = (float) bevb.m95934a(0.03d, dArr24);
        beup2.f112503f = (float) bevb.m95934a(0.93d, dArr24);
        beup2.f112504g = (float) bevb.m95934a(0.13d, dArr24);
        beup2.f112505h = (float) bevb.m95934a(0.8d, dArr24);
        beup2.f112506i = (float) bevb.m95934a(0.28d, dArr24);
        beup2.f112507j = (float) bevb.m95934a(0.62d, dArr24);
        dArr5[2] = null;
        return dArr34;
    }
}

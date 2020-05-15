package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: bewe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bewe {
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009a, code lost:
        r0.add(java.lang.Integer.valueOf(r2));
     */
    /* renamed from: a */
    public static bfku m95977a(bfku bfku, float f, float f2) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        int i = 0;
        while (i < bfku.f114316b) {
            int i2 = 0;
            while (true) {
                if (i2 >= bfku.mo61855a()) {
                    break;
                }
                float a = bfku.mo61854a(i, i2);
                if (a >= f && a <= f2) {
                    i2++;
                }
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            return bfku;
        }
        int size = arrayList.size();
        int i3 = bfku.f114316b;
        if (size == i3) {
            return bfku.f114314e;
        }
        int size2 = i3 - arrayList.size();
        long[] jArr = new long[size2];
        int a2 = bfku.mo61855a();
        int[] iArr = new int[2];
        iArr[1] = size2;
        iArr[0] = a2;
        float[][] fArr = (float[][]) Array.newInstance(float.class, iArr);
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < bfku.f114316b; i6++) {
            if (i4 >= arrayList.size() || i6 != ((Integer) arrayList.get(i4)).intValue()) {
                jArr[i5] = bfku.mo61857a(i6);
                for (int i7 = 0; i7 < bfku.mo61855a(); i7++) {
                    fArr[i7][i5] = bfku.mo61854a(i6, i7);
                }
                i5++;
            } else {
                i4++;
            }
        }
        if (i4 == arrayList.size() && i5 == size2) {
            z = true;
        }
        bxbm.m122541a(z);
        return new bfku(jArr, fArr);
    }

    /* renamed from: a */
    public static bfne m95978a(double[] dArr, int i, int i2) {
        double d;
        int i3 = (i2 - i) + 1;
        double d2 = (double) i3;
        double d3 = (double) (i3 - 1);
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = d3 * d2;
        double d5 = d4 / 2.0d;
        double d6 = (double) ((i3 + i3) - 1);
        Double.isNaN(d6);
        double d7 = (d4 * d6) / 6.0d;
        double d8 = 0.0d;
        double d9 = 0.0d;
        for (int i4 = 0; i4 < i3; i4++) {
            double d10 = dArr[i + i4];
            d8 += d10;
            double d11 = (double) i4;
            Double.isNaN(d11);
            d9 += d10 * d11;
        }
        Double.isNaN(d2);
        double d12 = (d7 * d2) - (d5 * d5);
        if (d12 != 0.0d) {
            Double.isNaN(d2);
            double d13 = ((d2 * d9) - (d8 * d5)) / d12;
            double d14 = ((d8 * d7) - (d9 * d5)) / d12;
            if (i3 > 2) {
                double d15 = 0.0d;
                for (int i5 = 0; i5 < i3; i5++) {
                    double d16 = (double) i5;
                    Double.isNaN(d16);
                    double d17 = ((d16 * d13) + d14) - dArr[i + i5];
                    d15 += d17 * d17;
                }
                double d18 = (double) (i3 - 2);
                Double.isNaN(d18);
                d = d15 / d18;
            } else {
                d = 0.0d;
            }
            return bfne.m97311a(Double.valueOf(d13), Double.valueOf(d));
        }
        Double valueOf = Double.valueOf(0.0d);
        return bfne.m97311a(valueOf, valueOf);
    }
}

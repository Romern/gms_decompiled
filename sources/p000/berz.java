package p000;

import java.util.Arrays;
import java.util.Map;

/* renamed from: berz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class berz {
    /* renamed from: a */
    private static bfni m95646a(betp betp, boolean z) {
        bfnb bfnb = betp.f112417b;
        if (bfnb != null) {
            bfmz bfmz = !z ? bfnb.f114457b : bfnb.f114458c;
            if (bfmz != null) {
                return bfmz.f114449c;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final Double m95647a(betp betp, betp betp2, boolean z) {
        int i;
        bfni a = m95646a(betp, z);
        bfni a2 = m95646a(betp2, z);
        if (a == null || a2 == null) {
            return null;
        }
        int a3 = bfmw.m97288a(a, a2);
        if (!z) {
            i = 1000;
        } else {
            i = 5000;
        }
        return Double.valueOf((double) Math.min(a3, i));
    }

    /* renamed from: a */
    public static final Double m95648a(long[] jArr, long[] jArr2, long[] jArr3) {
        int length = jArr3.length;
        int length2 = (jArr.length + jArr2.length) - length;
        if (length2 == 0) {
            return null;
        }
        double d = (double) length;
        double d2 = (double) length2;
        Double.isNaN(d);
        Double.isNaN(d2);
        return Double.valueOf(d / d2);
    }

    /* renamed from: a */
    public static final void m95649a(Map map, betn betn, Double d) {
        if (d != null) {
            map.put(betn, d);
        }
    }

    /* renamed from: a */
    public static long[] m95650a(bfoa bfoa) {
        int b = bfoa.mo62006b();
        long[] jArr = new long[b];
        for (int i = 0; i < b; i++) {
            jArr[i] = bfoa.mo62003a(i);
        }
        Arrays.sort(jArr);
        return jArr;
    }

    /* renamed from: a */
    public static long[] m95651a(long[] jArr, long[] jArr2) {
        boolean z = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < jArr.length && i2 < jArr2.length) {
            long j = jArr[i];
            long j2 = jArr2[i2];
            if (j < j2) {
                i++;
            } else {
                if (j <= j2) {
                    i3++;
                    i++;
                }
                i2++;
            }
        }
        long[] jArr3 = new long[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < jArr.length && i5 < jArr2.length) {
            long j3 = jArr[i4];
            long j4 = jArr2[i5];
            if (j3 < j4) {
                i4++;
            } else if (j3 <= j4) {
                jArr3[i6] = j3;
                i4++;
                i5++;
                i6++;
            } else {
                i5++;
            }
        }
        if (i6 == i3) {
            z = true;
        }
        bxbm.m122541a(z);
        return jArr3;
    }
}

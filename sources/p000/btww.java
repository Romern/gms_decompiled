package p000;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: btww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btww {

    /* renamed from: a */
    private static final double[][] f152761a;

    /* renamed from: b */
    private static final double[] f152762b = new double[btxf.f152796b.length];

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ee, code lost:
        r5 = r5 + 1;
        r0 = 0;
     */
    static {
        int i;
        int i2 = 2;
        int[] iArr = new int[2];
        iArr[1] = btxf.f152796b.length;
        int i3 = 0;
        iArr[0] = 23;
        f152761a = (double[][]) Array.newInstance(double.class, iArr);
        int i4 = 6;
        double[][] dArr = {new double[]{8921.0d, 342.0d, 60.0d, 309.0d, 30.0d, 196.0d}, new double[]{424.0d, 11497.0d, 870.0d, 114.0d, 4.0d, 508.0d}, new double[]{68.0d, 421.0d, 8228.0d, 59.0d, 1.0d, 603.0d}, new double[]{285.0d, 160.0d, 158.0d, 10965.0d, 55.0d, 323.0d}, new double[]{100.0d, 10.0d, 1.0d, 112.0d, 8040.0d, 10.0d}, new double[]{696.0d, 858.0d, 414.0d, 492.0d, 3.0d, 7716.0d}};
        int i5 = 0;
        while (i5 < i4) {
            int i6 = i5 != 0 ? i5 != 1 ? i5 != i2 ? i5 != 3 ? i5 != 4 ? 7 : 5 : 4 : 6 : 0 : 2;
            int length = dArr[i5].length;
            double d = 0.0d;
            for (int i7 = 0; i7 < length; i7++) {
                d += dArr[i5][i7];
            }
            double d2 = d + (d * 0.2d);
            m118966a(i6, 5, 0.2d);
            int i8 = 0;
            while (true) {
                double[] dArr2 = dArr[i5];
                if (i8 >= dArr2.length) {
                    break;
                }
                if (i8 == 0) {
                    i = 1;
                } else if (i8 == 1) {
                    i = 0;
                } else if (i8 == i2) {
                    i = 3;
                } else if (i8 == 3) {
                    i = 7;
                } else if (i8 == 4) {
                    i = 8;
                } else if (i8 == 5) {
                    i = 4;
                } else {
                    throw new RuntimeException();
                }
                m118966a(i6, i, dArr2[i8] / d2);
                i8++;
                i2 = 2;
                i4 = 6;
            }
        }
        m118966a(1, i3, 0.1d);
        m118966a(1, 1, 0.01d);
        m118966a(1, 7, 0.01d);
        m118966a(1, 8, 0.01d);
        m118966a(1, 3, 0.85d);
        m118966a(1, 4, 0.01d);
        m118966a(1, 5, 0.01d);
        m118966a(3, i3, 0.01d);
        m118966a(3, 1, 0.1d);
        m118966a(3, 7, 0.01d);
        m118966a(3, 8, 0.01d);
        m118966a(3, 3, 0.84d);
        m118966a(3, 4, 0.01d);
        m118966a(3, 5, 0.01d);
        Arrays.fill(f152762b, Double.MAX_VALUE);
        double[] dArr3 = f152762b;
        dArr3[i2] = 13.8889d;
        dArr3[3] = 13.8889d;
        dArr3[4] = 11.11d;
        dArr3[5] = 11.11d;
        dArr3[i4] = 11.11d;
        dArr3[7] = 11.11d;
    }

    /* renamed from: a */
    static double m118964a(int i, btxc btxc, List list) {
        double d;
        if (btxc.mo72464d() && btxc.f152790b > f152762b[i]) {
            return 1.0E-8d;
        }
        int size = list.size();
        double d2 = 0.0d;
        for (int i2 = 0; i2 < size; i2++) {
            btxa btxa = (btxa) list.get(i2);
            double d3 = f152761a[btxa.f152784a][i];
            double d4 = (double) btxa.f152785b;
            Double.isNaN(d4);
            d2 += d3 * d4;
        }
        double[] dArr = btxc.f152791c;
        double d5 = 1.0d;
        if (dArr.length != 0) {
            d = dArr[i];
        } else {
            d = 1.0d;
        }
        double d6 = d2 * d;
        double[] dArr2 = btxc.f152792d;
        if (dArr2.length != 0) {
            d5 = dArr2[i];
        }
        return (d6 * d5) / 100.0d;
    }

    /* renamed from: a */
    public static List m118965a(List list) {
        boolean z;
        Iterator it = list.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                z = false;
                break;
            }
            int i = ((btxa) it.next()).f152784a;
            if (i != 7) {
                if (i == 8) {
                    break;
                }
            } else {
                break;
            }
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            btxa btxa = (btxa) it2.next();
            int i2 = btxa.f152784a;
            if (i2 != 2) {
                if (i2 == 6) {
                    arrayList.add(new btxa(5, btxa.f152785b));
                } else if (i2 >= 0 && i2 <= 8) {
                    arrayList.add(btxa);
                } else if (!(i2 == 16 || i2 == 17)) {
                    arrayList.add(new btxa(4, btxa.f152785b));
                }
            } else if (!z) {
                arrayList.add(new btxa(7, btxa.f152785b));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m118966a(int i, int i2, double d) {
        f152761a[i2][i] = d;
    }
}

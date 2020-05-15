package p000;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/* renamed from: bewh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bewh {

    /* renamed from: a */
    private static final beur[] f112790a = {beur.IN_VEHICLE, beur.ON_BICYCLE, beur.ON_FOOT, beur.STILL, beur.INCONSISTENT};

    /* renamed from: b */
    private static final double[] f112791b = {1.0d, 1.0d, 0.8d};

    /* renamed from: c */
    private static final double[][] f112792c = {new double[]{-1.0d, -0.8d, 1.0d, 0.5d, 0.2d}, new double[]{-1.0d, -0.8d, 1.0d, 0.5d, 0.2d}, new double[]{-1.0d, -0.8d, 1.0d, 0.5d, 0.2d}};

    /* renamed from: d */
    private static final double[] f112793d = {1.0d, 1.0d, 0.8d};

    /* renamed from: e */
    private static final double[][] f112794e = {new double[]{-1.0d, -0.8d, 1.0d, 0.5d, 0.2d}, new double[]{-1.0d, -0.8d, 1.0d, 0.5d, 0.2d}, new double[]{-1.0d, -0.8d, 1.0d, 0.5d, 0.2d}};

    /* renamed from: f */
    private static final double[] f112795f = {0.8d, 1.0d, 0.6d};

    /* renamed from: g */
    private static final double[][] f112796g = {new double[]{-0.9d, -0.75d, 1.0d, 0.85d, 0.2d}, new double[]{-0.9d, -0.75d, 1.0d, 0.85d, 0.2d}, new double[]{-0.9d, -0.75d, 1.0d, 0.85d, 0.2d}};

    /* renamed from: h */
    private static final double[] f112797h = {0.8d, 1.0d, 0.6d};

    /* renamed from: i */
    private static final double[][] f112798i = {new double[]{-0.9d, -0.75d, 1.0d, 0.85d, 0.2d}, new double[]{-0.9d, -0.75d, 1.0d, 0.85d, 0.2d}, new double[]{-0.9d, -0.75d, 1.0d, 0.85d, 0.2d}};

    /* renamed from: j */
    private static final double[] f112799j = {0.8d, 1.0d, 1.0d};

    /* renamed from: k */
    private static final double[][] f112800k = {new double[]{-0.8d, -0.8d, 1.0d, 0.2d, 0.2d}, new double[]{-0.1d, -0.8d, 1.0d, 0.2d, 0.0d}, new double[]{-0.1d, -0.8d, 1.0d, 0.2d, 0.0d}};

    /* renamed from: l */
    private static final double[] f112801l = {0.8d, 1.0d, 1.0d};

    /* renamed from: m */
    private static final double[][] f112802m = {new double[]{-0.8d, -0.8d, 1.0d, 0.2d, 0.2d}, new double[]{-0.1d, -0.8d, 1.0d, 0.2d, 0.0d}, new double[]{-0.1d, -0.8d, 1.0d, 0.2d, 0.0d}};

    /* renamed from: n */
    private final double[] f112803n;

    /* renamed from: o */
    private final double[][] f112804o;

    private bewh(double[] dArr, double[][] dArr2) {
        bxbm.m122545b(dArr.length == dArr2.length, "Incosistent dimension");
        this.f112803n = dArr;
        this.f112804o = dArr2;
    }

    /* renamed from: a */
    public static bfne m95979a(int i) {
        bewh bewh;
        bewh bewh2;
        switch (i) {
            case 1:
            case 2:
                bewh = new bewh(f112791b, f112792c);
                bewh2 = new bewh(f112793d, f112794e);
                break;
            case 3:
            case 4:
                bewh = new bewh(f112795f, f112796g);
                bewh2 = new bewh(f112797h, f112798i);
                break;
            case 5:
            case 6:
                bewh = new bewh(f112799j, f112800k);
                bewh2 = new bewh(f112801l, f112802m);
                break;
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Invalid floor change type: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
        return bfne.m97311a(bewh, bewh2);
    }

    /* renamed from: a */
    public final double mo61189a(List list) {
        boolean z;
        boolean z2;
        int size = list.size();
        int[] iArr = new int[2];
        boolean z3 = true;
        iArr[1] = f112790a.length;
        iArr[0] = size;
        double[][] dArr = (double[][]) Array.newInstance(double.class, iArr);
        for (int i = 0; i < list.size(); i++) {
            for (int i2 = 0; i2 < f112790a.length; i2++) {
                double[] dArr2 = dArr[i];
                double a = (double) beus.m95921a((List) list.get(i), f112790a[i2]);
                Double.isNaN(a);
                dArr2[i2] = a / 100.0d;
            }
        }
        String valueOf = String.valueOf(Arrays.deepToString(dArr));
        if (valueOf.length() == 0) {
            new String("prob: ");
        } else {
            "prob: ".concat(valueOf);
        }
        int length = dArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        bxbm.m122545b(z, "activityProbabilityMatrix is empty");
        if (length <= this.f112804o.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        bxbm.m122545b(z2, "activityProbabilityMatrix is too long");
        if (dArr[0].length != this.f112804o[0].length) {
            z3 = false;
        }
        bxbm.m122545b(z3, "activityProbabilityMatrix has wrong size of activity");
        double d = 0.0d;
        double d2 = 0.0d;
        for (int i3 = 0; i3 < dArr.length; i3++) {
            d2 += this.f112803n[i3];
        }
        for (int i4 = 0; i4 < dArr.length; i4++) {
            int i5 = 0;
            while (true) {
                double[] dArr3 = dArr[i4];
                if (i5 >= dArr3.length) {
                    break;
                }
                d += ((dArr3[i5] * this.f112804o[i4][i5]) * this.f112803n[i4]) / d2;
                i5++;
            }
        }
        return d;
    }
}

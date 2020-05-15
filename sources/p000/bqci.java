package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: bqci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqci extends bqcj {

    /* renamed from: a */
    public static final /* synthetic */ int f140473a = 0;

    static {
        StringBuilder sb = new StringBuilder(78);
        sb.append("0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder("(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?".length() + 23 + String.valueOf(sb2).length());
        sb3.append("[+-]?(?:NaN|Infinity|(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?|");
        sb3.append(sb2);
        sb3.append(")");
        sb3.toString().replace("#", "+");
    }

    /* renamed from: a */
    public static double m112565a(double d, double d2, double d3) {
        bmxy.m108597a(d2 <= d3, "min (%s) must be less than or equal to max (%s)", Double.valueOf(d2), Double.valueOf(d3));
        return Math.min(Math.max(d, d2), d3);
    }

    /* renamed from: b */
    public static List m112570b(double... dArr) {
        int length = dArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new bqch(dArr, 0, length);
    }

    /* renamed from: b */
    public static boolean m112571b(double d) {
        return d > Double.NEGATIVE_INFINITY && d < Double.POSITIVE_INFINITY;
    }

    /* renamed from: a */
    public static double m112566a(double... dArr) {
        boolean z;
        if (dArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        double d = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            d = Math.min(d, dArr[i]);
        }
        return d;
    }

    /* renamed from: a */
    public static int m112567a(double d) {
        return Double.valueOf(d).hashCode();
    }

    /* renamed from: a */
    public static int m112568a(double[] dArr, double d, int i, int i2) {
        while (i < i2) {
            if (dArr[i] == d) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public static double[] m112569a(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            bmxy.m108581a(obj);
            dArr[i] = ((Number) obj).doubleValue();
        }
        return dArr;
    }
}

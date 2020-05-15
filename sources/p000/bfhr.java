package p000;

import com.felicanetworks.sdu.ErrorInfo;
import java.util.List;

/* renamed from: bfhr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfhr {

    /* renamed from: a */
    public static volatile bfht f113962a = null;

    /* renamed from: d */
    public static double[] f113963d;

    /* renamed from: e */
    public static double[][] f113964e;

    /* renamed from: f */
    public static double[] f113965f = null;

    /* renamed from: b */
    public final bfio f113966b;

    /* renamed from: c */
    public List f113967c;

    /* renamed from: g */
    public int f113968g;

    /* renamed from: h */
    public final double[] f113969h = new double[ErrorInfo.TYPE_SDU_UNKNOWN];

    /* renamed from: i */
    public long f113970i;

    /* renamed from: j */
    public long f113971j;

    public bfhr(int i) {
        this.f113966b = new bfio(1024, i, Short.class);
        f113963d = new double[1024];
        for (int i2 = 0; i2 < 1024; i2++) {
            double[] dArr = f113963d;
            double d = (double) i2;
            Double.isNaN(d);
            dArr[i2] = (1.0d - Math.cos((d * 6.283185307179586d) / 1023.0d)) * 0.5d;
        }
        mo61708a();
    }

    /* renamed from: a */
    static double m96810a(double d) {
        return Math.log1p(d / 700.0d) * 1125.0d;
    }

    /* renamed from: b */
    static double m96813b(double d) {
        return Math.expm1(d / 1125.0d) * 700.0d;
    }

    /* renamed from: c */
    public static final double m96815c(double d) {
        return Math.log10(Math.abs(d)) * 10.0d;
    }

    /* renamed from: d */
    static final int m96816d(double d) {
        int round = (int) Math.round(d * 0.023219954648526078d);
        if (round >= 512) {
            return 511;
        }
        return round;
    }

    /* renamed from: a */
    public final void mo61708a() {
        this.f113968g = 0;
    }

    /* renamed from: a */
    static double m96811a(double[] dArr) {
        double d = 0.0d;
        for (double d2 : dArr) {
            d += d2;
        }
        int length = dArr.length;
        if (length <= 0) {
            return d;
        }
        double d3 = (double) length;
        Double.isNaN(d3);
        return d / d3;
    }

    /* renamed from: b */
    static double m96814b(double[] dArr) {
        int length = dArr.length;
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        while (i < length) {
            double d3 = dArr[i];
            if (d3 >= 0.0d) {
                d2 += d3;
                i++;
            } else {
                throw new IllegalArgumentException("Values must be nonnegative");
            }
        }
        for (double d4 : dArr) {
            if (Math.abs(d4) > 1.0E-14d) {
                d += (Math.log(d4 / d2) * d4) / d2;
            }
        }
        return (-d) / Math.log(2.0d);
    }

    /* renamed from: a */
    static double m96812a(double[] dArr, double d) {
        double d2 = 0.0d;
        for (double d3 : dArr) {
            d2 += Math.pow(d3 - d, 2.0d);
        }
        int length = dArr.length;
        if (length > 0) {
            double d4 = (double) length;
            Double.isNaN(d4);
            d2 /= d4;
        }
        return Math.sqrt(d2);
    }
}

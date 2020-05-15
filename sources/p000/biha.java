package p000;

import android.graphics.Color;

/* renamed from: biha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biha {
    /* renamed from: a */
    private static double m102380a(double d) {
        return d > 0.03928d ? Math.pow((d + 0.055d) / 1.055d, 2.4d) : d / 12.92d;
    }

    /* renamed from: a */
    private static double m102381a(double d, double d2) {
        double round = (double) Math.round(((Math.max(d, d2) + 0.05d) / (Math.min(d, d2) + 0.05d)) * 100.0d);
        Double.isNaN(round);
        return round / 100.0d;
    }

    /* renamed from: a */
    private static double m102382a(int i) {
        double red = (double) Color.red(i);
        Double.isNaN(red);
        double green = (double) Color.green(i);
        Double.isNaN(green);
        double a = (m102380a(red / 255.0d) * 0.2126d) + (m102380a(green / 255.0d) * 0.7152d);
        double blue = (double) Color.blue(i);
        Double.isNaN(blue);
        return a + (m102380a(blue / 255.0d) * 0.0722d);
    }

    /* renamed from: a */
    public static int m102383a(int i, int i2, int i3) {
        double a = m102382a(i);
        double a2 = m102381a(m102382a(i2), a);
        return (a2 > 3.0d || a2 > m102381a(m102382a(i3), a)) ? i2 : i3;
    }
}

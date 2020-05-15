package p000;

import android.graphics.Color;

/* renamed from: avgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avgs {
    /* renamed from: a */
    private static double m78486a(double d) {
        return d > 0.03928d ? Math.pow((d + 0.055d) / 1.055d, 2.4d) : d / 12.92d;
    }

    /* renamed from: a */
    public static double m78487a(double d, double d2) {
        double round = (double) Math.round(((Math.max(d, d2) + 0.05d) / (Math.min(d, d2) + 0.05d)) * 100.0d);
        Double.isNaN(round);
        return round / 100.0d;
    }

    /* renamed from: a */
    public static double m78488a(int i) {
        double red = (double) Color.red(i);
        Double.isNaN(red);
        double green = (double) Color.green(i);
        Double.isNaN(green);
        double a = (m78486a(red / 255.0d) * 0.2126d) + (m78486a(green / 255.0d) * 0.7152d);
        double blue = (double) Color.blue(i);
        Double.isNaN(blue);
        return a + (m78486a(blue / 255.0d) * 0.0722d);
    }
}

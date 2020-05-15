package p000;

import com.android.volley.toolbox.ImageLoader;

/* renamed from: avgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avgy {

    /* renamed from: a */
    public static ImageLoader f93170a;

    /* renamed from: a */
    public static double m78499a(String str) {
        int max = Math.max(str.lastIndexOf(45), str.lastIndexOf(95));
        int i = max - 1;
        try {
            String substring = str.substring(Math.max(str.lastIndexOf(45, i), str.lastIndexOf(95, i)) + 1, max);
            int indexOf = substring.indexOf(120);
            int parseInt = Integer.parseInt(substring.substring(0, indexOf));
            int parseInt2 = Integer.parseInt(substring.substring(indexOf + 1));
            if (parseInt2 != 0) {
                return (double) (((float) parseInt) / ((float) parseInt2));
            }
            return 2.0d;
        } catch (Exception e) {
            return 2.0d;
        }
    }

    /* renamed from: a */
    public static int m78500a(int i, double d, int i2) {
        if (d == 0.0d || i2 == 0) {
            return 0;
        }
        double d2 = (double) i;
        Double.isNaN(d2);
        double d3 = d2 * d;
        double d4 = (double) i2;
        if (d3 <= d4) {
            Double.isNaN(d4);
            if (d3 / d4 < chay.f188218a.mo6606a().mo84896e()) {
                return 0;
            }
            return i;
        }
        Double.isNaN(d4);
        return (int) (d4 / d);
    }
}

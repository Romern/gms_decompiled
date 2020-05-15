package p000;

/* renamed from: buoa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buoa {

    /* renamed from: a */
    public final bunx f154468a;

    /* renamed from: b */
    public bunv f154469b = null;

    public buoa(bunx bunx) {
        this.f154468a = bunx;
    }

    /* renamed from: a */
    public static double m120143a(bunx bunx, double d) {
        buod buod = (buod) bunx;
        return Math.min(buod.f154501t, Math.max(buod.f154500s, d * buod.f154502u));
    }

    /* renamed from: a */
    public static double m120144a(bunx bunx, double d, double d2) {
        buod buod = (buod) bunx;
        double min = Math.min(buod.f154505x * d2, d);
        double d3 = buod.f154504w;
        return (min * d3) + ((1.0d - d3) * d2);
    }

    /* renamed from: a */
    public static boolean m120145a(double[][] dArr) {
        int length = dArr[0].length;
        int length2 = dArr[1].length;
        return length == length2 && length2 == dArr[2].length;
    }
}

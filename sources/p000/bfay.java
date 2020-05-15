package p000;

/* renamed from: bfay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfay {

    /* renamed from: a */
    public static final double f113280a = Math.sqrt(Math.pow(6378137.0d, 2.0d) * (1.0d - Math.pow(0.081819190842622d, 2.0d)));

    /* renamed from: b */
    private static final double f113281b = Math.sqrt((Math.pow(6378137.0d, 2.0d) - Math.pow(f113280a, 2.0d)) / Math.pow(f113280a, 2.0d));

    /* renamed from: a */
    public static bfax m96292a(double d, double d2, double d3) {
        double hypot = Math.hypot(d, d2);
        double atan2 = Math.atan2(d3 * 6378137.0d, f113280a * hypot);
        double atan22 = Math.atan2(d2, d) % 6.283185307179586d;
        double atan23 = Math.atan2(d3 + (Math.pow(f113281b, 2.0d) * f113280a * Math.pow(Math.sin(atan2), 3.0d)), hypot - ((Math.pow(0.081819190842622d, 2.0d) * 6378137.0d) * Math.pow(Math.cos(atan2), 3.0d)));
        double cos = (hypot / Math.cos(atan23)) - (6378137.0d / Math.sqrt(1.0d - (Math.pow(0.081819190842622d, 2.0d) * Math.pow(Math.sin(atan23), 2.0d))));
        if (Math.abs(d) < 1.0d && Math.abs(d2) < 1.0d) {
            cos = Math.abs(d3) - f113280a;
        }
        return new bfax(atan23, atan22, cos);
    }
}

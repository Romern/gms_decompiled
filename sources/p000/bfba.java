package p000;

/* renamed from: bfba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfba {
    /* renamed from: a */
    public static bfaz m96294a(bfax bfax) {
        double cos = Math.cos(bfax.f113277a);
        double cos2 = Math.cos(bfax.f113278b);
        double sin = Math.sin(bfax.f113277a);
        double sin2 = Math.sin(bfax.f113278b);
        double sqrt = 6378137.0d / Math.sqrt(1.0d - ((Math.pow(0.081819190842622d, 2.0d) * sin) * sin));
        double d = bfax.f113279c;
        double d2 = (d + sqrt) * cos;
        return new bfaz(d2 * cos2, d2 * sin2, (d + (sqrt * (1.0d - Math.pow(0.081819190842622d, 2.0d)))) * sin);
    }
}

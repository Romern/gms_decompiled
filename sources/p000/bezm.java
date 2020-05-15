package p000;

/* renamed from: bezm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bezm {
    NORTHERN("N", 0.0d),
    SOUTHERN("M", 1.0E7d);
    

    /* renamed from: c */
    public final double f113163c;

    /* renamed from: d */
    private final String f113164d;

    private bezm(String str, double d) {
        this.f113164d = str;
        this.f113163c = d;
    }

    /* renamed from: a */
    public static bezm m96170a(double d) {
        return d < 0.0d ? SOUTHERN : NORTHERN;
    }

    public final String toString() {
        return this.f113164d;
    }
}

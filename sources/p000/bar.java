package p000;

/* renamed from: bar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bar {

    /* renamed from: a */
    public final String f2795a;

    /* renamed from: b */
    public final String f2796b;

    /* renamed from: c */
    public final double f2797c;

    /* renamed from: d */
    public final int f2798d;

    /* renamed from: e */
    public final double f2799e;

    /* renamed from: f */
    public final double f2800f;

    /* renamed from: g */
    public final int f2801g;

    /* renamed from: h */
    public final int f2802h;

    /* renamed from: i */
    public final double f2803i;

    /* renamed from: j */
    public final boolean f2804j;

    /* renamed from: k */
    public final int f2805k;

    public bar(String str, String str2, double d, int i, int i2, double d2, double d3, int i3, int i4, double d4, boolean z) {
        this.f2795a = str;
        this.f2796b = str2;
        this.f2797c = d;
        this.f2805k = i;
        this.f2798d = i2;
        this.f2799e = d2;
        this.f2800f = d3;
        this.f2801g = i3;
        this.f2802h = i4;
        this.f2803i = d4;
        this.f2804j = z;
    }

    public final int hashCode() {
        int hashCode = this.f2795a.hashCode();
        int hashCode2 = this.f2796b.hashCode();
        double d = this.f2797c;
        int i = this.f2805k;
        int i2 = i - 1;
        if (i != 0) {
            int i3 = this.f2798d;
            long doubleToLongBits = Double.doubleToLongBits(this.f2799e);
            double d2 = (double) (((hashCode * 31) + hashCode2) * 31);
            Double.isNaN(d2);
            return (((((((((int) (d2 + d)) * 31) + i2) * 31) + i3) * 31) + ((int) ((doubleToLongBits >>> 32) ^ doubleToLongBits))) * 31) + this.f2801g;
        }
        throw null;
    }
}

package p000;

import java.io.Serializable;

/* renamed from: bnwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnwc implements Serializable {

    /* renamed from: a */
    public final double f132274a;

    /* renamed from: b */
    public final double f132275b;

    static {
        new bnwc(0.0d, 0.0d);
    }

    public bnwc() {
        this(0.0d, 0.0d);
    }

    /* renamed from: a */
    public static bnwc m110612a(double d, double d2) {
        return new bnwc(d, d2);
    }

    /* renamed from: b */
    public static bnwc m110613b(double d, double d2) {
        return new bnwc(bnvn.m110524b(d), bnvn.m110524b(d2));
    }

    /* renamed from: b */
    public final double mo68615b() {
        return this.f132274a * 57.29577951308232d;
    }

    /* renamed from: c */
    public final bnvn mo68616c() {
        return bnvn.m110521a(this.f132275b);
    }

    /* renamed from: d */
    public final double mo68617d() {
        return this.f132275b * 57.29577951308232d;
    }

    /* renamed from: e */
    public final bnwk mo68618e() {
        double d = this.f132274a;
        double d2 = this.f132275b;
        double cos = Math.cos(d);
        return new bnwk(Math.cos(d2) * cos, Math.sin(d2) * cos, Math.sin(d));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bnwc) {
            bnwc bnwc = (bnwc) obj;
            return this.f132274a == bnwc.f132274a && this.f132275b == bnwc.f132275b;
        }
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f132274a) + 646;
        long doubleToLongBits2 = doubleToLongBits + (37 * doubleToLongBits) + Double.doubleToLongBits(this.f132275b);
        return (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
    }

    public final String toString() {
        double d = this.f132274a;
        double d2 = this.f132275b;
        StringBuilder sb = new StringBuilder(52);
        sb.append("(");
        sb.append(d);
        sb.append(", ");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }

    public bnwc(double d, double d2) {
        this.f132274a = d;
        this.f132275b = d2;
    }

    /* renamed from: a */
    public final bnvn mo68614a() {
        return bnvn.m110521a(this.f132274a);
    }

    public bnwc(bnvn bnvn, bnvn bnvn2) {
        this(bnvn.f132229b, bnvn2.f132229b);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public bnwc(bnwk bnwk) {
        this(Math.atan2(r0, Math.sqrt((r2 * r2) + (r4 * r4))), Math.atan2(bnwk.f132307i, bnwk.f132306h));
        double d = bnwk.f132308j;
        double d2 = bnwk.f132306h;
        double d3 = bnwk.f132307i;
    }
}

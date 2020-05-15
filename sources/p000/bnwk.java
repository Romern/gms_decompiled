package p000;

import java.io.Serializable;

/* renamed from: bnwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnwk implements Comparable, Serializable {

    /* renamed from: a */
    public static final bnwk f132299a = new bnwk(0.0d, 0.0d, 0.0d);

    /* renamed from: b */
    public static final bnwk f132300b = new bnwk(1.0d, 0.0d, 0.0d);

    /* renamed from: c */
    public static final bnwk f132301c = new bnwk(-1.0d, 0.0d, 0.0d);

    /* renamed from: d */
    public static final bnwk f132302d = new bnwk(0.0d, 1.0d, 0.0d);

    /* renamed from: e */
    public static final bnwk f132303e = new bnwk(0.0d, -1.0d, 0.0d);

    /* renamed from: f */
    public static final bnwk f132304f = new bnwk(0.0d, 0.0d, 1.0d);

    /* renamed from: g */
    public static final bnwk f132305g = new bnwk(0.0d, 0.0d, -1.0d);

    /* renamed from: h */
    final double f132306h;

    /* renamed from: i */
    final double f132307i;

    /* renamed from: j */
    final double f132308j;

    public bnwk() {
        this.f132308j = 0.0d;
        this.f132307i = 0.0d;
        this.f132306h = 0.0d;
    }

    /* renamed from: a */
    public static final double m110661a(bnwk bnwk, bnwk bnwk2, bnwk bnwk3) {
        double d = bnwk2.f132307i;
        double d2 = bnwk3.f132308j;
        double d3 = bnwk2.f132308j;
        double d4 = bnwk3.f132307i;
        double d5 = bnwk3.f132306h;
        double d6 = bnwk2.f132306h;
        return (bnwk.f132306h * ((d * d2) - (d3 * d4))) + (bnwk.f132307i * ((d3 * d5) - (d2 * d6))) + (bnwk.f132308j * ((d6 * d4) - (d * d5)));
    }

    /* renamed from: b */
    public static final bnwk m110665b(bnwk bnwk) {
        double a = bnwk.mo68658a();
        if (a != 0.0d) {
            a = 1.0d / a;
        }
        return m110663a(bnwk, a);
    }

    /* renamed from: c */
    public static final bnwk m110667c(bnwk bnwk, bnwk bnwk2) {
        double d = bnwk.f132307i;
        double d2 = bnwk2.f132308j;
        double d3 = bnwk.f132308j;
        double d4 = bnwk2.f132307i;
        double d5 = bnwk2.f132306h;
        double d6 = bnwk.f132306h;
        return new bnwk((d * d2) - (d3 * d4), (d3 * d5) - (d2 * d6), (d6 * d4) - (d * d5));
    }

    /* renamed from: b */
    public final double mo68660b() {
        double d = this.f132306h;
        double d2 = this.f132307i;
        double d3 = this.f132308j;
        return (d * d) + (d2 * d2) + (d3 * d3);
    }

    /* renamed from: d */
    public final int compareTo(bnwk bnwk) {
        double d = this.f132306h;
        double d2 = bnwk.f132306h;
        if (d < d2) {
            return -1;
        }
        if (d2 >= d) {
            double d3 = this.f132307i;
            double d4 = bnwk.f132307i;
            if (d3 < d4) {
                return -1;
            }
            if (d4 >= d3 && this.f132308j < bnwk.f132308j) {
                return -1;
            }
        }
        return !mo68662c(bnwk) ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bnwk) {
            bnwk bnwk = (bnwk) obj;
            if (this.f132306h == bnwk.f132306h && this.f132307i == bnwk.f132307i && this.f132308j == bnwk.f132308j) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(Math.abs(this.f132306h)) + 646;
        long doubleToLongBits2 = doubleToLongBits + (doubleToLongBits * 37) + Double.doubleToLongBits(Math.abs(this.f132307i));
        long doubleToLongBits3 = doubleToLongBits2 + (37 * doubleToLongBits2) + Double.doubleToLongBits(Math.abs(this.f132308j));
        return (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
    }

    public final String toString() {
        double d = this.f132306h;
        double d2 = this.f132307i;
        double d3 = this.f132308j;
        StringBuilder sb = new StringBuilder(78);
        sb.append("(");
        sb.append(d);
        sb.append(", ");
        sb.append(d2);
        sb.append(", ");
        sb.append(d3);
        sb.append(")");
        return sb.toString();
    }

    public bnwk(double d, double d2, double d3) {
        this.f132306h = d;
        this.f132307i = d2;
        this.f132308j = d3;
    }

    /* renamed from: c */
    public final String mo68661c() {
        bnwc bnwc = new bnwc(this);
        String d = Double.toString(bnwc.mo68615b());
        String d2 = Double.toString(bnwc.mo68617d());
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 4 + String.valueOf(d2).length());
        sb.append("(");
        sb.append(d);
        sb.append(", ");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    static final int m110662a(double d, double d2, double d3) {
        double abs = Math.abs(d);
        double abs2 = Math.abs(d2);
        double abs3 = Math.abs(d3);
        return abs <= abs2 ? abs2 > abs3 ? 1 : 2 : abs > abs3 ? 0 : 2;
    }

    /* renamed from: b */
    public static final bnwk m110666b(bnwk bnwk, bnwk bnwk2) {
        return new bnwk(bnwk.f132306h - bnwk2.f132306h, bnwk.f132307i - bnwk2.f132307i, bnwk.f132308j - bnwk2.f132308j);
    }

    /* renamed from: a */
    public static final bnwk m110663a(bnwk bnwk, double d) {
        return new bnwk(d * bnwk.f132306h, bnwk.f132307i * d, bnwk.f132308j * d);
    }

    /* renamed from: a */
    public static final bnwk m110664a(bnwk bnwk, bnwk bnwk2) {
        return new bnwk(bnwk.f132306h + bnwk2.f132306h, bnwk.f132307i + bnwk2.f132307i, bnwk.f132308j + bnwk2.f132308j);
    }

    /* renamed from: c */
    public final boolean mo68662c(bnwk bnwk) {
        return this.f132306h == bnwk.f132306h && this.f132307i == bnwk.f132307i && this.f132308j == bnwk.f132308j;
    }

    /* renamed from: a */
    public final double mo68658a() {
        return Math.sqrt(mo68660b());
    }

    /* renamed from: a */
    public final double mo68659a(bnwk bnwk) {
        return (this.f132306h * bnwk.f132306h) + (this.f132307i * bnwk.f132307i) + (this.f132308j * bnwk.f132308j);
    }
}

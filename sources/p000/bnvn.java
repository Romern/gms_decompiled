package p000;

import java.io.Serializable;

/* renamed from: bnvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnvn implements Comparable, Serializable {

    /* renamed from: a */
    public static final bnvn f132228a = new bnvn(Double.POSITIVE_INFINITY);

    /* renamed from: b */
    public final double f132229b;

    static {
        new bnvn();
    }

    public bnvn() {
        this.f132229b = 0.0d;
    }

    /* renamed from: a */
    public static bnvn m110521a(double d) {
        return new bnvn(d);
    }

    /* renamed from: b */
    public static bnvn m110524b(double d) {
        return new bnvn(d * 0.017453292519943295d);
    }

    @Deprecated
    /* renamed from: c */
    public static bnvn m110525c(double d) {
        return m110521a(d / 6367000.0d);
    }

    /* renamed from: a */
    public final double mo68545a() {
        return this.f132229b * 57.29577951308232d;
    }

    @Deprecated
    /* renamed from: c */
    public final double mo68547c() {
        return this.f132229b * 6367000.0d;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        double d = this.f132229b;
        double d2 = ((bnvn) obj).f132229b;
        if (d >= d2) {
            return d <= d2 ? 0 : 1;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bnvn) && this.f132229b == ((bnvn) obj).f132229b;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f132229b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        double a = mo68545a();
        StringBuilder sb = new StringBuilder(25);
        sb.append(a);
        sb.append("d");
        return sb.toString();
    }

    private bnvn(double d) {
        this.f132229b = d;
    }

    /* renamed from: a */
    public static bnvn m110522a(int i) {
        double d = (double) i;
        Double.isNaN(d);
        return m110524b(d * 1.0E-7d);
    }

    /* renamed from: b */
    public final int mo68546b() {
        return bqcn.m112578a(Math.round(mo68545a() * 1.0E7d));
    }

    /* renamed from: a */
    public static bnvn m110523a(bnvn bnvn, bnvn bnvn2) {
        return bnvn2.f132229b > bnvn.f132229b ? bnvn : bnvn2;
    }
}

package p000;

import java.io.Serializable;

/* renamed from: bnvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnvo implements Comparable, Serializable {

    /* renamed from: a */
    public static final bnvo f132230a = new bnvo(4.0d);

    /* renamed from: b */
    public static final bnvo f132231b = new bnvo(Double.POSITIVE_INFINITY);

    /* renamed from: c */
    public static final bnvo f132232c = new bnvo(-1.0d);

    /* renamed from: d */
    private final double f132233d;

    static {
        new bnvo(0.0d);
        new bnvo(2.0d);
    }

    public bnvo(double d) {
        this.f132233d = d;
        boolean z = true;
        if ((d < 0.0d || d > 4.0d) && !mo68552a() && !mo68553b()) {
            z = false;
        }
        bmxy.m108588a(z);
    }

    /* renamed from: a */
    public final boolean mo68552a() {
        return this.f132233d < 0.0d;
    }

    /* renamed from: b */
    public final boolean mo68553b() {
        return this.f132233d == Double.POSITIVE_INFINITY;
    }

    /* renamed from: c */
    public final bnvn mo68554c() {
        if (mo68552a()) {
            return bnvn.m110521a(-1.0d);
        }
        if (mo68553b()) {
            return bnvn.f132228a;
        }
        double asin = Math.asin(Math.sqrt(this.f132233d) * 0.5d);
        return bnvn.m110521a(asin + asin);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Double.compare(this.f132233d, ((bnvo) obj).f132233d);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bnvo) && this.f132233d == ((bnvo) obj).f132233d;
    }

    public final int hashCode() {
        double d = this.f132233d;
        if (d != 0.0d) {
            return bqci.m112567a(d);
        }
        return 0;
    }

    public final String toString() {
        return mo68554c().toString();
    }

    /* renamed from: a */
    public static double m110529a(bnvo bnvo) {
        boolean z;
        if (!bnvo.mo68552a()) {
            z = bnvo.mo68553b();
        } else {
            z = true;
        }
        bmxy.m108588a(!z);
        double d = bnvo.f132233d;
        return Math.sqrt(d * (1.0d - (0.25d * d)));
    }

    /* renamed from: a */
    public static bnvo m110530a(bnvn bnvn) {
        if (bnvn.f132229b < 0.0d) {
            return f132232c;
        }
        if (bnvn.equals(bnvn.f132228a)) {
            return f132231b;
        }
        double sin = Math.sin(Math.min(3.141592653589793d, bnvn.f132229b) * 0.5d);
        double d = sin + sin;
        return new bnvo(d * d);
    }
}

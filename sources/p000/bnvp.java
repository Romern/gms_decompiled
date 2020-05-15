package p000;

import java.io.Serializable;

/* renamed from: bnvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnvp implements Cloneable, Serializable {

    /* renamed from: a */
    public double f132234a;

    /* renamed from: b */
    public double f132235b;

    public bnvp() {
        mo68559a();
    }

    /* renamed from: b */
    public static double m110534b(double d, double d2) {
        double d3 = d2 - d;
        return d3 < 0.0d ? (d2 + 3.141592653589793d) - (d - 1.4292036732051034d) : d3;
    }

    /* renamed from: c */
    public static bnvp m110535c() {
        bnvp bnvp = new bnvp();
        bnvp.mo68559a();
        return bnvp;
    }

    /* renamed from: d */
    public static bnvp m110536d() {
        bnvp bnvp = new bnvp();
        bnvp.mo68564b();
        return bnvp;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo68559a() {
        this.f132234a = 3.141592653589793d;
        this.f132235b = -3.141592653589793d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo68561a(double d, double d2, boolean z) {
        this.f132234a = d;
        this.f132235b = d2;
        if (!z) {
            if (d == -3.141592653589793d && d2 != 3.141592653589793d) {
                this.f132234a = 3.141592653589793d;
            }
            if (d2 == -3.141592653589793d && d != 3.141592653589793d) {
                this.f132235b = 3.141592653589793d;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo68564b() {
        this.f132234a = -3.141592653589793d;
        this.f132235b = 3.141592653589793d;
    }

    /* renamed from: e */
    public final boolean mo68566e() {
        return this.f132235b - this.f132234a == 6.283185307179586d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bnvp) {
            bnvp bnvp = (bnvp) obj;
            return this.f132234a == bnvp.f132234a && this.f132235b == bnvp.f132235b;
        }
    }

    /* renamed from: f */
    public final boolean mo68568f() {
        return this.f132234a - this.f132235b == 6.283185307179586d;
    }

    /* renamed from: g */
    public final boolean mo68569g() {
        return this.f132234a > this.f132235b;
    }

    /* renamed from: h */
    public final double mo68570h() {
        double d = this.f132235b - this.f132234a;
        if (d >= 0.0d) {
            return d;
        }
        double d2 = d + 6.283185307179586d;
        if (d2 <= 0.0d) {
            return -1.0d;
        }
        return d2;
    }

    public final int hashCode() {
        long doubleToLongBits = ((Double.doubleToLongBits(this.f132234a) + 629) * 37) + Double.doubleToLongBits(this.f132235b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        double d = this.f132234a;
        double d2 = this.f132235b;
        StringBuilder sb = new StringBuilder(52);
        sb.append("[");
        sb.append(d);
        sb.append(", ");
        sb.append(d2);
        sb.append("]");
        return sb.toString();
    }

    public bnvp(double d, double d2) {
        this(d, d2, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo68560a(double d, double d2) {
        if (d == -3.141592653589793d) {
            d = 3.141592653589793d;
        }
        if (d2 == -3.141592653589793d) {
            d2 = 3.141592653589793d;
        }
        if (m110534b(d, d2) <= 3.141592653589793d) {
            this.f132234a = d;
            this.f132235b = d2;
            return;
        }
        this.f132234a = d2;
        this.f132235b = d;
    }

    public bnvp(double d, double d2, boolean z) {
        mo68561a(d, d2, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo68565b(bnvp bnvp) {
        if (bnvp.mo68568f()) {
            return;
        }
        if (mo68562a(bnvp.f132234a)) {
            if (!mo68562a(bnvp.f132235b)) {
                this.f132235b = bnvp.f132235b;
            } else if (!mo68563a(bnvp)) {
                mo68564b();
            }
        } else if (mo68562a(bnvp.f132235b)) {
            this.f132234a = bnvp.f132234a;
        } else if (mo68568f() || bnvp.mo68562a(this.f132234a)) {
            this.f132234a = bnvp.f132234a;
            this.f132235b = bnvp.f132235b;
        } else if (m110534b(bnvp.f132235b, this.f132234a) >= m110534b(this.f132235b, bnvp.f132234a)) {
            this.f132235b = bnvp.f132235b;
        } else {
            this.f132234a = bnvp.f132234a;
        }
    }

    public bnvp(bnvp bnvp) {
        this.f132234a = bnvp.f132234a;
        this.f132235b = bnvp.f132235b;
    }

    /* renamed from: a */
    public final boolean mo68562a(double d) {
        return mo68569g() ? (d >= this.f132234a || d <= this.f132235b) && !mo68568f() : d >= this.f132234a && d <= this.f132235b;
    }

    /* renamed from: a */
    public final boolean mo68563a(bnvp bnvp) {
        return mo68569g() ? !bnvp.mo68569g() ? (bnvp.f132234a >= this.f132234a || bnvp.f132235b <= this.f132235b) && !mo68568f() : bnvp.f132234a >= this.f132234a && bnvp.f132235b <= this.f132235b : !bnvp.mo68569g() ? bnvp.f132234a >= this.f132234a && bnvp.f132235b <= this.f132235b : mo68566e() || bnvp.mo68568f();
    }
}

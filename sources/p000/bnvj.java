package p000;

import java.io.Serializable;

/* renamed from: bnvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnvj implements Serializable {

    /* renamed from: a */
    public double f132220a;

    /* renamed from: b */
    public double f132221b;

    public bnvj() {
        this.f132220a = 1.0d;
        this.f132221b = 0.0d;
    }

    /* renamed from: a */
    public static bnvj m110496a() {
        return new bnvj(1.0d, 0.0d);
    }

    /* renamed from: a */
    public final boolean mo68518a(double d) {
        return d >= this.f132220a && d <= this.f132221b;
    }

    /* renamed from: b */
    public final double mo68519b(double d) {
        return Math.max(this.f132220a, Math.min(this.f132221b, d));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo68520b(double d, double d2) {
        if (d > d2) {
            this.f132220a = d2;
            this.f132221b = d;
            return;
        }
        this.f132220a = d;
        this.f132221b = d2;
    }

    /* renamed from: b */
    public final boolean mo68521b() {
        return this.f132220a > this.f132221b;
    }

    /* renamed from: c */
    public final bnvj mo68522c(double d) {
        return !mo68521b() ? new bnvj(this.f132220a - d, this.f132221b + d) : this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo68523c(double d, double d2) {
        this.f132220a = d;
        this.f132221b = d2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bnvj)) {
            return false;
        }
        bnvj bnvj = (bnvj) obj;
        if ((this.f132220a != bnvj.f132220a || this.f132221b != bnvj.f132221b) && (!mo68521b() || !bnvj.mo68521b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (mo68521b()) {
            return 17;
        }
        long doubleToLongBits = ((Double.doubleToLongBits(this.f132220a) + 629) * 37) + Double.doubleToLongBits(this.f132221b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        double d = this.f132220a;
        double d2 = this.f132221b;
        StringBuilder sb = new StringBuilder(52);
        sb.append("[");
        sb.append(d);
        sb.append(", ");
        sb.append(d2);
        sb.append("]");
        return sb.toString();
    }

    public bnvj(double d, double d2) {
        this.f132220a = d;
        this.f132221b = d2;
    }

    /* renamed from: a */
    public static bnvj m110497a(double d, double d2) {
        bnvj bnvj = new bnvj();
        bnvj.mo68520b(d, d2);
        return bnvj;
    }

    public bnvj(bnvj bnvj) {
        this.f132220a = bnvj.f132220a;
        this.f132221b = bnvj.f132221b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo68517a(bnvj bnvj) {
        if (mo68521b()) {
            this.f132220a = bnvj.f132220a;
            this.f132221b = bnvj.f132221b;
        } else if (!bnvj.mo68521b()) {
            this.f132220a = Math.min(this.f132220a, bnvj.f132220a);
            this.f132221b = Math.max(this.f132221b, bnvj.f132221b);
        }
    }
}

package p000;

import java.io.Serializable;

/* renamed from: bnvl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnvl implements Serializable {

    /* renamed from: a */
    public double f132224a;

    /* renamed from: b */
    public double f132225b;

    public bnvl() {
        this(0.0d, 0.0d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo68533a(double d, double d2) {
        this.f132224a = d;
        this.f132225b = d2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bnvl) {
            bnvl bnvl = (bnvl) obj;
            if (this.f132224a == bnvl.f132224a && this.f132225b == bnvl.f132225b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(Math.abs(this.f132224a)) + 646;
        long doubleToLongBits2 = doubleToLongBits + (37 * doubleToLongBits) + Double.doubleToLongBits(Math.abs(this.f132225b));
        return (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
    }

    public final String toString() {
        double d = this.f132224a;
        double d2 = this.f132225b;
        StringBuilder sb = new StringBuilder(52);
        sb.append("(");
        sb.append(d);
        sb.append(", ");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }

    public bnvl(double d, double d2) {
        this.f132224a = d;
        this.f132225b = d2;
    }
}

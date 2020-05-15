package p000;

/* renamed from: bumh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bumh {

    /* renamed from: a */
    public double f154236a = Double.NEGATIVE_INFINITY;

    /* renamed from: b */
    public int f154237b = Integer.MIN_VALUE;

    /* renamed from: a */
    public final void mo72853a() {
        this.f154236a = Double.NEGATIVE_INFINITY;
        this.f154237b = Integer.MIN_VALUE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bumh) {
            bumh bumh = (bumh) obj;
            return this.f154236a == bumh.f154236a && this.f154237b == bumh.f154237b;
        }
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f154236a);
        int i = this.f154237b;
        return i + (i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        double d = this.f154236a;
        int i = this.f154237b;
        StringBuilder sb = new StringBuilder(111);
        sb.append("LogLikelihoodCalculationResult - result: ");
        sb.append(d);
        sb.append(" - number of matching predictives: ");
        sb.append(i);
        return sb.toString();
    }
}

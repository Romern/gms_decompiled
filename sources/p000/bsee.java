package p000;

/* renamed from: bsee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bsee extends bsep {

    /* renamed from: a */
    private final double f144290a;

    /* renamed from: b */
    private final double f144291b;

    public bsee(double d, double d2) {
        this.f144290a = d;
        this.f144291b = d2;
    }

    /* renamed from: a */
    public final double mo70338a() {
        return this.f144290a;
    }

    /* renamed from: b */
    public final double mo70339b() {
        return this.f144291b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bsep) {
            bsep bsep = (bsep) obj;
            return Double.doubleToLongBits(this.f144290a) == Double.doubleToLongBits(bsep.mo70338a()) && Double.doubleToLongBits(this.f144291b) == Double.doubleToLongBits(bsep.mo70339b());
        }
    }

    public final int hashCode() {
        return ((int) ((Double.doubleToLongBits(this.f144291b) >>> 32) ^ Double.doubleToLongBits(this.f144291b))) ^ ((((int) ((Double.doubleToLongBits(this.f144290a) >>> 32) ^ Double.doubleToLongBits(this.f144290a))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        double d = this.f144290a;
        double d2 = this.f144291b;
        StringBuilder sb = new StringBuilder(143);
        sb.append("BlueskyWeightingConfiguration{probabilityDensityForInvalidGrid=");
        sb.append(d);
        sb.append(", blueskyProbDeweightingFactor=");
        sb.append(d2);
        sb.append("}");
        return sb.toString();
    }
}

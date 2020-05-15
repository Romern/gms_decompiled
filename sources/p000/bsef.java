package p000;

/* renamed from: bsef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bsef extends bser {

    /* renamed from: a */
    private final double f144292a;

    /* renamed from: b */
    private final double f144293b;

    /* renamed from: c */
    private final double f144294c;

    /* renamed from: d */
    private final double f144295d;

    /* renamed from: e */
    private final double f144296e;

    /* renamed from: f */
    private final double f144297f;

    /* renamed from: g */
    private final double f144298g;

    /* renamed from: h */
    private final double f144299h;

    public bsef(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        this.f144292a = d;
        this.f144293b = d2;
        this.f144294c = d3;
        this.f144295d = d4;
        this.f144296e = d5;
        this.f144297f = d6;
        this.f144298g = d7;
        this.f144299h = d8;
    }

    /* renamed from: a */
    public final double mo70343a() {
        return this.f144292a;
    }

    /* renamed from: b */
    public final double mo70344b() {
        return this.f144293b;
    }

    /* renamed from: c */
    public final double mo70345c() {
        return this.f144294c;
    }

    /* renamed from: d */
    public final double mo70346d() {
        return this.f144295d;
    }

    /* renamed from: e */
    public final double mo70347e() {
        return this.f144296e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bser) {
            bser bser = (bser) obj;
            return Double.doubleToLongBits(this.f144292a) == Double.doubleToLongBits(bser.mo70343a()) && Double.doubleToLongBits(this.f144293b) == Double.doubleToLongBits(bser.mo70344b()) && Double.doubleToLongBits(this.f144294c) == Double.doubleToLongBits(bser.mo70345c()) && Double.doubleToLongBits(this.f144295d) == Double.doubleToLongBits(bser.mo70346d()) && Double.doubleToLongBits(this.f144296e) == Double.doubleToLongBits(bser.mo70347e()) && Double.doubleToLongBits(this.f144297f) == Double.doubleToLongBits(bser.mo70349f()) && Double.doubleToLongBits(this.f144298g) == Double.doubleToLongBits(bser.mo70350g()) && Double.doubleToLongBits(this.f144299h) == Double.doubleToLongBits(bser.mo70351h());
        }
    }

    /* renamed from: f */
    public final double mo70349f() {
        return this.f144297f;
    }

    /* renamed from: g */
    public final double mo70350g() {
        return this.f144298g;
    }

    /* renamed from: h */
    public final double mo70351h() {
        return this.f144299h;
    }

    public final int hashCode() {
        return ((int) ((Double.doubleToLongBits(this.f144299h) >>> 32) ^ Double.doubleToLongBits(this.f144299h))) ^ ((((((((((((((((int) ((Double.doubleToLongBits(this.f144292a) >>> 32) ^ Double.doubleToLongBits(this.f144292a))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f144293b) >>> 32) ^ Double.doubleToLongBits(this.f144293b)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f144294c) >>> 32) ^ Double.doubleToLongBits(this.f144294c)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f144295d) >>> 32) ^ Double.doubleToLongBits(this.f144295d)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f144296e) >>> 32) ^ Double.doubleToLongBits(this.f144296e)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f144297f) >>> 32) ^ Double.doubleToLongBits(this.f144297f)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f144298g) >>> 32) ^ Double.doubleToLongBits(this.f144298g)))) * 1000003);
    }

    public final String toString() {
        double d = this.f144292a;
        double d2 = this.f144293b;
        double d3 = this.f144294c;
        double d4 = this.f144295d;
        double d5 = this.f144296e;
        double d6 = this.f144297f;
        double d7 = this.f144298g;
        double d8 = this.f144299h;
        StringBuilder sb = new StringBuilder(444);
        sb.append("FilterStatusConfiguration{reInitAccuracyThresholdMultiplierGnss=");
        sb.append(d);
        sb.append(", reInitAccuracyThresholdMultiplierWifi=");
        sb.append(d2);
        sb.append(", initializationWindowLengthS=");
        sb.append(d3);
        sb.append(", maxGnssEvidenceAgeS=");
        sb.append(d4);
        sb.append(", maxWifiEvidenceAgeS=");
        sb.append(d5);
        sb.append(", maxStepEvidenceAgeS=");
        sb.append(d6);
        sb.append(", maxBearingGapS=");
        sb.append(d7);
        sb.append(", maxGnssWifiDistanceForGnssOnlyM=");
        sb.append(d8);
        sb.append("}");
        return sb.toString();
    }
}

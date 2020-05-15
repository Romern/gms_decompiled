package p000;

/* renamed from: bsei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bsei extends bsex {

    /* renamed from: a */
    private final double f144330a;

    /* renamed from: b */
    private final double f144331b;

    /* renamed from: c */
    private final double f144332c;

    /* renamed from: d */
    private final double f144333d;

    /* renamed from: e */
    private final double f144334e;

    public bsei(double d, double d2, double d3, double d4, double d5) {
        this.f144330a = d;
        this.f144331b = d2;
        this.f144332c = d3;
        this.f144333d = d4;
        this.f144334e = d5;
    }

    /* renamed from: a */
    public final double mo70390a() {
        return this.f144330a;
    }

    /* renamed from: b */
    public final double mo70391b() {
        return this.f144331b;
    }

    /* renamed from: c */
    public final double mo70392c() {
        return this.f144332c;
    }

    /* renamed from: d */
    public final double mo70393d() {
        return this.f144333d;
    }

    /* renamed from: e */
    public final double mo70394e() {
        return this.f144334e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bsex) {
            bsex bsex = (bsex) obj;
            return Double.doubleToLongBits(this.f144330a) == Double.doubleToLongBits(bsex.mo70390a()) && Double.doubleToLongBits(this.f144331b) == Double.doubleToLongBits(bsex.mo70391b()) && Double.doubleToLongBits(this.f144332c) == Double.doubleToLongBits(bsex.mo70392c()) && Double.doubleToLongBits(this.f144333d) == Double.doubleToLongBits(bsex.mo70393d()) && Double.doubleToLongBits(this.f144334e) == Double.doubleToLongBits(bsex.mo70394e());
        }
    }

    public final int hashCode() {
        return ((int) ((Double.doubleToLongBits(this.f144334e) >>> 32) ^ Double.doubleToLongBits(this.f144334e))) ^ ((((((((((int) ((Double.doubleToLongBits(this.f144330a) >>> 32) ^ Double.doubleToLongBits(this.f144330a))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f144331b) >>> 32) ^ Double.doubleToLongBits(this.f144331b)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f144332c) >>> 32) ^ Double.doubleToLongBits(this.f144332c)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f144333d) >>> 32) ^ Double.doubleToLongBits(this.f144333d)))) * 1000003);
    }

    public final String toString() {
        double d = this.f144330a;
        double d2 = this.f144331b;
        double d3 = this.f144332c;
        double d4 = this.f144333d;
        double d5 = this.f144334e;
        StringBuilder sb = new StringBuilder(244);
        sb.append("PositionMeasurementConditionerConfiguration{minStdDevM=");
        sb.append(d);
        sb.append(", maxStdDevM=");
        sb.append(d2);
        sb.append(", stdDevScaleM=");
        sb.append(d3);
        sb.append(", rejectionDistanceM=");
        sb.append(d4);
        sb.append(", rejectionPeriodS=");
        sb.append(d5);
        sb.append("}");
        return sb.toString();
    }
}

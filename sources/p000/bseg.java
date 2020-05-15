package p000;

/* renamed from: bseg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bseg extends bset {

    /* renamed from: a */
    private final double f144300a;

    /* renamed from: b */
    private final double f144301b;

    /* renamed from: c */
    private final double f144302c;

    /* renamed from: d */
    private final double f144303d;

    /* renamed from: e */
    private final double f144304e;

    /* renamed from: f */
    private final double f144305f;

    /* renamed from: g */
    private final boolean f144306g;

    /* renamed from: h */
    private final double f144307h;

    public bseg(double d, double d2, double d3, double d4, double d5, double d6, boolean z, double d7) {
        this.f144300a = d;
        this.f144301b = d2;
        this.f144302c = d3;
        this.f144303d = d4;
        this.f144304e = d5;
        this.f144305f = d6;
        this.f144306g = z;
        this.f144307h = d7;
    }

    /* renamed from: a */
    public final double mo70354a() {
        return this.f144300a;
    }

    /* renamed from: b */
    public final double mo70355b() {
        return this.f144301b;
    }

    /* renamed from: c */
    public final double mo70356c() {
        return this.f144302c;
    }

    /* renamed from: d */
    public final double mo70357d() {
        return this.f144303d;
    }

    /* renamed from: e */
    public final double mo70358e() {
        return this.f144304e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bset) {
            bset bset = (bset) obj;
            return Double.doubleToLongBits(this.f144300a) == Double.doubleToLongBits(bset.mo70354a()) && Double.doubleToLongBits(this.f144301b) == Double.doubleToLongBits(bset.mo70355b()) && Double.doubleToLongBits(this.f144302c) == Double.doubleToLongBits(bset.mo70356c()) && Double.doubleToLongBits(this.f144303d) == Double.doubleToLongBits(bset.mo70357d()) && Double.doubleToLongBits(this.f144304e) == Double.doubleToLongBits(bset.mo70358e()) && Double.doubleToLongBits(this.f144305f) == Double.doubleToLongBits(bset.mo70360f()) && this.f144306g == bset.mo70361g() && Double.doubleToLongBits(this.f144307h) == Double.doubleToLongBits(bset.mo70362h());
        }
    }

    /* renamed from: f */
    public final double mo70360f() {
        return this.f144305f;
    }

    /* renamed from: g */
    public final boolean mo70361g() {
        return this.f144306g;
    }

    /* renamed from: h */
    public final double mo70362h() {
        return this.f144307h;
    }

    public final int hashCode() {
        int i;
        int doubleToLongBits = (((((((((((((int) ((Double.doubleToLongBits(this.f144300a) >>> 32) ^ Double.doubleToLongBits(this.f144300a))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f144301b) >>> 32) ^ Double.doubleToLongBits(this.f144301b)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f144302c) >>> 32) ^ Double.doubleToLongBits(this.f144302c)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f144303d) >>> 32) ^ Double.doubleToLongBits(this.f144303d)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f144304e) >>> 32) ^ Double.doubleToLongBits(this.f144304e)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f144305f) >>> 32) ^ Double.doubleToLongBits(this.f144305f)))) * 1000003;
        if (!this.f144306g) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((int) ((Double.doubleToLongBits(this.f144307h) >>> 32) ^ Double.doubleToLongBits(this.f144307h))) ^ ((doubleToLongBits ^ i) * 1000003);
    }

    public final String toString() {
        double d = this.f144300a;
        double d2 = this.f144301b;
        double d3 = this.f144302c;
        double d4 = this.f144303d;
        double d5 = this.f144304e;
        double d6 = this.f144305f;
        boolean z = this.f144306g;
        double d7 = this.f144307h;
        StringBuilder sb = new StringBuilder(458);
        sb.append("LinearLatLngKalmanFilterConfiguration{processNoiseUnknownPositionM=");
        sb.append(d);
        sb.append(", processNoiseUnknownVelocityMps=");
        sb.append(d2);
        sb.append(", processNoiseFeetPositionM=");
        sb.append(d3);
        sb.append(", processNoiseFeetVelocityMps=");
        sb.append(d4);
        sb.append(", processNoiseWheelsPositionM=");
        sb.append(d5);
        sb.append(", processNoiseWheelsVelocityMps=");
        sb.append(d6);
        sb.append(", enableMeasurementErrorReset=");
        sb.append(z);
        sb.append(", measurementErrorResetThresholdM=");
        sb.append(d7);
        sb.append("}");
        return sb.toString();
    }
}

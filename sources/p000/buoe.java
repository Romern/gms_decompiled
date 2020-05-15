package p000;

/* renamed from: buoe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buoe extends bunz {

    /* renamed from: a */
    public final boolean f154506a;

    /* renamed from: b */
    public final boolean f154507b;

    /* renamed from: c */
    public final boolean f154508c;

    /* renamed from: d */
    public final double f154509d;

    /* renamed from: e */
    public final double f154510e;

    /* renamed from: f */
    public final double f154511f;

    /* renamed from: g */
    public final double f154512g;

    /* renamed from: h */
    public final bunv f154513h;

    public buoe(boolean z, boolean z2, boolean z3, double d, double d2, double d3, double d4, bunv bunv) {
        this.f154506a = z;
        this.f154507b = z2;
        this.f154508c = z3;
        this.f154509d = d;
        this.f154510e = d2;
        this.f154511f = d3;
        this.f154512g = d4;
        this.f154513h = bunv;
    }

    /* renamed from: a */
    public final boolean mo72955a() {
        return this.f154506a;
    }

    /* renamed from: b */
    public final boolean mo72956b() {
        return this.f154507b;
    }

    /* renamed from: c */
    public final boolean mo72957c() {
        return this.f154508c;
    }

    /* renamed from: d */
    public final double mo72958d() {
        return this.f154509d;
    }

    /* renamed from: e */
    public final double mo72959e() {
        return this.f154510e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bunz) {
            bunz bunz = (bunz) obj;
            return this.f154506a == bunz.mo72955a() && this.f154507b == bunz.mo72956b() && this.f154508c == bunz.mo72957c() && Double.doubleToLongBits(this.f154509d) == Double.doubleToLongBits(bunz.mo72958d()) && Double.doubleToLongBits(this.f154510e) == Double.doubleToLongBits(bunz.mo72959e()) && Double.doubleToLongBits(this.f154511f) == Double.doubleToLongBits(bunz.mo72960f()) && Double.doubleToLongBits(this.f154512g) == Double.doubleToLongBits(bunz.mo72961g()) && this.f154513h.equals(bunz.mo72962h());
        }
    }

    /* renamed from: f */
    public final double mo72960f() {
        return this.f154511f;
    }

    /* renamed from: g */
    public final double mo72961g() {
        return this.f154512g;
    }

    /* renamed from: h */
    public final bunv mo72962h() {
        return this.f154513h;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 1237;
        if (!this.f154506a) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i4 = (i ^ 1000003) * 1000003;
        if (!this.f154507b) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i5 = (i4 ^ i2) * 1000003;
        if (this.f154508c) {
            i3 = 1231;
        }
        return ((((((((((i5 ^ i3) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f154509d) >>> 32) ^ Double.doubleToLongBits(this.f154509d)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f154510e) >>> 32) ^ Double.doubleToLongBits(this.f154510e)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f154511f) >>> 32) ^ Double.doubleToLongBits(this.f154511f)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f154512g) >>> 32) ^ Double.doubleToLongBits(this.f154512g)))) * 1000003) ^ this.f154513h.hashCode();
    }

    public final String toString() {
        boolean z = this.f154506a;
        boolean z2 = this.f154507b;
        boolean z3 = this.f154508c;
        double d = this.f154509d;
        double d2 = this.f154510e;
        double d3 = this.f154511f;
        double d4 = this.f154512g;
        String valueOf = String.valueOf(this.f154513h);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 293);
        sb.append("Result{detected=");
        sb.append(z);
        sb.append(", outlierAccel=");
        sb.append(z2);
        sb.append(", spike=");
        sb.append(z3);
        sb.append(", accelVarianceAverageThresholdM2s4=");
        sb.append(d);
        sb.append(", accelVarianceXThresholdM2s4=");
        sb.append(d2);
        sb.append(", accelVarianceYThresholdM2s4=");
        sb.append(d3);
        sb.append(", accelVarianceZThresholdM2s4=");
        sb.append(d4);
        sb.append(", accelFeatures=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

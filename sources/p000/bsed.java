package p000;

/* renamed from: bsed */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsed extends bsen {

    /* renamed from: a */
    public final boolean f144285a;

    /* renamed from: b */
    public final double f144286b;

    /* renamed from: c */
    public final boolean f144287c;

    /* renamed from: d */
    public final boolean f144288d;

    /* renamed from: e */
    public final bsel f144289e;

    public bsed(boolean z, double d, boolean z2, boolean z3, bsel bsel) {
        this.f144285a = z;
        this.f144286b = d;
        this.f144287c = z2;
        this.f144288d = z3;
        this.f144289e = bsel;
    }

    /* renamed from: a */
    public final boolean mo70330a() {
        return this.f144285a;
    }

    /* renamed from: b */
    public final double mo70331b() {
        return this.f144286b;
    }

    /* renamed from: c */
    public final boolean mo70332c() {
        return this.f144287c;
    }

    /* renamed from: d */
    public final boolean mo70333d() {
        return this.f144288d;
    }

    /* renamed from: e */
    public final bsel mo70334e() {
        return this.f144289e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bsen) {
            bsen bsen = (bsen) obj;
            return this.f144285a == bsen.mo70330a() && Double.doubleToLongBits(this.f144286b) == Double.doubleToLongBits(bsen.mo70331b()) && this.f144287c == bsen.mo70332c() && this.f144288d == bsen.mo70333d() && this.f144289e.equals(bsen.mo70334e());
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 1237;
        if (!this.f144285a) {
            i = 1237;
        } else {
            i = 1231;
        }
        int doubleToLongBits = (((i ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f144286b) >>> 32) ^ Double.doubleToLongBits(this.f144286b)))) * 1000003;
        if (!this.f144287c) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i4 = (doubleToLongBits ^ i2) * 1000003;
        if (this.f144288d) {
            i3 = 1231;
        }
        return ((i4 ^ i3) * 1000003) ^ this.f144289e.hashCode();
    }

    public final String toString() {
        boolean z = this.f144285a;
        double d = this.f144286b;
        boolean z2 = this.f144287c;
        boolean z3 = this.f144288d;
        String valueOf = String.valueOf(this.f144289e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 247);
        sb.append("BluemoonLocalizerSensorFusionConfiguration{notRequestWifiScansWhenProposingFromGnss=");
        sb.append(z);
        sb.append(", maxGnssAgeForNotRequestingWifiScansS=");
        sb.append(d);
        sb.append(", enableBluePixel=");
        sb.append(z2);
        sb.append(", enableBearingRangeFix143083454=");
        sb.append(z3);
        sb.append(", bluemoonLocalizerConfiguration=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

package p000;

/* renamed from: bseh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bseh extends bsev {

    /* renamed from: a */
    public final double f144308a;

    /* renamed from: b */
    public final boolean f144309b;

    /* renamed from: c */
    public final double f144310c;

    /* renamed from: d */
    public final int f144311d;

    /* renamed from: e */
    public final boolean f144312e;

    /* renamed from: f */
    public final boolean f144313f;

    /* renamed from: g */
    public final double f144314g;

    /* renamed from: h */
    public final double f144315h;

    /* renamed from: i */
    public final double f144316i;

    /* renamed from: j */
    public final boolean f144317j;

    /* renamed from: k */
    public final boolean f144318k;

    /* renamed from: l */
    public final long f144319l;

    /* renamed from: m */
    public final boolean f144320m;

    /* renamed from: n */
    public final boolean f144321n;

    /* renamed from: o */
    public final double f144322o;

    /* renamed from: p */
    public final boolean f144323p;

    /* renamed from: q */
    public final long f144324q;

    /* renamed from: r */
    public final boolean f144325r;

    /* renamed from: s */
    public final boolean f144326s;

    /* renamed from: t */
    public final boolean f144327t;

    /* renamed from: u */
    public final bset f144328u;

    /* renamed from: v */
    private final bsen f144329v;

    public bseh(double d, boolean z, double d2, int i, boolean z2, boolean z3, double d3, double d4, double d5, boolean z4, boolean z5, long j, boolean z6, boolean z7, double d6, boolean z8, long j2, boolean z9, boolean z10, boolean z11, bsen bsen, bset bset) {
        this.f144308a = d;
        this.f144309b = z;
        this.f144310c = d2;
        this.f144311d = i;
        this.f144312e = z2;
        this.f144313f = z3;
        this.f144314g = d3;
        this.f144315h = d4;
        this.f144316i = d5;
        this.f144317j = z4;
        this.f144318k = z5;
        this.f144319l = j;
        this.f144320m = z6;
        this.f144321n = z7;
        this.f144322o = d6;
        this.f144323p = z8;
        this.f144324q = j2;
        this.f144325r = z9;
        this.f144326s = z10;
        this.f144327t = z11;
        this.f144329v = bsen;
        this.f144328u = bset;
    }

    /* renamed from: a */
    public final double mo70365a() {
        return this.f144308a;
    }

    /* renamed from: b */
    public final boolean mo70366b() {
        return this.f144309b;
    }

    /* renamed from: c */
    public final double mo70367c() {
        return this.f144310c;
    }

    /* renamed from: d */
    public final int mo70368d() {
        return this.f144311d;
    }

    /* renamed from: e */
    public final boolean mo70369e() {
        return this.f144312e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bsev) {
            bsev bsev = (bsev) obj;
            return Double.doubleToLongBits(this.f144308a) == Double.doubleToLongBits(bsev.mo70365a()) && this.f144309b == bsev.mo70366b() && Double.doubleToLongBits(this.f144310c) == Double.doubleToLongBits(bsev.mo70367c()) && this.f144311d == bsev.mo70368d() && this.f144312e == bsev.mo70369e() && this.f144313f == bsev.mo70371f() && Double.doubleToLongBits(this.f144314g) == Double.doubleToLongBits(bsev.mo70372g()) && Double.doubleToLongBits(this.f144315h) == Double.doubleToLongBits(bsev.mo70373h()) && Double.doubleToLongBits(this.f144316i) == Double.doubleToLongBits(bsev.mo70375i()) && this.f144317j == bsev.mo70376j() && this.f144318k == bsev.mo70377k() && this.f144319l == bsev.mo70378l() && this.f144320m == bsev.mo70379m() && this.f144321n == bsev.mo70380n() && Double.doubleToLongBits(this.f144322o) == Double.doubleToLongBits(bsev.mo70381o()) && this.f144323p == bsev.mo70382p() && this.f144324q == bsev.mo70383q() && this.f144325r == bsev.mo70384r() && this.f144326s == bsev.mo70385s() && this.f144327t == bsev.mo70386t() && this.f144329v.equals(bsev.mo70388u()) && this.f144328u.equals(bsev.mo70389v());
        }
    }

    /* renamed from: f */
    public final boolean mo70371f() {
        return this.f144313f;
    }

    /* renamed from: g */
    public final double mo70372g() {
        return this.f144314g;
    }

    /* renamed from: h */
    public final double mo70373h() {
        return this.f144315h;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int doubleToLongBits = (((int) ((Double.doubleToLongBits(this.f144308a) >>> 32) ^ Double.doubleToLongBits(this.f144308a))) ^ 1000003) * 1000003;
        int i11 = 1237;
        if (!this.f144309b) {
            i = 1237;
        } else {
            i = 1231;
        }
        int doubleToLongBits2 = (((((doubleToLongBits ^ i) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f144310c) >>> 32) ^ Double.doubleToLongBits(this.f144310c)))) * 1000003) ^ this.f144311d) * 1000003;
        if (!this.f144312e) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i12 = (doubleToLongBits2 ^ i2) * 1000003;
        if (!this.f144313f) {
            i3 = 1237;
        } else {
            i3 = 1231;
        }
        int doubleToLongBits3 = (((((((i12 ^ i3) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f144314g) >>> 32) ^ Double.doubleToLongBits(this.f144314g)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f144315h) >>> 32) ^ Double.doubleToLongBits(this.f144315h)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f144316i) >>> 32) ^ Double.doubleToLongBits(this.f144316i)))) * 1000003;
        if (!this.f144317j) {
            i4 = 1237;
        } else {
            i4 = 1231;
        }
        int i13 = (doubleToLongBits3 ^ i4) * 1000003;
        if (!this.f144318k) {
            i5 = 1237;
        } else {
            i5 = 1231;
        }
        long j = this.f144319l;
        int i14 = (((i13 ^ i5) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        if (!this.f144320m) {
            i6 = 1237;
        } else {
            i6 = 1231;
        }
        int i15 = (i14 ^ i6) * 1000003;
        if (!this.f144321n) {
            i7 = 1237;
        } else {
            i7 = 1231;
        }
        int doubleToLongBits4 = (((i15 ^ i7) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f144322o) >>> 32) ^ Double.doubleToLongBits(this.f144322o)))) * 1000003;
        if (!this.f144323p) {
            i8 = 1237;
        } else {
            i8 = 1231;
        }
        long j2 = this.f144324q;
        int i16 = (((doubleToLongBits4 ^ i8) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        if (!this.f144325r) {
            i9 = 1237;
        } else {
            i9 = 1231;
        }
        int i17 = (i16 ^ i9) * 1000003;
        if (!this.f144326s) {
            i10 = 1237;
        } else {
            i10 = 1231;
        }
        int i18 = (i17 ^ i10) * 1000003;
        if (this.f144327t) {
            i11 = 1231;
        }
        return this.f144328u.hashCode() ^ ((((i18 ^ i11) * 1000003) ^ this.f144329v.hashCode()) * 1000003);
    }

    /* renamed from: i */
    public final double mo70375i() {
        return this.f144316i;
    }

    /* renamed from: j */
    public final boolean mo70376j() {
        return this.f144317j;
    }

    /* renamed from: k */
    public final boolean mo70377k() {
        return this.f144318k;
    }

    /* renamed from: l */
    public final long mo70378l() {
        return this.f144319l;
    }

    /* renamed from: m */
    public final boolean mo70379m() {
        return this.f144320m;
    }

    /* renamed from: n */
    public final boolean mo70380n() {
        return this.f144321n;
    }

    /* renamed from: o */
    public final double mo70381o() {
        return this.f144322o;
    }

    /* renamed from: p */
    public final boolean mo70382p() {
        return this.f144323p;
    }

    /* renamed from: q */
    public final long mo70383q() {
        return this.f144324q;
    }

    /* renamed from: r */
    public final boolean mo70384r() {
        return this.f144325r;
    }

    /* renamed from: s */
    public final boolean mo70385s() {
        return this.f144326s;
    }

    /* renamed from: t */
    public final boolean mo70386t() {
        return this.f144327t;
    }

    public final String toString() {
        double d = this.f144308a;
        boolean z = this.f144309b;
        double d2 = this.f144310c;
        int i = this.f144311d;
        boolean z2 = this.f144312e;
        boolean z3 = this.f144313f;
        double d3 = this.f144314g;
        double d4 = this.f144315h;
        double d5 = this.f144316i;
        boolean z4 = this.f144317j;
        boolean z5 = this.f144318k;
        long j = this.f144319l;
        boolean z6 = this.f144320m;
        boolean z7 = this.f144321n;
        double d6 = this.f144322o;
        boolean z8 = this.f144323p;
        long j2 = this.f144324q;
        boolean z9 = this.f144325r;
        boolean z10 = this.f144326s;
        boolean z11 = this.f144327t;
        String valueOf = String.valueOf(this.f144329v);
        String valueOf2 = String.valueOf(this.f144328u);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 963 + String.valueOf(valueOf2).length());
        sb.append("ParticleFilterFusionConfiguration{speedUpperThresholdMps=");
        sb.append(d);
        sb.append(", useNStepActivationFilter=");
        sb.append(z);
        sb.append(", stepTimeoutThresholdSeconds=");
        sb.append(d2);
        sb.append(", requiredStepCount=");
        sb.append(i);
        sb.append(", alwaysRunAfterOneStep=");
        sb.append(z2);
        sb.append(", useAltitudeFilter=");
        sb.append(z3);
        sb.append(", altitudeFilterWifiValidTimeSeconds=");
        sb.append(d3);
        sb.append(", altitudeFilterGpsValidTimeSeconds=");
        sb.append(d4);
        sb.append(", altitudeFilterFloorLabelValidTimeSeconds=");
        sb.append(d5);
        sb.append(", altitudeFilterRequestBarometer=");
        sb.append(z4);
        sb.append(", enableBluePixel=");
        sb.append(z5);
        sb.append(", bluePixelOverruleIntervalNanos=");
        sb.append(j);
        sb.append(", enableOutputKalmanFilter=");
        sb.append(z6);
        sb.append(", enableActivityAwareKalmanFilter=");
        sb.append(z7);
        sb.append(", globalAccuracyFactor=");
        sb.append(d6);
        sb.append(", enableAccuracyOutputFilter=");
        sb.append(z8);
        sb.append(", accuracyOutputFilterMaxAgeInWindowNanos=");
        sb.append(j2);
        sb.append(", enableOutputFilterTimestampFix=");
        sb.append(z9);
        sb.append(", enableIncomingPositionAccuracyScaling=");
        sb.append(z10);
        sb.append(", enableArForDriving=");
        sb.append(z11);
        sb.append(", bluemoonLocalizerSensorFusionConfiguration=");
        sb.append(valueOf);
        sb.append(", linearLatLngKalmanFilterConfiguration=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    public final bsen mo70388u() {
        return this.f144329v;
    }

    /* renamed from: v */
    public final bset mo70389v() {
        return this.f144328u;
    }
}

package p000;

/* renamed from: bdmb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdmb extends bdmd {

    /* renamed from: a */
    private final boolean f105937a;

    /* renamed from: b */
    private final int f105938b;

    /* renamed from: c */
    private final boolean f105939c;

    /* renamed from: d */
    private final bmxv f105940d;

    /* renamed from: e */
    private final boolean f105941e;

    /* renamed from: f */
    private final boolean f105942f;

    /* renamed from: g */
    private final boolean f105943g;

    /* renamed from: h */
    private final boolean f105944h;

    /* renamed from: i */
    private final boolean f105945i;

    /* renamed from: j */
    private final boolean f105946j;

    /* renamed from: k */
    private final boolean f105947k;

    /* renamed from: l */
    private final boolean f105948l;

    public bdmb(boolean z, int i, boolean z2, bmxv bmxv, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.f105937a = z;
        this.f105938b = i;
        this.f105939c = z2;
        this.f105940d = bmxv;
        this.f105941e = z3;
        this.f105942f = z4;
        this.f105943g = z5;
        this.f105944h = z6;
        this.f105945i = z7;
        this.f105946j = z8;
        this.f105947k = z9;
        this.f105948l = z10;
    }

    /* renamed from: a */
    public final boolean mo58161a() {
        return this.f105937a;
    }

    /* renamed from: b */
    public final int mo58162b() {
        return this.f105938b;
    }

    /* renamed from: c */
    public final boolean mo58163c() {
        return this.f105939c;
    }

    /* renamed from: d */
    public final bmxv mo58164d() {
        return this.f105940d;
    }

    /* renamed from: e */
    public final boolean mo58165e() {
        return this.f105941e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdmd) {
            bdmd bdmd = (bdmd) obj;
            return this.f105937a == bdmd.mo58161a() && this.f105938b == bdmd.mo58162b() && this.f105939c == bdmd.mo58163c() && this.f105940d.equals(bdmd.mo58164d()) && this.f105941e == bdmd.mo58165e() && this.f105942f == bdmd.mo58167f() && this.f105943g == bdmd.mo58168g() && this.f105944h == bdmd.mo58169h() && this.f105945i == bdmd.mo58171i() && this.f105946j == bdmd.mo58172j() && this.f105947k == bdmd.mo58173k() && this.f105948l == bdmd.mo58174l();
        }
    }

    /* renamed from: f */
    public final boolean mo58167f() {
        return this.f105942f;
    }

    /* renamed from: g */
    public final boolean mo58168g() {
        return this.f105943g;
    }

    /* renamed from: h */
    public final boolean mo58169h() {
        return this.f105944h;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((((((((((((((((((!this.f105937a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f105938b) * 1000003) ^ (!this.f105939c ? 1237 : 1231)) * 1000003) ^ 2040732332) * 1000003) ^ (!this.f105941e ? 1237 : 1231)) * 1000003) ^ (!this.f105942f ? 1237 : 1231)) * 1000003) ^ (!this.f105943g ? 1237 : 1231)) * 1000003) ^ (!this.f105944h ? 1237 : 1231)) * 1000003) ^ (!this.f105945i ? 1237 : 1231)) * 1000003) ^ (!this.f105946j ? 1237 : 1231)) * 1000003) ^ (!this.f105947k ? 1237 : 1231)) * 1000003;
        if (this.f105948l) {
            i = 1231;
        }
        return i2 ^ i;
    }

    /* renamed from: i */
    public final boolean mo58171i() {
        return this.f105945i;
    }

    /* renamed from: j */
    public final boolean mo58172j() {
        return this.f105946j;
    }

    /* renamed from: k */
    public final boolean mo58173k() {
        return this.f105947k;
    }

    /* renamed from: l */
    public final boolean mo58174l() {
        return this.f105948l;
    }

    public final String toString() {
        boolean z = this.f105937a;
        int i = this.f105938b;
        boolean z2 = this.f105939c;
        String valueOf = String.valueOf(this.f105940d);
        boolean z3 = this.f105941e;
        boolean z4 = this.f105942f;
        boolean z5 = this.f105943g;
        boolean z6 = this.f105944h;
        boolean z7 = this.f105945i;
        boolean z8 = this.f105946j;
        boolean z9 = this.f105947k;
        boolean z10 = this.f105948l;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 315);
        sb.append("MemoryConfigurations{enabled=");
        sb.append(z);
        sb.append(", sampleRatePerSecond=");
        sb.append(i);
        sb.append(", recordMetricPerProcess=");
        sb.append(z2);
        sb.append(", metricExtensionProvider=");
        sb.append(valueOf);
        sb.append(", forceGcBeforeRecordMemory=");
        sb.append(z3);
        sb.append(", captureRssHwm=");
        sb.append(z4);
        sb.append(", captureTotalRss=");
        sb.append(z5);
        sb.append(", captureAnonRss=");
        sb.append(z6);
        sb.append(", captureSwap=");
        sb.append(z7);
        sb.append(", captureVmSize=");
        sb.append(z8);
        sb.append(", captureDebugMetrics=");
        sb.append(z9);
        sb.append(", captureMemoryInfo=");
        sb.append(z10);
        sb.append("}");
        return sb.toString();
    }
}

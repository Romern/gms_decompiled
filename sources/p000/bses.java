package p000;

/* renamed from: bses */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bses {

    /* renamed from: a */
    private Double f144386a;

    /* renamed from: b */
    private Double f144387b;

    /* renamed from: c */
    private Double f144388c;

    /* renamed from: d */
    private Double f144389d;

    /* renamed from: e */
    private Double f144390e;

    /* renamed from: f */
    private Double f144391f;

    /* renamed from: g */
    private Boolean f144392g;

    /* renamed from: h */
    private Double f144393h;

    /* renamed from: a */
    public final bset mo70447a() {
        String str = this.f144386a == null ? " processNoiseUnknownPositionM" : "";
        if (this.f144387b == null) {
            str = str.concat(" processNoiseUnknownVelocityMps");
        }
        if (this.f144388c == null) {
            str = String.valueOf(str).concat(" processNoiseFeetPositionM");
        }
        if (this.f144389d == null) {
            str = String.valueOf(str).concat(" processNoiseFeetVelocityMps");
        }
        if (this.f144390e == null) {
            str = String.valueOf(str).concat(" processNoiseWheelsPositionM");
        }
        if (this.f144391f == null) {
            str = String.valueOf(str).concat(" processNoiseWheelsVelocityMps");
        }
        if (this.f144392g == null) {
            str = String.valueOf(str).concat(" enableMeasurementErrorReset");
        }
        if (this.f144393h == null) {
            str = String.valueOf(str).concat(" measurementErrorResetThresholdM");
        }
        if (str.isEmpty()) {
            return new bseg(this.f144386a.doubleValue(), this.f144387b.doubleValue(), this.f144388c.doubleValue(), this.f144389d.doubleValue(), this.f144390e.doubleValue(), this.f144391f.doubleValue(), this.f144392g.booleanValue(), this.f144393h.doubleValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo70450b(double d) {
        this.f144388c = Double.valueOf(d);
    }

    /* renamed from: c */
    public final void mo70451c(double d) {
        this.f144389d = Double.valueOf(d);
    }

    /* renamed from: d */
    public final void mo70452d(double d) {
        this.f144386a = Double.valueOf(d);
    }

    /* renamed from: e */
    public final void mo70453e(double d) {
        this.f144387b = Double.valueOf(d);
    }

    /* renamed from: f */
    public final void mo70454f(double d) {
        this.f144390e = Double.valueOf(d);
    }

    /* renamed from: g */
    public final void mo70455g(double d) {
        this.f144391f = Double.valueOf(d);
    }

    /* renamed from: a */
    public final void mo70448a(double d) {
        this.f144393h = Double.valueOf(d);
    }

    /* renamed from: a */
    public final void mo70449a(boolean z) {
        this.f144392g = Boolean.valueOf(z);
    }
}

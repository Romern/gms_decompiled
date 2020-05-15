package p000;

/* renamed from: bseq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bseq {

    /* renamed from: a */
    private Double f144378a;

    /* renamed from: b */
    private Double f144379b;

    /* renamed from: c */
    private Double f144380c;

    /* renamed from: d */
    private Double f144381d;

    /* renamed from: e */
    private Double f144382e;

    /* renamed from: f */
    private Double f144383f;

    /* renamed from: g */
    private Double f144384g;

    /* renamed from: h */
    private Double f144385h;

    /* renamed from: a */
    public final bser mo70438a() {
        String str = this.f144378a == null ? " reInitAccuracyThresholdMultiplierGnss" : "";
        if (this.f144379b == null) {
            str = str.concat(" reInitAccuracyThresholdMultiplierWifi");
        }
        if (this.f144380c == null) {
            str = String.valueOf(str).concat(" initializationWindowLengthS");
        }
        if (this.f144381d == null) {
            str = String.valueOf(str).concat(" maxGnssEvidenceAgeS");
        }
        if (this.f144382e == null) {
            str = String.valueOf(str).concat(" maxWifiEvidenceAgeS");
        }
        if (this.f144383f == null) {
            str = String.valueOf(str).concat(" maxStepEvidenceAgeS");
        }
        if (this.f144384g == null) {
            str = String.valueOf(str).concat(" maxBearingGapS");
        }
        if (this.f144385h == null) {
            str = String.valueOf(str).concat(" maxGnssWifiDistanceForGnssOnlyM");
        }
        if (str.isEmpty()) {
            return new bsef(this.f144378a.doubleValue(), this.f144379b.doubleValue(), this.f144380c.doubleValue(), this.f144381d.doubleValue(), this.f144382e.doubleValue(), this.f144383f.doubleValue(), this.f144384g.doubleValue(), this.f144385h.doubleValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo70440b(double d) {
        this.f144384g = Double.valueOf(d);
    }

    /* renamed from: c */
    public final void mo70441c(double d) {
        this.f144381d = Double.valueOf(d);
    }

    /* renamed from: d */
    public final void mo70442d(double d) {
        this.f144385h = Double.valueOf(d);
    }

    /* renamed from: e */
    public final void mo70443e(double d) {
        this.f144383f = Double.valueOf(d);
    }

    /* renamed from: f */
    public final void mo70444f(double d) {
        this.f144382e = Double.valueOf(d);
    }

    /* renamed from: g */
    public final void mo70445g(double d) {
        this.f144378a = Double.valueOf(d);
    }

    /* renamed from: h */
    public final void mo70446h(double d) {
        this.f144379b = Double.valueOf(d);
    }

    /* renamed from: a */
    public final void mo70439a(double d) {
        this.f144380c = Double.valueOf(d);
    }
}

package p000;

/* renamed from: bsem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsem {

    /* renamed from: a */
    public bsel f144371a;

    /* renamed from: b */
    private Boolean f144372b;

    /* renamed from: c */
    private Double f144373c;

    /* renamed from: d */
    private Boolean f144374d;

    /* renamed from: e */
    private Boolean f144375e;

    /* renamed from: a */
    public final bsen mo70430a() {
        String str = this.f144372b == null ? " notRequestWifiScansWhenProposingFromGnss" : "";
        if (this.f144373c == null) {
            str = str.concat(" maxGnssAgeForNotRequestingWifiScansS");
        }
        if (this.f144374d == null) {
            str = String.valueOf(str).concat(" enableBluePixel");
        }
        if (this.f144375e == null) {
            str = String.valueOf(str).concat(" enableBearingRangeFix143083454");
        }
        if (this.f144371a == null) {
            str = String.valueOf(str).concat(" bluemoonLocalizerConfiguration");
        }
        if (str.isEmpty()) {
            return new bsed(this.f144372b.booleanValue(), this.f144373c.doubleValue(), this.f144374d.booleanValue(), this.f144375e.booleanValue(), this.f144371a);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo70433b(boolean z) {
        this.f144374d = Boolean.valueOf(z);
    }

    /* renamed from: c */
    public final void mo70434c(boolean z) {
        this.f144372b = Boolean.valueOf(z);
    }

    /* renamed from: a */
    public final void mo70431a(double d) {
        this.f144373c = Double.valueOf(d);
    }

    /* renamed from: a */
    public final void mo70432a(boolean z) {
        this.f144375e = Boolean.valueOf(z);
    }
}

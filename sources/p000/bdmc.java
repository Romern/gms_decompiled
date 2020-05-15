package p000;

/* renamed from: bdmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdmc {

    /* renamed from: a */
    public Boolean f105949a;

    /* renamed from: b */
    public bmxv f105950b;

    /* renamed from: c */
    public Boolean f105951c;

    /* renamed from: d */
    public Boolean f105952d;

    /* renamed from: e */
    public Boolean f105953e;

    /* renamed from: f */
    public Boolean f105954f;

    /* renamed from: g */
    public Boolean f105955g;

    /* renamed from: h */
    public Boolean f105956h;

    /* renamed from: i */
    public Boolean f105957i;

    /* renamed from: j */
    public Boolean f105958j;

    /* renamed from: k */
    private Boolean f105959k;

    /* renamed from: l */
    private Integer f105960l;

    public bdmc() {
    }

    /* renamed from: a */
    public final bdmd mo58176a() {
        String str = this.f105959k == null ? " enabled" : "";
        if (this.f105960l == null) {
            str = str.concat(" sampleRatePerSecond");
        }
        if (this.f105949a == null) {
            str = String.valueOf(str).concat(" recordMetricPerProcess");
        }
        if (this.f105951c == null) {
            str = String.valueOf(str).concat(" forceGcBeforeRecordMemory");
        }
        if (this.f105952d == null) {
            str = String.valueOf(str).concat(" captureRssHwm");
        }
        if (this.f105953e == null) {
            str = String.valueOf(str).concat(" captureTotalRss");
        }
        if (this.f105954f == null) {
            str = String.valueOf(str).concat(" captureAnonRss");
        }
        if (this.f105955g == null) {
            str = String.valueOf(str).concat(" captureSwap");
        }
        if (this.f105956h == null) {
            str = String.valueOf(str).concat(" captureVmSize");
        }
        if (this.f105957i == null) {
            str = String.valueOf(str).concat(" captureDebugMetrics");
        }
        if (this.f105958j == null) {
            str = String.valueOf(str).concat(" captureMemoryInfo");
        }
        if (str.isEmpty()) {
            return new bdmb(this.f105959k.booleanValue(), this.f105960l.intValue(), this.f105949a.booleanValue(), this.f105950b, this.f105951c.booleanValue(), this.f105952d.booleanValue(), this.f105953e.booleanValue(), this.f105954f.booleanValue(), this.f105955g.booleanValue(), this.f105956h.booleanValue(), this.f105957i.booleanValue(), this.f105958j.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public bdmc(byte[] bArr) {
        this.f105950b = bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo58177a(int i) {
        this.f105960l = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo58178a(boolean z) {
        this.f105959k = Boolean.valueOf(z);
    }
}

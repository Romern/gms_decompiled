package p000;

/* renamed from: bcem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcem {

    /* renamed from: a */
    private Integer f104038a;

    /* renamed from: b */
    private Long f104039b;

    /* renamed from: c */
    private Long f104040c;

    /* renamed from: d */
    private Double f104041d;

    /* renamed from: e */
    private Integer f104042e;

    /* renamed from: a */
    public final bcen mo56736a() {
        String str = this.f104038a == null ? " maxRetries" : "";
        if (this.f104039b == null) {
            str = str.concat(" maxDelayMs");
        }
        if (this.f104040c == null) {
            str = String.valueOf(str).concat(" initialDelayMs");
        }
        if (this.f104041d == null) {
            str = String.valueOf(str).concat(" backoff");
        }
        if (this.f104042e == null) {
            str = String.valueOf(str).concat(" jitterMs");
        }
        if (str.isEmpty()) {
            return new bceg(this.f104038a.intValue(), this.f104039b.longValue(), this.f104040c.longValue(), this.f104041d.doubleValue(), this.f104042e.intValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo56740b(int i) {
        this.f104038a = Integer.valueOf(i);
    }

    /* renamed from: b */
    public final void mo56741b(long j) {
        this.f104039b = Long.valueOf(j);
    }

    /* renamed from: a */
    public final void mo56737a(double d) {
        this.f104041d = Double.valueOf(d);
    }

    /* renamed from: a */
    public final void mo56738a(int i) {
        this.f104042e = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo56739a(long j) {
        this.f104040c = Long.valueOf(j);
    }
}

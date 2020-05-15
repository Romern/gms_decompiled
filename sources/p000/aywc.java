package p000;

/* renamed from: aywc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aywc {

    /* renamed from: a */
    public boki f98604a;

    /* renamed from: b */
    public Integer f98605b;

    /* renamed from: c */
    public Long f98606c;

    /* renamed from: d */
    public Long f98607d;

    /* renamed from: e */
    public int[] f98608e;

    /* renamed from: f */
    private String f98609f;

    /* renamed from: g */
    private bxxc f98610g;

    /* renamed from: h */
    private cagz f98611h;

    /* renamed from: a */
    public final aywd mo54472a() {
        String str = this.f98609f == null ? " logSource" : "";
        if (this.f98610g == null) {
            str = str.concat(" message");
        }
        if (this.f98611h == null) {
            str = String.valueOf(str).concat(" qosTier");
        }
        if (str.isEmpty()) {
            return new aywb(this.f98609f, this.f98610g, this.f98604a, this.f98605b, this.f98606c, this.f98607d, this.f98611h, this.f98608e);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo54473a(bxxc bxxc) {
        if (bxxc != null) {
            this.f98610g = bxxc;
            return;
        }
        throw new NullPointerException("Null message");
    }

    /* renamed from: a */
    public final void mo54474a(cagz cagz) {
        if (cagz != null) {
            this.f98611h = cagz;
            return;
        }
        throw new NullPointerException("Null qosTier");
    }

    /* renamed from: a */
    public final void mo54475a(String str) {
        if (str != null) {
            this.f98609f = str;
            return;
        }
        throw new NullPointerException("Null logSource");
    }
}

package p000;

/* renamed from: amvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amvq {

    /* renamed from: a */
    public Long f76118a;

    /* renamed from: b */
    public Long f76119b;

    /* renamed from: c */
    public Long f76120c;

    /* renamed from: d */
    public String f76121d;

    /* renamed from: e */
    public String f76122e;

    /* renamed from: f */
    public String f76123f;

    /* renamed from: g */
    public String f76124g;

    /* renamed from: h */
    public String f76125h;

    /* renamed from: i */
    public String f76126i;

    /* renamed from: j */
    public String f76127j;

    /* renamed from: k */
    public alvh f76128k;

    /* renamed from: l */
    private Boolean f76129l;

    /* renamed from: m */
    private Boolean f76130m;

    /* renamed from: n */
    private Boolean f76131n;

    /* renamed from: o */
    private Boolean f76132o;

    /* renamed from: p */
    private Boolean f76133p;

    /* renamed from: q */
    private Boolean f76134q;

    /* renamed from: a */
    public final amvr mo41441a() {
        String str = this.f76129l == null ? " isMarkedAsFavorite" : "";
        if (this.f76130m == null) {
            str = str.concat(" isVisible");
        }
        if (this.f76131n == null) {
            str = String.valueOf(str).concat(" isReadOnly");
        }
        if (this.f76132o == null) {
            str = String.valueOf(str).concat(" isAutoAdd");
        }
        if (this.f76133p == null) {
            str = String.valueOf(str).concat(" isDirty");
        }
        if (this.f76134q == null) {
            str = String.valueOf(str).concat(" isDeleted");
        }
        if (str.isEmpty()) {
            return new amvn(this.f76129l.booleanValue(), this.f76130m.booleanValue(), this.f76131n.booleanValue(), this.f76132o.booleanValue(), this.f76133p.booleanValue(), this.f76134q.booleanValue(), this.f76118a, this.f76119b, this.f76120c, this.f76121d, this.f76122e, this.f76123f, this.f76124g, this.f76125h, this.f76126i, this.f76127j, this.f76128k);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo41443b(boolean z) {
        this.f76134q = Boolean.valueOf(z);
    }

    /* renamed from: c */
    public final void mo41444c(boolean z) {
        this.f76133p = Boolean.valueOf(z);
    }

    /* renamed from: d */
    public final void mo41445d(boolean z) {
        this.f76129l = Boolean.valueOf(z);
    }

    /* renamed from: e */
    public final void mo41446e(boolean z) {
        this.f76131n = Boolean.valueOf(z);
    }

    /* renamed from: f */
    public final void mo41447f(boolean z) {
        this.f76130m = Boolean.valueOf(z);
    }

    /* renamed from: a */
    public final void mo41442a(boolean z) {
        this.f76132o = Boolean.valueOf(z);
    }
}

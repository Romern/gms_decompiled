package p000;

/* renamed from: acnw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acnw {

    /* renamed from: a */
    public String f60292a;

    /* renamed from: b */
    public Integer f60293b;

    /* renamed from: c */
    public Integer f60294c;

    /* renamed from: d */
    public String f60295d;

    /* renamed from: e */
    public String f60296e;

    /* renamed from: f */
    public String f60297f;

    /* renamed from: g */
    public String f60298g;

    /* renamed from: h */
    private Integer f60299h;

    /* renamed from: i */
    private String f60300i;

    /* renamed from: j */
    private Long f60301j;

    /* renamed from: k */
    private Integer f60302k;

    /* renamed from: l */
    private String f60303l;

    /* renamed from: m */
    private Boolean f60304m;

    /* renamed from: a */
    public final acnx mo32932a() {
        String str = this.f60299h == null ? " id" : "";
        if (this.f60292a == null) {
            str = str.concat(" messageType");
        }
        if (this.f60300i == null) {
            str = String.valueOf(str).concat(" uri");
        }
        if (this.f60301j == null) {
            str = String.valueOf(str).concat(" dateMillis");
        }
        if (this.f60302k == null) {
            str = String.valueOf(str).concat(" score");
        }
        if (this.f60303l == null) {
            str = String.valueOf(str).concat(" contentType");
        }
        if (this.f60304m == null) {
            str = String.valueOf(str).concat(" read");
        }
        if (str.isEmpty()) {
            return new aclt(this.f60299h.intValue(), this.f60292a, this.f60300i, this.f60293b, this.f60294c, this.f60301j.longValue(), this.f60295d, this.f60296e, this.f60297f, this.f60302k.intValue(), this.f60303l, this.f60298g, this.f60304m.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo32937b(int i) {
        this.f60302k = Integer.valueOf(i);
    }

    /* renamed from: b */
    public final void mo32938b(String str) {
        if (str != null) {
            this.f60300i = str;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    /* renamed from: a */
    public final void mo32933a(int i) {
        this.f60299h = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo32934a(long j) {
        this.f60301j = Long.valueOf(j);
    }

    /* renamed from: a */
    public final void mo32935a(String str) {
        if (str != null) {
            this.f60303l = str;
            return;
        }
        throw new NullPointerException("Null contentType");
    }

    /* renamed from: a */
    public final void mo32936a(boolean z) {
        this.f60304m = Boolean.valueOf(z);
    }
}

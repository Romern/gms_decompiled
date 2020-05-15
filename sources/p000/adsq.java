package p000;

/* renamed from: adsq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adsq {

    /* renamed from: a */
    public Integer f62646a;

    /* renamed from: b */
    public Integer f62647b;

    /* renamed from: c */
    public String f62648c;

    /* renamed from: d */
    public String f62649d;

    /* renamed from: e */
    public String f62650e;

    /* renamed from: f */
    public String f62651f;

    /* renamed from: g */
    private Integer f62652g;

    /* renamed from: h */
    private String f62653h;

    /* renamed from: i */
    private String f62654i;

    /* renamed from: j */
    private Long f62655j;

    /* renamed from: k */
    private Integer f62656k;

    /* renamed from: l */
    private String f62657l;

    /* renamed from: m */
    private Boolean f62658m;

    /* renamed from: a */
    public final adsr mo33776a() {
        String str = this.f62652g == null ? " id" : "";
        if (this.f62653h == null) {
            str = str.concat(" messageType");
        }
        if (this.f62654i == null) {
            str = String.valueOf(str).concat(" uri");
        }
        if (this.f62655j == null) {
            str = String.valueOf(str).concat(" dateMillis");
        }
        if (this.f62656k == null) {
            str = String.valueOf(str).concat(" score");
        }
        if (this.f62657l == null) {
            str = String.valueOf(str).concat(" contentType");
        }
        if (this.f62658m == null) {
            str = String.valueOf(str).concat(" read");
        }
        if (str.isEmpty()) {
            return new adsk(this.f62652g.intValue(), this.f62653h, this.f62654i, this.f62646a, this.f62647b, this.f62655j.longValue(), this.f62648c, this.f62649d, this.f62650e, this.f62656k.intValue(), this.f62657l, this.f62651f, this.f62658m.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo33781b(int i) {
        this.f62656k = Integer.valueOf(i);
    }

    /* renamed from: c */
    public final void mo33783c(String str) {
        if (str != null) {
            this.f62654i = str;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    /* renamed from: b */
    public final void mo33782b(String str) {
        if (str != null) {
            this.f62653h = str;
            return;
        }
        throw new NullPointerException("Null messageType");
    }

    /* renamed from: a */
    public final void mo33777a(int i) {
        this.f62652g = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo33778a(long j) {
        this.f62655j = Long.valueOf(j);
    }

    /* renamed from: a */
    public final void mo33779a(String str) {
        if (str != null) {
            this.f62657l = str;
            return;
        }
        throw new NullPointerException("Null contentType");
    }

    /* renamed from: a */
    public final void mo33780a(boolean z) {
        this.f62658m = Boolean.valueOf(z);
    }
}

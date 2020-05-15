package p000;

/* renamed from: adks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adks {

    /* renamed from: a */
    public adkz f62074a;

    /* renamed from: b */
    public String f62075b;

    /* renamed from: c */
    public String f62076c;

    /* renamed from: d */
    private String f62077d;

    /* renamed from: e */
    private Integer f62078e;

    /* renamed from: f */
    private Integer f62079f;

    /* renamed from: g */
    private Boolean f62080g;

    /* renamed from: h */
    private Boolean f62081h;

    /* renamed from: a */
    public final adkt mo33610a() {
        String str = this.f62077d == null ? " packageName" : "";
        if (this.f62078e == null) {
            str = str.concat(" versionCode");
        }
        if (this.f62079f == null) {
            str = String.valueOf(str).concat(" derivedId");
        }
        if (this.f62074a == null) {
            str = String.valueOf(str).concat(" eventLog");
        }
        if (this.f62080g == null) {
            str = String.valueOf(str).concat(" populateRoutes");
        }
        if (this.f62081h == null) {
            str = String.valueOf(str).concat(" addSyntheticRoutes");
        }
        if (str.isEmpty()) {
            return new adkw(this.f62077d, this.f62078e.intValue(), this.f62079f.intValue(), this.f62074a, this.f62080g.booleanValue(), this.f62075b, this.f62076c, this.f62081h.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo33614b(int i) {
        this.f62078e = Integer.valueOf(i);
    }

    /* renamed from: b */
    public final void mo33615b(boolean z) {
        this.f62080g = Boolean.valueOf(z);
    }

    /* renamed from: a */
    public final void mo33611a(int i) {
        this.f62079f = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo33612a(String str) {
        if (str != null) {
            this.f62077d = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: a */
    public final void mo33613a(boolean z) {
        this.f62081h = Boolean.valueOf(z);
    }
}

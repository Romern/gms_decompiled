package p000;

/* renamed from: acnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class acnm {

    /* renamed from: a */
    public static final acnm f60246a = new acnd();

    /* renamed from: b */
    public static final acnm f60247b = new acnf("emails", "email");

    /* renamed from: c */
    public static final acnm f60248c = new acnf("phones", "phone");

    /* renamed from: d */
    public static final acnm f60249d;

    /* renamed from: e */
    public static final acnm[] f60250e;

    /* renamed from: f */
    private final String f60251f;

    /* renamed from: g */
    private final String f60252g;

    /* renamed from: h */
    private ftz f60253h;

    static {
        acnf acnf = new acnf("postals", "postal");
        f60249d = acnf;
        f60250e = new acnm[]{f60246a, f60247b, f60248c, acnf};
    }

    public acnm(String str, String str2) {
        this.f60251f = str;
        this.f60252g = str2;
    }

    /* renamed from: a */
    public static ftz[] m49518a() {
        ftz[] ftzArr = new ftz[4];
        for (int i = 0; i < 4; i++) {
            ftzArr[i] = f60250e[i].mo32919c();
        }
        return ftzArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract ftz mo32905a(fty fty);

    /* renamed from: b */
    public final String mo32918b() {
        String str = this.f60251f;
        String str2 = this.f60252g;
        StringBuilder sb = new StringBuilder(str.length() + 1 + str2.length());
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        return sb.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: fty.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      fty.a(java.lang.String, java.lang.String):void
      fty.a(java.lang.String, boolean):void */
    /* renamed from: c */
    public final ftz mo32919c() {
        if (this.f60253h == null) {
            fty a = ftz.m12397a();
            a.mo11328a(mo32918b());
            a.mo11331b(this.f60251f);
            a.mo11330a(this.f60252g, true);
            this.f60253h = mo32905a(a);
        }
        return this.f60253h;
    }
}

package p000;

/* renamed from: yxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yxz extends yyf {

    /* renamed from: a */
    private final caad f54802a;

    /* renamed from: b */
    private final caah f54803b;

    /* renamed from: c */
    private final String f54804c;

    /* renamed from: d */
    private final String f54805d;

    /* renamed from: e */
    private final String f54806e;

    /* renamed from: f */
    private final String f54807f;

    /* renamed from: g */
    private final String f54808g;

    public yxz(caad caad, caah caah, String str, String str2, String str3, String str4, String str5) {
        this.f54802a = caad;
        this.f54803b = caah;
        this.f54804c = str;
        this.f54805d = str2;
        this.f54806e = str3;
        this.f54807f = str4;
        this.f54808g = str5;
    }

    /* renamed from: a */
    public final caad mo30845a() {
        return this.f54802a;
    }

    /* renamed from: b */
    public final caah mo30846b() {
        return this.f54803b;
    }

    /* renamed from: c */
    public final String mo30847c() {
        return this.f54804c;
    }

    /* renamed from: d */
    public final String mo30848d() {
        return this.f54805d;
    }

    /* renamed from: e */
    public final String mo30849e() {
        return this.f54806e;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yyf)) {
            return false;
        }
        yyf yyf = (yyf) obj;
        return this.f54802a.equals(yyf.mo30845a()) && this.f54803b.equals(yyf.mo30846b()) && ((str = this.f54804c) == null ? yyf.mo30847c() == null : str.equals(yyf.mo30847c())) && ((str2 = this.f54805d) == null ? yyf.mo30848d() == null : str2.equals(yyf.mo30848d())) && ((str3 = this.f54806e) == null ? yyf.mo30849e() == null : str3.equals(yyf.mo30849e())) && ((str4 = this.f54807f) == null ? yyf.mo30851f() == null : str4.equals(yyf.mo30851f())) && ((str5 = this.f54808g) == null ? yyf.mo30852g() == null : str5.equals(yyf.mo30852g()));
    }

    /* renamed from: f */
    public final String mo30851f() {
        return this.f54807f;
    }

    /* renamed from: g */
    public final String mo30852g() {
        return this.f54808g;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = (this.f54802a.hashCode() ^ 1000003) * 1000003;
        caah caah = this.f54803b;
        int i5 = caah.f164758ag;
        if (i5 == 0) {
            i5 = bxxm.f165037a.mo74228a(caah).mo74216a(caah);
            caah.f164758ag = i5;
        }
        int i6 = (hashCode ^ i5) * 1000003;
        String str = this.f54804c;
        int i7 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i8 = (i6 ^ i) * 1000003;
        String str2 = this.f54805d;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 ^ i2) * 1000003;
        String str3 = this.f54806e;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 ^ i3) * 1000003;
        String str4 = this.f54807f;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 ^ i4) * 1000003;
        String str5 = this.f54808g;
        if (str5 != null) {
            i7 = str5.hashCode();
        }
        return i11 ^ i7;
    }
}

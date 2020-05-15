package p000;

/* renamed from: amvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amvn extends amvr {

    /* renamed from: a */
    private final boolean f76028a;

    /* renamed from: b */
    private final boolean f76029b;

    /* renamed from: c */
    private final boolean f76030c;

    /* renamed from: d */
    private final boolean f76031d;

    /* renamed from: e */
    private final boolean f76032e;

    /* renamed from: f */
    private final boolean f76033f;

    /* renamed from: g */
    private final Long f76034g;

    /* renamed from: h */
    private final Long f76035h;

    /* renamed from: i */
    private final Long f76036i;

    /* renamed from: j */
    private final String f76037j;

    /* renamed from: k */
    private final String f76038k;

    /* renamed from: l */
    private final String f76039l;

    /* renamed from: m */
    private final String f76040m;

    /* renamed from: n */
    private final String f76041n;

    /* renamed from: o */
    private final String f76042o;

    /* renamed from: p */
    private final String f76043p;

    /* renamed from: q */
    private final alvh f76044q;

    public amvn(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, String str7, alvh alvh) {
        this.f76028a = z;
        this.f76029b = z2;
        this.f76030c = z3;
        this.f76031d = z4;
        this.f76032e = z5;
        this.f76033f = z6;
        this.f76034g = l;
        this.f76035h = l2;
        this.f76036i = l3;
        this.f76037j = str;
        this.f76038k = str2;
        this.f76039l = str3;
        this.f76040m = str4;
        this.f76041n = str5;
        this.f76042o = str6;
        this.f76043p = str7;
        this.f76044q = alvh;
    }

    /* renamed from: a */
    public final boolean mo41393a() {
        return this.f76028a;
    }

    /* renamed from: b */
    public final boolean mo41394b() {
        return this.f76029b;
    }

    /* renamed from: c */
    public final boolean mo41395c() {
        return this.f76030c;
    }

    /* renamed from: d */
    public final boolean mo41396d() {
        return this.f76031d;
    }

    /* renamed from: e */
    public final boolean mo41397e() {
        return this.f76032e;
    }

    public final boolean equals(Object obj) {
        Long l;
        Long l2;
        Long l3;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        alvh alvh;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof amvr)) {
            return false;
        }
        amvr amvr = (amvr) obj;
        return this.f76028a == amvr.mo41393a() && this.f76029b == amvr.mo41394b() && this.f76030c == amvr.mo41395c() && this.f76031d == amvr.mo41396d() && this.f76032e == amvr.mo41397e() && this.f76033f == amvr.mo41399f() && ((l = this.f76034g) == null ? amvr.mo41400g() == null : l.equals(amvr.mo41400g())) && ((l2 = this.f76035h) == null ? amvr.mo41401h() == null : l2.equals(amvr.mo41401h())) && ((l3 = this.f76036i) == null ? amvr.mo41403i() == null : l3.equals(amvr.mo41403i())) && ((str = this.f76037j) == null ? amvr.mo41404j() == null : str.equals(amvr.mo41404j())) && ((str2 = this.f76038k) == null ? amvr.mo41405k() == null : str2.equals(amvr.mo41405k())) && ((str3 = this.f76039l) == null ? amvr.mo41406l() == null : str3.equals(amvr.mo41406l())) && ((str4 = this.f76040m) == null ? amvr.mo41407m() == null : str4.equals(amvr.mo41407m())) && ((str5 = this.f76041n) == null ? amvr.mo41408n() == null : str5.equals(amvr.mo41408n())) && ((str6 = this.f76042o) == null ? amvr.mo41409o() == null : str6.equals(amvr.mo41409o())) && ((str7 = this.f76043p) == null ? amvr.mo41410p() == null : str7.equals(amvr.mo41410p())) && ((alvh = this.f76044q) == null ? amvr.mo41411q() == null : alvh.equals(amvr.mo41411q()));
    }

    /* renamed from: f */
    public final boolean mo41399f() {
        return this.f76033f;
    }

    /* renamed from: g */
    public final Long mo41400g() {
        return this.f76034g;
    }

    /* renamed from: h */
    public final Long mo41401h() {
        return this.f76035h;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 1237;
        if (!this.f76028a) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i17 = (i ^ 1000003) * 1000003;
        if (!this.f76029b) {
            i2 = 1237;
        } else {
            i2 = 1231;
        }
        int i18 = (i17 ^ i2) * 1000003;
        if (!this.f76030c) {
            i3 = 1237;
        } else {
            i3 = 1231;
        }
        int i19 = (i18 ^ i3) * 1000003;
        if (!this.f76031d) {
            i4 = 1237;
        } else {
            i4 = 1231;
        }
        int i20 = (i19 ^ i4) * 1000003;
        if (!this.f76032e) {
            i5 = 1237;
        } else {
            i5 = 1231;
        }
        int i21 = (i20 ^ i5) * 1000003;
        if (this.f76033f) {
            i16 = 1231;
        }
        int i22 = (i21 ^ i16) * 1000003;
        Long l = this.f76034g;
        int i23 = 0;
        if (l != null) {
            i6 = l.hashCode();
        } else {
            i6 = 0;
        }
        int i24 = (i22 ^ i6) * 1000003;
        Long l2 = this.f76035h;
        if (l2 != null) {
            i7 = l2.hashCode();
        } else {
            i7 = 0;
        }
        int i25 = (i24 ^ i7) * 1000003;
        Long l3 = this.f76036i;
        if (l3 != null) {
            i8 = l3.hashCode();
        } else {
            i8 = 0;
        }
        int i26 = (i25 ^ i8) * 1000003;
        String str = this.f76037j;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i27 = (i26 ^ i9) * 1000003;
        String str2 = this.f76038k;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i28 = (i27 ^ i10) * 1000003;
        String str3 = this.f76039l;
        if (str3 != null) {
            i11 = str3.hashCode();
        } else {
            i11 = 0;
        }
        int i29 = (i28 ^ i11) * 1000003;
        String str4 = this.f76040m;
        if (str4 != null) {
            i12 = str4.hashCode();
        } else {
            i12 = 0;
        }
        int i30 = (i29 ^ i12) * 1000003;
        String str5 = this.f76041n;
        if (str5 != null) {
            i13 = str5.hashCode();
        } else {
            i13 = 0;
        }
        int i31 = (i30 ^ i13) * 1000003;
        String str6 = this.f76042o;
        if (str6 != null) {
            i14 = str6.hashCode();
        } else {
            i14 = 0;
        }
        int i32 = (i31 ^ i14) * 1000003;
        String str7 = this.f76043p;
        if (str7 != null) {
            i15 = str7.hashCode();
        } else {
            i15 = 0;
        }
        int i33 = (i32 ^ i15) * 1000003;
        alvh alvh = this.f76044q;
        if (alvh != null && (i23 = alvh.f164758ag) == 0) {
            i23 = bxxm.f165037a.mo74228a(alvh).mo74216a(alvh);
            alvh.f164758ag = i23;
        }
        return i33 ^ i23;
    }

    /* renamed from: i */
    public final Long mo41403i() {
        return this.f76036i;
    }

    /* renamed from: j */
    public final String mo41404j() {
        return this.f76037j;
    }

    /* renamed from: k */
    public final String mo41405k() {
        return this.f76038k;
    }

    /* renamed from: l */
    public final String mo41406l() {
        return this.f76039l;
    }

    /* renamed from: m */
    public final String mo41407m() {
        return this.f76040m;
    }

    /* renamed from: n */
    public final String mo41408n() {
        return this.f76041n;
    }

    /* renamed from: o */
    public final String mo41409o() {
        return this.f76042o;
    }

    /* renamed from: p */
    public final String mo41410p() {
        return this.f76043p;
    }

    /* renamed from: q */
    public final alvh mo41411q() {
        return this.f76044q;
    }

    public final String toString() {
        boolean z = this.f76028a;
        boolean z2 = this.f76029b;
        boolean z3 = this.f76030c;
        boolean z4 = this.f76031d;
        boolean z5 = this.f76032e;
        boolean z6 = this.f76033f;
        String valueOf = String.valueOf(this.f76034g);
        String valueOf2 = String.valueOf(this.f76035h);
        String valueOf3 = String.valueOf(this.f76036i);
        String str = this.f76037j;
        String str2 = this.f76038k;
        String str3 = this.f76039l;
        String str4 = this.f76040m;
        String str5 = this.f76041n;
        String str6 = this.f76042o;
        String str7 = this.f76043p;
        String valueOf4 = String.valueOf(this.f76044q);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(str).length();
        int length5 = String.valueOf(str2).length();
        int length6 = String.valueOf(str3).length();
        int length7 = String.valueOf(str4).length();
        int length8 = String.valueOf(str5).length();
        int length9 = String.valueOf(str6).length();
        StringBuilder sb = new StringBuilder(length + 239 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + String.valueOf(str7).length() + String.valueOf(valueOf4).length());
        sb.append("Group{isMarkedAsFavorite=");
        sb.append(z);
        sb.append(", isVisible=");
        sb.append(z2);
        sb.append(", isReadOnly=");
        sb.append(z3);
        sb.append(", isAutoAdd=");
        sb.append(z4);
        sb.append(", isDirty=");
        sb.append(z5);
        sb.append(", isDeleted=");
        sb.append(z6);
        sb.append(", rowId=");
        sb.append(valueOf);
        sb.append(", version=");
        sb.append(valueOf2);
        sb.append(", lastUpdateDate=");
        sb.append(valueOf3);
        sb.append(", id=");
        sb.append(str);
        sb.append(", systemId=");
        sb.append(str2);
        sb.append(", title=");
        sb.append(str3);
        sb.append(", etag=");
        sb.append(str4);
        sb.append(", accountName=");
        sb.append(str5);
        sb.append(", accountType=");
        sb.append(str6);
        sb.append(", dataSet=");
        sb.append(str7);
        sb.append(", syncOneColumnData=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}

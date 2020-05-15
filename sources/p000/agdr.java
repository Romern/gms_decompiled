package p000;

/* renamed from: agdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agdr {

    /* renamed from: a */
    final String f65330a;

    /* renamed from: b */
    final String f65331b;

    /* renamed from: c */
    final long f65332c;

    /* renamed from: d */
    final long f65333d;

    /* renamed from: e */
    final long f65334e;

    /* renamed from: f */
    final long f65335f;

    /* renamed from: g */
    final long f65336g;

    /* renamed from: h */
    final Long f65337h;

    /* renamed from: i */
    final Long f65338i;

    /* renamed from: j */
    final Long f65339j;

    /* renamed from: k */
    final Boolean f65340k;

    public agdr(String str, String str2, long j) {
        this(str, str2, 0, 0, 0, j, 0, null, null, null, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final agdr mo35378a(long j) {
        return new agdr(this.f65330a, this.f65331b, this.f65332c, this.f65333d, this.f65334e, j, this.f65336g, this.f65337h, this.f65338i, this.f65339j, this.f65340k);
    }

    public agdr(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        long j6 = j;
        long j7 = j2;
        long j8 = j3;
        long j9 = j5;
        sdo.m34977c(str);
        sdo.m34977c(str2);
        boolean z = true;
        sdo.m34974b(j6 >= 0);
        sdo.m34974b(j7 >= 0);
        sdo.m34974b(j8 >= 0);
        sdo.m34974b(j9 < 0 ? false : z);
        this.f65330a = str;
        this.f65331b = str2;
        this.f65332c = j6;
        this.f65333d = j7;
        this.f65334e = j8;
        this.f65335f = j4;
        this.f65336g = j9;
        this.f65337h = l;
        this.f65338i = l2;
        this.f65339j = l3;
        this.f65340k = bool;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final agdr mo35379a(long j, long j2) {
        return new agdr(this.f65330a, this.f65331b, this.f65332c, this.f65333d, this.f65334e, this.f65335f, j, Long.valueOf(j2), this.f65338i, this.f65339j, this.f65340k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final agdr mo35380a(Long l, Long l2, Boolean bool) {
        return new agdr(this.f65330a, this.f65331b, this.f65332c, this.f65333d, this.f65334e, this.f65335f, this.f65336g, this.f65337h, l, l2, (bool != null && !bool.booleanValue()) ? null : bool);
    }
}

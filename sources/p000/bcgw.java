package p000;

/* renamed from: bcgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcgw extends bchq {

    /* renamed from: a */
    private final String f104131a;

    /* renamed from: b */
    private final bmxv f104132b;

    /* renamed from: c */
    private final bmxv f104133c;

    /* renamed from: d */
    private final bmxv f104134d;

    /* renamed from: e */
    private final String f104135e;

    /* renamed from: f */
    private final bmxv f104136f;

    /* renamed from: g */
    private final bnhe f104137g;

    /* renamed from: h */
    private final bngx f104138h;

    /* renamed from: i */
    private final bngx f104139i;

    /* renamed from: j */
    private final bmxv f104140j;

    /* renamed from: k */
    private final bmxv f104141k;

    public bcgw(String str, bmxv bmxv, bmxv bmxv2, bmxv bmxv3, String str2, bmxv bmxv4, bnhe bnhe, bngx bngx, bngx bngx2, bmxv bmxv5, bmxv bmxv6) {
        this.f104131a = str;
        this.f104132b = bmxv;
        this.f104133c = bmxv2;
        this.f104134d = bmxv3;
        this.f104135e = str2;
        this.f104136f = bmxv4;
        this.f104137g = bnhe;
        this.f104138h = bngx;
        this.f104139i = bngx2;
        this.f104140j = bmxv5;
        this.f104141k = bmxv6;
    }

    /* renamed from: a */
    public final String mo56841a() {
        return this.f104131a;
    }

    /* renamed from: b */
    public final bmxv mo56842b() {
        return this.f104132b;
    }

    /* renamed from: c */
    public final bmxv mo56843c() {
        return this.f104133c;
    }

    /* renamed from: d */
    public final bmxv mo56844d() {
        return this.f104134d;
    }

    /* renamed from: e */
    public final String mo56845e() {
        return this.f104135e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bchq) {
            bchq bchq = (bchq) obj;
            return this.f104131a.equals(bchq.mo56841a()) && this.f104132b.equals(bchq.mo56842b()) && this.f104133c.equals(bchq.mo56843c()) && this.f104134d.equals(bchq.mo56844d()) && this.f104135e.equals(bchq.mo56845e()) && this.f104136f.equals(bchq.mo56847f()) && this.f104137g.equals(bchq.mo56848g()) && bnkn.m109669a(this.f104138h, bchq.mo56849h()) && bnkn.m109669a(this.f104139i, bchq.mo56851i()) && this.f104140j.equals(bchq.mo56852j()) && this.f104141k.equals(bchq.mo56853k());
        }
    }

    /* renamed from: f */
    public final bmxv mo56847f() {
        return this.f104136f;
    }

    /* renamed from: g */
    public final bnhe mo56848g() {
        return this.f104137g;
    }

    /* renamed from: h */
    public final bngx mo56849h() {
        return this.f104138h;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.f104131a.hashCode() ^ 1000003) * 1000003) ^ this.f104132b.hashCode()) * 1000003) ^ this.f104133c.hashCode()) * 1000003) ^ this.f104134d.hashCode()) * 1000003) ^ this.f104135e.hashCode()) * 1000003) ^ this.f104136f.hashCode()) * 1000003) ^ this.f104137g.hashCode()) * 1000003) ^ this.f104138h.hashCode()) * 1000003) ^ this.f104139i.hashCode()) * 1000003) ^ this.f104140j.hashCode()) * 1000003) ^ this.f104141k.hashCode();
    }

    /* renamed from: i */
    public final bngx mo56851i() {
        return this.f104139i;
    }

    /* renamed from: j */
    public final bmxv mo56852j() {
        return this.f104140j;
    }

    /* renamed from: k */
    public final bmxv mo56853k() {
        return this.f104141k;
    }

    public final String toString() {
        String str = this.f104131a;
        String valueOf = String.valueOf(this.f104132b);
        String valueOf2 = String.valueOf(this.f104133c);
        String valueOf3 = String.valueOf(this.f104134d);
        String str2 = this.f104135e;
        String valueOf4 = String.valueOf(this.f104136f);
        String valueOf5 = String.valueOf(this.f104137g);
        String valueOf6 = String.valueOf(this.f104138h);
        String valueOf7 = String.valueOf(this.f104139i);
        String valueOf8 = String.valueOf(this.f104140j);
        String valueOf9 = String.valueOf(this.f104141k);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(str2).length();
        int length6 = String.valueOf(valueOf4).length();
        int length7 = String.valueOf(valueOf5).length();
        int length8 = String.valueOf(valueOf6).length();
        int length9 = String.valueOf(valueOf7).length();
        StringBuilder sb = new StringBuilder(length + 173 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + String.valueOf(valueOf8).length() + String.valueOf(valueOf9).length());
        sb.append("ProfileInfo{name=");
        sb.append(str);
        sb.append(", a11yName=");
        sb.append(valueOf);
        sb.append(", imageUrl=");
        sb.append(valueOf2);
        sb.append(", thumbnailData=");
        sb.append(valueOf3);
        sb.append(", contentType=");
        sb.append(str2);
        sb.append(", groupInfo=");
        sb.append(valueOf4);
        sb.append(", metadata=");
        sb.append(valueOf5);
        sb.append(", menuItems=");
        sb.append(valueOf6);
        sb.append(", toolbarButtons=");
        sb.append(valueOf7);
        sb.append(", lighterUiConfigurations=");
        sb.append(valueOf8);
        sb.append(", customViewContentModel=");
        sb.append(valueOf9);
        sb.append("}");
        return sb.toString();
    }
}

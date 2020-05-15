package p000;

/* renamed from: eou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class eou extends eox {

    /* renamed from: a */
    private final String f15437a;

    /* renamed from: b */
    private final bngx f15438b;

    /* renamed from: c */
    private final String f15439c;

    /* renamed from: d */
    private final String f15440d;

    /* renamed from: e */
    private final String f15441e;

    /* renamed from: f */
    private final String f15442f;

    /* renamed from: g */
    private final String f15443g;

    public eou(String str, bngx bngx, String str2, String str3, String str4, String str5, String str6) {
        this.f15437a = str;
        this.f15438b = bngx;
        this.f15439c = str2;
        this.f15440d = str3;
        this.f15441e = str4;
        this.f15442f = str5;
        this.f15443g = str6;
    }

    /* renamed from: a */
    public final String mo10366a() {
        return this.f15437a;
    }

    /* renamed from: b */
    public final String mo10367b() {
        return null;
    }

    /* renamed from: c */
    public final bngx mo10368c() {
        return this.f15438b;
    }

    /* renamed from: d */
    public final String mo10369d() {
        return this.f15439c;
    }

    /* renamed from: e */
    public final String mo10370e() {
        return this.f15440d;
    }

    public final boolean equals(Object obj) {
        bngx bngx;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eox)) {
            return false;
        }
        eox eox = (eox) obj;
        return this.f15437a.equals(eox.mo10366a()) && eox.mo10367b() == null && ((bngx = this.f15438b) == null ? eox.mo10368c() == null : bnkn.m109669a(bngx, eox.mo10368c())) && ((str = this.f15439c) == null ? eox.mo10369d() == null : str.equals(eox.mo10369d())) && this.f15440d.equals(eox.mo10370e()) && this.f15441e.equals(eox.mo10372f()) && this.f15442f.equals(eox.mo10373g()) && this.f15443g.equals(eox.mo10374h()) && eox.mo10376i() == null;
    }

    /* renamed from: f */
    public final String mo10372f() {
        return this.f15441e;
    }

    /* renamed from: g */
    public final String mo10373g() {
        return this.f15442f;
    }

    /* renamed from: h */
    public final String mo10374h() {
        return this.f15443g;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f15437a.hashCode() ^ 1000003) * -721379959;
        bngx bngx = this.f15438b;
        int i2 = 0;
        if (bngx != null) {
            i = bngx.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode ^ i) * 1000003;
        String str = this.f15439c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return (((((((((i3 ^ i2) * 1000003) ^ this.f15440d.hashCode()) * 1000003) ^ this.f15441e.hashCode()) * 1000003) ^ this.f15442f.hashCode()) * 1000003) ^ this.f15443g.hashCode()) * 1000003;
    }

    /* renamed from: i */
    public final Integer mo10376i() {
        return null;
    }

    public final String toString() {
        String str = this.f15437a;
        String valueOf = String.valueOf(this.f15438b);
        String str2 = this.f15439c;
        String str3 = this.f15440d;
        String str4 = this.f15441e;
        String str5 = this.f15442f;
        String str6 = this.f15443g;
        String valueOf2 = String.valueOf((Object) null);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf((Object) null).length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(str2).length();
        int length5 = String.valueOf(str3).length();
        int length6 = String.valueOf(str4).length();
        int length7 = String.valueOf(str5).length();
        StringBuilder sb = new StringBuilder(length + 130 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(str6).length() + String.valueOf(valueOf2).length());
        sb.append("IndexableItem{title=");
        sb.append(str);
        sb.append(", summary=null, keywords=");
        sb.append(valueOf);
        sb.append(", screenTitle=");
        sb.append(str2);
        sb.append(", key=");
        sb.append(str3);
        sb.append(", intentAction=");
        sb.append(str4);
        sb.append(", intentTargetPackageName=");
        sb.append(str5);
        sb.append(", intentTargetClass=");
        sb.append(str6);
        sb.append(", icon=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

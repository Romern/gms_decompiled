package p000;

/* renamed from: bcrw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcrw extends bctn {

    /* renamed from: a */
    private final bmxv f104759a;

    /* renamed from: b */
    private final bmxv f104760b;

    /* renamed from: c */
    private final bmxv f104761c;

    /* renamed from: d */
    private final bmxv f104762d;

    /* renamed from: e */
    private final int f104763e;

    /* renamed from: f */
    private final bmxv f104764f;

    /* renamed from: g */
    private final int f104765g;

    public bcrw(bmxv bmxv, bmxv bmxv2, bmxv bmxv3, bmxv bmxv4, int i, bmxv bmxv5, int i2) {
        this.f104759a = bmxv;
        this.f104760b = bmxv2;
        this.f104761c = bmxv3;
        this.f104762d = bmxv4;
        this.f104763e = i;
        this.f104764f = bmxv5;
        this.f104765g = i2;
    }

    /* renamed from: a */
    public final bmxv mo57384a() {
        return this.f104759a;
    }

    @Deprecated
    /* renamed from: b */
    public final bmxv mo57385b() {
        return this.f104760b;
    }

    /* renamed from: c */
    public final bmxv mo57386c() {
        return this.f104761c;
    }

    /* renamed from: d */
    public final bmxv mo57387d() {
        return this.f104762d;
    }

    /* renamed from: e */
    public final int mo57388e() {
        return this.f104763e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bctn) {
            bctn bctn = (bctn) obj;
            return this.f104759a.equals(bctn.mo57384a()) && this.f104760b.equals(bctn.mo57385b()) && this.f104761c.equals(bctn.mo57386c()) && this.f104762d.equals(bctn.mo57387d()) && this.f104763e == bctn.mo57388e() && this.f104764f.equals(bctn.mo57390f()) && this.f104765g == bctn.mo57391g();
        }
    }

    /* renamed from: f */
    public final bmxv mo57390f() {
        return this.f104764f;
    }

    /* renamed from: g */
    public final int mo57391g() {
        return this.f104765g;
    }

    public final int hashCode() {
        return ((((((((((((this.f104759a.hashCode() ^ 1000003) * 1000003) ^ this.f104760b.hashCode()) * 1000003) ^ this.f104761c.hashCode()) * 1000003) ^ this.f104762d.hashCode()) * 1000003) ^ this.f104763e) * 1000003) ^ this.f104764f.hashCode()) * 1000003) ^ this.f104765g;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104759a);
        String valueOf2 = String.valueOf(this.f104760b);
        String valueOf3 = String.valueOf(this.f104761c);
        String valueOf4 = String.valueOf(this.f104762d);
        int i = this.f104763e;
        String valueOf5 = String.valueOf(this.f104764f);
        int i2 = this.f104765g;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 136 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("Overlay{dismissAction=");
        sb.append(valueOf);
        sb.append(", displayIcon=");
        sb.append(valueOf2);
        sb.append(", lighterIcon=");
        sb.append(valueOf3);
        sb.append(", displayText=");
        sb.append(valueOf4);
        sb.append(", timeToLiveSec=");
        sb.append(i);
        sb.append(", expireTimeStamp=");
        sb.append(valueOf5);
        sb.append(", overlayStyle=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}

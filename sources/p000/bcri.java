package p000;

/* renamed from: bcri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcri extends bcoz {

    /* renamed from: a */
    private final bngx f104703a;

    /* renamed from: b */
    private final Long f104704b;

    /* renamed from: c */
    private final Long f104705c;

    /* renamed from: d */
    private final bcoy f104706d;

    public bcri(bngx bngx, Long l, Long l2, bcoy bcoy) {
        this.f104703a = bngx;
        this.f104704b = l;
        this.f104705c = l2;
        this.f104706d = bcoy;
    }

    /* renamed from: a */
    public final bngx mo57131a() {
        return this.f104703a;
    }

    /* renamed from: b */
    public final Long mo57132b() {
        return this.f104704b;
    }

    /* renamed from: c */
    public final Long mo57133c() {
        return this.f104705c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcoz) {
            bcoz bcoz = (bcoz) obj;
            return bnkn.m109669a(this.f104703a, bcoz.mo57131a()) && this.f104704b.equals(bcoz.mo57132b()) && this.f104705c.equals(bcoz.mo57133c()) && this.f104706d.equals(bcoz.mo57136g());
        }
    }

    /* renamed from: g */
    public final bcoy mo57136g() {
        return this.f104706d;
    }

    public final int hashCode() {
        return ((((((this.f104703a.hashCode() ^ 1000003) * 1000003) ^ this.f104704b.hashCode()) * 1000003) ^ this.f104705c.hashCode()) * 1000003) ^ this.f104706d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104703a);
        String valueOf2 = String.valueOf(this.f104704b);
        String valueOf3 = String.valueOf(this.f104705c);
        String valueOf4 = String.valueOf(this.f104706d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 59 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("AuthToken{tachyonToken=");
        sb.append(valueOf);
        sb.append(", expireAt=");
        sb.append(valueOf2);
        sb.append(", refreshedAt=");
        sb.append(valueOf3);
        sb.append(", oneOfId=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}

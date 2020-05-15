package p000;

/* renamed from: bdwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdwg extends bdxr {

    /* renamed from: a */
    private final ByteString f106522a;

    /* renamed from: b */
    private final long f106523b;

    /* renamed from: c */
    private final Long f106524c;

    public bdwg(ByteString bxtx, long j, Long l) {
        this.f106522a = bxtx;
        this.f106523b = j;
        this.f106524c = l;
    }

    /* renamed from: a */
    public final ByteString mo58404a() {
        return this.f106522a;
    }

    /* renamed from: b */
    public final long mo58405b() {
        return this.f106523b;
    }

    /* renamed from: c */
    public final Long mo58406c() {
        return this.f106524c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdxr) {
            bdxr bdxr = (bdxr) obj;
            return this.f106522a.equals(bdxr.mo58404a()) && this.f106523b == bdxr.mo58405b() && this.f106524c.equals(bdxr.mo58406c());
        }
    }

    public final int hashCode() {
        int hashCode = this.f106522a.hashCode();
        long j = this.f106523b;
        return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f106524c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f106522a);
        long j = this.f106523b;
        String valueOf2 = String.valueOf(this.f106524c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52 + String.valueOf(valueOf2).length());
        sb.append("ItemImpl{data=");
        sb.append(valueOf);
        sb.append(", timestamp=");
        sb.append(j);
        sb.append(", id=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

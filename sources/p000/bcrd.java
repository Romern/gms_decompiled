package p000;

/* renamed from: bcrd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcrd extends bcoh {

    /* renamed from: a */
    private final long f104684a;

    /* renamed from: b */
    private final bcol f104685b;

    /* renamed from: c */
    private final ByteString f104686c;

    /* renamed from: d */
    private final bcog f104687d;

    public bcrd(long j, bcol bcol, ByteString bxtx, bcog bcog) {
        this.f104684a = j;
        this.f104685b = bcol;
        this.f104686c = bxtx;
        this.f104687d = bcog;
    }

    /* renamed from: a */
    public final long mo57057a() {
        return this.f104684a;
    }

    /* renamed from: b */
    public final bcol mo57058b() {
        return this.f104685b;
    }

    /* renamed from: c */
    public final ByteString mo57059c() {
        return this.f104686c;
    }

    /* renamed from: d */
    public final bcog mo57060d() {
        return this.f104687d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcoh) {
            bcoh bcoh = (bcoh) obj;
            return this.f104684a == bcoh.mo57057a() && this.f104685b.equals(bcoh.mo57058b()) && this.f104686c.equals(bcoh.mo57059c()) && this.f104687d.equals(bcoh.mo57060d());
        }
    }

    public final int hashCode() {
        long j = this.f104684a;
        return this.f104687d.hashCode() ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f104685b.hashCode()) * 1000003) ^ this.f104686c.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.f104684a;
        String valueOf = String.valueOf(this.f104685b);
        String valueOf2 = String.valueOf(this.f104686c);
        String valueOf3 = String.valueOf(this.f104687d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 116 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("AccountContext{registrationId=");
        sb.append(j);
        sb.append(", accountUsers=");
        sb.append(valueOf);
        sb.append(", serverRegistrationId=");
        sb.append(valueOf2);
        sb.append(", serverRegistrationStatus=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}

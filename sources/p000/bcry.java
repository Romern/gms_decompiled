package p000;

/* renamed from: bcry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcry extends bcty {

    /* renamed from: a */
    public final Long f104766a;

    /* renamed from: b */
    public final bngx f104767b;

    public bcry(Long l, bngx bngx) {
        this.f104766a = l;
        this.f104767b = bngx;
    }

    /* renamed from: a */
    public final Long mo57396a() {
        return this.f104766a;
    }

    /* renamed from: b */
    public final bngx mo57397b() {
        return this.f104767b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcty) {
            bcty bcty = (bcty) obj;
            return this.f104766a.equals(bcty.mo57396a()) && bnkn.m109669a(this.f104767b, bcty.mo57397b());
        }
    }

    public final int hashCode() {
        return ((this.f104766a.hashCode() ^ 1000003) * 1000003) ^ this.f104767b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104766a);
        String valueOf2 = String.valueOf(this.f104767b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 80 + String.valueOf(valueOf2).length());
        sb.append("RegistrationProperties{lastCapabilitiesReportTimeMs=");
        sb.append(valueOf);
        sb.append(", lastReportedCapabilities=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

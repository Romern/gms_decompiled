package p000;

/* renamed from: bsjz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bsjz extends bskf {

    /* renamed from: a */
    public final bngx f144861a;

    /* renamed from: b */
    private final bmxv f144862b;

    /* renamed from: c */
    private final bnic f144863c;

    /* renamed from: d */
    private final bmxv f144864d;

    public bsjz(bngx bngx, bmxv bmxv, bnic bnic, bmxv bmxv2) {
        this.f144861a = bngx;
        this.f144862b = bmxv;
        this.f144863c = bnic;
        this.f144864d = bmxv2;
    }

    /* renamed from: a */
    public final bngx mo70642a() {
        return this.f144861a;
    }

    /* renamed from: b */
    public final bmxv mo70643b() {
        return this.f144862b;
    }

    /* renamed from: c */
    public final bnic mo70644c() {
        return this.f144863c;
    }

    /* renamed from: d */
    public final bmxv mo70645d() {
        return this.f144864d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bskf) {
            bskf bskf = (bskf) obj;
            return bnkn.m109669a(this.f144861a, bskf.mo70642a()) && this.f144862b.equals(bskf.mo70643b()) && this.f144863c.equals(bskf.mo70644c()) && this.f144864d.equals(bskf.mo70645d());
        }
    }

    public final int hashCode() {
        return ((((((this.f144861a.hashCode() ^ 1000003) * 1000003) ^ this.f144862b.hashCode()) * 1000003) ^ this.f144863c.hashCode()) * 1000003) ^ this.f144864d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f144861a);
        String valueOf2 = String.valueOf(this.f144862b);
        String valueOf3 = String.valueOf(this.f144863c);
        String valueOf4 = String.valueOf(this.f144864d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 84 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("CredentialGroup{credentials=");
        sb.append(valueOf);
        sb.append(", affiliatedGroupId=");
        sb.append(valueOf2);
        sb.append(", signonRealms=");
        sb.append(valueOf3);
        sb.append(", federationIconUrl=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}

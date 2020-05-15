package p000;

/* renamed from: bsjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bsjy extends bsjx {

    /* renamed from: a */
    private final String f144858a;

    /* renamed from: b */
    private final bytz f144859b;

    /* renamed from: c */
    private final bngx f144860c;

    public bsjy(String str, bytz bytz, bngx bngx) {
        this.f144858a = str;
        this.f144859b = bytz;
        this.f144860c = bngx;
    }

    /* renamed from: a */
    public final String mo70636a() {
        return this.f144858a;
    }

    /* renamed from: b */
    public final bytz mo70637b() {
        return this.f144859b;
    }

    /* renamed from: c */
    public final bngx mo70638c() {
        return this.f144860c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bsjx) {
            bsjx bsjx = (bsjx) obj;
            return this.f144858a.equals(bsjx.mo70636a()) && this.f144859b.equals(bsjx.mo70637b()) && bnkn.m109669a(this.f144860c, bsjx.mo70638c());
        }
    }

    public final int hashCode() {
        int hashCode = (this.f144858a.hashCode() ^ 1000003) * 1000003;
        bytz bytz = this.f144859b;
        int i = bytz.f164758ag;
        if (i == 0) {
            i = bxxm.f165037a.mo74228a(bytz).mo74216a(bytz);
            bytz.f164758ag = i;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f144860c.hashCode();
    }

    public final String toString() {
        String str = this.f144858a;
        String valueOf = String.valueOf(this.f144859b);
        String valueOf2 = String.valueOf(this.f144860c);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 59 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("AffiliatedGroup{id=");
        sb.append(str);
        sb.append(", groupBrandingInfo=");
        sb.append(valueOf);
        sb.append(", credentialGroups=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

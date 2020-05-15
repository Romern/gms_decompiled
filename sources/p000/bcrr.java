package p000;

/* renamed from: bcrr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcrr extends bctb {

    /* renamed from: a */
    private final String f104738a;

    /* renamed from: b */
    private final bcov f104739b;

    /* renamed from: c */
    private final bmxv f104740c;

    public bcrr(String str, bcov bcov, bmxv bmxv) {
        this.f104738a = str;
        this.f104739b = bcov;
        this.f104740c = bmxv;
    }

    /* renamed from: a */
    public final String mo57348a() {
        return this.f104738a;
    }

    /* renamed from: b */
    public final bcov mo57349b() {
        return this.f104739b;
    }

    /* renamed from: c */
    public final bmxv mo57350c() {
        return this.f104740c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bctb) {
            bctb bctb = (bctb) obj;
            return this.f104738a.equals(bctb.mo57348a()) && this.f104739b.equals(bctb.mo57349b()) && this.f104740c.equals(bctb.mo57350c());
        }
    }

    public final int hashCode() {
        return ((((this.f104738a.hashCode() ^ 1000003) * 1000003) ^ this.f104739b.hashCode()) * 1000003) ^ this.f104740c.hashCode();
    }

    public final String toString() {
        String str = this.f104738a;
        String valueOf = String.valueOf(this.f104739b);
        String valueOf2 = String.valueOf(this.f104740c);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 42 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("LighterMenuItem{menuName=");
        sb.append(str);
        sb.append(", action=");
        sb.append(valueOf);
        sb.append(", icon=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}

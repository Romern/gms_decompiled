package p000;

/* renamed from: bcsd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcsd extends bcus {

    /* renamed from: b */
    private final int f104775b;

    /* renamed from: c */
    private final String f104776c;

    /* renamed from: d */
    private final bmxv f104777d;

    /* renamed from: e */
    private final bcov f104778e;

    /* renamed from: f */
    private final String f104779f;

    public bcsd(int i, String str, bmxv bmxv, bcov bcov, String str2) {
        this.f104775b = i;
        this.f104776c = str;
        this.f104777d = bmxv;
        this.f104778e = bcov;
        this.f104779f = str2;
    }

    /* renamed from: a */
    public final int mo57408a() {
        return this.f104775b;
    }

    /* renamed from: b */
    public final String mo57409b() {
        return this.f104776c;
    }

    /* renamed from: c */
    public final bmxv mo57410c() {
        return this.f104777d;
    }

    /* renamed from: d */
    public final bcov mo57411d() {
        return this.f104778e;
    }

    /* renamed from: e */
    public final String mo57412e() {
        return this.f104779f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcus) {
            bcus bcus = (bcus) obj;
            return this.f104775b == bcus.mo57408a() && this.f104776c.equals(bcus.mo57409b()) && this.f104777d.equals(bcus.mo57410c()) && this.f104778e.equals(bcus.mo57411d()) && this.f104779f.equals(bcus.mo57412e());
        }
    }

    public final int hashCode() {
        return ((((((((this.f104775b ^ 1000003) * 1000003) ^ this.f104776c.hashCode()) * 1000003) ^ this.f104777d.hashCode()) * 1000003) ^ this.f104778e.hashCode()) * 1000003) ^ this.f104779f.hashCode();
    }

    public final String toString() {
        int i = this.f104775b;
        String str = this.f104776c;
        String valueOf = String.valueOf(this.f104777d);
        String valueOf2 = String.valueOf(this.f104778e);
        String str2 = this.f104779f;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 72 + length2 + String.valueOf(valueOf2).length() + String.valueOf(str2).length());
        sb.append("Suggestion{id=");
        sb.append(i);
        sb.append(", text=");
        sb.append(str);
        sb.append(", lighterIcon=");
        sb.append(valueOf);
        sb.append(", action=");
        sb.append(valueOf2);
        sb.append(", secondaryText=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}

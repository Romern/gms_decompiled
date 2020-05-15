package p000;

/* renamed from: brwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brwb extends brwt {

    /* renamed from: a */
    private final String f143501a;

    /* renamed from: b */
    private final bruw f143502b;

    /* renamed from: c */
    private final String f143503c;

    public brwb(String str, bruw bruw, String str2) {
        if (str != null) {
            this.f143501a = str;
            this.f143502b = bruw;
            if (str2 != null) {
                this.f143503c = str2;
                return;
            }
            throw new NullPointerException("Null methodName");
        }
        throw new NullPointerException("Null endpoint");
    }

    /* renamed from: a */
    public final String mo70033a() {
        return this.f143501a;
    }

    /* renamed from: b */
    public final bruw mo70034b() {
        return this.f143502b;
    }

    /* renamed from: c */
    public final String mo70035c() {
        return this.f143503c;
    }

    public final boolean equals(Object obj) {
        bruw bruw;
        if (obj == this) {
            return true;
        }
        if (obj instanceof brwt) {
            brwt brwt = (brwt) obj;
            return this.f143501a.equals(brwt.mo70033a()) && ((bruw = this.f143502b) == null ? brwt.mo70034b() == null : bruw.equals(brwt.mo70034b())) && this.f143503c.equals(brwt.mo70035c());
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f143501a.hashCode() ^ 1000003) * 1000003;
        bruw bruw = this.f143502b;
        if (bruw != null) {
            i = bruw.hashCode();
        } else {
            i = 0;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f143503c.hashCode();
    }

    public final String toString() {
        String str = this.f143501a;
        String valueOf = String.valueOf(this.f143502b);
        String str2 = this.f143503c;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 51 + String.valueOf(valueOf).length() + str2.length());
        sb.append("InterceptorId{endpoint=");
        sb.append(str);
        sb.append(", authContext=");
        sb.append(valueOf);
        sb.append(", methodName=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}

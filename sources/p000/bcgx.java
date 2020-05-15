package p000;

/* renamed from: bcgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcgx extends bchu {

    /* renamed from: a */
    private final String f104142a;

    /* renamed from: b */
    private final bcht f104143b;

    public bcgx(String str, bcht bcht) {
        this.f104142a = str;
        this.f104143b = bcht;
    }

    /* renamed from: a */
    public final String mo56855a() {
        return this.f104142a;
    }

    /* renamed from: b */
    public final bcht mo56856b() {
        return this.f104143b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bchu) {
            bchu bchu = (bchu) obj;
            return this.f104142a.equals(bchu.mo56855a()) && this.f104143b.equals(bchu.mo56856b());
        }
    }

    public final int hashCode() {
        return ((this.f104142a.hashCode() ^ 1000003) * 1000003) ^ this.f104143b.hashCode();
    }

    public final String toString() {
        String str = this.f104142a;
        String valueOf = String.valueOf(this.f104143b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(valueOf).length());
        sb.append("Push{pushId=");
        sb.append(str);
        sb.append(", oneOfType=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}

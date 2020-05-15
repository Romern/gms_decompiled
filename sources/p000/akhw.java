package p000;

/* renamed from: akhw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akhw extends akht {

    /* renamed from: a */
    private final String f72026a;

    /* renamed from: b */
    private final String f72027b;

    public akhw(String str, String str2) {
        this.f72026a = str;
        this.f72027b = str2;
    }

    /* renamed from: a */
    public final String mo39461a() {
        return this.f72026a;
    }

    /* renamed from: b */
    public final String mo39462b() {
        return this.f72027b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akht) {
            akht akht = (akht) obj;
            return this.f72026a.equals(akht.mo39461a()) && this.f72027b.equals(akht.mo39462b());
        }
    }

    public final int hashCode() {
        return ((this.f72026a.hashCode() ^ 1000003) * 1000003) ^ this.f72027b.hashCode();
    }

    public final String toString() {
        String str = this.f72026a;
        String str2 = this.f72027b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AccountOwner{displayName=");
        sb.append(str);
        sb.append(", givenName=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}

package p000;

/* renamed from: bcrh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcrh extends bcou {

    /* renamed from: a */
    private final String f104701a;

    /* renamed from: b */
    private final String f104702b;

    public bcrh(String str, String str2) {
        this.f104701a = str;
        this.f104702b = str2;
    }

    /* renamed from: a */
    public final String mo57112a() {
        return this.f104701a;
    }

    /* renamed from: b */
    public final String mo57113b() {
        return this.f104702b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcou) {
            bcou bcou = (bcou) obj;
            return this.f104701a.equals(bcou.mo57112a()) && this.f104702b.equals(bcou.mo57113b());
        }
    }

    public final int hashCode() {
        return ((this.f104701a.hashCode() ^ 1000003) * 1000003) ^ this.f104702b.hashCode();
    }

    public final String toString() {
        String str = this.f104701a;
        String str2 = this.f104702b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50 + String.valueOf(str2).length());
        sb.append("ReplyActionPayload{text=");
        sb.append(str);
        sb.append(", messageCallbackPayload=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}

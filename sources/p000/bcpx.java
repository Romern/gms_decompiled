package p000;

/* renamed from: bcpx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcpx extends bcpz {

    /* renamed from: a */
    private final String f104669a;

    /* renamed from: a */
    public final int mo57180a() {
        return 2;
    }

    /* renamed from: d */
    public final String mo57192d() {
        return this.f104669a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcti) {
            bcti bcti = (bcti) obj;
            return bcti.mo57180a() == 2 && this.f104669a.equals(bcti.mo57192d());
        }
    }

    public final int hashCode() {
        return this.f104669a.hashCode();
    }

    public final String toString() {
        String str = this.f104669a;
        StringBuilder sb = new StringBuilder(str.length() + 21);
        sb.append("MessageContent{text=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public bcpx(String str) {
        this.f104669a = str;
    }
}

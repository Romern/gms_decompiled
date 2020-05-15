package p000;

/* renamed from: bcpw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcpw extends bcpz {

    /* renamed from: a */
    private final bcuo f104668a;

    /* renamed from: a */
    public final int mo57180a() {
        return 4;
    }

    /* renamed from: c */
    public final bcuo mo57188c() {
        return this.f104668a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcti) {
            bcti bcti = (bcti) obj;
            return bcti.mo57180a() == 4 && this.f104668a.equals(bcti.mo57188c());
        }
    }

    public final int hashCode() {
        return this.f104668a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104668a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("MessageContent{richText=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcpw(bcuo bcuo) {
        this.f104668a = bcuo;
    }
}

package p000;

/* renamed from: bcgk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcgk extends bcgn {

    /* renamed from: a */
    private final bchu f104112a;

    /* renamed from: b */
    public final int mo56783b() {
        return 2;
    }

    /* renamed from: d */
    public final bchu mo56791d() {
        return this.f104112a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bchz) {
            bchz bchz = (bchz) obj;
            return bchz.mo56783b() == 2 && this.f104112a.equals(bchz.mo56791d());
        }
    }

    public final int hashCode() {
        return this.f104112a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104112a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
        sb.append("OneOfType{push=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcgk(bchu bchu) {
        this.f104112a = bchu;
    }
}

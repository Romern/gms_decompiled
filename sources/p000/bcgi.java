package p000;

/* renamed from: bcgi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcgi extends bcgn {

    /* renamed from: a */
    private final bchh f104110a;

    /* renamed from: a */
    public final bchh mo56782a() {
        return this.f104110a;
    }

    /* renamed from: b */
    public final int mo56783b() {
        return 5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bchz) {
            bchz bchz = (bchz) obj;
            return bchz.mo56783b() == 5 && this.f104110a.equals(bchz.mo56782a());
        }
    }

    public final int hashCode() {
        return this.f104110a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104110a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("OneOfType{cloudUpdate=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcgi(bchh bchh) {
        this.f104110a = bchh;
    }
}

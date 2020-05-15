package p000;

/* renamed from: bcgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcgl extends bcgn {

    /* renamed from: a */
    private final bchw f104113a;

    /* renamed from: b */
    public final int mo56783b() {
        return 3;
    }

    /* renamed from: e */
    public final bchw mo56795e() {
        return this.f104113a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bchz) {
            bchz bchz = (bchz) obj;
            return bchz.mo56783b() == 3 && this.f104113a.equals(bchz.mo56795e());
        }
    }

    public final int hashCode() {
        return this.f104113a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104113a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("OneOfType{receipt=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcgl(bchw bchw) {
        this.f104113a = bchw;
    }
}

package p000;

/* renamed from: bcqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcqd extends bcqf {

    /* renamed from: a */
    private final bctn f104673a;

    /* renamed from: a */
    public final bctq mo57200a() {
        return bctq.f104882c;
    }

    /* renamed from: b */
    public final bctn mo57207b() {
        return this.f104673a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcto) {
            bcto bcto = (bcto) obj;
            if (bctq.f104882c != bcto.mo57200a() || !this.f104673a.equals(bcto.mo57207b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f104673a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104673a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("RenderingDetails{overlay=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcqd(bctn bctn) {
        this.f104673a = bctn;
    }
}

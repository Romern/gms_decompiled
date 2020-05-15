package p000;

/* renamed from: bcpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcpf extends bcpi {

    /* renamed from: a */
    private final bcou f104657a;

    /* renamed from: a */
    public final bcon mo57076a() {
        return bcon.SEND_MESSAGE;
    }

    /* renamed from: b */
    public final bcou mo57077b() {
        return this.f104657a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcom) {
            bcom bcom = (bcom) obj;
            if (bcon.SEND_MESSAGE != bcom.mo57076a() || !this.f104657a.equals(bcom.mo57077b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f104657a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104657a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("ActionPayload{sendMessage=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcpf(bcou bcou) {
        this.f104657a = bcou;
    }
}

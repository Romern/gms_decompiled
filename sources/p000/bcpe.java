package p000;

/* renamed from: bcpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcpe extends bcpi {

    /* renamed from: a */
    private final bcou f104656a;

    /* renamed from: a */
    public final bcon mo57076a() {
        return bcon.PREFILL_MESSAGE;
    }

    /* renamed from: c */
    public final bcou mo57078c() {
        return this.f104656a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcom) {
            bcom bcom = (bcom) obj;
            if (bcon.PREFILL_MESSAGE != bcom.mo57076a() || !this.f104656a.equals(bcom.mo57078c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f104656a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104656a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("ActionPayload{prefillMessage=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcpe(bcou bcou) {
        this.f104656a = bcou;
    }
}

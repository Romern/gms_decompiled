package p000;

/* renamed from: bcpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcpb extends bcpi {

    /* renamed from: a */
    private final bcos f104653a;

    /* renamed from: a */
    public final bcon mo57076a() {
        return bcon.COMPOSED_OVERLAY_ACTION;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcom) {
            bcom bcom = (bcom) obj;
            if (bcon.COMPOSED_OVERLAY_ACTION != bcom.mo57076a() || !this.f104653a.equals(bcom.mo57081f())) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final bcos mo57081f() {
        return this.f104653a;
    }

    public final int hashCode() {
        return this.f104653a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104653a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("ActionPayload{composedOverlayAction=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcpb(bcos bcos) {
        this.f104653a = bcos;
    }
}

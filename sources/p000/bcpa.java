package p000;

/* renamed from: bcpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcpa extends bcpi {

    /* renamed from: a */
    private final String f104652a;

    /* renamed from: a */
    public final bcon mo57076a() {
        return bcon.CALL_ACTION;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcom) {
            bcom bcom = (bcom) obj;
            if (bcon.CALL_ACTION != bcom.mo57076a() || !this.f104652a.equals(bcom.mo57083h())) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final String mo57083h() {
        return this.f104652a;
    }

    public final int hashCode() {
        return this.f104652a.hashCode();
    }

    public final String toString() {
        String str = this.f104652a;
        StringBuilder sb = new StringBuilder(str.length() + 26);
        sb.append("ActionPayload{callAction=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public bcpa(String str) {
        this.f104652a = str;
    }
}

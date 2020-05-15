package p000;

/* renamed from: bcpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcpc extends bcpi {

    /* renamed from: a */
    private final String f104654a;

    /* renamed from: a */
    public final bcon mo57076a() {
        return bcon.CUSTOM_ACTION;
    }

    /* renamed from: d */
    public final String mo57079d() {
        return this.f104654a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcom) {
            bcom bcom = (bcom) obj;
            if (bcon.CUSTOM_ACTION != bcom.mo57076a() || !this.f104654a.equals(bcom.mo57079d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f104654a.hashCode();
    }

    public final String toString() {
        String str = this.f104654a;
        StringBuilder sb = new StringBuilder(str.length() + 28);
        sb.append("ActionPayload{customAction=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public bcpc(String str) {
        this.f104654a = str;
    }
}

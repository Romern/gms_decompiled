package p000;

/* renamed from: bcph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcph extends bcpi {

    /* renamed from: a */
    private final String f104659a;

    /* renamed from: a */
    public final bcon mo57076a() {
        return bcon.WEB_ACTION;
    }

    /* renamed from: e */
    public final String mo57080e() {
        return this.f104659a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcom) {
            bcom bcom = (bcom) obj;
            if (bcon.WEB_ACTION != bcom.mo57076a() || !this.f104659a.equals(bcom.mo57080e())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f104659a.hashCode();
    }

    public final String toString() {
        String str = this.f104659a;
        StringBuilder sb = new StringBuilder(str.length() + 25);
        sb.append("ActionPayload{webAction=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public bcph(String str) {
        this.f104659a = str;
    }
}

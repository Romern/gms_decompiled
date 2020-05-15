package p000;

/* renamed from: bcpg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcpg extends bcpi {

    /* renamed from: a */
    private final String f104658a;

    /* renamed from: a */
    public final bcon mo57076a() {
        return bcon.TOMBSTONE_ACTION;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcom) {
            bcom bcom = (bcom) obj;
            if (bcon.TOMBSTONE_ACTION != bcom.mo57076a() || !this.f104658a.equals(bcom.mo57084i())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f104658a.hashCode();
    }

    /* renamed from: i */
    public final String mo57084i() {
        return this.f104658a;
    }

    public final String toString() {
        String str = this.f104658a;
        StringBuilder sb = new StringBuilder(str.length() + 31);
        sb.append("ActionPayload{tombstoneAction=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public bcpg(String str) {
        this.f104658a = str;
    }
}

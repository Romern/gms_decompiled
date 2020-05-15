package p000;

/* renamed from: bcqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcqs extends bcqz {

    /* renamed from: a */
    private final int f104681a;

    /* renamed from: b */
    public final bcul mo57226b() {
        return bcul.SIZE;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcuj) {
            bcuj bcuj = (bcuj) obj;
            if (bcul.SIZE == bcuj.mo57226b() && this.f104681a == bcuj.mo57247g()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: g */
    public final int mo57247g() {
        return this.f104681a;
    }

    public final int hashCode() {
        return this.f104681a;
    }

    public final String toString() {
        int i = this.f104681a;
        StringBuilder sb = new StringBuilder(27);
        sb.append("TextStyle{size=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public bcqs(int i) {
        this.f104681a = i;
    }
}

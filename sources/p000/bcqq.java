package p000;

/* renamed from: bcqq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcqq extends bcqz {

    /* renamed from: a */
    private final int f104680a;

    /* renamed from: b */
    public final bcul mo57226b() {
        return bcul.HORIZONTAL_ALIGNMENT;
    }

    /* renamed from: e */
    public final int mo57238e() {
        return this.f104680a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcuj) {
            bcuj bcuj = (bcuj) obj;
            if (bcul.HORIZONTAL_ALIGNMENT == bcuj.mo57226b() && this.f104680a == bcuj.mo57238e()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f104680a;
    }

    public final String toString() {
        int i = this.f104680a;
        StringBuilder sb = new StringBuilder(42);
        sb.append("TextStyle{horizontalAlignment=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public bcqq(int i) {
        this.f104680a = i;
    }
}

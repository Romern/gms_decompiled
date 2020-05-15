package p000;

/* renamed from: bcqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcqp extends bcqz {

    /* renamed from: a */
    private final int f104679a;

    /* renamed from: b */
    public final bcul mo57226b() {
        return bcul.COLOR;
    }

    /* renamed from: d */
    public final int mo57234d() {
        return this.f104679a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcuj) {
            bcuj bcuj = (bcuj) obj;
            if (bcul.COLOR == bcuj.mo57226b() && this.f104679a == bcuj.mo57234d()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f104679a;
    }

    public final String toString() {
        int i = this.f104679a;
        StringBuilder sb = new StringBuilder(28);
        sb.append("TextStyle{color=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public bcqp(int i) {
        this.f104679a = i;
    }
}

package p000;

/* renamed from: bcqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcqn extends bcqz {

    /* renamed from: a */
    private final int f104678a;

    /* renamed from: a */
    public final int mo57225a() {
        return this.f104678a;
    }

    /* renamed from: b */
    public final bcul mo57226b() {
        return bcul.BACKGROUND_COLOR;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcuj) {
            bcuj bcuj = (bcuj) obj;
            if (bcul.BACKGROUND_COLOR == bcuj.mo57226b() && this.f104678a == bcuj.mo57225a()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f104678a;
    }

    public final String toString() {
        int i = this.f104678a;
        StringBuilder sb = new StringBuilder(38);
        sb.append("TextStyle{backgroundColor=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public bcqn(int i) {
        this.f104678a = i;
    }
}

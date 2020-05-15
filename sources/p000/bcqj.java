package p000;

/* renamed from: bcqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcqj extends bcql {

    /* renamed from: a */
    private final int f104676a;

    /* renamed from: a */
    public final bcug mo57214a() {
        return bcug.INDENTATION;
    }

    /* renamed from: b */
    public final int mo57218b() {
        return this.f104676a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcue) {
            bcue bcue = (bcue) obj;
            if (bcug.INDENTATION == bcue.mo57214a() && this.f104676a == bcue.mo57218b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f104676a;
    }

    public final String toString() {
        int i = this.f104676a;
        StringBuilder sb = new StringBuilder(34);
        sb.append("LineStyle{indentation=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public bcqj(int i) {
        this.f104676a = i;
    }
}

package p000;

/* renamed from: cixi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cixi extends cixh {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final Object f191672a;

    public cixi(Object obj) {
        this.f191672a = obj;
    }

    /* renamed from: a */
    public final boolean mo86624a() {
        return true;
    }

    /* renamed from: b */
    public final Object mo86625b() {
        return this.f191672a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cixi) {
            return this.f191672a.equals(((cixi) obj).f191672a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f191672a.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f191672a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}

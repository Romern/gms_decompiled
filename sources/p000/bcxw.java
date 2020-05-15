package p000;

/* renamed from: bcxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcxw extends bcxy {

    /* renamed from: b */
    private final bczq f105114b;

    /* renamed from: b */
    public final bczj mo57644b() {
        return bczj.STACK_CARD;
    }

    /* renamed from: c */
    public final bczq mo57648c() {
        return this.f105114b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bczk) {
            bczk bczk = (bczk) obj;
            if (bczj.STACK_CARD != bczk.mo57644b() || !this.f105114b.equals(bczk.mo57648c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f105114b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105114b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("RichCard{stackCard=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcxw(bczq bczq) {
        this.f105114b = bczq;
    }
}

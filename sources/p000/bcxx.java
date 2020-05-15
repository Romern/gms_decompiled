package p000;

/* renamed from: bcxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcxx extends bcxy {

    /* renamed from: b */
    private final bczs f105115b;

    /* renamed from: b */
    public final bczj mo57644b() {
        return bczj.STANDALONE_CARD;
    }

    /* renamed from: d */
    public final bczs mo57652d() {
        return this.f105115b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bczk) {
            bczk bczk = (bczk) obj;
            if (bczj.STANDALONE_CARD != bczk.mo57644b() || !this.f105115b.equals(bczk.mo57652d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f105115b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105115b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("RichCard{standaloneCard=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcxx(bczs bczs) {
        this.f105115b = bczs;
    }
}

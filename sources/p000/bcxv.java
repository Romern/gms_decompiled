package p000;

/* renamed from: bcxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcxv extends bcxy {

    /* renamed from: b */
    private final bcyz f105113b;

    /* renamed from: a */
    public final bcyz mo57643a() {
        return this.f105113b;
    }

    /* renamed from: b */
    public final bczj mo57644b() {
        return bczj.CARD_CAROUSEL;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bczk) {
            bczk bczk = (bczk) obj;
            if (bczj.CARD_CAROUSEL != bczk.mo57644b() || !this.f105113b.equals(bczk.mo57643a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f105113b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f105113b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("RichCard{cardCarousel=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public bcxv(bcyz bcyz) {
        this.f105113b = bcyz;
    }
}

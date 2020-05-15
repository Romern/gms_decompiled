package p000;

/* renamed from: bxur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxur {

    /* renamed from: a */
    private final Object f164869a;

    /* renamed from: b */
    private final int f164870b;

    public bxur(Object obj, int i) {
        this.f164869a = obj;
        this.f164870b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bxur) {
            bxur bxur = (bxur) obj;
            if (this.f164869a == bxur.f164869a && this.f164870b == bxur.f164870b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f164869a) * 65535) + this.f164870b;
    }
}

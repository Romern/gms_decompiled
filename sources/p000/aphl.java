package p000;

/* renamed from: aphl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aphl {

    /* renamed from: a */
    public final int f84387a;

    /* renamed from: b */
    public final int f84388b;

    public aphl(int i, int i2) {
        this.f84387a = i;
        this.f84388b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aphl) {
            aphl aphl = (aphl) obj;
            if (this.f84387a == aphl.f84387a && this.f84388b == aphl.f84388b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f84387a << 10) + this.f84388b;
    }
}

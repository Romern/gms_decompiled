package p000;

/* renamed from: bobs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bobs extends bobt {
    public bobs(int i, double d, int i2) {
        super(i, d, i2);
    }

    public final String toString() {
        bmxt a = bmxu.m108564a("exponentialBackoff");
        a.mo66883a("firstDelayMs", this.f132517b);
        a.mo66882a("multiplier", this.f132518c);
        a.mo66883a("tries", this.f132516a);
        return a.toString();
    }
}

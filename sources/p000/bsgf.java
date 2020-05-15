package p000;

import java.util.Random;

/* renamed from: bsgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsgf {

    /* renamed from: a */
    private final double f144524a;

    /* renamed from: b */
    private final Random f144525b;

    public bsgf(double d, long j) {
        bxbm.m122544b(bqci.m112571b(0.0d));
        boolean z = false;
        if (d > 0.0d && d < Double.POSITIVE_INFINITY) {
            z = true;
        }
        bxbm.m122544b(z);
        this.f144524a = d;
        this.f144525b = new Random(j);
    }

    /* renamed from: a */
    public final double mo70526a() {
        return (this.f144524a * this.f144525b.nextGaussian()) + 0.0d;
    }
}

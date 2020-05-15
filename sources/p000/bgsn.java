package p000;

import java.util.ArrayList;
import java.util.Random;

/* renamed from: bgsn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgsn {

    /* renamed from: a */
    public final int f117439a;

    /* renamed from: b */
    public final int f117440b;

    /* renamed from: c */
    public long f117441c = -1;

    /* renamed from: d */
    public ArrayList f117442d = null;

    /* renamed from: e */
    private final Random f117443e;

    static {
        srn.m36125a("EAlert");
    }

    public bgsn(Random random, int i, int i2) {
        this.f117443e = random;
        this.f117439a = i;
        this.f117440b = i2;
    }

    /* renamed from: a */
    public final double mo63136a(double d) {
        double nextDouble = this.f117443e.nextDouble() * d;
        double d2 = (double) (!this.f117443e.nextBoolean() ? -1 : 1);
        Double.isNaN(d2);
        return nextDouble * d2;
    }
}

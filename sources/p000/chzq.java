package p000;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: chzq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chzq {

    /* renamed from: a */
    private final Random f189613a = new Random();

    /* renamed from: b */
    private final long f189614b = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: c */
    private final long f189615c = TimeUnit.MINUTES.toNanos(2);

    /* renamed from: d */
    private long f189616d = this.f189614b;

    /* renamed from: a */
    public final long mo85845a() {
        boolean z;
        long j = this.f189616d;
        double d = (double) j;
        Double.isNaN(d);
        this.f189616d = Math.min((long) (1.6d * d), this.f189615c);
        Double.isNaN(d);
        double d2 = -0.2d * d;
        Double.isNaN(d);
        double d3 = d * 0.2d;
        if (d3 >= d2) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        return j + ((long) ((this.f189613a.nextDouble() * (d3 - d2)) + d2));
    }
}

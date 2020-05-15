package p000;

import android.os.SystemClock;
import java.util.Locale;
import java.util.Random;

/* renamed from: voy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class voy implements vpo {

    /* renamed from: a */
    private final long f49691a;

    /* renamed from: b */
    private final double f49692b;

    /* renamed from: c */
    private final long f49693c;

    /* renamed from: d */
    private final Random f49694d;

    /* renamed from: e */
    private int f49695e = 0;

    /* renamed from: f */
    private long f49696f;

    public voy(long j, double d, long j2) {
        boolean z;
        boolean z2;
        Random random = new Random();
        boolean z3 = false;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        if (d >= 1.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34974b(z2);
        sdo.m34974b(j <= j2 ? true : z3);
        this.f49691a = j;
        this.f49692b = d;
        this.f49693c = j2;
        sdo.m34959a(random);
        this.f49694d = random;
        mo28711b();
    }

    /* renamed from: e */
    private final synchronized void m40952e() {
        double d = this.f49692b;
        double nextDouble = this.f49694d.nextDouble();
        double pow = Math.pow(this.f49692b, (double) this.f49695e);
        long j = this.f49691a;
        double d2 = (double) this.f49693c;
        double d3 = (double) j;
        Double.isNaN(d3);
        this.f49696f = ((long) Math.min(d2, d3 * pow * (((d - 4.0d) * nextDouble) + 1.0d))) + SystemClock.uptimeMillis();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized long mo28710a() {
        long max;
        max = Math.max(0L, this.f49696f - SystemClock.uptimeMillis());
        this.f49695e++;
        m40952e();
        return max;
    }

    /* renamed from: b */
    public final synchronized void mo28711b() {
        this.f49695e = 0;
        m40952e();
    }

    /* renamed from: c */
    public final synchronized boolean mo28702c() {
        return SystemClock.uptimeMillis() >= this.f49696f;
    }

    /* renamed from: d */
    public final synchronized boolean mo28703d() {
        boolean c;
        c = mo28702c();
        if (c) {
            mo28710a();
        }
        return c;
    }

    /* renamed from: f */
    public final synchronized void mo28705f() {
        long a = mo28710a();
        if (a > 0) {
            Thread.sleep(a);
        }
    }

    /* renamed from: g */
    public final void mo28706g() {
    }

    public final String toString() {
        return String.format(Locale.US, "ExponentialBackoffRateLimiter[%d tokens, initialMs=%d, factor=%.3f]", Integer.valueOf(this.f49695e), Long.valueOf(this.f49691a), Double.valueOf(this.f49692b));
    }
}

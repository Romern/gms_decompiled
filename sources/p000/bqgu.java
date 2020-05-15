package p000;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: bqgu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqgu {

    /* renamed from: a */
    public final bqgt f140634a;

    /* renamed from: b */
    public double f140635b;

    /* renamed from: c */
    public double f140636c;

    /* renamed from: d */
    public double f140637d;

    /* renamed from: e */
    public long f140638e = 0;

    /* renamed from: f */
    private volatile Object f140639f;

    /* renamed from: a */
    public final Object mo69253a() {
        Object obj = this.f140639f;
        if (obj == null) {
            synchronized (this) {
                obj = this.f140639f;
                if (obj == null) {
                    obj = new Object();
                    this.f140639f = obj;
                }
            }
        }
        return obj;
    }

    public final String toString() {
        double d;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[1];
        synchronized (mo69253a()) {
            double micros = (double) TimeUnit.SECONDS.toMicros(1);
            double d2 = this.f140637d;
            Double.isNaN(micros);
            d = micros / d2;
        }
        objArr[0] = Double.valueOf(d);
        return String.format(locale, "RateLimiter[stableRate=%3.1fqps]", objArr);
    }

    public bqgu(bqgt bqgt) {
        bmxy.m108581a(bqgt);
        this.f140634a = bqgt;
    }

    /* renamed from: a */
    public final void mo69254a(long j) {
        long j2 = this.f140638e;
        if (j > j2) {
            double d = this.f140637d;
            double d2 = this.f140636c;
            double d3 = this.f140635b;
            double d4 = (double) (j - j2);
            Double.isNaN(d4);
            this.f140635b = Math.min(d2, d3 + (d4 / d));
            this.f140638e = j;
        }
    }
}

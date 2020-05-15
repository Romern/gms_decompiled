package p000;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* renamed from: bmzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmzj implements Serializable, bmzi {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final bmzi f131263a;

    /* renamed from: b */
    final long f131264b;

    /* renamed from: c */
    volatile transient Object f131265c;

    /* renamed from: d */
    volatile transient long f131266d;

    public bmzj(bmzi bmzi, long j, TimeUnit timeUnit) {
        bmxy.m108581a(bmzi);
        this.f131263a = bmzi;
        this.f131264b = timeUnit.toNanos(j);
        bmxy.m108595a(j > 0, "duration (%s %s) must be > 0", j, timeUnit);
    }

    /* renamed from: a */
    public final Object mo6606a() {
        long j = this.f131266d;
        long a = bmxx.m108575a();
        if (j == 0 || a - j >= 0) {
            synchronized (this) {
                if (j == this.f131266d) {
                    Object a2 = this.f131263a.mo6606a();
                    this.f131265c = a2;
                    long j2 = a + this.f131264b;
                    if (j2 == 0) {
                        j2 = 1;
                    }
                    this.f131266d = j2;
                    return a2;
                }
            }
        }
        return this.f131265c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f131263a);
        long j = this.f131264b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
        sb.append("Suppliers.memoizeWithExpiration(");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(j);
        sb.append(", NANOS)");
        return sb.toString();
    }
}

package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: yfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class yfv implements yhg {
    /* renamed from: a */
    public static yfv m44005a(long j, long j2) {
        return new yfw(j, j2);
    }

    /* renamed from: d */
    public static yfv m44006d() {
        return m44005a(Long.MIN_VALUE, Long.MAX_VALUE);
    }

    /* renamed from: a */
    public abstract long mo30385a();

    /* renamed from: a */
    public final long mo30386a(TimeUnit timeUnit) {
        return yhf.m44093a(this, timeUnit);
    }

    /* renamed from: b */
    public abstract long mo30387b();

    /* renamed from: b */
    public final long mo30388b(TimeUnit timeUnit) {
        return yhf.m44095b(this, timeUnit);
    }

    /* renamed from: c */
    public final long mo30389c() {
        return yhf.m44092a(this);
    }
}

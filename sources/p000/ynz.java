package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: ynz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class ynz implements yhg {
    /* renamed from: a */
    static ynz m44470a(long j, long j2, int i) {
        return new ynp(j, j2, i);
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

    /* renamed from: d */
    public abstract int mo30631d();
}

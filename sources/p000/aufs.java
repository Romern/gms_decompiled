package p000;

import java.util.concurrent.TimeoutException;

/* renamed from: aufs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aufs {

    /* renamed from: a */
    public final boolean f91738a;

    /* renamed from: b */
    public final int f91739b;

    /* renamed from: c */
    public final Throwable f91740c;

    private aufs(boolean z, int i, Throwable th) {
        this.f91738a = z;
        this.f91739b = i;
        this.f91740c = th;
    }

    /* renamed from: a */
    public static aufs m76993a(int i) {
        return new aufs(true, i, null);
    }

    /* renamed from: a */
    public static aufs m76994a(int i, Throwable th) {
        bmxy.m108581a(th);
        return new aufs(false, i, th);
    }

    /* renamed from: a */
    public static aufs m76995a(Throwable th) {
        if (!(th instanceof TimeoutException)) {
            return m76994a(0, th);
        }
        if (th.getClass() != TimeoutException.class) {
            th = new TimeoutException(th.getMessage()).initCause(th);
        }
        return m76994a(9999, th);
    }
}

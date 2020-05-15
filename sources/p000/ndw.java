package p000;

import android.os.SystemClock;

/* renamed from: ndw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ndw implements sqv {

    /* renamed from: a */
    private static ndw f35371a;

    private ndw() {
    }

    /* renamed from: d */
    public static void m25994d() {
        if (f35371a == null) {
            f35371a = new ndw();
        }
    }

    /* renamed from: a */
    public final long mo20505a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public final long mo20506b() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public final long mo20507c() {
        return System.nanoTime();
    }
}

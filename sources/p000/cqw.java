package p000;

import android.os.Build;
import android.os.SystemClock;

/* renamed from: cqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cqw {

    /* renamed from: a */
    public static final double f11866a = (1.0d / Math.pow(10.0d, 6.0d));

    static {
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static long m7370a() {
        int i = Build.VERSION.SDK_INT;
        return SystemClock.elapsedRealtimeNanos();
    }
}

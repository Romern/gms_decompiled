package p000;

import android.os.Build;
import android.os.SystemClock;

/* renamed from: bgof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgof implements bgmk {
    /* renamed from: e */
    public static long m99492e() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    public final long mo62774a() {
        int i = Build.VERSION.SDK_INT;
        return SystemClock.elapsedRealtimeNanos();
    }

    /* renamed from: d */
    public final long mo62777d() {
        return m99492e();
    }

    /* renamed from: b */
    public final long mo62775b() {
        return System.currentTimeMillis();
    }

    /* renamed from: c */
    public final long mo62776c() {
        return SystemClock.elapsedRealtime();
    }
}

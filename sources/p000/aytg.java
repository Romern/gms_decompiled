package p000;

import android.os.Build;
import android.os.SystemClock;

/* renamed from: aytg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aytg implements ayte {

    /* renamed from: a */
    public static final /* synthetic */ int f98445a = 0;

    /* renamed from: a */
    public final long mo54417a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public final long mo54418b() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public final long mo54419c() {
        return SystemClock.uptimeMillis();
    }

    static {
        try {
            int i = Build.VERSION.SDK_INT;
            SystemClock.elapsedRealtimeNanos();
        } catch (Throwable th) {
        }
    }
}

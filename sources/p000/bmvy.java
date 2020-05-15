package p000;

import android.os.Build;
import android.os.SystemClock;

/* renamed from: bmvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmvy {

    /* renamed from: a */
    public static final bmzq f131119a;

    static {
        bmzq bmzq;
        try {
            int i = Build.VERSION.SDK_INT;
            SystemClock.elapsedRealtimeNanos();
            bmzq = new bmvw();
        } catch (Throwable th) {
            SystemClock.elapsedRealtime();
            bmzq = new bmvx();
        }
        f131119a = bmzq;
    }
}

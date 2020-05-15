package p000;

import android.os.SystemClock;

/* renamed from: ciur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciur {
    /* renamed from: a */
    public static boolean m151032a(Thread thread) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = 2000;
        boolean z = false;
        while (j > 0) {
            try {
                thread.join(j);
                break;
            } catch (InterruptedException e) {
                j = 2000 - (SystemClock.elapsedRealtime() - elapsedRealtime);
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return !thread.isAlive();
    }
}

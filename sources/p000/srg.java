package p000;

import android.os.Build;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: srg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class srg extends bmzq {
    /* renamed from: a */
    public final long mo15379a() {
        int i = Build.VERSION.SDK_INT;
        try {
            return SystemClock.elapsedRealtimeNanos();
        } catch (NoSuchMethodError e) {
            return TimeUnit.NANOSECONDS.convert(SystemClock.elapsedRealtime(), TimeUnit.MILLISECONDS);
        }
    }
}

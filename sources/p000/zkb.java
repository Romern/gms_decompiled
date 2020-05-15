package p000;

import android.location.Location;
import android.os.Build;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: zkb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zkb {
    /* renamed from: a */
    static long m45638a(Location location) {
        int i = Build.VERSION.SDK_INT;
        if (location.getElapsedRealtimeNanos() == 0) {
            return location.getTime();
        }
        return System.currentTimeMillis() - (SystemClock.elapsedRealtime() - TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos()));
    }
}

package p000;

import android.location.Location;
import android.os.Build;
import android.os.SystemClock;

/* renamed from: bfoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfoy {
    /* renamed from: a */
    public static final long m97457a(Location location) {
        int i = Build.VERSION.SDK_INT;
        long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
        long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
        return elapsedRealtimeNanos > elapsedRealtimeNanos2 ? elapsedRealtimeNanos2 : elapsedRealtimeNanos;
    }
}

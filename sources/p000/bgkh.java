package p000;

import android.location.Location;

/* renamed from: bgkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bgkh extends bgkx {
    /* renamed from: a */
    public final long mo62941a(Location location) {
        try {
            return location.getElapsedRealtimeNanos() / 1000000;
        } catch (NoSuchMethodError e) {
            return 0;
        }
    }
}

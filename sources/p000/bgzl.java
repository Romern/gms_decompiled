package p000;

import android.location.Location;

/* renamed from: bgzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgzl {
    /* renamed from: a */
    public static float m100452a(Location location, Location location2) {
        if (location2 == null || location == null || location.getAccuracy() <= 0.0f || location2.getAccuracy() <= 0.0f) {
            return 0.0f;
        }
        float accuracy = location.getAccuracy();
        float accuracy2 = location2.getAccuracy();
        return ((float) chcs.f188354a.mo6606a().mo85038a()) * ((float) Math.sqrt((double) ((accuracy * accuracy) + (accuracy2 * accuracy2))));
    }
}

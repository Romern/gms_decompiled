package p000;

import android.location.Location;

/* renamed from: bfkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfkm {
    /* renamed from: a */
    public static boolean m97133a(Location location) {
        return "gps".equals(location.getProvider()) && location.getExtras() != null && location.getExtras().getInt("SourceType") == 128;
    }
}

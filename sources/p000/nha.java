package p000;

import android.util.Log;

/* renamed from: nha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nha {
    /* renamed from: a */
    public static void m26243a(String str) {
        if (Log.isLoggable("BeaconBle", 5)) {
            Log.w("BeaconBle", str);
        }
    }

    /* renamed from: b */
    public static void m26245b(String str) {
        if (Log.isLoggable("BeaconBle", 4)) {
            Log.i("BeaconBle", str);
        }
    }

    /* renamed from: c */
    public static void m26246c(String str) {
        if (Log.isLoggable("BeaconBle", 6)) {
            Log.e("BeaconBle", str);
        }
    }

    /* renamed from: a */
    public static void m26244a(String str, Exception exc) {
        if (Log.isLoggable("BeaconBle", 6)) {
            Log.e("BeaconBle", str, exc);
        }
    }
}

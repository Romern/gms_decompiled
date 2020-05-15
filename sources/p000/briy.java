package p000;

import android.util.Log;

/* renamed from: briy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class briy {
    /* renamed from: a */
    public static void m114097a(String str) {
        if (m114098a(3)) {
            Log.d("FirebaseAppIndex", str);
        }
    }

    /* renamed from: b */
    public static void m114099b(String str) {
        if (m114098a(6)) {
            Log.e("FirebaseAppIndex", str);
        }
    }

    /* renamed from: a */
    public static boolean m114098a(int i) {
        if (!Log.isLoggable("FirebaseAppIndex", i)) {
            return Log.isLoggable("FirebaseAppIndex", i);
        }
        return true;
    }
}

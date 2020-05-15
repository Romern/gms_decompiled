package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;

/* renamed from: ifr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ifr {
    /* renamed from: a */
    public static boolean m15375a(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(0) != null;
    }

    /* renamed from: b */
    public static boolean m15376b(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (Build.VERSION.RELEASE != "7.1") {
            return ((ConnectivityManager) context.getSystemService("connectivity")).isTetheringSupported();
        }
        return false;
    }
}

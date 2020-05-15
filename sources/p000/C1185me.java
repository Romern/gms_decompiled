package p000;

import android.net.ConnectivityManager;
import android.os.Build;

/* renamed from: me */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1185me {
    /* renamed from: a */
    public static boolean m19630a(ConnectivityManager connectivityManager) {
        int i = Build.VERSION.SDK_INT;
        return connectivityManager.isActiveNetworkMetered();
    }
}

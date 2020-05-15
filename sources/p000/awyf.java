package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: awyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awyf {
    /* renamed from: a */
    public static boolean m81495a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }
}

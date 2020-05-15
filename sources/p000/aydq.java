package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;

/* renamed from: aydq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aydq {
    public aydq(Context context) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
    }
}

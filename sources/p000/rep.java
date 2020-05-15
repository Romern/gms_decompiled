package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;

/* renamed from: rep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rep {
    /* renamed from: a */
    public static boolean m33475a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected() && !C1185me.m19630a(connectivityManager);
    }

    /* renamed from: b */
    public static boolean m33476b(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return false;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        if (intExtra == 2 || intExtra == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m33477c(Context context) {
        int i = Build.VERSION.SDK_INT;
        return Settings.Global.getInt(context.getContentResolver(), "auto_time", 0) != 0;
    }
}

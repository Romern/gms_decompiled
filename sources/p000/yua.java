package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;

/* renamed from: yua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yua {
    static {
        zvt.m46581a();
    }

    /* renamed from: a */
    public static boolean m44836a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1;
    }

    /* renamed from: b */
    public static boolean m44837b(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || (activeNetworkInfo.getType() != 0 && activeNetworkInfo.getType() != 5 && activeNetworkInfo.getType() != 4)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m44838c(Context context) {
        Intent f = m44841f(context);
        int intExtra = f.getIntExtra("status", -1);
        if (!cdzm.f182081a.mo6606a().mo78620l()) {
            return intExtra == 2 || intExtra == 5;
        }
        return intExtra == 2 || intExtra == 5 || f.getIntExtra("plugged", -1) > 0;
    }

    /* renamed from: d */
    public static boolean m44839d(Context context) {
        Intent f = m44841f(context);
        int intExtra = f.getIntExtra("level", -1);
        int intExtra2 = f.getIntExtra("scale", -1);
        return (intExtra == -1 || intExtra2 == -1 || ((float) intExtra) / ((float) intExtra2) < 0.7f) ? false : true;
    }

    /* renamed from: e */
    public static boolean m44840e(Context context) {
        int i = Build.VERSION.SDK_INT;
        return ((PowerManager) context.getSystemService("power")).isDeviceIdleMode();
    }

    /* renamed from: f */
    private static Intent m44841f(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        bmxy.m108581a(registerReceiver);
        return registerReceiver;
    }
}

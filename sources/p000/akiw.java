package p000;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import com.google.android.chimera.Activity;

/* renamed from: akiw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akiw {
    /* renamed from: a */
    public static aucb m59861a(Activity activity) {
        WifiManager wifiManager = (WifiManager) activity.getApplicationContext().getSystemService("wifi");
        if (wifiManager.isWifiEnabled()) {
            return aucu.m76778a((Object) null);
        }
        if (cfov.m142053f()) {
            return aucu.m76780a(ahhr.m55807c(), new akiv(activity, wifiManager));
        }
        int i = Build.VERSION.SDK_INT;
        activity.startActivityForResult(new Intent("android.settings.panel.action.WIFI"), 1006);
        return aucu.m76778a((Object) null);
    }

    /* renamed from: b */
    public static boolean m59863b(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    /* renamed from: a */
    public static boolean m59862a(Context context) {
        return ((WifiManager) context.getApplicationContext().getSystemService("wifi")).isWifiEnabled();
    }
}

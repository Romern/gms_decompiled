package p000;

import android.app.BroadcastOptions;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;

/* renamed from: sse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sse {
    /* renamed from: a */
    public static void m36201a(PendingIntent pendingIntent, Context context, int i, Intent intent, PendingIntent.OnFinished onFinished) {
        m36202a(pendingIntent, context, i, intent, onFinished, null);
    }

    /* renamed from: b */
    public static boolean m36206b() {
        int i = Build.VERSION.SDK_INT;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            return defaultAdapter.isBleScanAlwaysAvailable();
        }
        return false;
    }

    /* renamed from: a */
    public static void m36202a(PendingIntent pendingIntent, Context context, int i, Intent intent, PendingIntent.OnFinished onFinished, String str) {
        Bundle bundle;
        int i2 = Build.VERSION.SDK_INT;
        if (cdjz.f181084a.mo6606a().mo77785n()) {
            BroadcastOptions makeBasic = BroadcastOptions.makeBasic();
            try {
                BroadcastOptions.class.getMethod("setDontSendToRestrictedApps", Boolean.TYPE).invoke(makeBasic, true);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                if (Log.isLoggable("LocationUtils", 6)) {
                    Log.e("LocationUtils", "Reflection error", e);
                }
            }
            bundle = makeBasic.toBundle();
        } else {
            bundle = null;
        }
        int i3 = Build.VERSION.SDK_INT;
        pendingIntent.send(context, i, intent, onFinished, null, str, bundle);
    }

    /* renamed from: b */
    public static boolean m36207b(Context context) {
        int i = Build.VERSION.SDK_INT;
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        if (wifiManager != null) {
            return wifiManager.isScanAlwaysAvailable();
        }
        return false;
    }

    /* renamed from: a */
    public static void m36203a(PendingIntent pendingIntent, Context context, Intent intent, PendingIntent.OnFinished onFinished, String str) {
        m36202a(pendingIntent, context, 0, intent, onFinished, str);
    }

    /* renamed from: a */
    public static boolean m36204a() {
        String displayName = Locale.getDefault().getDisplayName();
        if (TextUtils.isEmpty(displayName)) {
            return false;
        }
        byte directionality = Character.getDirectionality(displayName.charAt(0));
        if (directionality == 1 || directionality == 2 || directionality == 16 || directionality == 17) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m36205a(Context context) {
        int h = stu.m36322h();
        if (h == 8 || h == 13 || h == 10 || h == 11 || stn.m36304a("ro.boot.vr", "").equals("1") || ((cdlv.f181212a.mo6606a().mo77873a() && sre.m36085e(context)) || sre.m36080a(context) || sre.m36082b(context))) {
            return false;
        }
        return true;
    }
}

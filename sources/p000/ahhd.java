package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;

/* renamed from: ahhd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahhd {
    /* renamed from: a */
    public static void m55766a(Context context, BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null) {
            try {
                context.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
            }
        }
    }

    /* renamed from: a */
    public static void m55767a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        context.registerReceiver(broadcastReceiver, intentFilter, "com.google.android.gms.permission.INTERNAL_BROADCAST", new adzt(Looper.getMainLooper()));
    }

    /* renamed from: a */
    public static void m55768a(Context context, Intent intent) {
        context.sendBroadcast(intent.setPackage(context.getPackageName()), "com.google.android.gms.permission.INTERNAL_BROADCAST");
    }

    /* renamed from: a */
    public static void m55769a(Context context, String str) {
        m55768a(context, new Intent(str));
    }
}

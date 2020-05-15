package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;

/* renamed from: atxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atxn {
    /* renamed from: a */
    public static boolean m76506a(Context context, Intent intent) {
        return !TextUtils.isEmpty(m76507b(context, intent));
    }

    /* renamed from: b */
    public static String m76507b(Context context, Intent intent) {
        ActivityInfo resolveActivityInfo = intent.resolveActivityInfo(context.getPackageManager(), 0);
        return (resolveActivityInfo == null || !resolveActivityInfo.exported || !rfz.m33557a(context).mo24610b(resolveActivityInfo.applicationInfo.packageName)) ? "" : resolveActivityInfo.applicationInfo.packageName;
    }

    @Deprecated
    /* renamed from: c */
    public static void m76508c(Context context, Intent intent) {
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentServices(intent, 0)) {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            if (serviceInfo != null && serviceInfo.exported && rfz.m33557a(context).mo24610b(serviceInfo.packageName)) {
                ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                Intent intent2 = new Intent(intent);
                intent2.setComponent(componentName);
                context.startService(intent2);
            }
        }
    }

    /* renamed from: d */
    public static void m76509d(Context context, Intent intent) {
        PackageManager packageManager = context.getPackageManager();
        rfz a = rfz.m33557a(context);
        for (ResolveInfo resolveInfo : packageManager.queryBroadcastReceivers(intent, 0)) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo != null && activityInfo.exported && a.mo24610b(activityInfo.packageName)) {
                Intent intent2 = new Intent(intent);
                intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                context.sendBroadcast(intent2);
            }
        }
    }
}

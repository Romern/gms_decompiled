package com.google.android.gms.analytics;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ChimeraAnalyticsReceiver extends BroadcastReceiver {

    /* renamed from: b */
    private foa f9483b;

    public final void onReceive(Context context, Intent intent) {
        if (this.f9483b == null) {
            this.f9483b = new foa();
        }
        fnt a = fkm.m11883a(context).mo10957a();
        if (intent == null) {
            a.mo10940f("AnalyticsReceiver called with null intent");
            return;
        }
        String action = intent.getAction();
        a.mo10926a("Device AnalyticsReceiver got", action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            boolean a2 = foe.m12065a(context);
            Intent intent2 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent2.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
            intent2.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            synchronized (foa.f16995a) {
                context.startService(intent2);
                if (a2) {
                    try {
                        if (foa.f16996b == null) {
                            foa.f16996b = new asfb(context, 1, "Analytics WakeLock");
                            foa.f16996b.mo49115a(false);
                        }
                        foa.f16996b.mo49111a(1000);
                    } catch (SecurityException e) {
                        a.mo10940f("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
                    }
                }
            }
        }
    }
}

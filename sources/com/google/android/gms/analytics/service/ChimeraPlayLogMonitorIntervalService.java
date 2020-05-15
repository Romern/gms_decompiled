package com.google.android.gms.analytics.service;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChimeraPlayLogMonitorIntervalService extends IntentOperation {
    /* renamed from: a */
    public static void m6120a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, "com.google.android.gms.analytics.internal.PlayLogReportingService"));
        PendingIntent service = PendingIntent.getService(context, 0, intent, 0);
        skc skc = new skc(context);
        skc.mo25668a(service);
        skc.mo25671a("PlayLogMonitorIntervalService", 3, ((SystemClock.elapsedRealtime() / ((Long) fni.f16946x.mo11021a()).longValue()) + 1) * ((Long) fni.f16946x.mo11021a()).longValue(), ((Long) fni.f16946x.mo11021a()).longValue(), service, "com.google.android.gms");
    }

    public final void onHandleIntent(Intent intent) {
        m6120a(getBaseContext());
    }
}

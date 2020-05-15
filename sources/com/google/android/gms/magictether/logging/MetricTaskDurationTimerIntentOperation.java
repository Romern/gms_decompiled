package com.google.android.gms.magictether.logging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MetricTaskDurationTimerIntentOperation extends IntentOperation {

    /* renamed from: a */
    private final SharedPreferences f79830a = rpr.m34216b().getSharedPreferences("com.google.android.gms.magictether.logging.MetricTaskDurationTimer.PREFERENCE_FILE", 0);

    /* renamed from: a */
    private static Intent m67147a(Context context, String str, String str2, long j, String str3) {
        return IntentOperation.getStartIntent(context, MetricTaskDurationTimerIntentOperation.class, str).putExtra("EXTRA_METRIC_KEY", str2).putExtra("EXTRA_TIMESTAMP", j).putExtra("EXTRA_TASK_ID", str3);
    }

    /* renamed from: b */
    public static void m67151b(Context context, String str) {
        m67152b(context, str, null);
    }

    /* renamed from: c */
    public static void m67153c(Context context, String str, String str2) {
        context.startService(m67147a(context, "com.google.android.gms.magictether.logging.CLEAR_TIMER", str, -1, str2));
    }

    public final void onHandleIntent(Intent intent) {
        String stringExtra;
        if (cfcj.m138656c() && (stringExtra = intent.getStringExtra("EXTRA_METRIC_KEY")) != null) {
            String stringExtra2 = intent.getStringExtra("EXTRA_TASK_ID");
            if ("com.google.android.gms.magictether.logging.CLEAR_TIMER".equals(intent.getAction())) {
                m67150a(stringExtra, stringExtra2);
            }
            long longExtra = intent.getLongExtra("EXTRA_TIMESTAMP", -1);
            if (longExtra <= 0) {
                return;
            }
            if ("com.google.android.gms.magictether.logging.START_TIMER".equals(intent.getAction())) {
                if (stringExtra2 != null) {
                    stringExtra = stringExtra2.length() == 0 ? new String(stringExtra) : stringExtra.concat(stringExtra2);
                }
                this.f79830a.edit().putLong(stringExtra, longExtra).apply();
            } else if ("com.google.android.gms.magictether.logging.STOP_TIMER".equals(intent.getAction())) {
                long j = this.f79830a.getLong(stringExtra2 != null ? stringExtra2.length() == 0 ? new String(stringExtra) : stringExtra.concat(stringExtra2) : stringExtra, -1);
                if (j > 0) {
                    long j2 = longExtra - j;
                    afba a = afaz.m52798a();
                    if (cfcm.m138682b() && afba.f64112a.contains(stringExtra)) {
                        a.f64113b.mo24387e(stringExtra.concat("_ms")).mo24368a(j2);
                        a.f64113b.mo24388e();
                    }
                    m67150a(stringExtra, stringExtra2);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m67152b(Context context, String str, String str2) {
        context.startService(m67147a(context, "com.google.android.gms.magictether.logging.STOP_TIMER", str, SystemClock.elapsedRealtime(), str2));
    }

    /* renamed from: a */
    public static void m67148a(Context context, String str) {
        m67149a(context, str, (String) null);
    }

    /* renamed from: a */
    public static void m67149a(Context context, String str, String str2) {
        context.startService(m67147a(context, "com.google.android.gms.magictether.logging.START_TIMER", str, SystemClock.elapsedRealtime(), str2));
    }

    /* renamed from: a */
    private final void m67150a(String str, String str2) {
        if (str2 != null) {
            str = str2.length() == 0 ? new String(str) : str.concat(str2);
        }
        this.f79830a.edit().remove(str).apply();
    }
}

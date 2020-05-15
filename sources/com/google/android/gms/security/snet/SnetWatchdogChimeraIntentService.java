package com.google.android.gms.security.snet;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import android.util.EventLog;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.IntentOperation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SnetWatchdogChimeraIntentService extends IntentOperation {

    /* renamed from: a */
    public static final long f107595a = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: b */
    public static final long f107596b = TimeUnit.MINUTES.toMillis(10);

    /* renamed from: c */
    private static final String f107597c = SnetWatchdogChimeraIntentService.class.getSimpleName();

    /* renamed from: a */
    public static long m92438a(String str) {
        return "com.google.android.gms.security.snet.ACTION_IDLE_MODE".equals(str) ? f107596b : f107595a;
    }

    public final void onCreate() {
    }

    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("snet.watchdog.intent.extra.GMS_CORE_VERSION", -1);
            long longExtra = intent.getLongExtra("snet.watchdog.intent.extra.TIMEOUT", -1);
            String stringExtra = intent.getStringExtra("snet.watchdog.intent.extra.SESSION_UUID");
            String stringExtra2 = intent.getStringExtra("snet.watchdog.intent.extra.DEVICE_UUID");
            aqdu aqdu = new aqdu(this, intExtra);
            aqdu.f85799m = stringExtra;
            aqdu.f85800n = stringExtra2;
            if (!cgkt.m145944p() || !"com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR".equals(intent.getAction())) {
                stopService(apuh.m71021a(this, SnetLaunchChimeraIntentService.class));
                String valueOf = String.valueOf(getApplicationContext().getPackageName());
                String valueOf2 = String.valueOf(getString(C0126R.string.common_snet_process));
                String str = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
                ActivityManager activityManager = (ActivityManager) getSystemService("activity");
                if (activityManager != null) {
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                        if (str.equals(runningAppProcessInfo.processName)) {
                            m92442a(aqdu, longExtra);
                            Process.killProcess(runningAppProcessInfo.pid);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            stopService(apuh.m71021a(this, SnetLaunchInProcessChimeraIntentService.class));
            m92442a(aqdu, longExtra);
        }
    }

    /* renamed from: a */
    private static PendingIntent m92439a(Context context, int i, long j, String str, String str2, String str3) {
        Intent startIntent = IntentOperation.getStartIntent(context, SnetWatchdogChimeraIntentService.class, str3);
        startIntent.putExtra("snet.watchdog.intent.extra.GMS_CORE_VERSION", i);
        startIntent.putExtra("snet.watchdog.intent.extra.TIMEOUT", j);
        startIntent.putExtra("snet.watchdog.intent.extra.SESSION_UUID", str);
        startIntent.putExtra("snet.watchdog.intent.extra.DEVICE_UUID", str2);
        return PendingIntent.getService(context, 0, startIntent, 0);
    }

    /* renamed from: a */
    public static void m92440a(Context context, int i, String str, String str2, String str3) {
        skc skc = new skc(context);
        long a = m92438a(str3);
        long currentTimeMillis = System.currentTimeMillis();
        skc.mo25675a(f107597c, 0, currentTimeMillis + a, m92439a(context, i, a, str, str2, str3), "com.google.android.gms");
    }

    /* renamed from: a */
    public static void m92441a(Context context, String str) {
        if (str != null) {
            new skc(context).mo25668a(m92439a(context, -1, -1, "", "", str));
        }
    }

    /* renamed from: a */
    private static final void m92442a(aqdu aqdu, long j) {
        aqdu.f85788d = true;
        aqdu.f85792h = j;
        if (cgkt.m145943o()) {
            ArrayList<EventLog.Event> arrayList = new ArrayList();
            String str = null;
            try {
                EventLog.readEvents(new int[]{1397638484}, arrayList);
                String str2 = null;
                for (EventLog.Event event : arrayList) {
                    Object[] objArr = (Object[]) event.getData();
                    if (objArr.length == 3 && "do-not-log-execution-checkpoint-tag".equals(objArr[0])) {
                        str2 = (String) objArr[2];
                    }
                }
                str = str2;
            } catch (IOException | ClassCastException e) {
            }
            if (!TextUtils.isEmpty(str)) {
                aqdu.f85793i = str;
                EventLog.writeEvent(1397638484, "do-not-log-execution-checkpoint-tag", -1, "done");
            }
        }
        aqdu.mo47765a(4);
    }
}

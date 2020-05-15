package com.google.android.gms.security.snet;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SnetGcmSchedulerChimeraIntentService extends IntentOperation {
    static {
        SnetGcmSchedulerChimeraIntentService.class.getSimpleName();
    }

    /* renamed from: a */
    public static void m92426a(Context context) {
        context.startService(IntentOperation.getStartIntent(context, SnetGcmSchedulerChimeraIntentService.class, "com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR_RUN"));
    }

    /* renamed from: b */
    public static void m92427b(Context context) {
        context.startService(IntentOperation.getStartIntent(context, SnetGcmSchedulerChimeraIntentService.class, "com.google.android.gms.security.snet.ACTION_SET_EVENT_LOG_COLLECTOR_PERIOD"));
    }

    /* renamed from: c */
    public static void m92428c(Context context) {
        context.startService(IntentOperation.getStartIntent(context, SnetGcmSchedulerChimeraIntentService.class, "com.google.android.gms.security.snet.ACTION_IDLE_RUN"));
        if (cgkt.m145945q()) {
            context.startService(IntentOperation.getStartIntent(context, SnetDailyHygieneChimeraIntentService.class, "com.google.android.gms.security.snet.ACTION_CLEAN_PREFS"));
        }
    }

    /* renamed from: d */
    public static void m92429d(Context context) {
        context.startService(IntentOperation.getStartIntent(context, SnetGcmSchedulerChimeraIntentService.class, "com.google.android.gms.security.snet.ACTION_SET_IDLE_PERIOD"));
    }

    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR_RUN".equals(action)) {
                Intent a = apuh.m71021a(this, SnetChimeraService.class);
                a.setAction("com.google.android.gms.security.snet.ACTION_EVENT_LOG_COLLECTOR");
                startService(a);
            } else if ("com.google.android.gms.security.snet.ACTION_SET_EVENT_LOG_COLLECTOR_PERIOD".equals(action)) {
                apyk apyk = new apyk(this);
                long millis = TimeUnit.HOURS.toMillis(cgkt.f187180a.mo6606a().mo84040o());
                apyk.mo47701a("snet_saved_wake_interval_ms", millis);
                long j = millis / 1000;
                aebl aebl = new aebl();
                aebl.f63097i = apuh.m71023a(SnetNormalTaskChimeraService.class);
                aebl.f63099k = "event_log_collector_runner";
                aebl.f63102n = true;
                aebl.mo34027b(1);
                aebl.mo34024a(0, cdny.m134338c() ? 1 : 0);
                aebl.mo34023a(0);
                if (cdny.m134351p()) {
                    double h = cdnj.m134212h();
                    double d = (double) j;
                    Double.isNaN(d);
                    aebl.mo34008a(j, (long) (h * d), aebu.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
                } else {
                    aebl.f63070a = j;
                    aebl.f63071b = TimeUnit.MINUTES.toSeconds(cgkt.f187180a.mo6606a().mo84039n());
                }
                aeat a2 = aeat.m51532a(this);
                if (a2 != null) {
                    a2.mo33984a(aebl.mo33974b());
                }
            } else if ("com.google.android.gms.security.snet.ACTION_IDLE_RUN".equals(action)) {
                Intent a3 = apuh.m71021a(this, SnetChimeraService.class);
                a3.setAction("com.google.android.gms.security.snet.ACTION_IDLE_MODE");
                startService(a3);
            } else if ("com.google.android.gms.security.snet.ACTION_SET_IDLE_PERIOD".equals(action)) {
                long millis2 = TimeUnit.HOURS.toMillis(cgkt.f187180a.mo6606a().mo84046u());
                new apyk(this).mo47701a("snet_idle_mode_gcm_interval_ms", millis2);
                long j2 = millis2 / 1000;
                aebl aebl2 = new aebl();
                aebl2.f63097i = apuh.m71023a(SnetIdleTaskChimeraService.class);
                aebl2.f63099k = "snet_idle_runner";
                aebl2.f63102n = true;
                aebl2.mo34027b(1);
                aebl2.mo34023a(2);
                aebl2.mo34024a(1, 1);
                aebl2.mo34026a(true);
                if (cdny.m134351p()) {
                    aebl2.mo34009a(aebh.m51568a(j2));
                } else {
                    aebl2.f63070a = j2;
                }
                aebm a4 = aebl2.mo33974b();
                aeat a5 = aeat.m51532a(this);
                if (a5 != null) {
                    a5.mo33984a(a4);
                }
            }
        }
    }
}

package com.google.android.gms.security.snet;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SafeBrowsingUpdateChimeraIntentService extends IntentOperation {

    /* renamed from: a */
    public static final long f107556a = TimeUnit.HOURS.toMillis(20);

    /* renamed from: a */
    public static void m92411a(Context context) {
        context.startService(IntentOperation.getStartIntent(context, SafeBrowsingUpdateChimeraIntentService.class, "com.google.android.gms.security.snet.ACTION_XLB_UPDATE"));
    }

    /* renamed from: b */
    public static void m92412b(Context context) {
        context.startService(IntentOperation.getStartIntent(context, SafeBrowsingUpdateChimeraIntentService.class, "com.google.android.gms.security.snet.ACTION_SET_XLB_PERIODIC_UPDATE"));
    }

    /* renamed from: c */
    private static void m92413c(Context context) {
        apyk apyk = new apyk(context);
        if (System.currentTimeMillis() >= Math.max(apyk.mo47705c(), apyk.mo47704b() + f107556a)) {
            try {
                aucu.m76783a(apfp.m70157a(context).mo24701a((rpa) new apft()), 60, TimeUnit.SECONDS);
                aucu.m76783a(apfp.m70158b(context).mo24701a((rpa) new apfw()), 60, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
            } catch (Throwable th) {
                apfp.m70157a(context).mo24768v();
                throw th;
            }
            apfp.m70157a(context).mo24768v();
        }
    }

    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("com.google.android.gms.security.snet.ACTION_XLB_UPDATE".equals(action)) {
                m92413c(this);
            } else if ("com.google.android.gms.security.snet.ACTION_SET_XLB_PERIODIC_UPDATE".equals(action)) {
                long j = f107556a / 1000;
                aebl aebl = new aebl();
                aebl.f63097i = apuh.m71023a(SafeBrowsingUpdateTaskChimeraService.class);
                aebl.f63099k = "snet_safe_browsing_periodic_updater";
                aebl.f63102n = true;
                aebl.mo34027b(1);
                aebl.mo34023a(0);
                aebl.mo34024a(0, cdny.m134338c() ? 1 : 0);
                if (cdny.m134351p()) {
                    aebl.mo34009a(aebh.EVERY_20_HOURS);
                } else {
                    aebl.f63070a = j;
                }
                aeat a = aeat.m51532a(this);
                if (a != null) {
                    a.mo33984a(aebl.mo33974b());
                }
            }
        }
    }
}

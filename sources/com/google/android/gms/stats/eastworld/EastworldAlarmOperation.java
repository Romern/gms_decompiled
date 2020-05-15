package com.google.android.gms.stats.eastworld;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EastworldAlarmOperation extends IntentOperation {

    /* renamed from: a */
    qxq f108286a;

    /* renamed from: b */
    asfn f108287b;

    /* renamed from: c */
    private qws f108288c;

    /* renamed from: a */
    private final void m92990a(Context context, long j) {
        long b = cgtm.m147035b();
        new skc(context).mo25671a("EastworldAlarmOperation", 3, SystemClock.elapsedRealtime() + j, b, IntentOperation.getPendingIntent(context, EastworldAlarmOperation.class, new Intent("com.google.android.gms.stats.eastworld.action.EASTWORLD_ALARM"), 0, 134217728), "com.google.android.gms");
        this.f108286a.mo24383c("EastworldPeriodicAlarmSetup").mo24359a();
        this.f108286a.mo24388e();
    }

    public final void onCreate() {
        this.f108288c = new qws(this, null, null);
        this.f108286a = new qxq(this.f108288c, "PLATFORM_STATS_COUNTERS", 1024);
        this.f108287b = asfn.m73971a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [rpr, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    public final void onHandleIntent(Intent intent) {
        rpr b = rpr.m34216b();
        this.f108286a.mo24383c("EastworldPeridicAlarmFire").mo24359a();
        if (!cgsa.m146806b() && !ashd.m74118a()) {
            this.f108286a.mo24383c("CancellNonDeviceOwnerTasksForEastworldAlarmOperation").mo24359a();
            this.f108286a.mo24388e();
        } else if (!cgtm.f187746a.mo6606a().mo84488b()) {
            this.f108286a.mo24383c("EastworldNotEnable").mo24359a();
            this.f108286a.mo24388e();
            m92990a(b, cgtd.m146971c());
        } else if (m92991a(this.f108286a)) {
            rpr b2 = rpr.m34216b();
            spn.m35856a((Context) b2, "com.google.android.gms.stats.eastworld.EastworldService", true);
            Intent intent2 = new Intent();
            intent2.setClassName(b2, "com.google.android.gms.stats.eastworld.EastworldService");
            b2.startService(intent2);
            this.f108286a.mo24383c("EastworldChimeraServiceStart").mo24359a();
            if (ashd.m74118a()) {
                long currentTimeMillis = System.currentTimeMillis();
                long b3 = cgtm.m147035b();
                long a = asfq.m73985a(b);
                Calendar instance = Calendar.getInstance();
                instance.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
                instance.set(11, 0);
                instance.set(12, 0);
                instance.set(13, 0);
                instance.set(14, 0);
                instance.add(5, 1);
                m92990a(b, ((instance.getTimeInMillis() + a) - currentTimeMillis) % b3);
                if (!intent.getBooleanExtra("extra_for_init_intent", false)) {
                    this.f108287b.mo49132a(intent);
                }
                this.f108286a.mo24388e();
            }
        } else {
            this.f108286a.mo24383c("EastworldNotOptIn").mo24359a();
            this.f108286a.mo24388e();
            m92990a(b, cgtd.m146971c());
        }
    }

    /* renamed from: a */
    public static boolean m92991a(qxq qxq) {
        if (cgtv.m147055b()) {
            aucb k = avtz.m79336a(rpr.m34216b(), new avty()).mo24755k("EASTWORLD_STATS");
            try {
                aucu.m76783a(k, 10000, TimeUnit.MILLISECONDS);
            } catch (ExecutionException | TimeoutException e) {
                qxq.mo24383c("ConsentApiEastworldFailure").mo24359a();
            } catch (InterruptedException e2) {
                qxq.mo24383c("ConsentApiEastworldFailure").mo24359a();
                Thread.currentThread().interrupt();
            }
            return k.mo50384b() && k.mo50386d() != null && ((Boolean) k.mo50386d()).booleanValue();
        }
        boolean b = cgsu.m146907b();
        rpr b2 = rpr.m34216b();
        new aseq();
        List a = aseq.m73886a(b2);
        boolean c = ashd.m74124c();
        return b || (!a.isEmpty() && (!cgsl.m146894b() || c)) || c;
    }
}

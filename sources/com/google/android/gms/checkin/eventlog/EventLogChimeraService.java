package com.google.android.gms.checkin.eventlog;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.DropBoxManager;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EventLogChimeraService extends aeah {

    /* renamed from: a */
    private static final sek f29951a = qgn.m32143a("EventLogChimeraService");

    /* renamed from: b */
    private static final qeq f29952b = new qeq();

    /* renamed from: a */
    private static long m22375a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getLong(str, 0);
        } catch (ClassCastException | NumberFormatException e) {
            f29951a.mo25418e(str.length() == 0 ? new String("Non-long value in sharedPrefs. key: ") : "Non-long value in sharedPrefs. key: ".concat(str), new Object[0]);
            return 0;
        }
    }

    /* renamed from: b */
    private static boolean m22380b(Context context) {
        boolean z;
        try {
            z = ((rkj) aucu.m76783a(avtz.m79338b(context).mo24673E(), 5, TimeUnit.SECONDS)).mo24824r();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            f29951a.mo25412b("Unable to get opted in result. Defaults to false", new Object[0]);
            z = false;
        }
        f29951a.mo25414c("Opted in for usage reporting: %s", Boolean.valueOf(z));
        return z;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return 1;
        }
        if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction()) || "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(intent.getAction())) {
            return super.onStartCommand(intent, i, i2);
        }
        return 1;
    }

    /* renamed from: a */
    public static void m22376a(Context context, boolean z) {
        if (!soz.m35811h(context)) {
            f29951a.mo25414c("Event logging disabled. Logs will not be captured for imminent checkin.", new Object[0]);
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("EventLogChimeraService", 0);
        DropBoxManager dropBoxManager = (DropBoxManager) context.getSystemService("dropbox");
        synchronized (f29952b) {
            long a = m22375a(sharedPreferences, "lastLog");
            sek sek = f29951a;
            StringBuilder sb = new StringBuilder(44);
            sb.append("Accumulating logs since ");
            sb.append(a);
            sek.mo25414c(sb.toString(), new Object[0]);
            try {
                sharedPreferences.edit().putLong("lastLog", f29952b.mo23990a(new qws(context, "ANDROID_CHECKIN_EVENT_LOG", null), context, a, -1, dropBoxManager, z)).apply();
            } catch (IOException e) {
                f29951a.mo25417e("Can't capture logs", e, new Object[0]);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.checkin.eventlog.EventLogChimeraService.a(boolean, android.content.Context):void
     arg types: [int, android.content.Context]
     candidates:
      com.google.android.gms.checkin.eventlog.EventLogChimeraService.a(android.content.SharedPreferences, java.lang.String):long
      com.google.android.gms.checkin.eventlog.EventLogChimeraService.a(android.content.Context, boolean):void
      com.google.android.gms.checkin.eventlog.EventLogChimeraService.a(android.content.SharedPreferences, android.content.Context):void
      aeah.a(aecc, aebu):bqgg
      aebd.a(aecc, aebu):bqgg
      com.google.android.gms.checkin.eventlog.EventLogChimeraService.a(boolean, android.content.Context):void */
    /* renamed from: a */
    public static void m22377a(SharedPreferences sharedPreferences, Context context) {
        long j = sharedPreferences.getLong("aggregation_interval", 0);
        long j2 = sharedPreferences.getLong("aggregation_flex", 0);
        long d = cdci.m132538d();
        long c = cdci.m132537c();
        if (j != d || j2 != c) {
            m22378a(true, context);
        }
    }

    /* renamed from: a */
    public static void m22378a(boolean z, Context context) {
        if (!soz.m35811h(context)) {
            f29951a.mo25414c("Event logging disabled. Aggregation task is not created.", new Object[0]);
            return;
        }
        long d = cdci.m132538d();
        long c = cdci.m132537c();
        SharedPreferences.Editor edit = qdn.m31960l(context).edit();
        edit.putLong("aggregation_interval", d);
        edit.putLong("aggregation_flex", c);
        edit.apply();
        aebl aebl = new aebl();
        aebl.f63099k = "AggregationTaskTag";
        aebl.mo34029b(z);
        aebl.f63097i = "com.google.android.gms.checkin.EventLogService";
        aebl.f63102n = true;
        aebl.mo34028b(2, 2);
        aebl.mo34024a(0, 0);
        aebl.mo34026a(false);
        aebl.f63070a = d;
        aebl.f63071b = c;
        aeat.m51532a(context).mo33984a(aebl.mo33974b());
    }

    /* renamed from: a */
    public static boolean m22379a(Context context) {
        if (m22380b(context)) {
            return true;
        }
        String a = aymn.m84264a(context.getContentResolver(), "checkin_optedin_for_usage_reporting");
        if (a == null || !aymn.f97982c.matcher(a).matches()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        if (!soz.m35811h(this)) {
            f29951a.mo25414c("Event logging disabled. Aggregation will not run and aggregation task would be stopped.", new Object[0]);
            aeat.m51532a(this).mo33986a("AggregationTaskTag", "com.google.android.gms.checkin.EventLogService");
            return 0;
        }
        ContentResolver contentResolver = getContentResolver();
        SharedPreferences sharedPreferences = getSharedPreferences("EventLogChimeraService", 0);
        DropBoxManager dropBoxManager = (DropBoxManager) getSystemService("dropbox");
        boolean a = m22379a(this);
        synchronized (f29952b) {
            long a2 = m22375a(sharedPreferences, "lastLog");
            long a3 = m22375a(sharedPreferences, "lastData");
            try {
                sek sek = f29951a;
                StringBuilder sb = new StringBuilder(70);
                sb.append("Aggregate from ");
                sb.append(a2);
                sb.append(" (log), ");
                sb.append(a3);
                sb.append(" (data)");
                sek.mo25414c(sb.toString(), new Object[0]);
                long a4 = f29952b.mo23990a(new qws(this, "ANDROID_CHECKIN_EVENT_LOG", null), this, a2, a3, dropBoxManager, a);
                sharedPreferences.edit().putLong("lastLog", a4).putLong("lastData", a4).apply();
            } catch (IOException e) {
                f29951a.mo25417e("Can't aggregate logs", e, new Object[0]);
            }
        }
        synchronized (qes.class) {
            qes.m32028a(qer.m32027a(aymn.m84266a(contentResolver, "dumpsys:"), "dumpsys:", a, aymn.m84264a(contentResolver, "checkin_dumpsys_whitelist")), dropBoxManager, getFileStreamPath("dump.tmp"));
        }
        return 0;
    }
}

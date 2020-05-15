package com.google.android.gms.backup.transport.component;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.provider.Settings;
import com.google.android.chimera.JobService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MmsBackupSchedulerChimeraService extends JobService {

    /* renamed from: a */
    public static final lvn f29230a = new lvn("MmsBackupScheduler");

    /* renamed from: b */
    private final bqgj f29231b = new soc(1, 10);

    /* renamed from: c */
    private boolean f29232c = true;

    /* renamed from: d */
    private mbx f29233d;

    /* renamed from: a */
    public static void m22015a(Context context) {
        int i;
        int i2;
        boolean z;
        nam c = m22017c(context);
        int i3 = Build.VERSION.SDK_INT;
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.backup.component.MmsBackupSchedulerService");
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService == null || resolveService.serviceInfo == null || !JobService.PERMISSION_BIND.equals(resolveService.serviceInfo.permission)) {
            f29230a.mo25409a("Ineligible, not scheduling.", new Object[0]);
            return;
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        JobInfo.Builder requiresDeviceIdle = new JobInfo.Builder(2, new ComponentName(context, "com.google.android.gms.backup.component.MmsBackupSchedulerService")).setMinimumLatency(TimeUnit.MINUTES.toMillis(ccls.m130532k())).setRequiresCharging(ccls.m130533l()).setRequiresDeviceIdle(ccls.m130534m());
        if (!m22016b(context)) {
            i = 3;
        } else {
            i = 2;
        }
        try {
            i2 = jobScheduler.schedule(requiresDeviceIdle.setRequiredNetworkType(i).build());
        } catch (Exception e) {
            f29230a.mo25417e("", e, new Object[0]);
            mab.m24748a(context, e, ccnf.m130739h());
            i2 = 0;
        }
        if (i2 == 1) {
            f29230a.mo25409a("Scheduled task to run in %d minutes, while idle: %b, require charging: %b, require wifi: %b", Long.valueOf(ccls.m130532k()), Boolean.valueOf(ccls.m130534m()), Boolean.valueOf(ccls.m130533l()), Boolean.valueOf(m22016b(context)));
        } else {
            f29230a.mo25409a("Error scheduling job.", new Object[0]);
        }
        boolean b = m22016b(context);
        if (i2 == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean m = ccls.m130534m();
        boolean l = ccls.m130533l();
        long k = ccls.m130532k();
        bxvd a = lyu.m24685a();
        bxvd da = msb.f34514h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        msb msb = (msb) da.f164949b;
        int i4 = msb.f34516a | 1;
        msb.f34516a = i4;
        msb.f34517b = true;
        int i5 = 2 | i4;
        msb.f34516a = i5;
        msb.f34518c = b;
        int i6 = i5 | 4;
        msb.f34516a = i6;
        msb.f34519d = m;
        int i7 = i6 | 8;
        msb.f34516a = i7;
        msb.f34520e = l;
        int i8 = i7 | 16;
        msb.f34516a = i8;
        msb.f34521f = k;
        msb.f34516a = i8 | 32;
        msb.f34522g = z;
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        mqk mqk = (mqk) a.f164949b;
        msb msb2 = (msb) da.mo74062i();
        mqk mqk2 = mqk.f34276G;
        msb2.getClass();
        mqk.f34278A = msb2;
        mqk.f34285b |= 16;
        c.mo20411a((mqk) a.mo74062i(), mqj.MMS_BACKUP_SCHEDULE);
    }

    /* renamed from: b */
    public static boolean m22016b(Context context) {
        boolean z = new rtj(context, "g1_shared_prefs", true).getBoolean("use_mobile_data_for_mms", false);
        if (ccls.f179387a.mo6606a().mo76321B() || !z) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static nam m22017c(Context context) {
        return new nam(new qws(context, "ANDROID_BACKUP", null));
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        f29230a.mo25409a("Hooray! Backup Mms time!", new Object[0]);
        nam c = m22017c(this);
        long j = 0;
        if (ccls.m130541t()) {
            lvt lvt = lvt.f33072a;
            long j2 = Settings.Secure.getLong(getContentResolver(), "scheduled_mms_backup_last_requested", 0);
            if (j2 > 0) {
                j = System.currentTimeMillis() - j2;
            }
            Settings.Secure.putLong(getContentResolver(), "scheduled_mms_backup_last_requested", System.currentTimeMillis());
        }
        if (this.f29233d == null) {
            this.f29233d = new mbx(this);
        }
        this.f29233d.mo19825a(2, j / 1000);
        this.f29231b.execute(new nal(this, c, jobParameters));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return this.f29232c;
    }
}

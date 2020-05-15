package com.google.android.gms.backup.transport.component;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.UserHandle;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.JobService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GmsBackupSchedulerChimeraService extends JobService {

    /* renamed from: a */
    public static final lvn f29226a = new lvn("GmsBackupScheduler");

    /* renamed from: b */
    private final bqgj f29227b = new soc(1, 10);

    /* renamed from: c */
    private boolean f29228c = true;

    /* renamed from: a */
    public static void m22012a(Context context) {
        int i;
        int i2;
        boolean z;
        nak c = m22014c(context);
        if (!ccli.m130405e()) {
            f29226a.mo25409a("Disabled, not scheduling.", new Object[0]);
            bxvd a = lyu.m24685a();
            bxvd da = mrq.f34472h.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mrq mrq = (mrq) da.f164949b;
            mrq.f34474a = 1 | mrq.f34474a;
            mrq.f34475b = false;
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            mqk mqk = (mqk) a.f164949b;
            mrq mrq2 = (mrq) da.mo74062i();
            mqk mqk2 = mqk.f34276G;
            mrq2.getClass();
            mqk.f34307x = mrq2;
            mqk.f34284a |= JGCastService.FLAG_PRIVATE_DISPLAY;
            c.mo20409a((mqk) a.mo74062i(), mqj.GMS_BACKUP_SCHEDULE);
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.backup.component.GmsBackupSchedulerService");
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService == null || resolveService.serviceInfo == null || !JobService.PERMISSION_BIND.equals(resolveService.serviceInfo.permission)) {
            f29226a.mo25409a("Ineligible, not scheduling.", new Object[0]);
            return;
        }
        JobInfo.Builder requiresDeviceIdle = new JobInfo.Builder(1, new ComponentName(context, "com.google.android.gms.backup.component.GmsBackupSchedulerService")).setMinimumLatency(TimeUnit.MINUTES.toMillis(ccli.m130402b())).setRequiresCharging(ccli.m130407g()).setRequiresDeviceIdle(ccli.m130403c());
        if (!m22013b(context)) {
            i = 3;
        } else {
            i = 2;
        }
        JobInfo build = requiresDeviceIdle.setRequiredNetworkType(i).build();
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        try {
            if (!ccnu.f179578a.mo6606a().mo76498h()) {
                i2 = jobScheduler.schedule(build);
            } else {
                i2 = jobScheduler.scheduleAsPackage(build, "com.google.android.gms.backup", UserHandle.myUserId(), "GmsBackupSchedulerChimeraService");
            }
        } catch (Exception e) {
            f29226a.mo25417e("", e, new Object[0]);
            mab.m24748a(context, e, ccnf.m130739h());
            i2 = 0;
        }
        if (i2 == 1) {
            f29226a.mo25409a("Scheduled task to run in %d minutes, while idle: %b, require charging: %b, require wifi: %b", Long.valueOf(ccli.m130402b()), Boolean.valueOf(ccli.m130403c()), Boolean.valueOf(ccli.m130407g()), Boolean.valueOf(m22013b(context)));
        } else {
            f29226a.mo25409a("Error scheduling job.", new Object[0]);
        }
        boolean b = m22013b(context);
        if (i2 == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean c2 = ccli.m130403c();
        boolean g = ccli.m130407g();
        long b2 = ccli.m130402b();
        bxvd a2 = lyu.m24685a();
        bxvd da2 = mrq.f34472h.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        mrq mrq3 = (mrq) da2.f164949b;
        int i4 = mrq3.f34474a | 1;
        mrq3.f34474a = i4;
        mrq3.f34475b = true;
        int i5 = i4 | 2;
        mrq3.f34474a = i5;
        mrq3.f34476c = b;
        int i6 = i5 | 4;
        mrq3.f34474a = i6;
        mrq3.f34477d = c2;
        int i7 = i6 | 8;
        mrq3.f34474a = i7;
        mrq3.f34478e = g;
        int i8 = i7 | 16;
        mrq3.f34474a = i8;
        mrq3.f34479f = b2;
        mrq3.f34474a = i8 | 32;
        mrq3.f34480g = z;
        if (a2.f164950c) {
            a2.mo74035c();
            a2.f164950c = false;
        }
        mqk mqk3 = (mqk) a2.f164949b;
        mrq mrq4 = (mrq) da2.mo74062i();
        mqk mqk4 = mqk.f34276G;
        mrq4.getClass();
        mqk3.f34307x = mrq4;
        mqk3.f34284a |= JGCastService.FLAG_PRIVATE_DISPLAY;
        c.mo20409a((mqk) a2.mo74062i(), mqj.GMS_BACKUP_SCHEDULE);
    }

    /* renamed from: b */
    public static boolean m22013b(Context context) {
        if (new rtj(context, "backup_settings", true).getBoolean("use_mobile_data", false) || !ccli.f179330a.mo6606a().mo76279l()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static nak m22014c(Context context) {
        return new nak(new qws(context, "ANDROID_BACKUP", null));
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        f29226a.mo25414c("Hooray! Backup time!", new Object[0]);
        nak c = m22014c(this);
        if (!ccli.m130405e()) {
            f29226a.mo25416d("Disabled, not running and cancelling future jobs.", new Object[0]);
            bxvd a = lyu.m24685a();
            bxvd da = mrp.f34462i.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mrp mrp = (mrp) da.f164949b;
            mrp.f34464a |= 1;
            mrp.f34465b = false;
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            mqk mqk = (mqk) a.f164949b;
            mrp mrp2 = (mrp) da.mo74062i();
            mqk mqk2 = mqk.f34276G;
            mrp2.getClass();
            mqk.f34308y = mrp2;
            mqk.f34284a |= Integer.MIN_VALUE;
            c.mo20409a((mqk) a.mo74062i(), mqj.GMS_BACKUP_RUN);
            this.f29228c = false;
            ((JobScheduler) getSystemService("jobscheduler")).cancel(1);
            return false;
        } else if (!new lvp(this).mo19644b()) {
            f29226a.mo25416d("Backup is disabled, not running.", new Object[0]);
            bxvd a2 = lyu.m24685a();
            bxvd da2 = mrp.f34462i.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            mrp mrp3 = (mrp) da2.f164949b;
            int i = mrp3.f34464a | 1;
            mrp3.f34464a = i;
            mrp3.f34465b = true;
            mrp3.f34464a = i | 2;
            mrp3.f34466c = false;
            if (a2.f164950c) {
                a2.mo74035c();
                a2.f164950c = false;
            }
            mqk mqk3 = (mqk) a2.f164949b;
            mrp mrp4 = (mrp) da2.mo74062i();
            mqk mqk4 = mqk.f34276G;
            mrp4.getClass();
            mqk3.f34308y = mrp4;
            mqk3.f34284a |= Integer.MIN_VALUE;
            c.mo20409a((mqk) a2.mo74062i(), mqj.GMS_BACKUP_RUN);
            return false;
        } else {
            if (ccli.f179330a.mo6606a().mo76274g() > 0) {
                int i2 = Build.VERSION.SDK_INT;
            }
            this.f29227b.execute(new naj(this, c, jobParameters));
            return true;
        }
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return this.f29228c;
    }
}

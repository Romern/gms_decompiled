package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: adzi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adzi {

    /* renamed from: b */
    private static final Method f62958b;

    /* renamed from: c */
    private static final Method f62959c;

    /* renamed from: a */
    private final JobScheduler f62960a;

    public adzi(JobScheduler jobScheduler) {
        this.f62960a = jobScheduler;
    }

    /* renamed from: a */
    public static void m51464a(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (f62958b == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            jobScheduler.schedule(jobInfo);
            return;
        }
        adzi adzi = new adzi(jobScheduler);
        Method method = f62959c;
        int i = 0;
        if (method != null) {
            try {
                i = ((Integer) method.invoke(null, new Object[0])).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                }
            }
        }
        adzi.mo33953a(jobInfo, str, i, str2);
    }

    static {
        Method method;
        int i = Build.VERSION.SDK_INT;
        Method method2 = null;
        try {
            method = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException e) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
                method = null;
            } else {
                method = null;
            }
        }
        f62958b = method;
        int i2 = Build.VERSION.SDK_INT;
        try {
            method2 = UserHandle.class.getDeclaredMethod("myUserId", null);
        } catch (NoSuchMethodException e2) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
            }
        }
        f62959c = method2;
    }

    /* renamed from: a */
    public final int mo33953a(JobInfo jobInfo, String str, int i, String str2) {
        Method method = f62958b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f62960a, jobInfo, str, Integer.valueOf(i), str2)).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.e(str2, "error calling scheduleAsPackage", e);
            }
        }
        return this.f62960a.schedule(jobInfo);
    }

    /* renamed from: a */
    public final List mo33954a() {
        return this.f62960a.getAllPendingJobs();
    }

    /* renamed from: a */
    public final void mo33955a(int i) {
        this.f62960a.cancel(i);
    }
}

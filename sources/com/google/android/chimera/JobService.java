package com.google.android.chimera;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class JobService extends Service {
    public static final String PERMISSION_BIND = "android.permission.BIND_JOB_SERVICE";

    /* renamed from: a */
    private dem f7638a;

    public final void jobFinished(JobParameters jobParameters, boolean z) {
        this.f7638a.jobFinished(jobParameters, z);
    }

    public final IBinder onBind(Intent intent) {
        return this.f7638a.onBind(intent);
    }

    public abstract boolean onStartJob(JobParameters jobParameters);

    public abstract boolean onStopJob(JobParameters jobParameters);

    public void setProxy(Service service, Context context) {
        super.setProxy(service, context);
        dem dem = new dem(this);
        this.f7638a = dem;
        dem.attachBaseContext(context);
    }
}

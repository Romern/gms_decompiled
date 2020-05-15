package p000;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;

/* renamed from: dem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dem extends JobService {

    /* renamed from: a */
    final /* synthetic */ com.google.android.chimera.JobService f12979a;

    public dem(com.google.android.chimera.JobService jobService) {
        this.f12979a = jobService;
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        return this.f12979a.onStartJob(jobParameters);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return this.f12979a.onStopJob(jobParameters);
    }
}

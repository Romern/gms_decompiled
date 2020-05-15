package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class JobInfoSchedulerService extends JobService {
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        ejc.m10524a(getApplicationContext());
        eja d = ejb.m10519d();
        d.mo10190a(string);
        d.mo10189a(emj.m10667a(i));
        if (string2 != null) {
            d.f15114a = Base64.decode(string2, 0);
        }
        ejc.m10523a().f15118a.mo10238a(d.mo10188a(), i2, new ekc(this, jobParameters));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

package com.google.android.gms.scheduler;

import android.app.job.JobParameters;
import android.util.Log;
import com.google.android.chimera.JobService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TaskExecutionChimeraService extends JobService {
    public final boolean onStartJob(JobParameters jobParameters) {
        apjy apjy = apht.m70315a().f84402b;
        if (apjy == null) {
            Log.w("NetworkScheduler", String.format("Dropping incoming job (jid=%d) because JobServiceRegistry is null", Integer.valueOf(jobParameters.getJobId())));
            return false;
        }
        apjy.f84580e.execute(new apjt(apjy, this, jobParameters));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        apjy apjy = apht.m70315a().f84402b;
        if (apjy == null) {
            return false;
        }
        apjy.f84580e.execute(new apju(apjy, jobParameters));
        return true;
    }
}

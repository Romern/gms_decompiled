package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AppMeasurementJobService extends JobService implements aglr {

    /* renamed from: a */
    private agls f80085a;

    /* renamed from: a */
    private final agls m67248a() {
        if (this.f80085a == null) {
            this.f80085a = new agls(this);
        }
        return this.f80085a;
    }

    /* renamed from: a */
    public final void mo35632a(Intent intent) {
    }

    public final void onCreate() {
        super.onCreate();
        m67248a().mo35635a();
    }

    public final void onDestroy() {
        m67248a().mo35638b();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        m67248a().mo35639b(intent);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        agls a = m67248a();
        agje a2 = agje.m54353a(a.f65902a);
        agid E = a2.mo35497E();
        String string = jobParameters.getExtras().getString("action");
        if (a2.f65690f.f65291a) {
            E.f65572k.mo35436a("Device PackageMeasurementJobService called. action", string);
        } else {
            E.f65572k.mo35436a("Local AppMeasurementJobService called. action", string);
        }
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        a.mo35637a(new aglp(a, E, jobParameters));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        m67248a().mo35641c(intent);
        return true;
    }

    /* renamed from: a */
    public final void mo35631a(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    /* renamed from: a */
    public final boolean mo35633a(int i) {
        throw new UnsupportedOperationException();
    }
}

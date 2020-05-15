package p000;

import android.app.job.JobParameters;

/* renamed from: aglp */
public final /* synthetic */ class aglp implements Runnable {

    /* renamed from: a */
    private final agls f65897a;

    /* renamed from: b */
    private final agid f65898b;

    /* renamed from: c */
    private final JobParameters f65899c;

    public aglp(agls agls, agid agid, JobParameters jobParameters) {
        this.f65897a = agls;
        this.f65898b = agid;
        this.f65899c = jobParameters;
    }

    public final void run() {
        agls agls = this.f65897a;
        agid agid = this.f65898b;
        JobParameters jobParameters = this.f65899c;
        agid.f65572k.mo35435a("AppMeasurementJobService processed last upload request.");
        ((aglr) agls.f65902a).mo35631a(jobParameters);
    }
}

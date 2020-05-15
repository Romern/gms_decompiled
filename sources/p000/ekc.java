package p000;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

/* renamed from: ekc */
public final /* synthetic */ class ekc implements Runnable {

    /* renamed from: a */
    private final JobInfoSchedulerService f15172a;

    /* renamed from: b */
    private final JobParameters f15173b;

    public ekc(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f15172a = jobInfoSchedulerService;
        this.f15173b = jobParameters;
    }

    public final void run() {
        this.f15172a.jobFinished(this.f15173b, false);
    }
}

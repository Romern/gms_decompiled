package p000;

import android.app.job.JobParameters;
import android.util.Log;

/* renamed from: apju */
public final /* synthetic */ class apju implements Runnable {

    /* renamed from: a */
    private final apjy f84564a;

    /* renamed from: b */
    private final JobParameters f84565b;

    public apju(apjy apjy, JobParameters jobParameters) {
        this.f84564a = apjy;
        this.f84565b = jobParameters;
    }

    public final void run() {
        apjy apjy = this.f84564a;
        JobParameters jobParameters = this.f84565b;
        int jobId = jobParameters.getJobId();
        StringBuilder sb = new StringBuilder(38);
        sb.append("nts:jobscheduler:onStopJob:");
        sb.append(jobId);
        aech aech = new aech(sb.toString());
        try {
            synchronized (apjy.f84576a) {
                aeco a = apjy.m70501a(jobParameters);
                if (a == null) {
                    apjy.f84577b.mo33955a(jobParameters.getJobId());
                } else {
                    apid c = apjy.f84576a.mo47349c(a);
                    if (c == null) {
                        int jobId2 = jobParameters.getJobId();
                        StringBuilder sb2 = new StringBuilder(63);
                        sb2.append("Received onStopJob for unknown task (jid=");
                        sb2.append(jobId2);
                        sb2.append("), ignoring");
                        Log.w("NetworkScheduler", sb2.toString());
                        apjy.f84577b.mo33955a(jobParameters.getJobId());
                    } else {
                        apjx apjx = (apjx) apjy.f84582g.get(c);
                        if (apjx == null) {
                            int jobId3 = jobParameters.getJobId();
                            StringBuilder sb3 = new StringBuilder(65);
                            sb3.append("Received onStopJob for untracked task (jid=");
                            sb3.append(jobId3);
                            sb3.append("), ignoring");
                            Log.w("NetworkScheduler", sb3.toString());
                            apjy.f84577b.mo33955a(jobParameters.getJobId());
                        } else if (!c.f84446p) {
                            apjy.f84579d.mo47246a(c, 3);
                            if (apjy.f84578c.mo47341a(apjx.f84575c, 4)) {
                                apjy.f84582g.remove(c);
                            } else {
                                apjx.f84573a = false;
                            }
                        }
                    }
                }
            }
            aech.close();
        } catch (Throwable th) {
            try {
                aech.close();
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
            throw th;
        }
    }
}

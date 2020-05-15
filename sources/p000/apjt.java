package p000;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.scheduler.TaskExecutionChimeraService;

/* renamed from: apjt */
public final /* synthetic */ class apjt implements Runnable {

    /* renamed from: a */
    private final apjy f84561a;

    /* renamed from: b */
    private final TaskExecutionChimeraService f84562b;

    /* renamed from: c */
    private final JobParameters f84563c;

    public apjt(apjy apjy, TaskExecutionChimeraService taskExecutionChimeraService, JobParameters jobParameters) {
        this.f84561a = apjy;
        this.f84562b = taskExecutionChimeraService;
        this.f84563c = jobParameters;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        apid apid;
        Uri[] triggeredContentUris;
        apjy apjy = this.f84561a;
        TaskExecutionChimeraService taskExecutionChimeraService = this.f84562b;
        JobParameters jobParameters = this.f84563c;
        int jobId = jobParameters.getJobId();
        StringBuilder sb = new StringBuilder(39);
        sb.append("nts:jobscheduler:onStartJob:");
        sb.append(jobId);
        aech aech = new aech(sb.toString());
        try {
            synchronized (apjy.f84576a) {
                aeco a = apjy.m70501a(jobParameters);
                if (a == null) {
                    int jobId2 = jobParameters.getJobId();
                    StringBuilder sb2 = new StringBuilder(55);
                    sb2.append("unable to extract a task from job with ID = ");
                    sb2.append(jobId2);
                    Log.w("NetworkScheduler", sb2.toString());
                    taskExecutionChimeraService.jobFinished(jobParameters, false);
                    apid = null;
                } else if (apjy.f84576a.f84550e) {
                    apid c = apjy.f84576a.mo47349c(a);
                    if (c == null) {
                        Log.w("NetworkScheduler", "unknown task request received, aborting");
                        taskExecutionChimeraService.jobFinished(jobParameters, false);
                        apid = null;
                    } else {
                        int i = Build.VERSION.SDK_INT;
                        if (!(!c.mo47280q() || jobParameters.getTriggeredContentUris() == null || (triggeredContentUris = jobParameters.getTriggeredContentUris()) == null)) {
                            for (Uri uri : triggeredContentUris) {
                                c.mo47259a(uri);
                            }
                        }
                        apid = c;
                    }
                } else {
                    taskExecutionChimeraService.jobFinished(jobParameters, true);
                    apid = null;
                }
                if (apid != null) {
                    if (!apid.f84446p) {
                        synchronized (apjy.f84576a) {
                            apjx apjx = (apjx) apjy.f84582g.get(apid);
                            if (apjx != null) {
                                int i2 = apjx.f84574b;
                                if (i2 != -1) {
                                    apjy.mo47352a(apid, taskExecutionChimeraService, jobParameters, i2);
                                    apjy.f84582g.remove(apid);
                                } else {
                                    apjx.f84573a = true;
                                }
                            }
                        }
                    }
                    apid.mo47261a(false);
                    Context applicationContext = taskExecutionChimeraService.getApplicationContext();
                    PackageManager c2 = apjy.f84576a.f84549d.mo17013c((int) apid.f84431a.f28809e);
                    if (c2 != null) {
                        apik apik = new apik(apid, applicationContext, new apjw(apjy, taskExecutionChimeraService), apjy.f84580e, c2, apjy.f84579d, apik.m70394a(), aapx.CAUSE_UNKNOWN, 0);
                        apjv apjv = new apjv(apjy, apid, taskExecutionChimeraService, jobParameters, apik);
                        apjy.f84581f.put(apid, jobParameters);
                        apjy.f84578c.mo47340a(applicationContext, apik).mo50378a(apjy.f84580e, apjv);
                    } else {
                        taskExecutionChimeraService.jobFinished(jobParameters, true);
                    }
                }
            }
            aech.close();
        } catch (Throwable th) {
            Throwable th2 = th;
            try {
                aech.close();
            } catch (Throwable th3) {
                bqye.m113761a(th2, th3);
            }
            throw th2;
        }
    }
}

package p000;

import android.app.job.JobParameters;
import android.util.Log;
import com.google.android.gms.scheduler.TaskExecutionChimeraService;

/* renamed from: apjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apjv implements aubq {

    /* renamed from: a */
    final /* synthetic */ apjy f84566a;

    /* renamed from: b */
    private final apid f84567b;

    /* renamed from: c */
    private final TaskExecutionChimeraService f84568c;

    /* renamed from: d */
    private final JobParameters f84569d;

    /* renamed from: e */
    private final apik f84570e;

    public apjv(apjy apjy, apid apid, TaskExecutionChimeraService taskExecutionChimeraService, JobParameters jobParameters, apik apik) {
        this.f84566a = apjy;
        this.f84567b = apid;
        this.f84568c = taskExecutionChimeraService;
        this.f84569d = jobParameters;
        this.f84570e = apik;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        int intValue = ((Integer) aucb.mo50386d()).intValue();
        if (apje.m70447b(intValue)) {
            apjy apjy = this.f84566a;
            apid apid = this.f84567b;
            apik apik = this.f84570e;
            synchronized (apjy.f84576a) {
                if (apjy.f84582g.get(apid) == null) {
                    apjx apjx = new apjx(apik);
                    apjx.f84573a = true;
                    apjy.f84582g.put(apid, apjx);
                }
                apjy.f84579d.mo47254c(aapx.CAUSE_UNKNOWN);
                apid.f84437g = System.currentTimeMillis();
            }
            return;
        }
        if (apje.m70446a(intValue)) {
            Log.w("NetworkScheduler", "execution request failed for temporary reasons, rescheduling");
            this.f84568c.jobFinished(this.f84569d, true);
        } else {
            Log.e("NetworkScheduler", "execution request failed for permanent reasons, not rescheduling");
            this.f84568c.jobFinished(this.f84569d, false);
        }
        apjy apjy2 = this.f84566a;
        apjy2.f84579d.mo47245a(apjy2.f84576a.mo47348c(), this.f84570e, apka.m70510d(intValue));
    }
}

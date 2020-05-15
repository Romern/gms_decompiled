package p000;

import android.app.job.JobParameters;
import android.util.Log;
import com.google.android.chimera.JobService;
import java.lang.ref.WeakReference;

/* renamed from: apjw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apjw implements apij {

    /* renamed from: a */
    final /* synthetic */ apjy f84571a;

    /* renamed from: b */
    private final WeakReference f84572b;

    public apjw(apjy apjy, JobService jobService) {
        this.f84571a = apjy;
        this.f84572b = new WeakReference(jobService);
    }

    /* renamed from: a */
    public final void mo47292a(apik apik, int i) {
        apjy apjy = this.f84571a;
        JobService jobService = (JobService) this.f84572b.get();
        apid apid = apik.f84459a;
        String valueOf = String.valueOf(apid.mo47266e());
        aech aech = new aech(valueOf.length() == 0 ? new String("nts:jobscheduler:onJobResult:") : "nts:jobscheduler:onJobResult:".concat(valueOf));
        try {
            synchronized (apjy.f84576a) {
                apjx apjx = (apjx) apjy.f84582g.remove(apid);
                if (apjx != null) {
                    apjy.f84579d.mo47245a(apjy.f84576a.mo47348c(), apjx.f84575c, apka.m70511e(i));
                    if (!apid.f84446p) {
                        if (apjx.f84573a) {
                            if (jobService != null) {
                                JobParameters jobParameters = (JobParameters) apjy.f84581f.get(apid);
                                if (jobParameters == null) {
                                    Log.w("NetworkScheduler", "Received result for job with no associated jobParams");
                                } else {
                                    apjy.mo47352a(apid, jobService, jobParameters, i);
                                }
                            }
                        }
                        apjx.f84574b = i;
                        apjy.f84582g.put(apid, apjx);
                    }
                } else {
                    String e = apid.mo47266e();
                    int i2 = apid.f84439i;
                    StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 55);
                    sb.append("received result for unknown job (tag=");
                    sb.append(e);
                    sb.append(", jid=");
                    sb.append(i2);
                    sb.append(")");
                    Log.w("NetworkScheduler", sb.toString());
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

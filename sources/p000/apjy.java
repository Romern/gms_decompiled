package p000;

import android.app.job.JobParameters;
import android.content.ComponentName;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.JobService;
import java.util.concurrent.ExecutorService;

/* renamed from: apjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apjy {

    /* renamed from: a */
    public final apjr f84576a;

    /* renamed from: b */
    public final adzi f84577b;

    /* renamed from: c */
    public final apje f84578c;

    /* renamed from: d */
    public final apia f84579d;

    /* renamed from: e */
    public final ExecutorService f84580e;

    /* renamed from: f */
    public final C1245ok f84581f = new C1245ok();

    /* renamed from: g */
    public final C1245ok f84582g = new C1245ok();

    public apjy(apjr apjr, adzi adzi, apje apje, ExecutorService executorService) {
        this.f84576a = apjr;
        this.f84577b = adzi;
        this.f84578c = apje;
        this.f84580e = executorService;
        this.f84579d = apjr.f84548c;
    }

    /* renamed from: a */
    public static final aeco m70501a(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        if (extras != null) {
            String string = extras.getString("_nts.pkg");
            String string2 = extras.getString("_nts.cls");
            int i = extras.getInt("_nts.usr", -1);
            if (extras.containsKey("_nts.tag") && !TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && i != -1) {
                return aeco.m51641a(i, new ComponentName(string, string2), extras.getString("_nts.tag"));
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo47352a(apid apid, JobService jobService, JobParameters jobParameters, int i) {
        if (i != 0) {
            if (i == 1) {
                jobService.jobFinished(jobParameters, true);
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Unknown result code: ");
                sb.append(i);
                Log.e("NetworkScheduler", sb.toString());
                jobService.jobFinished(jobParameters, false);
            }
            this.f84576a.mo47347a(apid, i);
        }
        jobService.jobFinished(jobParameters, false);
        this.f84576a.mo47347a(apid, i);
    }
}

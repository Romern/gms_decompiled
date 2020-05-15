package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* renamed from: ekb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ekb implements ekt {

    /* renamed from: a */
    private final Context f15169a;

    /* renamed from: b */
    private final ekw f15170b;

    /* renamed from: c */
    private final ekh f15171c;

    public ekb(Context context, ekw ekw, ekh ekh) {
        this.f15169a = context;
        this.f15170b = ekw;
        this.f15171c = ekh;
    }

    /* renamed from: a */
    public final void mo10228a(ejb ejb, int i) {
        ComponentName componentName = new ComponentName(this.f15169a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f15169a.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(this.f15169a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(ejb.mo10171a().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(emj.m10666a(ejb.mo10173c())).array());
        if (ejb.mo10172b() != null) {
            adler32.update(ejb.mo10172b());
        }
        int value = (int) adler32.getValue();
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            JobInfo next = it.next();
            int i2 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == value) {
                if (i2 >= i) {
                    ejt.m10552a("JobInfoScheduler", ejb);
                    return;
                }
            }
        }
        long a = this.f15170b.mo10255a(ejb);
        ekh ekh = this.f15171c;
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        eie c = ejb.mo10173c();
        builder.setMinimumLatency(ekh.mo10235a(c, a, i));
        Set c2 = ((ekf) ((ejz) ekh).f15162a.get(c)).mo10224c();
        if (c2.contains(ekg.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (c2.contains(ekg.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (c2.contains(ekg.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", ejb.mo10171a());
        persistableBundle.putInt("priority", emj.m10666a(ejb.mo10173c()));
        if (ejb.mo10172b() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(ejb.mo10172b(), 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {ejb, Integer.valueOf(value), Long.valueOf(this.f15171c.mo10235a(ejb.mo10173c(), a, i)), Long.valueOf(a), Integer.valueOf(i)};
        ejt.m10551a("JobInfoScheduler");
        jobScheduler.schedule(builder.build());
    }
}

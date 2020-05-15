package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* renamed from: agme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class agme extends agmg {

    /* renamed from: a */
    public final agdo f65927a;

    /* renamed from: b */
    private final AlarmManager f65928b = ((AlarmManager) mo35542z().getSystemService("alarm"));

    /* renamed from: c */
    private Integer f65929c;

    public agme(agmn agmn) {
        super(agmn);
        this.f65927a = new agmd(this, agmn.f65953g, agmn);
    }

    /* renamed from: e */
    private final void m54489e() {
        ((JobScheduler) mo35542z().getSystemService("jobscheduler")).cancel(mo35654d());
    }

    /* renamed from: f */
    private final PendingIntent m54490f() {
        Context z = mo35542z();
        return PendingIntent.getBroadcast(z, 0, new Intent().setClassName(z, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    /* renamed from: a */
    public void mo35454a(long j) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public void mo35455b() {
        mo35659q();
        mo35497E().f65572k.mo35435a("Unscheduling upload");
        this.f65928b.cancel(m54490f());
        this.f65927a.mo35370c();
        int i = Build.VERSION.SDK_INT;
        m54489e();
    }

    /* renamed from: d */
    public final int mo35654d() {
        if (this.f65929c == null) {
            String valueOf = String.valueOf(mo35542z().getPackageName());
            this.f65929c = Integer.valueOf((valueOf.length() == 0 ? new String("measurement") : "measurement".concat(valueOf)).hashCode());
        }
        return this.f65929c.intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo35305a() {
        this.f65928b.cancel(m54490f());
        int i = Build.VERSION.SDK_INT;
        m54489e();
        return false;
    }
}

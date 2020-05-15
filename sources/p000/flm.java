package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: flm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class flm extends fkj {

    /* renamed from: a */
    public boolean f16861a;

    /* renamed from: b */
    public boolean f16862b;

    /* renamed from: c */
    private final AlarmManager f16863c = ((AlarmManager) mo10939f().getSystemService("alarm"));

    /* renamed from: e */
    private Integer f16864e;

    protected flm(fkm fkm) {
        super(fkm);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10890a() {
        try {
            mo11015b();
            mo10943h();
            if (flh.m11933c() > 0) {
                Context f = mo10939f();
                ActivityInfo receiverInfo = f.getPackageManager().getReceiverInfo(new ComponentName(f, "com.google.android.gms.analytics.AnalyticsReceiver"), 0);
                if (receiverInfo != null && receiverInfo.enabled) {
                    mo10933d("Receiver registered for local dispatch.");
                    this.f16861a = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
    }

    /* renamed from: b */
    public void mo11015b() {
        this.f16862b = false;
        AlarmManager alarmManager = this.f16863c;
        Context f = mo10939f();
        alarmManager.cancel(PendingIntent.getBroadcast(f, 0, new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(f, "com.google.android.gms.analytics.AnalyticsReceiver")), 0));
        int i = Build.VERSION.SDK_INT;
        int c = mo11016c();
        mo10926a("Cancelling job. JobID", Integer.valueOf(c));
        ((JobScheduler) mo10939f().getSystemService("jobscheduler")).cancel(c);
    }

    /* renamed from: c */
    public final int mo11016c() {
        if (this.f16864e == null) {
            String valueOf = String.valueOf(mo10939f().getPackageName());
            this.f16864e = Integer.valueOf((valueOf.length() == 0 ? new String("analytics") : "analytics".concat(valueOf)).hashCode());
        }
        return this.f16864e.intValue();
    }

    /* renamed from: a */
    public void mo11014a(long j) {
        throw new UnsupportedOperationException();
    }
}

package p000;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;

/* renamed from: aebr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aebr extends aebp {
    public aebr(Context context, int i, int i2) {
        super(context, i, i2);
    }

    /* renamed from: a */
    public final void mo34019a(aapx aapx) {
        Log.e("GmsTaskScheduler", "sendWakeUpEvent called on SchedulerClientBroadcastStrategy");
    }

    /* renamed from: b */
    public final void mo34020b(ComponentName componentName) {
        this.f63081a.sendBroadcast(mo34017a(componentName));
    }

    /* renamed from: b */
    public final void mo34021b(ComponentName componentName, String str) {
        this.f63081a.sendBroadcast(mo34018a(componentName, str));
    }

    /* renamed from: b */
    public final boolean mo34022b(aeca aeca) {
        this.f63081a.sendBroadcast(mo34016a(aeca));
        return true;
    }
}

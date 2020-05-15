package p000;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: aphd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aphd extends dcj implements aphf {
    public aphd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.scheduler.IGmsTaskScheduler");
    }

    /* renamed from: a */
    public final void mo47213a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo47214a(Intent intent, aphi aphi) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, intent);
        dcl.m8164a(bj, aphi);
        mo8530c(1, bj);
    }
}

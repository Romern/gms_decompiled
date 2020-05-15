package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: aalj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aalj extends dcj implements aall {
    public aalj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gcm.IMessengerProxyCallback");
    }

    /* renamed from: a */
    public final void mo16970a() {
        mo8530c(1, mo8529bj());
    }

    /* renamed from: c */
    public final void mo16973c() {
        mo8530c(2, mo8529bj());
    }

    /* renamed from: d */
    public final void mo16974d() {
        mo8530c(4, mo8529bj());
    }

    /* renamed from: a */
    public final void mo16971a(ComponentName componentName) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, componentName);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo16972a(ComponentName componentName, aali aali) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, componentName);
        dcl.m8164a(bj, aali);
        mo8530c(6, bj);
    }
}

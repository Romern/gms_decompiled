package p000;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: nqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nqv extends dcj implements IInterface {
    public nqv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarActivityStartListener");
    }

    /* renamed from: a */
    public final void mo21470a(Intent intent) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, intent);
        mo8530c(1, bj);
    }
}

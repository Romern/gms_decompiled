package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.KeyEvent;

/* renamed from: nsd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nsd extends dcj implements IInterface {
    public nsd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarPhoneStatusEventListener");
    }

    /* renamed from: a */
    public final void mo21506a(KeyEvent keyEvent) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, keyEvent);
        mo8530c(3, bj);
    }
}

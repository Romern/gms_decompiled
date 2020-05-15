package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: nsw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nsw extends dcj implements IInterface {
    public nsw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarVideoFocusListener");
    }

    /* renamed from: a */
    public final void mo21546a(boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, z);
        mo8530c(1, bj);
    }
}

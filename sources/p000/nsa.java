package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: nsa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nsa extends dcj implements IInterface {
    public nsa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarNavigationStatusEventListener");
    }

    /* renamed from: a */
    public final void mo21504a() {
        mo8530c(2, mo8529bj());
    }

    /* renamed from: a */
    public final void mo21505a(int i, int i2, int i3, int i4, int i5) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        bj.writeInt(i2);
        bj.writeInt(i3);
        bj.writeInt(i4);
        bj.writeInt(i5);
        mo8530c(1, bj);
    }
}

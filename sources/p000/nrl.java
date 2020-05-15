package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: nrl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nrl extends dcj implements IInterface {
    public nrl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarConnectionListener");
    }

    /* renamed from: a */
    public final void mo21485a() {
        mo8530c(2, mo8529bj());
    }

    /* renamed from: a */
    public final void mo21486a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8530c(1, bj);
    }
}

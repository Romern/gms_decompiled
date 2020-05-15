package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: oua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oua extends dcj implements ouc {
    public oua(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.carsetup.ICarSetupBinder");
    }

    /* renamed from: a */
    public final nrp mo22651a() {
        nrp nrp;
        Parcel a = mo8526a(1, mo8529bj());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.ICarGalMonitor");
            nrp = queryLocalInterface instanceof nrp ? (nrp) queryLocalInterface : new nrn(readStrongBinder);
        } else {
            nrp = null;
        }
        a.recycle();
        return nrp;
    }

    /* renamed from: c */
    public final void mo22652c() {
        mo8528b(2, mo8529bj());
    }
}

package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: nsk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class nsk extends dck implements nsl {
    public nsk() {
        super("com.google.android.gms.car.ICarRetailMode");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        nsm nsm = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.ICarRetailModeListener");
                if (queryLocalInterface instanceof nsm) {
                    nsm = (nsm) queryLocalInterface;
                } else {
                    nsm = new nsm(readStrongBinder);
                }
            }
            mo21148a(nsm);
            parcel2.writeNoException();
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.car.ICarRetailModeListener");
                if (queryLocalInterface2 instanceof nsm) {
                    nsm = (nsm) queryLocalInterface2;
                } else {
                    nsm = new nsm(readStrongBinder2);
                }
            }
            mo21150b(nsm);
            parcel2.writeNoException();
        } else if (i == 3) {
            boolean b = mo21151b();
            parcel2.writeNoException();
            dcl.m8166a(parcel2, b);
        } else if (i != 4) {
            return false;
        } else {
            boolean a = mo21149a();
            parcel2.writeNoException();
            dcl.m8166a(parcel2, a);
        }
        return true;
    }
}

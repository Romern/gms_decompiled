package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: nrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class nrs extends dck implements nrt {
    public nrs() {
        super("com.google.android.gms.car.ICarMediaPlaybackStatus");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        nru nru;
        nru nru2;
        nru nru3 = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.ICarMediaPlaybackStatusEventListener");
                if (queryLocalInterface instanceof nru) {
                    nru = (nru) queryLocalInterface;
                    mo21493a(nru, parcel.readInt(), parcel.readString(), parcel.readInt(), dcl.m8167a(parcel), dcl.m8167a(parcel), dcl.m8167a(parcel));
                    parcel2.writeNoException();
                } else {
                    nru3 = new nru(readStrongBinder);
                }
            }
            nru = nru3;
            mo21493a(nru, parcel.readInt(), parcel.readString(), parcel.readInt(), dcl.m8167a(parcel), dcl.m8167a(parcel), dcl.m8167a(parcel));
            parcel2.writeNoException();
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.car.ICarMediaPlaybackStatusEventListener");
                if (queryLocalInterface2 instanceof nru) {
                    nru2 = (nru) queryLocalInterface2;
                    mo21494a(nru2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.createByteArray(), parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                } else {
                    nru3 = new nru(readStrongBinder2);
                }
            }
            nru2 = nru3;
            mo21494a(nru2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.createByteArray(), parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
        } else if (i == 3) {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.car.ICarMediaPlaybackStatusEventListener");
                if (queryLocalInterface3 instanceof nru) {
                    nru3 = (nru) queryLocalInterface3;
                } else {
                    nru3 = new nru(readStrongBinder3);
                }
            }
            boolean a = mo21495a(nru3);
            parcel2.writeNoException();
            dcl.m8166a(parcel2, a);
        } else if (i != 4) {
            return false;
        } else {
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.car.ICarMediaPlaybackStatusEventListener");
                if (queryLocalInterface4 instanceof nru) {
                    nru3 = (nru) queryLocalInterface4;
                } else {
                    nru3 = new nru(readStrongBinder4);
                }
            }
            boolean b = mo21496b(nru3);
            parcel2.writeNoException();
            dcl.m8166a(parcel2, b);
        }
        return true;
    }
}

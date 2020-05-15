package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: nrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class nrv extends dck implements nrw {
    public nrv() {
        super("com.google.android.gms.car.ICarMessage");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        nrx nrx = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.ICarMessageCallback");
                    if (queryLocalInterface instanceof nrx) {
                        nrx = (nrx) queryLocalInterface;
                    } else {
                        nrx = new nrx(readStrongBinder);
                    }
                }
                mo21497a(nrx);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.car.ICarMessageCallback");
                    nrx = queryLocalInterface2 instanceof nrx ? (nrx) queryLocalInterface2 : new nrx(readStrongBinder2);
                }
                mo21501b(nrx);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.car.ICarMessageCallback");
                    if (queryLocalInterface3 instanceof nrx) {
                        nrx = (nrx) queryLocalInterface3;
                    } else {
                        nrx = new nrx(readStrongBinder3);
                    }
                }
                boolean a = mo21499a(nrx, parcel.readInt());
                parcel2.writeNoException();
                dcl.m8166a(parcel2, a);
                return true;
            case 4:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.car.ICarMessageCallback");
                    if (queryLocalInterface4 instanceof nrx) {
                        nrx = (nrx) queryLocalInterface4;
                    } else {
                        nrx = new nrx(readStrongBinder4);
                    }
                }
                mo21498a(nrx, parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.car.ICarMessageCallback");
                    if (queryLocalInterface5 instanceof nrx) {
                        nrx = (nrx) queryLocalInterface5;
                    } else {
                        nrx = new nrx(readStrongBinder5);
                    }
                }
                int[] a2 = mo21500a(nrx, parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeIntArray(a2);
                return true;
            case 6:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.car.ICarMessageCallback");
                    if (queryLocalInterface6 instanceof nrx) {
                        nrx = (nrx) queryLocalInterface6;
                    } else {
                        nrx = new nrx(readStrongBinder6);
                    }
                }
                mo21502b(nrx, parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.car.ICarMessageCallback");
                    if (queryLocalInterface7 instanceof nrx) {
                        nrx = (nrx) queryLocalInterface7;
                    } else {
                        nrx = new nrx(readStrongBinder7);
                    }
                }
                mo21503c(nrx);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

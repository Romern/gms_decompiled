package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: nro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class nro extends dck implements nrp {
    public nro() {
        super("com.google.android.gms.car.ICarGalMonitor");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        nrm nrm = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.ICarGalListener");
                    if (queryLocalInterface instanceof nrm) {
                        nrm = (nrm) queryLocalInterface;
                    } else {
                        nrm = new nrm(readStrongBinder);
                    }
                }
                mo21488a(nrm, parcel.readInt());
                break;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.car.ICarGalListener");
                    nrm = queryLocalInterface2 instanceof nrm ? (nrm) queryLocalInterface2 : new nrm(readStrongBinder2);
                }
                mo21490b(nrm, parcel.readInt());
                break;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.car.ICarGalListener");
                    if (queryLocalInterface3 instanceof nrm) {
                        nrm = (nrm) queryLocalInterface3;
                    } else {
                        nrm = new nrm(readStrongBinder3);
                    }
                }
                mo21491c(nrm, parcel.readInt());
                break;
            case 4:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.car.ICarGalListener");
                    if (queryLocalInterface4 instanceof nrm) {
                        nrm = (nrm) queryLocalInterface4;
                    } else {
                        nrm = new nrm(readStrongBinder4);
                    }
                }
                mo21492d(nrm, parcel.readInt());
                break;
            case 5:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.car.ICarGalListener");
                    if (queryLocalInterface5 instanceof nrm) {
                        nrm = (nrm) queryLocalInterface5;
                    } else {
                        nrm = new nrm(readStrongBinder5);
                    }
                }
                mo21487a(nrm);
                break;
            case 6:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.car.ICarGalListener");
                    if (queryLocalInterface6 instanceof nrm) {
                        nrm = (nrm) queryLocalInterface6;
                    } else {
                        nrm = new nrm(readStrongBinder6);
                    }
                }
                mo21489b(nrm);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}

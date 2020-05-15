package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.car.CarInstrumentClusterInfo;

/* renamed from: nry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class nry extends dck implements nrz {
    public nry() {
        super("com.google.android.gms.car.ICarNavigationStatus");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        nsa nsa = null;
        switch (i) {
            case 1:
                mo21088a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 2:
                mo21092a(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.createByteArray(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 3:
                mo21089a(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 4:
                boolean e = mo21098e();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, e);
                return true;
            case 5:
                CarInstrumentClusterInfo d = mo21097d();
                parcel2.writeNoException();
                dcl.m8169b(parcel2, d);
                return true;
            case 6:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.ICarNavigationStatusEventListener");
                    if (queryLocalInterface instanceof nsa) {
                        nsa = (nsa) queryLocalInterface;
                    } else {
                        nsa = new nsa(readStrongBinder);
                    }
                }
                boolean a = mo21094a(nsa);
                parcel2.writeNoException();
                dcl.m8166a(parcel2, a);
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.car.ICarNavigationStatusEventListener");
                    if (queryLocalInterface2 instanceof nsa) {
                        nsa = (nsa) queryLocalInterface2;
                    } else {
                        nsa = new nsa(readStrongBinder2);
                    }
                }
                boolean b = mo21096b(nsa);
                parcel2.writeNoException();
                dcl.m8166a(parcel2, b);
                return true;
            case 8:
                mo21090a(parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 9:
                mo21091a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.car.CarPhoneStatus;

/* renamed from: nsb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class nsb extends dck implements nsc {
    public nsb() {
        super("com.google.android.gms.car.ICarPhoneStatus");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        nsd nsd = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.ICarPhoneStatusEventListener");
                    if (queryLocalInterface instanceof nsd) {
                        nsd = (nsd) queryLocalInterface;
                    } else {
                        nsd = new nsd(readStrongBinder);
                    }
                }
                mo21108a(nsd, (CarPhoneStatus) dcl.m8163a(parcel, CarPhoneStatus.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.car.ICarPhoneStatusEventListener");
                    nsd = queryLocalInterface2 instanceof nsd ? (nsd) queryLocalInterface2 : new nsd(readStrongBinder2);
                }
                boolean a = mo21111a(nsd);
                parcel2.writeNoException();
                dcl.m8166a(parcel2, a);
                return true;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.car.ICarPhoneStatusEventListener");
                    if (queryLocalInterface3 instanceof nsd) {
                        nsd = (nsd) queryLocalInterface3;
                    } else {
                        nsd = new nsd(readStrongBinder3);
                    }
                }
                boolean b = mo21112b(nsd);
                parcel2.writeNoException();
                dcl.m8166a(parcel2, b);
                return true;
            case 4:
                boolean a2 = mo21109a();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, a2);
                return true;
            case 5:
                int readInt = parcel.readInt();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.car.ICarPhoneStatusEventListener");
                    if (queryLocalInterface4 instanceof nsd) {
                        nsd = (nsd) queryLocalInterface4;
                    } else {
                        nsd = new nsd(readStrongBinder4);
                    }
                }
                boolean a3 = mo21110a(readInt, nsd);
                parcel2.writeNoException();
                dcl.m8166a(parcel2, a3);
                return true;
            case 6:
                mo21105a((CarPhoneStatus) dcl.m8163a(parcel, CarPhoneStatus.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

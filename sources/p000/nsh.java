package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.car.RadioState;
import java.util.List;

/* renamed from: nsh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class nsh extends dck implements nsi {
    public nsh() {
        super("com.google.android.gms.car.ICarRadio");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        nsj nsj = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.ICarRadioCallback");
                    if (queryLocalInterface instanceof nsj) {
                        nsj = (nsj) queryLocalInterface;
                    } else {
                        nsj = new nsj(readStrongBinder);
                    }
                }
                mo21128a(nsj);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.car.ICarRadioCallback");
                    nsj = queryLocalInterface2 instanceof nsj ? (nsj) queryLocalInterface2 : new nsj(readStrongBinder2);
                }
                mo21136b(nsj);
                parcel2.writeNoException();
                return true;
            case 3:
                mo21123a(parcel.readInt(), dcl.m8167a(parcel), dcl.m8167a(parcel));
                parcel2.writeNoException();
                return true;
            case 4:
                mo21135b(parcel.readInt(), dcl.m8167a(parcel), dcl.m8167a(parcel));
                parcel2.writeNoException();
                return true;
            case 5:
                mo21124a(parcel.readInt(), dcl.m8167a(parcel), dcl.m8167a(parcel), dcl.m8167a(parcel));
                parcel2.writeNoException();
                return true;
            case 6:
                mo21117a(parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 7:
                mo21122a(parcel.readInt(), dcl.m8167a(parcel));
                parcel2.writeNoException();
                return true;
            case 8:
                mo21115a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 9:
                mo21116a(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 10:
                mo21139d();
                parcel2.writeNoException();
                return true;
            case 11:
                mo21130b(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 12:
                mo21137c(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 13:
                mo21140d(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 14:
                List a = mo21114a();
                parcel2.writeNoException();
                parcel2.writeTypedList(a);
                return true;
            case 15:
                RadioState b = mo21129b();
                parcel2.writeNoException();
                dcl.m8169b(parcel2, b);
                return true;
            default:
                return false;
        }
    }
}

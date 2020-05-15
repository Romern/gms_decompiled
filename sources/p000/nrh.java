package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.KeyEvent;
import com.google.android.gms.car.CarCall;
import java.util.List;

/* renamed from: nrh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class nrh extends dck implements nri {
    public nrh() {
        super("com.google.android.gms.car.ICarCall");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        nrj nrj = null;
        switch (i) {
            case 1:
                List c = mo21007c();
                parcel2.writeNoException();
                parcel2.writeTypedList(c);
                return true;
            case 2:
                boolean d = mo21010d();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, d);
                return true;
            case 3:
                mo21002a(dcl.m8167a(parcel));
                parcel2.writeNoException();
                return true;
            case 4:
                int e = mo21011e();
                parcel2.writeNoException();
                parcel2.writeInt(e);
                return true;
            case 5:
                int f = mo21013f();
                parcel2.writeNoException();
                parcel2.writeInt(f);
                return true;
            case 6:
                mo20990a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.ICarCallListener");
                    if (queryLocalInterface instanceof nrj) {
                        nrj = (nrj) queryLocalInterface;
                    } else {
                        nrj = new nrj(readStrongBinder);
                    }
                }
                boolean a = mo21003a(nrj);
                parcel2.writeNoException();
                dcl.m8166a(parcel2, a);
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.car.ICarCallListener");
                    if (queryLocalInterface2 instanceof nrj) {
                        nrj = (nrj) queryLocalInterface2;
                    } else {
                        nrj = new nrj(readStrongBinder2);
                    }
                }
                boolean b = mo21006b(nrj);
                parcel2.writeNoException();
                dcl.m8166a(parcel2, b);
                return true;
            case 9:
                mo20993a((CarCall) dcl.m8163a(parcel, CarCall.CREATOR));
                parcel2.writeNoException();
                return true;
            case 10:
                mo20998a((CarCall) dcl.m8163a(parcel, CarCall.CREATOR), dcl.m8167a(parcel), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                mo21005b((CarCall) dcl.m8163a(parcel, CarCall.CREATOR));
                parcel2.writeNoException();
                return true;
            case 12:
                mo21008c((CarCall) dcl.m8163a(parcel, CarCall.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                mo21009d((CarCall) dcl.m8163a(parcel, CarCall.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                mo20994a((CarCall) dcl.m8163a(parcel, CarCall.CREATOR), (char) parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 15:
                mo21012e((CarCall) dcl.m8163a(parcel, CarCall.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                mo20997a((CarCall) dcl.m8163a(parcel, CarCall.CREATOR), dcl.m8167a(parcel));
                parcel2.writeNoException();
                return true;
            case 17:
                mo20995a((CarCall) dcl.m8163a(parcel, CarCall.CREATOR), (CarCall) dcl.m8163a(parcel, CarCall.CREATOR));
                parcel2.writeNoException();
                return true;
            case 18:
                mo21014f((CarCall) dcl.m8163a(parcel, CarCall.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                mo20999a(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 20:
                mo21004b();
                parcel2.writeNoException();
                return true;
            case 21:
            default:
                return false;
            case 22:
                mo20992a((KeyEvent) dcl.m8163a(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                return true;
            case 23:
                mo20996a((CarCall) dcl.m8163a(parcel, CarCall.CREATOR), parcel.readString(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 24:
                mo20991a((Uri) dcl.m8163a(parcel, Uri.CREATOR), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}

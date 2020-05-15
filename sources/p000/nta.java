package p000;

import android.graphics.Point;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.CarWindowSpec;

/* renamed from: nta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class nta extends dck implements ntb {
    public nta() {
        super("com.google.android.gms.car.ICarWindowManager");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        nsw nsw = null;
        nsz nsz = null;
        nsz nsz2 = null;
        nrq nrq = null;
        nrq nrq2 = null;
        nsw nsw2 = null;
        switch (i) {
            case 1:
                boolean a = mo21552a();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, a);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.ICarVideoFocusListener");
                    nsw = queryLocalInterface instanceof nsw ? (nsw) queryLocalInterface : new nsw(readStrongBinder);
                }
                mo21551a(nsw);
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.car.ICarVideoFocusListener");
                    if (queryLocalInterface2 instanceof nsw) {
                        nsw2 = (nsw) queryLocalInterface2;
                    } else {
                        nsw2 = new nsw(readStrongBinder2);
                    }
                }
                mo21555b(nsw2);
                parcel2.writeNoException();
                return true;
            case 4:
                mo21549a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.car.ICarInputCallback");
                    if (queryLocalInterface3 instanceof nrq) {
                        nrq2 = (nrq) queryLocalInterface3;
                    } else {
                        nrq2 = new nrq(readStrongBinder3);
                    }
                }
                mo21550a(nrq2);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.car.ICarInputCallback");
                    if (queryLocalInterface4 instanceof nrq) {
                        nrq = (nrq) queryLocalInterface4;
                    } else {
                        nrq = new nrq(readStrongBinder4);
                    }
                }
                mo21554b(nrq);
                parcel2.writeNoException();
                return true;
            case 7:
                mo21553b();
                parcel2.writeNoException();
                return true;
            case 8:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                CarWindowLayoutParams carWindowLayoutParams = (CarWindowLayoutParams) dcl.m8163a(parcel, CarWindowLayoutParams.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.car.ICarWindowCallback");
                    if (queryLocalInterface5 instanceof nsz) {
                        nsz2 = (nsz) queryLocalInterface5;
                    } else {
                        nsz2 = new nsz(readStrongBinder5);
                    }
                }
                nsy a2 = mo21548a(readString, readString2, carWindowLayoutParams, nsz2);
                parcel2.writeNoException();
                dcl.m8164a(parcel2, a2);
                return true;
            case 9:
                Point c = mo21556c();
                parcel2.writeNoException();
                dcl.m8169b(parcel2, c);
                return true;
            case 10:
                int d = mo21557d();
                parcel2.writeNoException();
                parcel2.writeInt(d);
                return true;
            case 11:
                CarWindowSpec carWindowSpec = (CarWindowSpec) dcl.m8163a(parcel, CarWindowSpec.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.car.ICarWindowCallback");
                    if (queryLocalInterface6 instanceof nsz) {
                        nsz = (nsz) queryLocalInterface6;
                    } else {
                        nsz = new nsz(readStrongBinder6);
                    }
                }
                nsy a3 = mo21547a(carWindowSpec, nsz);
                parcel2.writeNoException();
                dcl.m8164a(parcel2, a3);
                return true;
            default:
                return false;
        }
    }
}

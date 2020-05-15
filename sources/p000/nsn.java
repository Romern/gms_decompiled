package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.car.CarSensorEvent;

/* renamed from: nsn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class nsn extends dck implements nso {
    public nsn() {
        super("com.google.android.gms.car.ICarSensor");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        nsr nsr = null;
        switch (i) {
            case 1:
                int[] b = mo21180b();
                parcel2.writeNoException();
                parcel2.writeIntArray(b);
                return true;
            case 2:
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.ICarSensorEventListener");
                    if (queryLocalInterface instanceof nsr) {
                        nsr = (nsr) queryLocalInterface;
                    } else {
                        nsr = new nsp(readStrongBinder);
                    }
                }
                boolean a = mo21178a(readInt, readInt2, nsr);
                parcel2.writeNoException();
                dcl.m8166a(parcel2, a);
                return true;
            case 3:
                CarSensorEvent b2 = mo21179b(parcel.readInt());
                parcel2.writeNoException();
                dcl.m8169b(parcel2, b2);
                return true;
            case 4:
                int readInt3 = parcel.readInt();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.car.ICarSensorEventListener");
                    if (queryLocalInterface2 instanceof nsr) {
                        nsr = (nsr) queryLocalInterface2;
                    } else {
                        nsr = new nsp(readStrongBinder2);
                    }
                }
                mo21175a(readInt3, nsr);
                parcel2.writeNoException();
                return true;
            case 5:
                int d = mo21182d();
                parcel2.writeNoException();
                parcel2.writeInt(d);
                return true;
            case 6:
                int[] e = mo21183e();
                parcel2.writeNoException();
                parcel2.writeIntArray(e);
                return true;
            case 7:
                int[] f = mo21184f();
                parcel2.writeNoException();
                parcel2.writeIntArray(f);
                return true;
            default:
                return false;
        }
    }
}

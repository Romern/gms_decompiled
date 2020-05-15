package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: nrd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class nrd extends dck implements nre {
    public nrd() {
        super("com.google.android.gms.car.ICarBluetooth");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        nrf nrf;
        switch (i) {
            case 1:
                int e = mo20967e();
                parcel2.writeNoException();
                parcel2.writeInt(e);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.ICarBluetoothClient");
                    nrf = queryLocalInterface instanceof nrf ? (nrf) queryLocalInterface : new nrf(readStrongBinder);
                } else {
                    nrf = null;
                }
                boolean a = mo20964a(nrf);
                parcel2.writeNoException();
                dcl.m8166a(parcel2, a);
                return true;
            case 3:
                boolean f = mo20968f();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, f);
                return true;
            case 4:
                boolean g = mo20969g();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, g);
                return true;
            case 5:
                boolean h = mo20970h();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, h);
                return true;
            case 6:
                boolean i2 = mo20971i();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, i2);
                return true;
            case 7:
                boolean j = mo20972j();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, j);
                return true;
            case 8:
                String k = mo20973k();
                parcel2.writeNoException();
                parcel2.writeString(k);
                return true;
            case 9:
                int[] l = mo20974l();
                parcel2.writeNoException();
                parcel2.writeIntArray(l);
                return true;
            default:
                return false;
        }
    }
}

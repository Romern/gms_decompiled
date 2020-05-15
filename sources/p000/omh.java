package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: omh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class omh extends dck implements omi {
    public omh() {
        super("com.google.android.gms.car.startup.IProxySensorsEndPoint");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        oml oml = null;
        switch (i) {
            case 2:
                int[] bl = mo22292bl();
                parcel2.writeNoException();
                parcel2.writeIntArray(bl);
                return true;
            case 3:
                boolean bk = mo22291bk();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, bk);
                return true;
            case 4:
                boolean a = mo22288a(parcel.readInt(), parcel.readLong());
                parcel2.writeNoException();
                dcl.m8166a(parcel2, a);
                return true;
            case 5:
                byte[] a2 = mo22289a(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeByteArray(a2);
                return true;
            case 6:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.startup.IProxySensorsEndPointCallback");
                    if (queryLocalInterface instanceof oml) {
                        oml = (oml) queryLocalInterface;
                    } else {
                        oml = new omj(readStrongBinder);
                    }
                }
                mo22287a(oml);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.car.startup.IProxySensorsEndPointCallback");
                    if (queryLocalInterface2 instanceof oml) {
                        oml = (oml) queryLocalInterface2;
                    } else {
                        oml = new omj(readStrongBinder2);
                    }
                }
                mo22290b(oml);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

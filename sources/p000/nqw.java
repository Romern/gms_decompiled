package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.car.CarAudioConfiguration;

/* renamed from: nqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class nqw extends dck implements nqx {
    public nqw() {
        super("com.google.android.gms.car.ICarAudio");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        nqy nqy;
        switch (i) {
            case 1:
                int[] c = mo20922c();
                parcel2.writeNoException();
                parcel2.writeIntArray(c);
                break;
            case 2:
                int[] d = mo20925d();
                parcel2.writeNoException();
                parcel2.writeIntArray(d);
                break;
            case 3:
                CarAudioConfiguration[] b = mo20920b(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeTypedArray(b, 1);
                break;
            case 4:
                CarAudioConfiguration a = mo20912a(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a);
                break;
            case 5:
                CarAudioConfiguration[] c2 = mo20923c(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeTypedArray(c2, 1);
                break;
            case 6:
                CarAudioConfiguration b2 = mo20917b(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                dcl.m8169b(parcel2, b2);
                break;
            case 7:
                int c3 = mo20921c(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(c3);
                break;
            case 8:
                int d2 = mo20924d(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(d2);
                break;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.car.ICarAudioCallback");
                    if (queryLocalInterface instanceof nqy) {
                        nqy nqy2 = (nqy) queryLocalInterface;
                    } else {
                        new nqy(readStrongBinder);
                    }
                }
                parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                nrc f = mo20927f();
                parcel2.writeNoException();
                dcl.m8164a(parcel2, f);
                break;
            case 10:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.car.ICarAudioCallback");
                    nqy = queryLocalInterface2 instanceof nqy ? (nqy) queryLocalInterface2 : new nqy(readStrongBinder2);
                } else {
                    nqy = null;
                }
                int readInt = parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                nra a2 = mo20913a(nqy, readInt);
                parcel2.writeNoException();
                dcl.m8164a(parcel2, a2);
                break;
            case 11:
                boolean a3 = mo20916a(parcel.readLong());
                parcel2.writeNoException();
                dcl.m8166a(parcel2, a3);
                break;
            case 12:
                boolean b3 = mo20919b(parcel.readLong());
                parcel2.writeNoException();
                dcl.m8166a(parcel2, b3);
                break;
            default:
                return false;
        }
        return true;
    }
}

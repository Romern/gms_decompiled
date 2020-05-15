package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.carsetup.CarInfoInternal;

/* renamed from: oue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class oue extends dck implements ouf {
    public oue() {
        super("com.google.android.gms.carsetup.IConnectionTransfer");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        oui oui;
        switch (i) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeInt(mo17427a());
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.carsetup.IConnectionTransferCallbacks");
                    oui = queryLocalInterface instanceof oui ? (oui) queryLocalInterface : new oug(readStrongBinder);
                } else {
                    oui = null;
                }
                mo17428a(oui);
                parcel2.writeNoException();
                return true;
            case 3:
                CarInfoInternal b = mo17429b();
                parcel2.writeNoException();
                dcl.m8169b(parcel2, b);
                return true;
            case 4:
                int c = mo17430c();
                parcel2.writeNoException();
                parcel2.writeInt(c);
                return true;
            case 5:
                boolean d = mo17431d();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, d);
                return true;
            case 6:
                ParcelFileDescriptor e = mo17432e();
                parcel2.writeNoException();
                dcl.m8169b(parcel2, e);
                return true;
            case 7:
                boolean f = mo17433f();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, f);
                return true;
            case 8:
                boolean g = mo17434g();
                parcel2.writeNoException();
                dcl.m8166a(parcel2, g);
                return true;
            case 9:
                int h = mo17435h();
                parcel2.writeNoException();
                parcel2.writeInt(h);
                return true;
            case 10:
                int i2 = mo17436i();
                parcel2.writeNoException();
                parcel2.writeInt(i2);
                return true;
            case 11:
                omi j = mo17437j();
                parcel2.writeNoException();
                dcl.m8164a(parcel2, j);
                return true;
            default:
                return false;
        }
    }
}

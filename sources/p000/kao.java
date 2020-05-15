package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: kao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class kao extends dck implements kap {
    public kao() {
        super("com.google.android.gms.auth.uncertifieddevice.IUncertifiedDeviceService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        kaq kaq;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.auth.uncertifieddevice.IUncertifiedDeviceServiceCallback");
            kaq = queryLocalInterface instanceof kaq ? (kaq) queryLocalInterface : new kaq(readStrongBinder);
        } else {
            kaq = null;
        }
        mo14337a(kaq);
        parcel2.writeNoException();
        return true;
    }
}

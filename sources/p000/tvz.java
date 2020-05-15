package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: tvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class tvz extends dck implements twa {
    public tvz() {
        super("com.google.android.gms.deviceconnection.internal.IDeviceConnectionService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        tvx tvx = null;
        if (i == 1001) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.deviceconnection.internal.IDeviceConnectionCallbacks");
                if (queryLocalInterface instanceof tvx) {
                    tvx = (tvx) queryLocalInterface;
                } else {
                    tvx = new tvv(readStrongBinder);
                }
            }
            mo26833a(tvx, parcel.createStringArray());
        } else if (i != 1002) {
            return false;
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.deviceconnection.internal.IDeviceConnectionCallbacks");
                if (queryLocalInterface2 instanceof tvx) {
                    tvx = (tvx) queryLocalInterface2;
                } else {
                    tvx = new tvv(readStrongBinder2);
                }
            }
            mo26832a(tvx);
        }
        parcel2.writeNoException();
        return true;
    }
}

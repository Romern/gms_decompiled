package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: fvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class fvf extends dck implements fvg {
    public fvf() {
        super("com.google.android.gms.appinvite.internal.IAppInviteInternalService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        fve fve;
        int i2 = i;
        fve fve2 = null;
        if (i2 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.appinvite.internal.IAppInviteInternalCallbacks");
                if (queryLocalInterface instanceof fve) {
                    fve = (fve) queryLocalInterface;
                    mo11394a(fve, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), dcl.m8170c(parcel), parcel.readString(), parcel.readString(), dcl.m8168b(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createByteArray(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
                } else {
                    fve2 = new fve(readStrongBinder);
                }
            }
            fve = fve2;
            mo11394a(fve, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), dcl.m8170c(parcel), parcel.readString(), parcel.readString(), dcl.m8168b(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createByteArray(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        } else if (i2 != 2) {
            return false;
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.appinvite.internal.IAppInviteInternalCallbacks");
                if (queryLocalInterface2 instanceof fve) {
                    fve2 = (fve) queryLocalInterface2;
                } else {
                    fve2 = new fve(readStrongBinder2);
                }
            }
            mo11393a(fve2);
        }
        parcel2.writeNoException();
        return true;
    }
}

package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: fvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class fvh extends dck implements fvi {
    public fvh() {
        super("com.google.android.gms.appinvite.internal.IAppInviteService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        fvd fvd = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.appinvite.internal.IAppInviteCallbacks");
                if (queryLocalInterface instanceof fvd) {
                    fvd = (fvd) queryLocalInterface;
                } else {
                    fvd = new fvd(readStrongBinder);
                }
            }
            mo11396a(fvd, parcel.readString());
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.appinvite.internal.IAppInviteCallbacks");
                if (queryLocalInterface2 instanceof fvd) {
                    fvd = (fvd) queryLocalInterface2;
                } else {
                    fvd = new fvd(readStrongBinder2);
                }
            }
            mo11397b(fvd, parcel.readString());
        } else if (i != 3) {
            return false;
        } else {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.appinvite.internal.IAppInviteCallbacks");
                if (queryLocalInterface3 instanceof fvd) {
                    fvd = (fvd) queryLocalInterface3;
                } else {
                    fvd = new fvd(readStrongBinder3);
                }
            }
            mo11395a(fvd);
        }
        parcel2.writeNoException();
        return true;
    }
}

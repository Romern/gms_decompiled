package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: xod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xod extends dck implements xoe {
    public xod() {
        super("com.google.android.gms.fido.fido2.api.IAuthStatusCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        xol xol;
        if (i == 1) {
            parcel.readInt();
        } else if (i != 2) {
            return false;
        } else {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.fido.fido2.api.IUserPresenceApprover");
                xol = queryLocalInterface instanceof xol ? (xol) queryLocalInterface : new xol(readStrongBinder);
            } else {
                xol = null;
            }
            xol.mo8528b(1, xol.mo8529bj());
        }
        return true;
    }
}

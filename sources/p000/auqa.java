package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: auqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class auqa extends dck implements auqb {
    public auqa() {
        super("com.google.android.gms.trustagent.internal.IBridgeApi");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        auqe auqe;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.trustagent.internal.IBridgeCallbacks");
            auqe = queryLocalInterface instanceof auqe ? (auqe) queryLocalInterface : new auqc(readStrongBinder);
        } else {
            auqe = null;
        }
        sce a = mo50656a(auqe, parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        dcl.m8164a(parcel2, a);
        return true;
    }
}

package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: rbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class rbc extends dck implements rbd {
    public rbc() {
        super("com.google.android.gms.clearcut.internal.IBootCountService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        rba rba;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IBootCountCallbacks");
            rba = queryLocalInterface instanceof rba ? (rba) queryLocalInterface : new ray(readStrongBinder);
        } else {
            rba = null;
        }
        mo24393a(rba);
        return true;
    }
}

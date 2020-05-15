package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: aooz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aooz extends dck implements aopa {
    public aooz() {
        super("com.google.android.gms.rcs.internal.IRcsBindingService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        rnt rnt = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                if (queryLocalInterface instanceof rnt) {
                    rnt = (rnt) queryLocalInterface;
                } else {
                    rnt = new rnr(readStrongBinder);
                }
            }
            mo43128a(rnt, dcl.m8167a(parcel), parcel.readString());
        } else if (i != 2) {
            return false;
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                if (queryLocalInterface2 instanceof rnt) {
                    rnt = (rnt) queryLocalInterface2;
                } else {
                    rnt = new rnr(readStrongBinder2);
                }
            }
            mo43129a(rnt, dcl.m8167a(parcel), parcel.readString(), parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}

package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: vvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class vvb extends dck implements vvc {
    public vvb() {
        super("com.google.android.gms.drivingmode.internal.IDrivingModeService");
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
            mo28896a(rnt, parcel.readInt());
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                if (queryLocalInterface2 instanceof rnt) {
                    rnt = (rnt) queryLocalInterface2;
                } else {
                    rnt = new rnr(readStrongBinder2);
                }
            }
            mo28898b(rnt, parcel.readInt());
        } else if (i == 3) {
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                if (queryLocalInterface3 instanceof rnt) {
                    rnt = (rnt) queryLocalInterface3;
                } else {
                    rnt = new rnr(readStrongBinder3);
                }
            }
            mo28895a(rnt);
        } else if (i != 4) {
            return false;
        } else {
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                if (queryLocalInterface4 instanceof rnt) {
                    rnt = (rnt) queryLocalInterface4;
                } else {
                    rnt = new rnr(readStrongBinder4);
                }
            }
            mo28897a(rnt, parcel.readInt(), dcl.m8167a(parcel));
        }
        parcel2.writeNoException();
        return true;
    }
}

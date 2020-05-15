package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: brsn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class brsn extends dck implements brso {
    public brsn() {
        super("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        brsm brsm = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
                if (queryLocalInterface instanceof brsm) {
                    brsm = (brsm) queryLocalInterface;
                } else {
                    brsm = new brsm(readStrongBinder);
                }
            }
            mo29003a(brsm, parcel.readString());
        } else if (i != 2) {
            return false;
        } else {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
                if (queryLocalInterface2 instanceof brsm) {
                    brsm = (brsm) queryLocalInterface2;
                } else {
                    brsm = new brsm(readStrongBinder2);
                }
            }
            mo29002a(brsm, (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}

package p000;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: ntg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ntg extends dck implements nth {
    public ntg() {
        super("com.google.android.gms.car.IProjectionLifecycleCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo21558a(parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}

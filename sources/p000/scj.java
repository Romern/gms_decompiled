package p000;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.ConnectionInfo;

/* renamed from: scj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class scj extends dck implements sck {
    public scj() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo16678a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            mo16677a(parcel.readInt(), (Bundle) dcl.m8163a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            mo16679a(parcel.readInt(), parcel.readStrongBinder(), (ConnectionInfo) dcl.m8163a(parcel, ConnectionInfo.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}

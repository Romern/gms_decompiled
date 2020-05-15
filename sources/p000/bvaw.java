package p000;

import android.os.Parcel;
import com.google.location.nearby.direct.client.internal.OperationStatus;

/* renamed from: bvaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bvaw extends dck implements bvax {
    public bvaw() {
        super("com.google.location.nearby.direct.client.internal.INearbyDirectCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo73262a((OperationStatus) dcl.m8163a(parcel, OperationStatus.CREATOR));
        return true;
    }
}

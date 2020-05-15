package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: aenq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aenq extends dck implements aenr {
    public aenq() {
        super("com.google.android.gms.location.places.internal.IPlacesCallbacks");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo34322a((DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR));
        } else if (i == 2) {
            mo34323b((DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR));
        } else if (i == 3) {
            mo34324c((DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR));
        } else if (i == 4) {
            mo34321a((Status) dcl.m8163a(parcel, Status.CREATOR));
        } else if (i != 5) {
            return false;
        } else {
            mo34325d((DataHolder) dcl.m8163a(parcel, DataHolder.CREATOR));
        }
        return true;
    }
}

package p000;

import android.os.Parcel;
import com.google.android.gms.nearby.sharing.internal.OnTransferUpdateParams;

/* renamed from: ajyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ajyy extends dck implements ajyz {
    public ajyy() {
        super("com.google.android.gms.nearby.sharing.internal.ITransferUpdateCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo38778a((OnTransferUpdateParams) dcl.m8163a(parcel, OnTransferUpdateParams.CREATOR));
        return true;
    }
}

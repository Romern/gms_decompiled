package p000;

import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnPayloadReceivedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadTransferUpdateParams;

/* renamed from: aign */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aign extends dck implements aigo {
    public aign() {
        super("com.google.android.gms.nearby.internal.connection.IPayloadListener");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            mo36566a((OnPayloadReceivedParams) dcl.m8163a(parcel, OnPayloadReceivedParams.CREATOR));
            return true;
        } else if (i != 3) {
            return false;
        } else {
            mo36567a((OnPayloadTransferUpdateParams) dcl.m8163a(parcel, OnPayloadTransferUpdateParams.CREATOR));
            return true;
        }
    }
}

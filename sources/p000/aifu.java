package p000;

import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadReceivedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadTransferUpdateParams;

/* renamed from: aifu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aifu extends dck implements aifv {
    public aifu() {
        super("com.google.android.gms.nearby.internal.connection.IConnectionEventListener");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            mo36550a((OnPayloadReceivedParams) dcl.m8163a(parcel, OnPayloadReceivedParams.CREATOR));
            return true;
        } else if (i == 3) {
            mo36549a((OnDisconnectedParams) dcl.m8163a(parcel, OnDisconnectedParams.CREATOR));
            return true;
        } else if (i != 4) {
            return false;
        } else {
            OnPayloadTransferUpdateParams onPayloadTransferUpdateParams = (OnPayloadTransferUpdateParams) dcl.m8163a(parcel, OnPayloadTransferUpdateParams.CREATOR);
            return true;
        }
    }
}

package p000;

import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnEndpointDistanceChangedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointLostParams;
import com.google.android.gms.nearby.internal.connection.OnStoppedDiscoveryParams;

/* renamed from: aigg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aigg extends dck implements aigh {
    public aigg() {
        super("com.google.android.gms.nearby.internal.connection.IDiscoveryListener");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            mo36555a((OnEndpointFoundParams) dcl.m8163a(parcel, OnEndpointFoundParams.CREATOR));
            return true;
        } else if (i == 3) {
            mo36556a((OnEndpointLostParams) dcl.m8163a(parcel, OnEndpointLostParams.CREATOR));
            return true;
        } else if (i == 4) {
            mo36557a((OnStoppedDiscoveryParams) dcl.m8163a(parcel, OnStoppedDiscoveryParams.CREATOR));
            return true;
        } else if (i != 5) {
            return false;
        } else {
            mo36554a((OnEndpointDistanceChangedParams) dcl.m8163a(parcel, OnEndpointDistanceChangedParams.CREATOR));
            return true;
        }
    }
}

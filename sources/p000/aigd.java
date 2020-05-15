package p000;

import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointLostParams;
import com.google.android.gms.nearby.internal.connection.OnStoppedDiscoveryParams;

/* renamed from: aigd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aigd extends dck implements aige {
    public aigd() {
        super("com.google.android.gms.nearby.internal.connection.IDiscoveryCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            mo36574a((OnEndpointFoundParams) dcl.m8163a(parcel, OnEndpointFoundParams.CREATOR));
            return true;
        } else if (i == 3) {
            mo36575a((OnEndpointLostParams) dcl.m8163a(parcel, OnEndpointLostParams.CREATOR));
            return true;
        } else if (i != 4) {
            return false;
        } else {
            OnStoppedDiscoveryParams onStoppedDiscoveryParams = (OnStoppedDiscoveryParams) dcl.m8163a(parcel, OnStoppedDiscoveryParams.CREATOR);
            return true;
        }
    }
}

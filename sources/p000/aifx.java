package p000;

import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnBandwidthChangedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionInitiatedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionResultParams;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;

/* renamed from: aifx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aifx extends dck implements aify {
    public aifx() {
        super("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            mo36561a((OnConnectionInitiatedParams) dcl.m8163a(parcel, OnConnectionInitiatedParams.CREATOR));
            return true;
        } else if (i == 3) {
            mo36562a((OnConnectionResultParams) dcl.m8163a(parcel, OnConnectionResultParams.CREATOR));
            return true;
        } else if (i == 4) {
            mo36563a((OnDisconnectedParams) dcl.m8163a(parcel, OnDisconnectedParams.CREATOR));
            return true;
        } else if (i != 5) {
            return false;
        } else {
            mo36560a((OnBandwidthChangedParams) dcl.m8163a(parcel, OnBandwidthChangedParams.CREATOR));
            return true;
        }
    }
}

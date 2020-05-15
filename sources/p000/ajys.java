package p000;

import android.os.Parcel;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDiscoveredParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDistanceChangedParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetLostParams;

/* renamed from: ajys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ajys extends dck implements ajyt {
    public ajys() {
        super("com.google.android.gms.nearby.sharing.internal.IShareTargetDiscoveredCallback");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo38774a((OnShareTargetDiscoveredParams) dcl.m8163a(parcel, OnShareTargetDiscoveredParams.CREATOR));
        } else if (i == 2) {
            mo38776a((OnShareTargetLostParams) dcl.m8163a(parcel, OnShareTargetLostParams.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            mo38775a((OnShareTargetDistanceChangedParams) dcl.m8163a(parcel, OnShareTargetDistanceChangedParams.CREATOR));
        }
        return true;
    }
}

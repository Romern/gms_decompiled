package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDiscoveredParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDistanceChangedParams;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetLostParams;

/* renamed from: ajyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajyr extends dcj implements ajyt {
    public ajyr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.sharing.internal.IShareTargetDiscoveredCallback");
    }

    /* renamed from: a */
    public final void mo38774a(OnShareTargetDiscoveredParams onShareTargetDiscoveredParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onShareTargetDiscoveredParams);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo38775a(OnShareTargetDistanceChangedParams onShareTargetDistanceChangedParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onShareTargetDistanceChangedParams);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo38776a(OnShareTargetLostParams onShareTargetLostParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onShareTargetLostParams);
        mo8530c(2, bj);
    }
}

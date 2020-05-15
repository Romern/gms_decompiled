package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointLostParams;
import com.google.android.gms.nearby.internal.connection.OnStoppedDiscoveryParams;

/* renamed from: aigc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aigc extends dcj implements aige {
    public aigc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.internal.connection.IDiscoveryCallback");
    }

    /* renamed from: a */
    public final void mo36574a(OnEndpointFoundParams onEndpointFoundParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onEndpointFoundParams);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo36575a(OnEndpointLostParams onEndpointLostParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onEndpointLostParams);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo36576a(OnStoppedDiscoveryParams onStoppedDiscoveryParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onStoppedDiscoveryParams);
        mo8530c(4, bj);
    }
}

package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnEndpointDistanceChangedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointLostParams;
import com.google.android.gms.nearby.internal.connection.OnStoppedDiscoveryParams;

/* renamed from: aigf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aigf extends dcj implements aigh {
    public aigf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.internal.connection.IDiscoveryListener");
    }

    /* renamed from: a */
    public final void mo36554a(OnEndpointDistanceChangedParams onEndpointDistanceChangedParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onEndpointDistanceChangedParams);
        mo8530c(5, bj);
    }

    /* renamed from: a */
    public final void mo36557a(OnStoppedDiscoveryParams onStoppedDiscoveryParams) {
        throw null;
    }

    /* renamed from: a */
    public final void mo36555a(OnEndpointFoundParams onEndpointFoundParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onEndpointFoundParams);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo36556a(OnEndpointLostParams onEndpointLostParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onEndpointLostParams);
        mo8530c(3, bj);
    }
}

package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnBandwidthChangedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionInitiatedParams;
import com.google.android.gms.nearby.internal.connection.OnConnectionResultParams;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;

/* renamed from: aifw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aifw extends dcj implements aify {
    public aifw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
    }

    /* renamed from: a */
    public final void mo36560a(OnBandwidthChangedParams onBandwidthChangedParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onBandwidthChangedParams);
        mo8530c(5, bj);
    }

    /* renamed from: a */
    public final void mo36561a(OnConnectionInitiatedParams onConnectionInitiatedParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onConnectionInitiatedParams);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo36562a(OnConnectionResultParams onConnectionResultParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onConnectionResultParams);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo36563a(OnDisconnectedParams onDisconnectedParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onDisconnectedParams);
        mo8530c(4, bj);
    }
}

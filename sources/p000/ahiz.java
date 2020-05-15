package p000;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.nearby.internal.connection.OnEndpointDistanceChangedParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointLostParams;
import com.google.android.gms.nearby.internal.connection.OnStoppedDiscoveryParams;

/* renamed from: ahiz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahiz extends aigg {

    /* renamed from: a */
    final /* synthetic */ aige f67261a;

    public ahiz(aige aige) {
        this.f67261a = aige;
    }

    /* renamed from: a */
    public final void mo36554a(OnEndpointDistanceChangedParams onEndpointDistanceChangedParams) {
    }

    public final void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        super.linkToDeath(deathRecipient, i);
        try {
            this.f67261a.asBinder().linkToDeath(deathRecipient, i);
        } catch (RemoteException e) {
            ahkm.m55982a(e, "Exception calling linkToDeath on IDiscoveryCallback", new Object[0]);
        }
    }

    public final boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        this.f67261a.asBinder().unlinkToDeath(deathRecipient, i);
        return super.unlinkToDeath(deathRecipient, i);
    }

    /* renamed from: a */
    public final void mo36555a(OnEndpointFoundParams onEndpointFoundParams) {
        this.f67261a.mo36574a(onEndpointFoundParams);
    }

    /* renamed from: a */
    public final void mo36556a(OnEndpointLostParams onEndpointLostParams) {
        this.f67261a.mo36575a(onEndpointLostParams);
    }

    /* renamed from: a */
    public final void mo36557a(OnStoppedDiscoveryParams onStoppedDiscoveryParams) {
        this.f67261a.mo36576a(onStoppedDiscoveryParams);
    }
}

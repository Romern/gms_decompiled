package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointLostParams;
import com.google.android.gms.nearby.internal.connection.OnStoppedDiscoveryParams;

/* renamed from: ahjf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahjf extends aigd {

    /* renamed from: a */
    final /* synthetic */ aigi f67268a;

    public ahjf(aigi aigi) {
        this.f67268a = aigi;
    }

    /* renamed from: a */
    public final void mo36574a(OnEndpointFoundParams onEndpointFoundParams) {
        aigi aigi = this.f67268a;
        String str = onEndpointFoundParams.f80590a;
        String str2 = onEndpointFoundParams.f80591b;
        String str3 = onEndpointFoundParams.f80592c;
        Parcel bj = aigi.mo8529bj();
        bj.writeString(str);
        bj.writeString(null);
        bj.writeString(str2);
        bj.writeString(str3);
        aigi.mo8528b(1002, bj);
    }

    /* renamed from: a */
    public final void mo36576a(OnStoppedDiscoveryParams onStoppedDiscoveryParams) {
    }

    public final void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        super.linkToDeath(deathRecipient, i);
        try {
            this.f67268a.f12819a.linkToDeath(deathRecipient, i);
        } catch (RemoteException e) {
            ahkm.m55982a(e, "Exception calling linkToDeath on INearbyConnectionCallbacks", new Object[0]);
        }
    }

    public final boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        this.f67268a.f12819a.unlinkToDeath(deathRecipient, i);
        return super.unlinkToDeath(deathRecipient, i);
    }

    /* renamed from: a */
    public final void mo36575a(OnEndpointLostParams onEndpointLostParams) {
        aigi aigi = this.f67268a;
        String str = onEndpointLostParams.f80595a;
        Parcel bj = aigi.mo8529bj();
        bj.writeString(str);
        aigi.mo8528b(1003, bj);
    }
}

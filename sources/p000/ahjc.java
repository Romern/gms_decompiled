package p000;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.nearby.internal.connection.OnPayloadReceivedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadTransferUpdateParams;

/* renamed from: ahjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahjc extends aign {

    /* renamed from: a */
    final /* synthetic */ aifv f67265a;

    public ahjc(aifv aifv) {
        this.f67265a = aifv;
    }

    /* renamed from: a */
    public final void mo36566a(OnPayloadReceivedParams onPayloadReceivedParams) {
        this.f67265a.mo36550a(onPayloadReceivedParams);
    }

    public final void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        super.linkToDeath(deathRecipient, i);
        try {
            this.f67265a.asBinder().linkToDeath(deathRecipient, i);
        } catch (RemoteException e) {
            ahkm.m55982a(e, "Exception calling linkToDeath on IConnectionEventListener", new Object[0]);
        }
    }

    public final boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        this.f67265a.asBinder().unlinkToDeath(deathRecipient, i);
        return super.unlinkToDeath(deathRecipient, i);
    }

    /* renamed from: a */
    public final void mo36567a(OnPayloadTransferUpdateParams onPayloadTransferUpdateParams) {
        this.f67265a.mo36551a(onPayloadTransferUpdateParams);
    }
}

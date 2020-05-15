package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadReceivedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadTransferUpdateParams;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;

/* renamed from: ahiy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahiy extends aifu {

    /* renamed from: a */
    final /* synthetic */ aigi f67260a;

    public ahiy(aigi aigi) {
        this.f67260a = aigi;
    }

    /* renamed from: a */
    public final void mo36549a(OnDisconnectedParams onDisconnectedParams) {
        aigi aigi = this.f67260a;
        String str = onDisconnectedParams.f80587a;
        Parcel bj = aigi.mo8529bj();
        bj.writeString(str);
        aigi.mo8528b(1008, bj);
    }

    /* renamed from: a */
    public final void mo36551a(OnPayloadTransferUpdateParams onPayloadTransferUpdateParams) {
    }

    public final void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        super.linkToDeath(deathRecipient, i);
        try {
            this.f67260a.f12819a.linkToDeath(deathRecipient, i);
        } catch (RemoteException e) {
            ahkm.m55982a(e, "Exception calling linkToDeath on INearbyConnectionCallbacks", new Object[0]);
        }
    }

    public final boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        this.f67260a.f12819a.unlinkToDeath(deathRecipient, i);
        return super.unlinkToDeath(deathRecipient, i);
    }

    /* renamed from: a */
    public final void mo36550a(OnPayloadReceivedParams onPayloadReceivedParams) {
        ParcelablePayload parcelablePayload = onPayloadReceivedParams.f80597b;
        if (parcelablePayload.f80606b == 1) {
            aigi aigi = this.f67260a;
            String str = onPayloadReceivedParams.f80596a;
            byte[] bArr = parcelablePayload.f80607c;
            boolean z = onPayloadReceivedParams.f80598c;
            Parcel bj = aigi.mo8529bj();
            bj.writeString(str);
            bj.writeByteArray(bArr);
            dcl.m8166a(bj, z);
            aigi.mo8528b(1007, bj);
        }
    }
}

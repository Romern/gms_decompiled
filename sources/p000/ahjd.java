package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.internal.connection.OnConnectionRequestParams;

/* renamed from: ahjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahjd extends aifr {

    /* renamed from: a */
    final /* synthetic */ aigi f67266a;

    public ahjd(aigi aigi) {
        this.f67266a = aigi;
    }

    /* renamed from: a */
    public final void mo36570a(OnConnectionRequestParams onConnectionRequestParams) {
        aigi aigi = this.f67266a;
        String str = onConnectionRequestParams.f80578a;
        String str2 = onConnectionRequestParams.f80579b;
        byte[] bArr = onConnectionRequestParams.f80580c;
        Parcel bj = aigi.mo8529bj();
        bj.writeString(str);
        bj.writeString(null);
        bj.writeString(str2);
        bj.writeByteArray(bArr);
        aigi.mo8528b(1001, bj);
    }

    public final void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        super.linkToDeath(deathRecipient, i);
        try {
            this.f67266a.f12819a.linkToDeath(deathRecipient, i);
        } catch (RemoteException e) {
            ahkm.m55982a(e, "Exception calling linkToDeath on INearbyConnectionCallbacks", new Object[0]);
        }
    }

    public final boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        this.f67266a.f12819a.unlinkToDeath(deathRecipient, i);
        return super.unlinkToDeath(deathRecipient, i);
    }
}

package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadReceivedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadTransferUpdateParams;

/* renamed from: aift */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aift extends dcj implements aifv {
    public aift(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.internal.connection.IConnectionEventListener");
    }

    /* renamed from: a */
    public final void mo36549a(OnDisconnectedParams onDisconnectedParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onDisconnectedParams);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo36550a(OnPayloadReceivedParams onPayloadReceivedParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onPayloadReceivedParams);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo36551a(OnPayloadTransferUpdateParams onPayloadTransferUpdateParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onPayloadTransferUpdateParams);
        mo8530c(4, bj);
    }
}

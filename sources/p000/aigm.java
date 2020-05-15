package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnPayloadReceivedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadTransferUpdateParams;

/* renamed from: aigm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aigm extends dcj implements aigo {
    public aigm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.internal.connection.IPayloadListener");
    }

    /* renamed from: a */
    public final void mo36566a(OnPayloadReceivedParams onPayloadReceivedParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onPayloadReceivedParams);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo36567a(OnPayloadTransferUpdateParams onPayloadTransferUpdateParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onPayloadTransferUpdateParams);
        mo8530c(3, bj);
    }
}

package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.sharing.internal.OnTransferUpdateParams;

/* renamed from: ajyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajyx extends dcj implements ajyz {
    public ajyx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.sharing.internal.ITransferUpdateCallback");
    }

    /* renamed from: a */
    public final void mo38778a(OnTransferUpdateParams onTransferUpdateParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onTransferUpdateParams);
        mo8530c(1, bj);
    }
}

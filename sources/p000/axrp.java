package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: axrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axrp extends dcj implements IInterface {
    public axrp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
    }

    /* renamed from: a */
    public final void mo53436a(int i, int i2) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        bj.writeInt(i2);
        mo8528b(2, bj);
    }
}

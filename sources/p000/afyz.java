package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: afyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afyz extends dcj implements IInterface {
    public afyz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mdm.internal.IDeviceManagerCallbacks");
    }

    /* renamed from: a */
    public final void mo35072a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8528b(2, bj);
    }
}

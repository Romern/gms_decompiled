package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: tvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tvv extends dcj implements tvx {
    public tvv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.deviceconnection.internal.IDeviceConnectionCallbacks");
    }

    /* renamed from: a */
    public final void mo26830a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8528b(1002, bj);
    }

    /* renamed from: a */
    public final void mo26831a(DataHolder dataHolder) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, dataHolder);
        mo8528b(1001, bj);
    }
}

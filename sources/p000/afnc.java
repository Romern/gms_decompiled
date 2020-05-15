package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: afnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afnc extends dcj implements IInterface {
    public afnc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mdh.internal.IMdhTimeSeriesFootprintsWriteResultCallback");
    }

    /* renamed from: a */
    public final void mo34971a(Status status, long j) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeLong(j);
        mo8530c(1, bj);
    }
}

package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: vjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vjl extends dcj implements IInterface {
    public vjl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.drive.realtime.internal.IDataHolderCallback");
    }

    /* renamed from: a */
    public final void mo28501a(DataHolder dataHolder) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, dataHolder);
        mo8528b(1, bj);
    }
}

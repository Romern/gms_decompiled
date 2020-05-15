package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;

/* renamed from: nrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nrk extends dcj implements IInterface {
    public nrk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarCallback");
    }

    /* renamed from: a */
    public final void mo21484a(BitmapTeleporter bitmapTeleporter) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, bitmapTeleporter);
        mo8530c(2, bj);
    }
}

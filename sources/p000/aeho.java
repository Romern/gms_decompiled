package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.DeviceOrientation;

/* renamed from: aeho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeho extends dcj implements aehq {
    public aeho(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.IDeviceOrientationListener");
    }

    /* renamed from: a */
    public final void mo34156a(DeviceOrientation deviceOrientation) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, deviceOrientation);
        mo8530c(1, bj);
    }
}

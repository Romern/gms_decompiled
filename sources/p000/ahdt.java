package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.bootstrap.Device;

/* renamed from: ahdt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahdt extends dcj implements ahdv {
    public ahdt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.bootstrap.internal.IScanListener");
    }

    /* renamed from: a */
    public final void mo36361a() {
        mo8530c(2, mo8529bj());
    }

    /* renamed from: a */
    public final void mo36362a(Device device) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, device);
        mo8530c(1, bj);
    }
}

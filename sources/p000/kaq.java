package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.uncertifieddevice.UncertifiedDeviceServiceResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: kaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kaq extends dcj implements IInterface {
    public kaq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.uncertifieddevice.IUncertifiedDeviceServiceCallback");
    }

    /* renamed from: a */
    public final void mo14338a(Status status, UncertifiedDeviceServiceResponse uncertifiedDeviceServiceResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, uncertifiedDeviceServiceResponse);
        mo8530c(1, bj);
    }
}

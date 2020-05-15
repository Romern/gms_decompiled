package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.dataservice.ClearTokenResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: gop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gop extends dcj implements IInterface {
    public gop(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IClearTokenCallback");
    }

    /* renamed from: a */
    public final void mo12113a(Status status, ClearTokenResponse clearTokenResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, clearTokenResponse);
        mo8530c(2, bj);
    }
}

package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.dataservice.DeviceManagementInfoResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: goy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class goy extends dcj implements gpa {
    public goy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGetDeviceManagementInfoCallback");
    }

    /* renamed from: a */
    public final void mo12118a(Status status, DeviceManagementInfoResponse deviceManagementInfoResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, deviceManagementInfoResponse);
        mo8530c(2, bj);
    }
}

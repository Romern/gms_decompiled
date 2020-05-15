package p000;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.dataservice.DeviceManagementInfoResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: goz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class goz extends dck implements gpa {

    /* renamed from: a */
    final /* synthetic */ aucf f18780a;

    public goz() {
        super("com.google.android.gms.auth.account.data.IGetDeviceManagementInfoCallback");
    }

    /* renamed from: a */
    public final void mo12118a(Status status, DeviceManagementInfoResponse deviceManagementInfoResponse) {
        rpc.m34202a(status, deviceManagementInfoResponse, this.f18780a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public goz(aucf aucf) {
        super("com.google.android.gms.auth.account.data.IGetDeviceManagementInfoCallback");
        this.f18780a = aucf;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        mo12118a((Status) dcl.m8163a(parcel, Status.CREATOR), (DeviceManagementInfoResponse) dcl.m8163a(parcel, DeviceManagementInfoResponse.CREATOR));
        return true;
    }
}

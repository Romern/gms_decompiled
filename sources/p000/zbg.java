package p000;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.fitness.request.ClaimBleDeviceRequest;
import com.google.android.gms.fitness.request.ListClaimedBleDevicesRequest;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.request.StopBleScanRequest;
import com.google.android.gms.fitness.request.UnclaimBleDeviceRequest;

/* renamed from: zbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zbg extends dck implements zbh {

    /* renamed from: a */
    final /* synthetic */ zmn f54901a;

    /* renamed from: b */
    private final ytu f54902b;

    public zbg() {
        super("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
    }

    /* renamed from: a */
    public final void mo30902a(ClaimBleDeviceRequest claimBleDeviceRequest) {
        this.f54902b.mo30771a(2, claimBleDeviceRequest);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zbg(zmn zmn, ytu ytu) {
        super("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
        this.f54901a = zmn;
        this.f54902b = ytu;
    }

    /* renamed from: a */
    public final void mo30903a(ListClaimedBleDevicesRequest listClaimedBleDevicesRequest) {
        this.f54902b.mo30771a(4, listClaimedBleDevicesRequest);
    }

    /* renamed from: a */
    public final void mo30904a(StartBleScanRequest startBleScanRequest) {
        zmn zmn = this.f54901a;
        srn srn = zmn.f55470d;
        Context context = zmn.f55428a;
        ytt ytt = this.f54902b.f54621a;
        context.enforcePermission("android.permission.BLUETOOTH_ADMIN", ytt.f54619c, ytt.f54618b, "Missing BLUETOOTH_ADMIN permission");
        this.f54902b.mo30771a(0, startBleScanRequest);
    }

    /* renamed from: a */
    public final void mo30905a(StopBleScanRequest stopBleScanRequest) {
        this.f54902b.mo30771a(1, stopBleScanRequest);
    }

    /* renamed from: a */
    public final void mo30906a(UnclaimBleDeviceRequest unclaimBleDeviceRequest) {
        this.f54902b.mo30771a(3, unclaimBleDeviceRequest);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo30904a((StartBleScanRequest) dcl.m8163a(parcel, StartBleScanRequest.CREATOR));
        } else if (i == 2) {
            mo30905a((StopBleScanRequest) dcl.m8163a(parcel, StopBleScanRequest.CREATOR));
        } else if (i == 3) {
            mo30902a((ClaimBleDeviceRequest) dcl.m8163a(parcel, ClaimBleDeviceRequest.CREATOR));
        } else if (i == 4) {
            mo30906a((UnclaimBleDeviceRequest) dcl.m8163a(parcel, UnclaimBleDeviceRequest.CREATOR));
        } else if (i != 5) {
            return false;
        } else {
            mo30903a((ListClaimedBleDevicesRequest) dcl.m8163a(parcel, ListClaimedBleDevicesRequest.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}

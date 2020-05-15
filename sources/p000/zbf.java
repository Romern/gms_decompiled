package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fitness.request.ClaimBleDeviceRequest;
import com.google.android.gms.fitness.request.ListClaimedBleDevicesRequest;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.request.StopBleScanRequest;
import com.google.android.gms.fitness.request.UnclaimBleDeviceRequest;

/* renamed from: zbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zbf extends dcj implements zbh {
    public zbf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitBleApi");
    }

    /* renamed from: a */
    public final void mo30902a(ClaimBleDeviceRequest claimBleDeviceRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, claimBleDeviceRequest);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo30903a(ListClaimedBleDevicesRequest listClaimedBleDevicesRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, listClaimedBleDevicesRequest);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo30904a(StartBleScanRequest startBleScanRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, startBleScanRequest);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo30905a(StopBleScanRequest stopBleScanRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, stopBleScanRequest);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo30906a(UnclaimBleDeviceRequest unclaimBleDeviceRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, unclaimBleDeviceRequest);
        mo8528b(4, bj);
    }
}

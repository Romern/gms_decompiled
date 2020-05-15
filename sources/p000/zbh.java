package p000;

import android.os.IInterface;
import com.google.android.gms.fitness.request.ClaimBleDeviceRequest;
import com.google.android.gms.fitness.request.ListClaimedBleDevicesRequest;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.request.StopBleScanRequest;
import com.google.android.gms.fitness.request.UnclaimBleDeviceRequest;

/* renamed from: zbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface zbh extends IInterface {
    /* renamed from: a */
    void mo30902a(ClaimBleDeviceRequest claimBleDeviceRequest);

    /* renamed from: a */
    void mo30903a(ListClaimedBleDevicesRequest listClaimedBleDevicesRequest);

    /* renamed from: a */
    void mo30904a(StartBleScanRequest startBleScanRequest);

    /* renamed from: a */
    void mo30905a(StopBleScanRequest stopBleScanRequest);

    /* renamed from: a */
    void mo30906a(UnclaimBleDeviceRequest unclaimBleDeviceRequest);
}

package p000;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkResponse;
import com.google.android.gms.smartdevice.wifi.GetWifiCredentialsResponse;

/* renamed from: asdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface asdq extends IInterface {
    /* renamed from: a */
    void mo49072a(Status status, ConnectToWifiNetworkResponse connectToWifiNetworkResponse);

    /* renamed from: a */
    void mo49073a(Status status, GetWifiCredentialsResponse getWifiCredentialsResponse);
}

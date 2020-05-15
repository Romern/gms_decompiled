package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkResponse;
import com.google.android.gms.smartdevice.wifi.GetWifiCredentialsResponse;

/* renamed from: asdp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class asdp extends dck implements asdq {
    public asdp() {
        super("com.google.android.gms.smartdevice.wifi.internal.IWifiHelperCallbacks");
    }

    /* renamed from: a */
    public void mo49072a(Status status, ConnectToWifiNetworkResponse connectToWifiNetworkResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo49073a(Status status, GetWifiCredentialsResponse getWifiCredentialsResponse) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo49073a((Status) dcl.m8163a(parcel, Status.CREATOR), (GetWifiCredentialsResponse) dcl.m8163a(parcel, GetWifiCredentialsResponse.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo49072a((Status) dcl.m8163a(parcel, Status.CREATOR), (ConnectToWifiNetworkResponse) dcl.m8163a(parcel, ConnectToWifiNetworkResponse.CREATOR));
        }
        return true;
    }
}

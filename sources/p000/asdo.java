package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkResponse;
import com.google.android.gms.smartdevice.wifi.GetWifiCredentialsResponse;

/* renamed from: asdo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asdo extends dcj implements asdq {
    public asdo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.wifi.internal.IWifiHelperCallbacks");
    }

    /* renamed from: a */
    public final void mo49072a(Status status, ConnectToWifiNetworkResponse connectToWifiNetworkResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, connectToWifiNetworkResponse);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo49073a(Status status, GetWifiCredentialsResponse getWifiCredentialsResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, getWifiCredentialsResponse);
        mo8530c(1, bj);
    }
}

package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkRequest;
import com.google.android.gms.smartdevice.wifi.GetWifiCredentialsRequest;

/* renamed from: asdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asdr extends dcj implements asdt {
    public asdr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.wifi.internal.IWifiHelperService");
    }

    /* renamed from: a */
    public final void mo49070a(asdq asdq, ConnectToWifiNetworkRequest connectToWifiNetworkRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, asdq);
        dcl.m8165a(bj, connectToWifiNetworkRequest);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo49071a(asdq asdq, GetWifiCredentialsRequest getWifiCredentialsRequest) {
        throw null;
    }
}

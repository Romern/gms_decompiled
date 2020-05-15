package p000;

import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkRequest;
import com.google.android.gms.smartdevice.wifi.GetWifiCredentialsRequest;
import com.google.android.gms.smartdevice.wifi.WifiHelperChimeraService;

/* renamed from: asdj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asdj extends asds implements aaai {

    /* renamed from: a */
    private final WifiHelperChimeraService f88734a;

    /* renamed from: b */
    private final aaag f88735b;

    public asdj(WifiHelperChimeraService wifiHelperChimeraService, aaag aaag) {
        this.f88734a = wifiHelperChimeraService;
        this.f88735b = aaag;
    }

    /* renamed from: a */
    public final void mo49070a(asdq asdq, ConnectToWifiNetworkRequest connectToWifiNetworkRequest) {
        this.f88735b.mo16659a(this.f88734a, new asdv(asdq, connectToWifiNetworkRequest));
    }

    /* renamed from: a */
    public final void mo49071a(asdq asdq, GetWifiCredentialsRequest getWifiCredentialsRequest) {
        this.f88735b.mo16659a(this.f88734a, new asdx(asdq, getWifiCredentialsRequest));
    }
}

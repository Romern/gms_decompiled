package p000;

import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pManager;

/* renamed from: aimp */
final /* synthetic */ class aimp implements WifiP2pManager.DeviceInfoListener {

    /* renamed from: a */
    private final bqgy f69199a;

    public aimp(bqgy bqgy) {
        this.f69199a = bqgy;
    }

    public final void onDeviceInfoAvailable(WifiP2pDevice wifiP2pDevice) {
        this.f69199a.mo69138b(wifiP2pDevice);
    }
}

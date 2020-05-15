package p000;

import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager;

/* renamed from: ciug */
final /* synthetic */ class ciug implements WifiP2pManager.GroupInfoListener {

    /* renamed from: a */
    private final ciuh f191471a;

    public ciug(ciuh ciuh) {
        this.f191471a = ciuh;
    }

    public final void onGroupInfoAvailable(WifiP2pGroup wifiP2pGroup) {
        this.f191471a.mo86576a(wifiP2pGroup);
    }
}

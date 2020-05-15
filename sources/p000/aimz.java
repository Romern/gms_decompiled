package p000;

import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager;
import java.util.concurrent.CountDownLatch;

/* renamed from: aimz */
final /* synthetic */ class aimz implements WifiP2pManager.GroupInfoListener {

    /* renamed from: a */
    private final ainc f69228a;

    /* renamed from: b */
    private final CountDownLatch f69229b;

    /* renamed from: c */
    private final WifiP2pManager.Channel f69230c;

    public aimz(ainc ainc, CountDownLatch countDownLatch, WifiP2pManager.Channel channel) {
        this.f69228a = ainc;
        this.f69229b = countDownLatch;
        this.f69230c = channel;
    }

    public final void onGroupInfoAvailable(WifiP2pGroup wifiP2pGroup) {
        ainc ainc = this.f69228a;
        CountDownLatch countDownLatch = this.f69229b;
        WifiP2pManager.Channel channel = this.f69230c;
        if (wifiP2pGroup != null && wifiP2pGroup.isGroupOwner()) {
            ainc.f69232a.removeGroup(channel, new ainb(countDownLatch));
            return;
        }
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("ainc", "a", 690, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Failed to stop Wifi Direct hotspot because no group was found.");
        countDownLatch.countDown();
    }
}

package p000;

import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager;
import java.util.concurrent.CountDownLatch;

/* renamed from: aioa */
final /* synthetic */ class aioa implements WifiP2pManager.GroupInfoListener {

    /* renamed from: a */
    private final aioe f69307a;

    /* renamed from: b */
    private final CountDownLatch f69308b;

    /* renamed from: c */
    private final WifiP2pManager.Channel f69309c;

    public aioa(aioe aioe, CountDownLatch countDownLatch, WifiP2pManager.Channel channel) {
        this.f69307a = aioe;
        this.f69308b = countDownLatch;
        this.f69309c = channel;
    }

    public final void onGroupInfoAvailable(WifiP2pGroup wifiP2pGroup) {
        aioe aioe = this.f69307a;
        CountDownLatch countDownLatch = this.f69308b;
        WifiP2pManager.Channel channel = this.f69309c;
        if (wifiP2pGroup != null && wifiP2pGroup.isGroupOwner()) {
            aioe.f69313a.removeGroup(channel, new aiod(countDownLatch));
            return;
        }
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aioe", "a", 1463, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Failed to stop Wifi Direct hotspot because no group was found.");
        countDownLatch.countDown();
    }
}

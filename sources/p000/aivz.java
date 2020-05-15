package p000;

import android.net.wifi.p2p.WifiP2pManager;

/* renamed from: aivz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aivz implements WifiP2pManager.ChannelListener {

    /* renamed from: a */
    WifiP2pManager.Channel f69917a;

    /* renamed from: b */
    final /* synthetic */ aiwa f69918b;

    public aivz(aiwa aiwa) {
        this.f69918b = aiwa;
    }

    public final void onChannelDisconnected() {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aivz", "onChannelDisconnected", 190, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("WiFi Direct channel has disconnected.");
        WifiP2pManager.Channel channel = this.f69917a;
        if (channel != null) {
            aiwa aiwa = this.f69918b;
            long j = aiwa.f69919a;
            aiwa.mo38145a(channel);
            this.f69917a = null;
        }
    }
}

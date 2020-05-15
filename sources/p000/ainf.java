package p000;

import android.net.wifi.p2p.WifiP2pManager;

/* renamed from: ainf */
public final /* synthetic */ class ainf implements WifiP2pManager.ChannelListener {

    /* renamed from: a */
    private final aiof f69250a;

    public ainf(aiof aiof) {
        this.f69250a = aiof;
    }

    public final void onChannelDisconnected() {
        aiof aiof = this.f69250a;
        aiof.mo37743a(new ainl(aiof));
    }
}

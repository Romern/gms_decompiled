package p000;

import android.net.wifi.p2p.WifiP2pManager;

/* renamed from: aims */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class aims implements WifiP2pManager.ActionListener {

    /* renamed from: a */
    private final bqgy f69205a;

    public aims(bqgy bqgy) {
        this.f69205a = bqgy;
    }

    public final void onFailure(int i) {
        this.f69205a.mo69136a((Throwable) new Exception(aile.m57411a(i)));
    }

    public void onSuccess() {
        this.f69205a.mo69138b((Object) null);
    }
}

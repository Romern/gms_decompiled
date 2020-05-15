package p000;

import android.net.wifi.p2p.WifiP2pManager;

/* renamed from: aimu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aimu implements WifiP2pManager.ActionListener {

    /* renamed from: a */
    final /* synthetic */ bqgy f69207a;

    /* renamed from: b */
    final /* synthetic */ aimv f69208b;

    public aimu(aimv aimv, bqgy bqgy) {
        this.f69208b = aimv;
        this.f69207a = bqgy;
    }

    public final void onFailure(int i) {
        this.f69207a.mo69136a((Throwable) new Exception(String.format("WifiDirect failed to connect to %s: %s", this.f69208b.f69211c, aile.m57411a(i))));
    }

    public final void onSuccess() {
        srn srn = ailf.f69111a;
    }
}

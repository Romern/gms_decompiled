package p000;

import android.net.wifi.p2p.WifiP2pManager;
import java.util.concurrent.CountDownLatch;

/* renamed from: aioc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aioc implements WifiP2pManager.ActionListener {

    /* renamed from: a */
    final /* synthetic */ CountDownLatch f69311a;

    public aioc(CountDownLatch countDownLatch) {
        this.f69311a = countDownLatch;
    }

    public final void onFailure(int i) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
        bnsl.mo68432a("aioc", "onFailure", 1422, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Failed to cancel Wifi Direct hotspot: %s.", aile.m57411a(i));
        this.f69311a.countDown();
    }

    public final void onSuccess() {
        this.f69311a.countDown();
    }
}

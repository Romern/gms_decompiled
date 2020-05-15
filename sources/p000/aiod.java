package p000;

import android.net.wifi.p2p.WifiP2pManager;
import java.util.concurrent.CountDownLatch;

/* renamed from: aiod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiod implements WifiP2pManager.ActionListener {

    /* renamed from: a */
    final /* synthetic */ CountDownLatch f69312a;

    public aiod(CountDownLatch countDownLatch) {
        this.f69312a = countDownLatch;
    }

    public final void onFailure(int i) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
        bnsl.mo68432a("aiod", "onFailure", 1479, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Failed to stop Wifi Direct hotspot: %s.", aile.m57411a(i));
        this.f69312a.countDown();
    }

    public final void onSuccess() {
        srn srn = ailf.f69111a;
        this.f69312a.countDown();
    }
}

package p000;

import android.net.wifi.p2p.WifiP2pManager;

/* renamed from: aiob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiob implements WifiP2pManager.ActionListener {

    /* renamed from: a */
    final /* synthetic */ bqgy f69310a;

    public aiob(bqgy bqgy) {
        this.f69310a = bqgy;
    }

    public final void onFailure(int i) {
        bqgy bqgy = this.f69310a;
        String valueOf = String.valueOf(aile.m57411a(i));
        bqgy.mo69136a((Throwable) new Exception(valueOf.length() == 0 ? new String("Failed to create Wifi Direct hotspot: ") : "Failed to create Wifi Direct hotspot: ".concat(valueOf)));
    }

    public final void onSuccess() {
        srn srn = ailf.f69111a;
    }
}

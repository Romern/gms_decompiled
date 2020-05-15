package p000;

import android.net.wifi.aware.AttachCallback;
import android.net.wifi.aware.WifiAwareSession;

/* renamed from: aiuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiuu extends AttachCallback {

    /* renamed from: a */
    final /* synthetic */ bqgy f69820a;

    public aiuu(bqgy bqgy) {
        this.f69820a = bqgy;
    }

    public final void onAttachFailed() {
        this.f69820a.mo69136a((Throwable) new Exception("Failed to create WiFi Aware session."));
    }

    public final void onAttached(WifiAwareSession wifiAwareSession) {
        this.f69820a.mo69138b(wifiAwareSession);
    }
}

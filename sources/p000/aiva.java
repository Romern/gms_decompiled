package p000;

import android.net.wifi.aware.DiscoverySession;
import android.net.wifi.aware.DiscoverySessionCallback;
import android.net.wifi.aware.PeerHandle;
import android.net.wifi.aware.PublishDiscoverySession;
import android.net.wifi.aware.SubscribeDiscoverySession;
import java.util.Map;

/* renamed from: aiva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class aiva extends DiscoverySessionCallback {

    /* renamed from: a */
    private final aivn f69836a;

    /* renamed from: b */
    private final String f69837b;

    /* renamed from: c */
    private final Map f69838c = new C1223np();

    /* renamed from: d */
    public DiscoverySession f69839d;

    public aiva(aivn aivn, String str) {
        this.f69836a = aivn;
        this.f69837b = str;
    }

    public final void onMessageReceived(PeerHandle peerHandle, byte[] bArr) {
        aivw aivw = (aivw) this.f69838c.get(peerHandle);
        if (aivw == null) {
            aivw aivw2 = new aivw(peerHandle, this.f69837b, this.f69839d, new byte[2]);
            this.f69838c.put(peerHandle, aivw2);
            aivw = aivw2;
        }
        aivn aivn = this.f69836a;
        aivn.mo38124a(new aivk(aivn, aivw, bArr));
    }

    public final void onMessageSendFailed(int i) {
        aivn aivn = this.f69836a;
        aivn.mo38124a(new aivj(aivn, i));
    }

    public final void onMessageSendSucceeded(int i) {
        aivn aivn = this.f69836a;
        aivn.mo38124a(new aivi(aivn, i));
    }

    public void onPublishStarted(PublishDiscoverySession publishDiscoverySession) {
        this.f69839d = publishDiscoverySession;
    }

    public void onSubscribeStarted(SubscribeDiscoverySession subscribeDiscoverySession) {
        this.f69839d = subscribeDiscoverySession;
    }
}

package p000;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: vet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vet extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    final /* synthetic */ vev f49144a;

    public vet(vev vev) {
        this.f49144a = vev;
    }

    /* renamed from: a */
    private final void m40255a() {
        vev vev = this.f49144a;
        sbw sbw = vev.f49146a;
        for (vem vem : vev.f49150e) {
            vem.mo28355a();
        }
    }

    public final void onAvailable(Network network) {
        vev vev = this.f49144a;
        sbw sbw = vev.f49146a;
        synchronized (vev.f49148c) {
            this.f49144a.f49149d.add(network);
            m40255a();
        }
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        vev vev = this.f49144a;
        sbw sbw = vev.f49146a;
        synchronized (vev.f49148c) {
            m40255a();
        }
    }

    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
    }

    public final void onLosing(Network network, int i) {
    }

    public final void onLost(Network network) {
        vev vev = this.f49144a;
        sbw sbw = vev.f49146a;
        synchronized (vev.f49148c) {
            this.f49144a.f49149d.remove(network);
            vev.f49146a.mo25369a("Lost %s", network);
            m40255a();
        }
    }
}

package p000;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import org.webrtc.Logging;
import org.webrtc.NetworkMonitorAutoDetect$NetworkInformation;

/* renamed from: ciuf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciuf extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    final /* synthetic */ ciuj f191470a;

    public ciuf(ciuj ciuj) {
        this.f191470a = ciuj;
    }

    /* renamed from: a */
    private final void m151022a(Network network) {
        NetworkMonitorAutoDetect$NetworkInformation a = this.f191470a.f191479d.mo86567a(network);
        if (a != null) {
            this.f191470a.f191482g.mo86564a(a);
        }
    }

    public final void onAvailable(Network network) {
        String valueOf = String.valueOf(network.toString());
        Logging.m151178a("NetworkMonitorAutoDetect", valueOf.length() == 0 ? new String("Network becomes available: ") : "Network becomes available: ".concat(valueOf));
        m151022a(network);
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        String valueOf = String.valueOf(networkCapabilities.toString());
        Logging.m151178a("NetworkMonitorAutoDetect", valueOf.length() == 0 ? new String("capabilities changed: ") : "capabilities changed: ".concat(valueOf));
        m151022a(network);
    }

    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        String valueOf = String.valueOf(linkProperties.toString());
        Logging.m151178a("NetworkMonitorAutoDetect", valueOf.length() == 0 ? new String("link properties changed: ") : "link properties changed: ".concat(valueOf));
        m151022a(network);
    }

    public final void onLosing(Network network, int i) {
        String network2 = network.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(network2).length() + 42);
        sb.append("Network ");
        sb.append(network2);
        sb.append(" is about to lose in ");
        sb.append(i);
        sb.append("ms");
        Logging.m151178a("NetworkMonitorAutoDetect", sb.toString());
    }

    public final void onLost(Network network) {
        String network2 = network.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(network2).length() + 24);
        sb.append("Network ");
        sb.append(network2);
        sb.append(" is disconnected");
        Logging.m151178a("NetworkMonitorAutoDetect", sb.toString());
        this.f191470a.f191482g.mo86563a(ciuj.m151024a(network));
    }
}

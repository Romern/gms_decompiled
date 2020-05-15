package p000;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.wifi.aware.WifiAwareNetworkInfo;
import android.os.Build;
import java.net.InetSocketAddress;

/* renamed from: aius */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aius extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    final /* synthetic */ bqgy f69817a;

    /* renamed from: b */
    final /* synthetic */ aivw f69818b;

    public aius(bqgy bqgy, aivw aivw) {
        this.f69817a = bqgy;
        this.f69818b = aivw;
    }

    public final void onLost(Network network) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aius", "onLost", 724, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Lost connection to the WiFi Aware network.");
    }

    public final void onUnavailable() {
        this.f69817a.mo69136a((Throwable) new RuntimeException(String.format("Failed to join the WiFi Aware network with %s", this.f69818b)));
    }

    public final void onAvailable(Network network) {
        int i = Build.VERSION.SDK_INT;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.net.Inet6Address, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        int i = Build.VERSION.SDK_INT;
        WifiAwareNetworkInfo wifiAwareNetworkInfo = (WifiAwareNetworkInfo) networkCapabilities.getTransportInfo();
        if (wifiAwareNetworkInfo != null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aius", "onCapabilitiesChanged", 703, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68422a("Received network info with ipAddr %s and port %s.", (Object) wifiAwareNetworkInfo.getPeerIpv6Addr(), wifiAwareNetworkInfo.getPort());
        }
        bqgy bqgy = this.f69817a;
        InetSocketAddress inetSocketAddress = null;
        if (!(wifiAwareNetworkInfo == null || wifiAwareNetworkInfo.getPeerIpv6Addr() == null || wifiAwareNetworkInfo.getPort() == 0)) {
            inetSocketAddress = new InetSocketAddress(wifiAwareNetworkInfo.getPeerIpv6Addr(), wifiAwareNetworkInfo.getPort());
        }
        bqgy.mo69138b(new aitm(network, inetSocketAddress));
    }
}

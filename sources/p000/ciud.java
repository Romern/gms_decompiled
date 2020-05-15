package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import org.webrtc.Logging;
import org.webrtc.NetworkMonitorAutoDetect$ConnectionType;
import org.webrtc.NetworkMonitorAutoDetect$IPAddress;
import org.webrtc.NetworkMonitorAutoDetect$NetworkInformation;

/* renamed from: ciud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciud {

    /* renamed from: a */
    public final ConnectivityManager f191464a;

    ciud() {
        this.f191464a = null;
    }

    /* renamed from: a */
    private static final ciue m151017a(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected()) {
            return new ciue(true, networkInfo.getType(), networkInfo.getSubtype(), -1, -1);
        }
        return new ciue(false, -1, -1, -1, -1);
    }

    /* renamed from: b */
    public final boolean mo86569b() {
        int i = Build.VERSION.SDK_INT;
        return this.f191464a != null;
    }

    public ciud(Context context) {
        this.f191464a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ciue mo86566a() {
        ConnectivityManager connectivityManager = this.f191464a;
        if (connectivityManager == null) {
            return new ciue(false, -1, -1, -1, -1);
        }
        return m151017a(connectivityManager.getActiveNetworkInfo());
    }

    /* renamed from: a */
    public final NetworkMonitorAutoDetect$NetworkInformation mo86567a(Network network) {
        ConnectivityManager connectivityManager;
        ciue ciue;
        NetworkMonitorAutoDetect$ConnectionType networkMonitorAutoDetect$ConnectionType;
        NetworkInfo activeNetworkInfo;
        Network network2 = network;
        if (network2 == null || (connectivityManager = this.f191464a) == null) {
            return null;
        }
        LinkProperties linkProperties = connectivityManager.getLinkProperties(network2);
        if (linkProperties == null) {
            String valueOf = String.valueOf(network.toString());
            Logging.m151181c("NetworkMonitorAutoDetect", valueOf.length() == 0 ? new String("Detected unknown network: ") : "Detected unknown network: ".concat(valueOf));
            return null;
        } else if (linkProperties.getInterfaceName() == null) {
            String valueOf2 = String.valueOf(network.toString());
            Logging.m151181c("NetworkMonitorAutoDetect", valueOf2.length() == 0 ? new String("Null interface name for network ") : "Null interface name for network ".concat(valueOf2));
            return null;
        } else {
            ConnectivityManager connectivityManager2 = this.f191464a;
            if (connectivityManager2 == null) {
                ciue = new ciue(false, -1, -1, -1, -1);
            } else {
                NetworkInfo networkInfo = connectivityManager2.getNetworkInfo(network2);
                if (networkInfo == null) {
                    String valueOf3 = String.valueOf(network.toString());
                    Logging.m151181c("NetworkMonitorAutoDetect", valueOf3.length() == 0 ? new String("Couldn't retrieve information from network ") : "Couldn't retrieve information from network ".concat(valueOf3));
                    ciue = new ciue(false, -1, -1, -1, -1);
                } else if (networkInfo.getType() != 17) {
                    NetworkCapabilities networkCapabilities = this.f191464a.getNetworkCapabilities(network2);
                    if (networkCapabilities == null || !networkCapabilities.hasTransport(4)) {
                        ciue = m151017a(networkInfo);
                    } else {
                        ciue = new ciue(networkInfo.isConnected(), 17, -1, networkInfo.getType(), networkInfo.getSubtype());
                    }
                } else if (networkInfo.getType() == 17) {
                    int i = Build.VERSION.SDK_INT;
                    if (!network2.equals(this.f191464a.getActiveNetwork()) || (activeNetworkInfo = this.f191464a.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() == 17) {
                        ciue = new ciue(networkInfo.isConnected(), 17, -1, -1, -1);
                    } else {
                        ciue = new ciue(networkInfo.isConnected(), 17, -1, activeNetworkInfo.getType(), activeNetworkInfo.getSubtype());
                    }
                } else {
                    ciue = m151017a(networkInfo);
                }
            }
            NetworkMonitorAutoDetect$ConnectionType a = ciuj.m151025a(ciue);
            if (a == NetworkMonitorAutoDetect$ConnectionType.CONNECTION_NONE) {
                String network3 = network.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(network3).length() + 24);
                sb.append("Network ");
                sb.append(network3);
                sb.append(" is disconnected");
                Logging.m151178a("NetworkMonitorAutoDetect", sb.toString());
                return null;
            }
            if (a == NetworkMonitorAutoDetect$ConnectionType.CONNECTION_UNKNOWN || a == NetworkMonitorAutoDetect$ConnectionType.CONNECTION_UNKNOWN_CELLULAR) {
                String network4 = network.toString();
                String valueOf4 = String.valueOf(a);
                int i2 = ciue.f191466b;
                int i3 = ciue.f191467c;
                StringBuilder sb2 = new StringBuilder(String.valueOf(network4).length() + 84 + String.valueOf(valueOf4).length());
                sb2.append("Network ");
                sb2.append(network4);
                sb2.append(" connection type is ");
                sb2.append(valueOf4);
                sb2.append(" because it has type ");
                sb2.append(i2);
                sb2.append(" and subtype ");
                sb2.append(i3);
                Logging.m151178a("NetworkMonitorAutoDetect", sb2.toString());
            }
            if (ciue.f191466b == 17) {
                networkMonitorAutoDetect$ConnectionType = ciuj.m151026a(ciue.f191465a, ciue.f191468d, ciue.f191469e);
            } else {
                networkMonitorAutoDetect$ConnectionType = NetworkMonitorAutoDetect$ConnectionType.CONNECTION_NONE;
            }
            String interfaceName = linkProperties.getInterfaceName();
            long a2 = ciuj.m151024a(network);
            NetworkMonitorAutoDetect$IPAddress[] networkMonitorAutoDetect$IPAddressArr = new NetworkMonitorAutoDetect$IPAddress[linkProperties.getLinkAddresses().size()];
            int i4 = 0;
            for (LinkAddress linkAddress : linkProperties.getLinkAddresses()) {
                networkMonitorAutoDetect$IPAddressArr[i4] = new NetworkMonitorAutoDetect$IPAddress(linkAddress.getAddress().getAddress());
                i4++;
            }
            return new NetworkMonitorAutoDetect$NetworkInformation(interfaceName, a, networkMonitorAutoDetect$ConnectionType, a2, networkMonitorAutoDetect$IPAddressArr);
        }
    }

    /* renamed from: a */
    public final void mo86568a(ConnectivityManager.NetworkCallback networkCallback) {
        if (mo86569b()) {
            Logging.m151178a("NetworkMonitorAutoDetect", "Unregister network callback");
            this.f191464a.unregisterNetworkCallback(networkCallback);
        }
    }
}

package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.wifi.WifiInfo;
import android.os.Build;
import org.webrtc.Logging;
import org.webrtc.NetworkMonitor;
import org.webrtc.NetworkMonitorAutoDetect$ConnectionType;
import org.webrtc.PeerConnectionFactory;

/* renamed from: ciuj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciuj extends BroadcastReceiver {

    /* renamed from: a */
    public final Context f191476a;

    /* renamed from: b */
    public final ConnectivityManager.NetworkCallback f191477b;

    /* renamed from: c */
    public final ConnectivityManager.NetworkCallback f191478c;

    /* renamed from: d */
    public final ciud f191479d;

    /* renamed from: e */
    public ciuh f191480e;

    /* renamed from: f */
    public boolean f191481f;

    /* renamed from: g */
    public final ciua f191482g;

    /* renamed from: h */
    private final IntentFilter f191483h = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");

    /* renamed from: i */
    private final ciui f191484i;

    /* renamed from: j */
    private NetworkMonitorAutoDetect$ConnectionType f191485j;

    /* renamed from: k */
    private String f191486k;

    public ciuj(ciua ciua, Context context) {
        String str;
        this.f191482g = ciua;
        this.f191476a = context;
        this.f191479d = new ciud(context);
        this.f191484i = new ciui(context);
        ciue a = this.f191479d.mo86566a();
        this.f191485j = m151025a(a);
        this.f191486k = m151027b(a);
        if (citz.m151013a()) {
            str = PeerConnectionFactory.nativeFindFieldTrialsFullName("IncludeWifiDirect");
        } else {
            str = "";
        }
        if (str.equals("Enabled")) {
            this.f191480e = new ciuh(ciua, context);
        }
        if (!this.f191481f) {
            this.f191481f = true;
            this.f191476a.registerReceiver(this, this.f191483h);
        }
        ConnectivityManager.NetworkCallback networkCallback = null;
        if (this.f191479d.mo86569b()) {
            ConnectivityManager.NetworkCallback networkCallback2 = new ConnectivityManager.NetworkCallback();
            try {
                ciud ciud = this.f191479d;
                NetworkRequest.Builder builder = new NetworkRequest.Builder();
                builder.addCapability(12).addTransportType(0);
                ciud.f191464a.requestNetwork(builder.build(), networkCallback2);
                networkCallback = networkCallback2;
            } catch (SecurityException e) {
                Logging.m151181c("NetworkMonitorAutoDetect", "Unable to obtain permission to request a cellular network.");
            }
            this.f191477b = networkCallback;
            ciuf ciuf = new ciuf(this);
            this.f191478c = ciuf;
            this.f191479d.f191464a.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), ciuf);
            return;
        }
        this.f191477b = null;
        this.f191478c = null;
    }

    /* renamed from: a */
    public static long m151024a(Network network) {
        int i = Build.VERSION.SDK_INT;
        return network.getNetworkHandle();
    }

    /* renamed from: b */
    private final String m151027b(ciue ciue) {
        Intent registerReceiver;
        WifiInfo wifiInfo;
        String ssid;
        if (m151025a(ciue) != NetworkMonitorAutoDetect$ConnectionType.CONNECTION_WIFI || (registerReceiver = this.f191484i.f191475a.registerReceiver(null, new IntentFilter("android.net.wifi.STATE_CHANGE"))) == null || (wifiInfo = (WifiInfo) registerReceiver.getParcelableExtra("wifiInfo")) == null || (ssid = wifiInfo.getSSID()) == null) {
            return "";
        }
        return ssid;
    }

    public final void onReceive(Context context, Intent intent) {
        ciue a = mo86578a();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            NetworkMonitorAutoDetect$ConnectionType a2 = m151025a(a);
            String b = m151027b(a);
            if (a2 != this.f191485j || !b.equals(this.f191486k)) {
                this.f191485j = a2;
                this.f191486k = b;
                String valueOf = String.valueOf(a2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                sb.append("Network connectivity changed, type is: ");
                sb.append(valueOf);
                Logging.m151178a("NetworkMonitorAutoDetect", sb.toString());
                NetworkMonitor networkMonitor = this.f191482g.f191462a;
                networkMonitor.f191862a = a2;
                networkMonitor.mo86818b();
            }
        }
    }

    /* renamed from: a */
    public static NetworkMonitorAutoDetect$ConnectionType m151025a(ciue ciue) {
        return m151026a(ciue.f191465a, ciue.f191466b, ciue.f191467c);
    }

    /* renamed from: a */
    public static NetworkMonitorAutoDetect$ConnectionType m151026a(boolean z, int i, int i2) {
        if (!z) {
            return NetworkMonitorAutoDetect$ConnectionType.CONNECTION_NONE;
        }
        if (i == 0) {
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return NetworkMonitorAutoDetect$ConnectionType.CONNECTION_2G;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return NetworkMonitorAutoDetect$ConnectionType.CONNECTION_3G;
                case 13:
                    return NetworkMonitorAutoDetect$ConnectionType.CONNECTION_4G;
                default:
                    return NetworkMonitorAutoDetect$ConnectionType.CONNECTION_UNKNOWN_CELLULAR;
            }
        } else if (i == 1) {
            return NetworkMonitorAutoDetect$ConnectionType.CONNECTION_WIFI;
        } else {
            if (i == 6) {
                return NetworkMonitorAutoDetect$ConnectionType.CONNECTION_4G;
            }
            if (i == 7) {
                return NetworkMonitorAutoDetect$ConnectionType.CONNECTION_BLUETOOTH;
            }
            if (i == 9) {
                return NetworkMonitorAutoDetect$ConnectionType.CONNECTION_ETHERNET;
            }
            if (i != 17) {
                return NetworkMonitorAutoDetect$ConnectionType.CONNECTION_UNKNOWN;
            }
            return NetworkMonitorAutoDetect$ConnectionType.CONNECTION_VPN;
        }
    }

    /* renamed from: a */
    public final ciue mo86578a() {
        return this.f191479d.mo86566a();
    }
}

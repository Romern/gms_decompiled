package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Build;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import org.webrtc.Logging;
import org.webrtc.NetworkMonitorAutoDetect$ConnectionType;
import org.webrtc.NetworkMonitorAutoDetect$IPAddress;
import org.webrtc.NetworkMonitorAutoDetect$NetworkInformation;

/* renamed from: ciuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciuh extends BroadcastReceiver {

    /* renamed from: a */
    public final Context f191472a;

    /* renamed from: b */
    public NetworkMonitorAutoDetect$NetworkInformation f191473b;

    /* renamed from: c */
    private final ciua f191474c;

    public ciuh(ciua ciua, Context context) {
        this.f191472a = context;
        this.f191474c = ciua;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.p2p.STATE_CHANGED");
        intentFilter.addAction("android.net.wifi.p2p.CONNECTION_STATE_CHANGE");
        context.registerReceiver(this, intentFilter);
        int i = Build.VERSION.SDK_INT;
        WifiP2pManager wifiP2pManager = (WifiP2pManager) context.getSystemService("wifip2p");
        wifiP2pManager.requestGroupInfo(wifiP2pManager.initialize(context, context.getMainLooper(), null), new ciug(this));
    }

    /* renamed from: a */
    public final void mo86576a(WifiP2pGroup wifiP2pGroup) {
        if (wifiP2pGroup != null && wifiP2pGroup.getInterface() != null) {
            try {
                ArrayList list = Collections.list(NetworkInterface.getByName(wifiP2pGroup.getInterface()).getInetAddresses());
                NetworkMonitorAutoDetect$IPAddress[] networkMonitorAutoDetect$IPAddressArr = new NetworkMonitorAutoDetect$IPAddress[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    networkMonitorAutoDetect$IPAddressArr[i] = new NetworkMonitorAutoDetect$IPAddress(((InetAddress) list.get(i)).getAddress());
                }
                NetworkMonitorAutoDetect$NetworkInformation networkMonitorAutoDetect$NetworkInformation = new NetworkMonitorAutoDetect$NetworkInformation(wifiP2pGroup.getInterface(), NetworkMonitorAutoDetect$ConnectionType.CONNECTION_WIFI, NetworkMonitorAutoDetect$ConnectionType.CONNECTION_NONE, 0, networkMonitorAutoDetect$IPAddressArr);
                this.f191473b = networkMonitorAutoDetect$NetworkInformation;
                this.f191474c.mo86564a(networkMonitorAutoDetect$NetworkInformation);
            } catch (SocketException e) {
                Logging.m151179a("NetworkMonitorAutoDetect", "Unable to get WifiP2p network interface", e);
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(intent.getAction())) {
            mo86576a((WifiP2pGroup) intent.getParcelableExtra("p2pGroupInfo"));
        } else if ("android.net.wifi.p2p.STATE_CHANGED".equals(intent.getAction()) && intent.getIntExtra("wifi_p2p_state", 0) == 1) {
            this.f191473b = null;
            this.f191474c.mo86563a(0);
        }
    }
}

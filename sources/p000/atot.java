package p000;

import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import java.util.Iterator;
import java.util.List;

/* renamed from: atot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atot {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    /* renamed from: a */
    public static void m76239a(WifiManager wifiManager, List list) {
        WifiInfo wifiInfo;
        int i;
        String str = null;
        if (wifiManager != null) {
            wifiInfo = wifiManager.getConnectionInfo();
        } else {
            wifiInfo = null;
        }
        if (wifiInfo != null) {
            str = wifiInfo.getBSSID();
        }
        if (str != null) {
            long a = bupz.m120219a(str);
            int networkId = wifiInfo.getNetworkId();
            List<WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
            if (configuredNetworks != null) {
                Iterator<WifiConfiguration> it = configuredNetworks.iterator();
                while (true) {
                    i = 2;
                    if (!it.hasNext()) {
                        break;
                    }
                    WifiConfiguration next = it.next();
                    if (networkId == next.networkId) {
                        if (!next.allowedKeyManagement.get(0)) {
                            i = !next.allowedKeyManagement.get(1) ? next.allowedKeyManagement.get(2) ? 5 : 6 : 4;
                        } else {
                            i = 3;
                        }
                    }
                }
                int size = list.size();
                int i2 = 0;
                while (i2 < size) {
                    bxvd bxvd = (bxvd) list.get(i2);
                    i2++;
                    if (((btqm) bxvd.f164949b).f149982a == a) {
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        btqm btqm = (btqm) bxvd.f164949b;
                        btqm btqm2 = btqm.f149980e;
                        btqm.f149985d = true;
                        btqm.f149984c = i - 2;
                        return;
                    }
                }
            }
        }
    }
}

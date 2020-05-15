package p000;

import android.content.Context;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;

/* renamed from: asdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asdd {
    /* renamed from: a */
    private static WifiConfiguration m73820a(String str) {
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        wifiConfiguration.SSID = ascr.m73790a(str);
        return wifiConfiguration;
    }

    /* renamed from: a */
    public static WifiConfiguration m73821a(String str, String str2, String str3, boolean z) {
        WifiConfiguration wifiConfiguration;
        if (!"EAP".equals(str)) {
            if ("PSK".equals(str)) {
                bmxy.m108581a(str3);
                wifiConfiguration = m73820a(str2);
                wifiConfiguration.preSharedKey = ascr.m73790a(str3);
                wifiConfiguration.allowedKeyManagement.set(1);
                wifiConfiguration.allowedGroupCiphers.set(2);
                wifiConfiguration.allowedGroupCiphers.set(3);
            } else if ("WEP".equals(str)) {
                bmxy.m108581a(str3);
                wifiConfiguration = m73820a(str2);
                wifiConfiguration.wepKeys[0] = ascr.m73790a(str3);
                wifiConfiguration.wepTxKeyIndex = 0;
                wifiConfiguration.allowedKeyManagement.set(0);
                wifiConfiguration.allowedGroupCiphers.set(0);
                wifiConfiguration.allowedGroupCiphers.set(1);
            } else {
                wifiConfiguration = m73820a(str2);
                wifiConfiguration.allowedKeyManagement.set(0);
                wifiConfiguration.allowedAuthAlgorithms.set(0);
            }
            wifiConfiguration.hiddenSSID = z;
            return wifiConfiguration;
        }
        throw new UnsupportedOperationException("WPA-EAP security type is not supported");
    }

    /* renamed from: a */
    public static WifiManager m73822a(Context context) {
        bmxy.m108581a(context);
        return (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    /* renamed from: a */
    public static boolean m73823a(WifiConfiguration wifiConfiguration) {
        return "*".equals(wifiConfiguration.preSharedKey);
    }
}

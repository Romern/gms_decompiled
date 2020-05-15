package com.google.android.gms.nearby.mediums;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pInfo;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WifiHotspot$WifiDirectHotspotOperation$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ bqgy f80660a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiHotspot$WifiDirectHotspotOperation$1(String str, bqgy bqgy) {
        super(str);
        this.f80660a = bqgy;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(intent.getAction())) {
            WifiP2pGroup wifiP2pGroup = (WifiP2pGroup) intent.getParcelableExtra("p2pGroupInfo");
            WifiP2pInfo wifiP2pInfo = (WifiP2pInfo) intent.getParcelableExtra("wifiP2pInfo");
            if (wifiP2pGroup != null && wifiP2pGroup.getInterface() != null && wifiP2pInfo != null) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                bnsl.mo68432a("com.google.android.gms.nearby.mediums.WifiHotspot$WifiDirectHotspotOperation$1", "a", 1337, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68424a("Successfully created a Wifi Direct hotspot. SSID=%s, IP address=%s", wifiP2pGroup.getNetworkName(), wifiP2pInfo.groupOwnerAddress.getHostAddress());
                try {
                    this.f80660a.mo69138b(new aint(wifiP2pGroup.getNetworkName(), wifiP2pGroup.getPassphrase(), InetAddress.getByName(wifiP2pInfo.groupOwnerAddress.getHostAddress()), "192.168.49.1"));
                } catch (UnknownHostException e) {
                    bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
                    bnsl2.mo68437a(e);
                    bnsl2.mo68432a("com.google.android.gms.nearby.mediums.WifiHotspot$WifiDirectHotspotOperation$1", "a", 1349, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Failed to parse IP address.");
                    this.f80660a.mo69136a((Throwable) e);
                }
            }
        }
    }
}

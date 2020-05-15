package com.google.android.gms.nearby.mediums;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pInfo;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WifiDirect$ConnectOperation$1ConnectToWifiP2pDeviceRunnable$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ bqgy f80655a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiDirect$ConnectOperation$1ConnectToWifiP2pDeviceRunnable$1(String str, bqgy bqgy) {
        super(str);
        this.f80655a = bqgy;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(intent.getAction())) {
            WifiP2pGroup wifiP2pGroup = (WifiP2pGroup) intent.getParcelableExtra("p2pGroupInfo");
            WifiP2pInfo wifiP2pInfo = (WifiP2pInfo) intent.getParcelableExtra("wifiP2pInfo");
            NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            if (wifiP2pGroup == null || wifiP2pInfo == null || networkInfo == null) {
                srn srn = ailf.f69111a;
            } else if (!networkInfo.isConnected()) {
                srn srn2 = ailf.f69111a;
            } else {
                this.f80655a.mo69138b(wifiP2pInfo.groupOwnerAddress);
            }
        }
    }
}

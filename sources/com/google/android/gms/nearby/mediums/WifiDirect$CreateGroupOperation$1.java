package com.google.android.gms.nearby.mediums;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.p2p.WifiP2pGroup;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WifiDirect$CreateGroupOperation$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ bqgy f80656a;

    /* renamed from: b */
    final /* synthetic */ ainc f80657b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiDirect$CreateGroupOperation$1(ainc ainc, String str, bqgy bqgy) {
        super(str);
        this.f80657b = ainc;
        this.f80656a = bqgy;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(intent.getAction())) {
            WifiP2pGroup wifiP2pGroup = (WifiP2pGroup) intent.getParcelableExtra("p2pGroupInfo");
            if (wifiP2pGroup == null) {
                srn srn = ailf.f69111a;
            } else if (!wifiP2pGroup.isGroupOwner()) {
                srn srn2 = ailf.f69111a;
            } else {
                this.f80657b.f69235d = wifiP2pGroup.getFrequency();
                bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                bnsl.mo68432a("com.google.android.gms.nearby.mediums.WifiDirect$CreateGroupOperation$1", "a", 620, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68409a("WiFi Direct group created on frequency %s", this.f80657b.f69235d);
                this.f80656a.mo69138b((Object) null);
            }
        }
    }
}

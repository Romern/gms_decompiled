package com.google.android.gms.netrec.logging;

import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetworkStateLogger$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ akkn f81179a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NetworkStateLogger$1(akkn akkn, String str) {
        super(str);
        this.f81179a = akkn;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("android.net.wifi.WIFI_AP_STATE_CHANGED".equals(intent.getAction())) {
            this.f81179a.mo39521a(intent);
        } else if ("android.net.wifi.STATE_CHANGE".equals(intent.getAction())) {
            akkn akkn = this.f81179a;
            if (cfpd.m142363c()) {
                NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                akkn.mo39522a(networkInfo != null ? networkInfo.getDetailedState() : null);
            }
        } else if ("android.net.wifi.WIFI_STATE_CHANGED".equals(intent.getAction())) {
            this.f81179a.mo39523b(intent);
        }
    }
}

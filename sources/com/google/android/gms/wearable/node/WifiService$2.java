package com.google.android.gms.wearable.node;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WifiService$2 extends aacn {

    /* renamed from: a */
    final /* synthetic */ aybd f110986a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiService$2(aybd aybd, String str) {
        super(str);
        this.f110986a = aybd;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        aybd aybd = this.f110986a;
        if ("android.net.wifi.WIFI_STATE_CHANGED".equals(intent.getAction()) && intent.getIntExtra("wifi_state", 4) == 3) {
            aybd.f97019k.sendEmptyMessage(3);
        }
    }
}

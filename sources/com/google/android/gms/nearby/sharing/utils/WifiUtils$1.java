package com.google.android.gms.nearby.sharing.utils;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WifiUtils$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ bqgy f81143a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiUtils$1(String str, bqgy bqgy) {
        super(str);
        this.f81143a = bqgy;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("android.net.wifi.WIFI_STATE_CHANGED".equals(intent.getAction()) && intent.getIntExtra("wifi_state", -1) == 3) {
            this.f81143a.mo69138b((Object) null);
        }
    }
}

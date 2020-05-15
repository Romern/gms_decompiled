package com.google.android.gms.nearby.mediums.wifiaware;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.aware.WifiAwareManager;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WifiAwareImpl$LazyWifiAwareSession$1 extends aacn {

    /* renamed from: a */
    public final /* synthetic */ aiuw f80665a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiAwareImpl$LazyWifiAwareSession$1(aiuw aiuw, String str) {
        super(str);
        this.f80665a = aiuw;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        WifiAwareManager wifiAwareManager = this.f80665a.f69821a;
        if (wifiAwareManager != null && !wifiAwareManager.isAvailable()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("com.google.android.gms.nearby.mediums.wifiaware.WifiAwareImpl$LazyWifiAwareSession$1", "a", 1044, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("WiFi Aware is no longer available.");
            aiuw aiuw = this.f80665a;
            aiuw.f69822b.execute(new aiut(this));
        }
    }
}

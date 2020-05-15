package com.google.android.gms.smartdevice.utils.wifi;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WifiDiscoveryManager$WifiScanResultsReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ asdc f108265a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiDiscoveryManager$WifiScanResultsReceiver(asdc asdc) {
        super("smartdevice");
        this.f108265a = asdc;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("android.net.wifi.SCAN_RESULTS".equals(intent.getAction())) {
            asdc asdc = this.f108265a;
            asdc.mo49059a(asdc.f88727c.getScanResults());
        }
    }
}

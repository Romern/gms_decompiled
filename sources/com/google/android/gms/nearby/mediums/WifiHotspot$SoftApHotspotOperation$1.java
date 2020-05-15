package com.google.android.gms.nearby.mediums;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WifiHotspot$SoftApHotspotOperation$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ int f80658a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f80659b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiHotspot$SoftApHotspotOperation$1(String str, int i, CountDownLatch countDownLatch) {
        super(str);
        this.f80658a = i;
        this.f80659b = countDownLatch;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("android.net.wifi.WIFI_AP_STATE_CHANGED".equals(intent.getAction()) && this.f80658a == intent.getIntExtra("wifi_state", -1)) {
            this.f80659b.countDown();
        }
    }
}

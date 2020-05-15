package com.google.android.gms.nearby.mediums;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WifiRadio$2 extends aacn {

    /* renamed from: a */
    final /* synthetic */ int f80662a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f80663b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiRadio$2(String str, int i, CountDownLatch countDownLatch) {
        super(str);
        this.f80662a = i;
        this.f80663b = countDownLatch;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("android.net.wifi.WIFI_STATE_CHANGED".equals(intent.getAction()) && !isInitialStickyBroadcast() && this.f80662a == intent.getIntExtra("wifi_state", 4)) {
            this.f80663b.countDown();
        }
    }
}

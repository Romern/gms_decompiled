package com.google.android.gms.nearby.mediums;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothClassic$AdvertisingOperation$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ int f80642a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f80643b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothClassic$AdvertisingOperation$1(String str, int i, CountDownLatch countDownLatch) {
        super(str);
        this.f80642a = i;
        this.f80643b = countDownLatch;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("android.bluetooth.adapter.action.SCAN_MODE_CHANGED".equals(intent.getAction()) && this.f80642a == intent.getIntExtra("android.bluetooth.adapter.extra.SCAN_MODE", -1)) {
            this.f80643b.countDown();
        }
    }
}

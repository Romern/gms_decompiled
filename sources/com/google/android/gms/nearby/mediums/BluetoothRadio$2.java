package com.google.android.gms.nearby.mediums;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothRadio$2 extends aacn {

    /* renamed from: a */
    final /* synthetic */ boolean f80651a;

    /* renamed from: b */
    final /* synthetic */ CountDownLatch f80652b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothRadio$2(String str, boolean z, CountDownLatch countDownLatch) {
        super(str);
        this.f80651a = z;
        this.f80652b = countDownLatch;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
        if (this.f80651a) {
            if (intExtra != 12) {
                return;
            }
        } else if (intExtra != 10) {
            return;
        }
        this.f80652b.countDown();
    }
}

package com.google.android.gms.smartdevice.utils.bluetooth;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothController$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ CountDownLatch f108260a;

    /* renamed from: b */
    final /* synthetic */ ascx f108261b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothController$1(ascx ascx, String str, CountDownLatch countDownLatch) {
        super(str);
        this.f108261b = ascx;
        this.f108260a = countDownLatch;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        ascx ascx = this.f108261b;
        int i = ascx.f88714b;
        ascv ascv = ascx.f88716a;
        if (ascv != null && ascv.mo49047b()) {
            this.f108260a.countDown();
            ascx.m73806a(context, this);
        }
    }
}

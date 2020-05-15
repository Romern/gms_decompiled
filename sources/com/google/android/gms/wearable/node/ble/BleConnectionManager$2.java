package com.google.android.gms.wearable.node.ble;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BleConnectionManager$2 extends aacn {

    /* renamed from: a */
    final /* synthetic */ aybu f110989a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BleConnectionManager$2(aybu aybu, String str) {
        super(str);
        this.f110989a = aybu;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        this.f110989a.mo53898c(4);
        this.f110989a.mo53895b(5);
        aybu aybu = this.f110989a;
        int i = aybu.f97038z;
        aybu.f97051a.unregisterReceiver(aybu.f97069s);
        this.f110989a.f97070t = false;
    }
}

package com.google.android.gms.wearable.node.bluetooth;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothServer$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ aycs f110994a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothServer$1(aycs aycs, String str) {
        super(str);
        this.f110994a = aycs;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (intent.getAction().equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10);
            if (intExtra == 12) {
                this.f110994a.mo53910a();
            } else if (intExtra == 10) {
                this.f110994a.mo53912b();
            }
        }
    }
}

package com.google.location.nearby.direct.bluetooth.state;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothAdapterWrapper$1 extends aacn {

    /* renamed from: a */
    public final buqn f191759a = new buwr(this, "SendActuallyEnabled");

    /* renamed from: b */
    public final /* synthetic */ buwt f191760b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothAdapterWrapper$1(buwt buwt, String str) {
        super(str);
        this.f191760b = buwt;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (intent.getAction().equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
            this.f191760b.f155187e.mo72987c(new buws(this, "BluetoothAdapterStateChanged"));
        }
    }
}

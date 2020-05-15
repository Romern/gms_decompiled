package com.google.location.nearby.direct.bluetooth.state;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BackgroundBleScanner$3 extends aacn {

    /* renamed from: a */
    public final /* synthetic */ buwo f191758a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackgroundBleScanner$3(buwo buwo, String str) {
        super(str);
        this.f191758a = buwo;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        buwo buwo = this.f191758a;
        buyz[] buyzArr = buwo.f155154a;
        buwo.f155157d.mo72987c(new buwl(this, "BackgroundBleScanner_broadcastReceiver", intent));
    }
}

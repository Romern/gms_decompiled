package com.google.android.gms.fitness.service.ble;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FitBleChimeraBroker extends zmb {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo19167a() {
        return yzz.f54882a.mo3214a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ zlz mo19168a(String str) {
        return new zmn(this, str, this.f55437e, this.f55438f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo19169a(Intent intent) {
        return "com.google.android.gms.fitness.BleApi".equals(intent.getAction());
    }
}

package com.google.android.gms.fido.communication.ble;

import android.bluetooth.le.ScanResult;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BleScanner$1 extends aacm {

    /* renamed from: a */
    public final /* synthetic */ xis f31680a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BleScanner$1(xis xis, String str, String str2) {
        super(str, str2);
        this.f31680a = xis;
    }

    /* renamed from: a */
    public final void mo16720a(int i, ScanResult scanResult) {
        xis xis = this.f31680a;
        int i2 = xis.f52369e;
        xis.f52371a.post(new xio(this, scanResult));
    }
}

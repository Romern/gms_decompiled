package com.google.android.gms.nearby.mediums;

import android.bluetooth.le.ScanResult;
import java.util.Locale;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothLowEnergy$2 extends aacm {

    /* renamed from: a */
    public final /* synthetic */ aikx f80649a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothLowEnergy$2(aikx aikx, String str, String str2) {
        super(str, str2);
        this.f80649a = aikx;
    }

    /* renamed from: a */
    public final void mo16719a(int i) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
        bnsl.mo68432a("com.google.android.gms.nearby.mediums.BluetoothLowEnergy$2", "a", 1244, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Failed to start extended included scanning with error %s", String.format(Locale.ENGLISH, "[%d]%s", Integer.valueOf(i), i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "SCAN_FAILED_FEATURE_UNSUPPORTED" : "SCAN_FAILED_INTERNAL_ERROR" : "SCAN_FAILED_APPLICATION_REGISTRATION_FAILED" : "SCAN_FAILED_ALREADY_STARTED"));
    }

    /* renamed from: a */
    public final void mo16720a(int i, ScanResult scanResult) {
        aikx aikx = this.f80649a;
        aijs aijs = new aijs(this, scanResult);
        int i2 = aikx.f69072i;
        aikx.mo37614a(aijs);
    }
}

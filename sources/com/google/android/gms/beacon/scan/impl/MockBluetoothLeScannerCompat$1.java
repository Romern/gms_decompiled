package com.google.android.gms.beacon.scan.impl;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.beacon.BleSighting;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MockBluetoothLeScannerCompat$1 extends aacn {
    public MockBluetoothLeScannerCompat$1(String str) {
        super(str);
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("gms:bluetoothle:scan:.CALLBACK_TYPE", 1);
        int intExtra2 = intent.getIntExtra("gms:bluetoothle:scan:.BLE_SCAN_MODE", 3);
        BleSighting bleSighting = (BleSighting) sef.m35067a(intent, "gms:bluetoothle:scan:.BLE_SIGHTING_KEY", BleSighting.CREATOR);
        if (bleSighting != null) {
            ngk.m26186a(bleSighting, intExtra, intExtra2);
        }
    }
}

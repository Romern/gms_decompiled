package com.google.android.gms.trustagent.trustlet.device.bluetooth.p072ui;

import android.os.Bundle;
import android.view.MenuItem;

/* renamed from: com.google.android.gms.trustagent.trustlet.device.bluetooth.ui.BluetoothDeviceSelectionChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothDeviceSelectionChimeraActivity extends aupe {

    /* renamed from: b */
    private autt f109189b;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo8628aW().mo15853b(true);
        this.f109189b = new autt();
        getSupportFragmentManager().beginTransaction().replace(16908290, this.f109189b).commit();
        bogj bogj = (bogj) bohi.f133070z.mo74144da();
        if (bogj.f164950c) {
            bogj.mo74035c();
            bogj.f164950c = false;
        }
        bohi bohi = (bohi) bogj.f164949b;
        bohi.f133088r = 11;
        bohi.f133071a |= 4096;
        aupk.m77567a(this, (bohi) bogj.mo74062i());
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0);
        onBackPressed();
        return true;
    }
}

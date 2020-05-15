package com.google.android.gms.nearby.discovery.devices;

import android.os.Bundle;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DevicesListChimeraActivity extends wse {

    /* renamed from: d */
    private ahtd f80487d;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        this.f51236c = cfoj.f184966a.mo6606a().mo82108af();
        super.onCreate(bundle);
        ahuu ahuu = new ahuu(this);
        if (this.f51236c) {
            ahtd ahtd = new ahtd(this, "com.google.android.gms.fastpair.devices.DevicesListActivity", ahuu);
            this.f80487d = ahtd;
            ahtd.mo37109a(getIntent());
            return;
        }
        ahuu.mo37179a();
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        ahtd ahtd = this.f80487d;
        if (ahtd != null) {
            ahtd.mo37110a(this);
        }
    }
}

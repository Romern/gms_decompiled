package com.google.android.gms.nearby.discovery.devices;

import android.os.Bundle;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FindDeviceChimeraActivity extends deu {

    /* renamed from: b */
    private ahtd f80488b;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ahtd ahtd = new ahtd(this, "com.google.android.gms.fastpair.fmd.FindDeviceActivity", new ahuu(this));
        this.f80488b = ahtd;
        ahtd.mo37109a(getIntent());
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        this.f80488b.mo37110a(this);
    }
}

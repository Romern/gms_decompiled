package com.google.android.gms.tron;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ModuleInitializer extends qlf {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        int i2;
        Intent a = CollectionChimeraService.m93376a(this);
        if ((i & 2) == 0) {
            i2 = (i & 4) == 0 ? (i & 8) != 0 ? 5 : 0 : 4;
        } else {
            i2 = 3;
        }
        a.putExtra("com.google.android.gms.tron.extra.reason", i2);
        startService(a);
    }
}

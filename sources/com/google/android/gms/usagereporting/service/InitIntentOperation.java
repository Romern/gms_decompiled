package com.google.android.gms.usagereporting.service;

import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InitIntentOperation extends qlf {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        sre.m36087g(getApplicationContext());
        if ((i & 14) != 0 && chdn.m148524e()) {
            int i2 = Build.VERSION.SDK_INT;
            startService(IntentOperation.getStartIntent(this, InitHandler.class, "com.google.android.gms.usagereporting.init"));
        }
    }
}

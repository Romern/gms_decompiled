package com.google.android.gms.deviceconnection;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceConnectionInitializer extends qlf {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        startService(new Intent().setClassName(this, "com.google.android.gms.deviceconnection.service.DeviceConnectionWatcherService"));
    }
}

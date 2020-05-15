package com.google.android.contextmanager.service;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ModuleInitializer extends qlf {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        startService(new Intent().setClassName(this, "com.google.android.contextmanager.service.ContextManagerService"));
    }
}

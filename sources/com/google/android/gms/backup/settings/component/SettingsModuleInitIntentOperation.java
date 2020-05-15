package com.google.android.gms.backup.settings.component;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SettingsModuleInitIntentOperation extends qlf {

    /* renamed from: a */
    private static final lvn f29096a = new lvn("SettingsModuleInit");

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        f29096a.mo25409a("onInitRuntimeState", new Object[0]);
        if (!NoBackupNotificationChimeraService.m21922b(this)) {
            NoBackupNotificationChimeraService.f29076a.mo25409a("Disabled, not scheduling", new Object[0]);
        } else {
            NoBackupNotificationChimeraService.m21921a(this, 0, false);
        }
    }
}

package com.google.android.gms.backup.settings.component;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NoBackupNotificationIntentOperation extends lvz {

    /* renamed from: a */
    private static final lvn f29078a = new lvn("NoBackupNotificationIO");

    /* renamed from: a */
    public final void mo17242a(Intent intent) {
        f29078a.mo25409a("Intent: %s", intent);
        if (intent == null) {
            return;
        }
        if ("com.google.android.gms.backup.ACTION_TRANSPORT_FULL_BACKUP".equals(intent.getAction()) || "com.google.android.gms.backup.ACTION_TRANSPORT_INITIALIZE_DEVICE".equals(intent.getAction()) || "com.google.android.gms.backup.BackupAccountChanged".equals(intent.getAction())) {
            NoBackupNotificationChimeraService.m21920a(this);
        } else {
            f29078a.mo25416d("Intent not supported", new Object[0]);
        }
    }
}

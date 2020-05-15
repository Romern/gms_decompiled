package com.google.android.gms.backup.transport.component;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GmsBackupSchedulerIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final lvn f29229a = new lvn("GmsBackupSchedulerIO");

    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        if ("com.google.android.gms.backup.ACTION_BACKUP_NETWORK_SETTINGS_CHANGED".equals(intent.getAction())) {
            GmsBackupSchedulerChimeraService.m22012a(this);
        } else {
            f29229a.mo25416d("Intent not supported", new Object[0]);
        }
    }
}

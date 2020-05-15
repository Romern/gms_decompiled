package com.google.android.gms.backup.transport.component;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MmsBackupSchedulerIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final lvn f29234a = new lvn("MmsBackupSchedulerIO");

    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        if ("com.google.android.gms.backup.ACTION_MMS_BACKUP_SCHEDULE_CHANGED".equals(intent.getAction())) {
            MmsBackupSchedulerChimeraService.m22015a(this);
        } else {
            f29234a.mo25416d("Intent not supported", new Object[0]);
        }
    }
}

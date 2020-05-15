package com.google.android.gms.auth.folsom.operation;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BackupAccountChangeIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f10907a = jdh.m16547a("BackupAccountChangeIntentOperation");

    public BackupAccountChangeIntentOperation() {
    }

    public final void onHandleIntent(Intent intent) {
        if (!"com.google.android.gms.backup.BackupAccountChanged".equals(intent.getAction())) {
            f10907a.mo25412b("Unexpected action, ignoring: %s", intent.getAction());
        } else if (!jde.f22216b) {
            f10907a.mo25414c("Build is lower than P. No need to handle action [%s]", "com.google.android.gms.backup.BackupAccountChanged");
        } else if (ccfv.m129485b()) {
            jar.m16428a(this, 3);
        }
    }

    public BackupAccountChangeIntentOperation(Context context) {
        attachBaseContext(context);
    }
}

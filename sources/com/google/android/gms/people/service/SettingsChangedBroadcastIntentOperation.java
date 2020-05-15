package com.google.android.gms.people.service;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SettingsChangedBroadcastIntentOperation extends IntentOperation {
    public final void onCreate() {
    }

    public final void onDestroy() {
    }

    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) && "com.google.android.gms.people".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            if (cgbf.f186281a.mo6606a().mo83222a()) {
                bdxy a = bdxy.m91563a(getBaseContext().getContentResolver(), anef.m64088a("com.google.android.gms.people"));
                if (a != null) {
                    a.mo58435b();
                } else {
                    Log.e("SettingsChangedOp", "Get null phenotype loader");
                }
            }
            if (cfvk.m143176b()) {
                amwo.m63557a(getApplicationContext());
            }
            if (cgbo.m144213k()) {
                DeletedNullContactsCleanupChimeraService.m68181b(this);
            }
            if (cfvo.m143210i()) {
                BackupAndSyncOptInValidationChimeraService.m68175b(this);
            }
        }
    }
}

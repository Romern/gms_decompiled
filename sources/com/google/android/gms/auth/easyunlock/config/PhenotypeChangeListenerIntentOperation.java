package com.google.android.gms.auth.easyunlock.config;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.easyunlock.authorization.EasyUnlockChimeraService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhenotypeChangeListenerIntentOperation extends IntentOperation {

    /* renamed from: a */
    static final String f10569a = ssv.m36267a("com.google.android.gms.auth.easyunlock");

    public PhenotypeChangeListenerIntentOperation() {
    }

    public final void onHandleIntent(Intent intent) {
        if (("com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) || f10569a.equals(intent.getAction())) && "com.google.android.gms.auth.easyunlock".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            startService(EasyUnlockSupportReporterIntentOperation.m6559a(this));
            startService(EasyUnlockChimeraService.m6556a(this));
        }
    }

    PhenotypeChangeListenerIntentOperation(Context context) {
        attachBaseContext(context);
    }
}

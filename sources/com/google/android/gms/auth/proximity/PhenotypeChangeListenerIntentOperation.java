package com.google.android.gms.auth.proximity;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.proximity.firstparty.CryptauthDeviceSyncGcmTaskService;
import com.google.android.gms.auth.proximity.multidevice.BetterTogetherUnifiedSetupIntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhenotypeChangeListenerIntentOperation extends IntentOperation {

    /* renamed from: a */
    static final String f11134a = ssv.m36267a("com.google.android.gms.auth.proximity");

    public PhenotypeChangeListenerIntentOperation() {
    }

    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || f11134a.equals(action)) && "com.google.android.gms.auth.proximity".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            CryptauthDeviceSyncGcmTaskService.m6784a(getApplicationContext());
            startService(BetterTogetherFeatureSupportIntentOperation.m6739a(getBaseContext()));
            startService(BetterTogetherUnifiedSetupIntentOperation.m6878a(getBaseContext()));
        }
    }

    PhenotypeChangeListenerIntentOperation(Context context) {
        attachBaseContext(context);
    }
}

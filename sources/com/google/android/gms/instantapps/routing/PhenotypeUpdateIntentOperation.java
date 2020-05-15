package com.google.android.gms.instantapps.routing;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PhenotypeUpdateIntentOperation extends IntentOperation {
    static {
        new adfs("PhenotypeUpdateIntentOperation");
    }

    public final void onCreate() {
    }

    public final void onHandleIntent(Intent intent) {
        new Object[1][0] = intent;
        if (intent != null && "com.google.android.gms.phenotype.UPDATE".equals(intent.getAction()) && "com.google.android.gms.instantapps".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME")) && cepl.f183185a.mo6606a().mo79521E()) {
            DomainFilterUpdateChimeraService.m66765b();
        }
    }
}

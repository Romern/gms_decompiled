package com.google.android.gms.phenotype.platform;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhenotypeBootCompleteIntentOperation extends IntentOperation {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public final void onHandleIntent(Intent intent) {
        if (!"android.intent.action.PHENOTYPE_BOOT_COMPLETED".equals(intent.getAction())) {
            intent.getAction();
        } else if (anhe.m64383a()) {
            anfh.m64156a();
            anhj.m64401a();
        }
    }
}

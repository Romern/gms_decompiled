package com.google.android.gms.measurement.internal;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhenotypeChangeListenerIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final String f80137a = ssv.m36267a("com.google.android.gms.measurement");

    public final void onHandleIntent(Intent intent) {
        if (("com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) || f80137a.equals(intent.getAction())) && "com.google.android.gms.measurement".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            agje.m54353a(this).mo35497E().f65572k.mo35435a("Measurement Phenotype flag(s) updated");
        }
    }
}

package com.google.android.gms.phonesky.recovery;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhenotypeCommittedIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        String str;
        if (intent == null) {
            anjb.m64557b("Invalid phenotype committed intent", new Object[0]);
            return;
        }
        if (intent.getExtras() != null) {
            str = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str) && TextUtils.equals("com.google.android.gms.phonesky_recovery", str)) {
            anjb.m64556a("Experiments updated. Start recovery checks.", new Object[0]);
            new anjf(this).mo41868a();
        }
    }
}

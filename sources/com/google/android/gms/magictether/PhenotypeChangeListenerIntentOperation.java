package com.google.android.gms.magictether;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhenotypeChangeListenerIntentOperation extends IntentOperation {

    /* renamed from: a */
    static final String f79803a = ssv.m36267a("com.google.android.gms.magictether");

    public PhenotypeChangeListenerIntentOperation() {
    }

    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (aezu.m52751a(this)) {
            return;
        }
        if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || f79803a.equals(action)) && "com.google.android.gms.magictether".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            aezt.m52750a(getBaseContext(), false);
        }
    }

    PhenotypeChangeListenerIntentOperation(Context context) {
        attachBaseContext(context);
    }
}

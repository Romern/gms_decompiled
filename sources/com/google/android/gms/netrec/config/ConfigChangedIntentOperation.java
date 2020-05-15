package com.google.android.gms.netrec.config;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConfigChangedIntentOperation extends IntentOperation {
    public ConfigChangedIntentOperation() {
        this(new akjz());
    }

    public final void onHandleIntent(Intent intent) {
        if (!akmq.m60023a(this)) {
            eoa.m10828c("NetRec", "Device does not support scoring, exiting", new Object[0]);
            return;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.phenotype.UPDATE".equals(action)) {
            String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
            if (!"com.google.android.gms.netrec".equals(stringExtra)) {
                new Object[1][0] = stringExtra;
                int i = eoa.f15378a;
                return;
            }
            int i2 = eoa.f15378a;
        } else if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action)) {
            int i3 = eoa.f15378a;
        } else {
            eoa.m10828c("NetRec", "Ignoring unexpected configuration changed action %s", action);
            return;
        }
        akjz.m59905a(getApplicationContext());
    }

    public ConfigChangedIntentOperation(akjz akjz) {
    }
}

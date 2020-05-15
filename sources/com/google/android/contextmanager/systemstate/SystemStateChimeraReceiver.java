package com.google.android.contextmanager.systemstate;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SystemStateChimeraReceiver extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        new Object[1][0] = action;
        if ("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(action) || "com.google.android.gms.location.reporting.DELETE_OPERATION".equals(action) || "com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action) || "com.google.android.gms.phenotype.COMMITTED".equals(action) || efz.f14849a.equals(action)) {
            dwq.m9667k().mo9435a(new efw(intent), dqy.m9123a("HandleSystemStateOnReceive"));
        }
    }
}

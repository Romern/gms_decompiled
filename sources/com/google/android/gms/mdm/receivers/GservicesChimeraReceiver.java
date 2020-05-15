package com.google.android.gms.mdm.receivers;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GservicesChimeraReceiver extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if (!sre.m36080a(this) && "com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction()) && !GoogleAccountsAddedChimeraReceiver.m67196a()) {
            int i = eoa.f15378a;
            GoogleAccountsAddedChimeraReceiver.m67197b();
        }
    }
}

package com.google.android.gms.location.persistent;

import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NonwearableLocationPersistentRegistrationIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.location.persistent.REGISTER".equals(intent.getAction())) {
            int i = Build.VERSION.SDK_INT;
            if (ceyv.m138446b()) {
                LocationPersistentChimeraService.m66899a("LOWD", new aera());
            }
        }
    }
}

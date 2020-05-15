package com.google.android.gms.location.persistent;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationPersistentRegistrationIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.location.persistent.REGISTER".equals(intent.getAction()) && beyw.m96100c(this)) {
            LocationPersistentChimeraService.m66899a("BlueskyManager", beyw.m96098b(this));
        }
    }
}

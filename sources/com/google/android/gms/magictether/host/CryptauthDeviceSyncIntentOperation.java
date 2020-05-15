package com.google.android.gms.magictether.host;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CryptauthDeviceSyncIntentOperation extends IntentOperation {
    public CryptauthDeviceSyncIntentOperation() {
    }

    public final void onHandleIntent(Intent intent) {
        if (cfcj.m138656c() && "com.google.android.gms.auth.proximity.DEVICE_SYNC_FINISHED".equals(intent.getAction())) {
            startService(TetherListenerChimeraService.m67140a(this));
        }
    }

    CryptauthDeviceSyncIntentOperation(Context context) {
        attachBaseContext(context);
    }
}

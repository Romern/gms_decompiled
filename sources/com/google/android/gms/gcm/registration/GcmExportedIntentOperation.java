package com.google.android.gms.gcm.registration;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmExportedIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        aajg.m21335a((Context) this);
        String action = intent.getAction();
        if ("com.google.iid.TOKEN_REQUEST".equals(action)) {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
            PushMessagingRegistrarChimeraProxy.m24334a(this, intent);
            return;
        }
        String valueOf = String.valueOf(action);
        Log.w("GCM", valueOf.length() == 0 ? new String("ExportedIntentOperation dropping intent with unknown action: ") : "ExportedIntentOperation dropping intent with unknown action: ".concat(valueOf));
    }
}

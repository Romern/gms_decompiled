package com.google.android.gms.nearby.messages;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GcmRegistrationChimeraReceiver extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.gcm.REGISTERED".equals(intent.getAction())) {
            srn srn = ahfq.f67120a;
            getSharedPreferences("copresence_gcm_pref", 0).edit().putBoolean("require_sync_to_server", true).commit();
        }
    }
}

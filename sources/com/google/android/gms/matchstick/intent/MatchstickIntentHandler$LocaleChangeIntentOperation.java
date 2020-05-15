package com.google.android.gms.matchstick.intent;

import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.libraries.matchstick.net.MessagingService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MatchstickIntentHandler$LocaleChangeIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        int i = Build.VERSION.SDK_INT;
        Intent intent2 = new Intent("com.google.android.apps.libraries.matchstick.action.RUN_SYNC_CHECKER");
        intent2.putExtra("sync_ops", (int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        MessagingService.m94560d(intent2, getBaseContext());
    }
}

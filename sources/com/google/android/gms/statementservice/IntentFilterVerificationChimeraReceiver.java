package com.google.android.gms.statementservice;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class IntentFilterVerificationChimeraReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (!"android.intent.action.INTENT_FILTER_NEEDS_VERIFICATION".equals(action)) {
            String valueOf = String.valueOf(action);
            Log.w("IntentFilterVerRcvr", valueOf.length() == 0 ? new String("Intent action not supported: ") : "Intent action not supported: ".concat(valueOf));
            return;
        }
        int i = Build.VERSION.SDK_INT;
        context.startService(IntentOperation.getStartIntent(context, IntentFilterIntentOperation.class, action).putExtras(intent.getExtras()));
    }
}

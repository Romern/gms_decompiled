package com.google.android.location.reporting.state.update;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ExternalChangeIntentReceiver extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if (sse.m36205a(this)) {
            bgyb.m100293a(this, intent);
        } else if (Log.isLoggable("GCoreUlr", 4)) {
            Log.i("GCoreUlr", "ULR code skipped on unsupported form factor.");
        }
    }
}

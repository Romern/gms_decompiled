package com.google.android.chimera.container;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BroadcastServiceIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        bmzs.m108698a("com.google.android.chimera.BROADCAST_SERVICE".equals(intent.getAction()));
        Intent intent2 = (Intent) intent.getParcelableExtra("broadcast");
        if (intent2 == null) {
            Log.w("ChimeraBroadcastSvc", "Dropping null broadcast intent");
            return;
        }
        List startIntentsForBroadcast = IntentOperation.getStartIntentsForBroadcast(this, intent2, false, !aytw.m84815b(this), false);
        if (startIntentsForBroadcast != null) {
            int size = startIntentsForBroadcast.size();
            for (int i = 0; i < size; i++) {
                startService((Intent) startIntentsForBroadcast.get(i));
            }
        }
    }
}

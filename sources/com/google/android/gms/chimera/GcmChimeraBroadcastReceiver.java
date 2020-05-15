package com.google.android.gms.chimera;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.container.InitConfigOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        Intent startIntent;
        if (cdji.f180981a.mo6606a().mo77678g() && (startIntent = IntentOperation.getStartIntent(context, InitConfigOperation.class, "com.google.android.gms.chimera.container.ACTION_FORCE_CONFIG_RECHECK")) != null) {
            context.startService(startIntent);
        }
    }
}

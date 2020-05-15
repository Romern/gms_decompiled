package com.google.android.gms.tron;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AlarmChimeraReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        cgzf.m147724c();
        Intent a = CollectionChimeraService.m93376a(context);
        a.putExtra("com.google.android.gms.tron.extra.reason", 1);
        context.startService(a);
    }
}

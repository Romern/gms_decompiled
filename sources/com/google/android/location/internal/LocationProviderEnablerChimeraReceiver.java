package com.google.android.location.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocationProviderEnablerChimeraReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("locationMode", 0);
        if (intExtra != 0) {
            int intExtra2 = intent.getIntExtra("source", 0);
            new bgav(context).mo62572a(intExtra, null, bsqm.m116095a(intExtra2), intent.getIntArrayExtra("textResources"));
        }
    }
}

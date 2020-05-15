package com.google.android.gms.auth.setup.devicesignals;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LockScreenChimeraReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            juu.m17357a(context).mo14119a(true);
            if (!LockScreenChimeraService.f11287a) {
                context.startService(LockScreenChimeraService.m6899a(context));
            }
        }
    }
}

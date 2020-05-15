package com.google.android.gms.clearcut.systemevent;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.clearcut.service.ClearcutLoggerChimeraService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WallClockChangedIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        new Object[1][0] = intent.getAction();
        if (!cddx.m132741e()) {
            ClearcutLoggerChimeraService.f30052a.execute(rdu.f42764a);
        }
    }
}

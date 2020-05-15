package com.google.android.gms.clearcut.init;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.clearcut.service.ClearcutLoggerChimeraService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ClearcutBootCompleteIntentOperation extends IntentOperation {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035  */
    public final void onHandleIntent(Intent intent) {
        char c;
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode != -101572338) {
            if (hashCode == -60251293 && action.equals("android.intent.action.CLEARCUT_BOOT_COMPLETED")) {
                c = 1;
                if (c != 0) {
                    if (c == 1) {
                        qxs.m33072a();
                        aytw.m84814b();
                        return;
                    }
                    return;
                } else if (!cddx.m132741e()) {
                    ClearcutLoggerChimeraService.f30052a.execute(rap.f42570a);
                    return;
                } else {
                    return;
                }
            }
        } else if (action.equals("android.intent.action.CLEARCUT_LOCKED_BOOT_COMPLETED")) {
            c = 0;
            if (c != 0) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
    }
}

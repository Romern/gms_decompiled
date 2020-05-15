package com.google.android.gms.netrec.scoring.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ClearDatabaseService extends IntentOperation {
    /* renamed from: a */
    public static void m67657a(Context context) {
        context.startService(IntentOperation.getStartIntent(context, ClearDatabaseService.class, "com.google.android.gms.netrec.scoring.CLEAR_DATABASE"));
    }

    public final void onHandleIntent(Intent intent) {
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("Received intent: ");
        sb.append(valueOf);
        sb.toString();
        int i = eoa.f15378a;
        if ("com.google.android.gms.netrec.scoring.CLEAR_DATABASE".equals(intent.getAction())) {
            eoa.m10826b("NetRec", "Clearing score cache", new Object[0]);
            akmy.m60045a(this).mo39580c();
            return;
        }
        eoa.m10828c("NetRec", "Received unhandled intent: %s", intent.getAction());
    }
}

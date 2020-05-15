package com.google.android.gms.mdm.receivers;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GmsRegisteredChimeraReceiver extends IntentOperation {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: afzn.a(android.content.Context, boolean, cakk):android.content.Intent
     arg types: [com.google.android.gms.mdm.receivers.GmsRegisteredChimeraReceiver, int, cakk]
     candidates:
      com.google.android.chimera.IntentOperation.a(android.content.Context, android.content.Intent, java.lang.String):dnb
      afzn.a(android.content.Context, boolean, cakk):android.content.Intent */
    public final void onHandleIntent(Intent intent) {
        if (!sre.m36080a(this)) {
            afzn.m53752a();
            Intent a = afzn.m53750a((Context) this, false, cakk.GMS_GCM_REGISTERED);
            if (a != null) {
                int i = eoa.f15378a;
                startService(a);
            }
        }
    }
}

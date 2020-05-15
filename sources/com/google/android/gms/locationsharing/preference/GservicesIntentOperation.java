package com.google.android.gms.locationsharing.preference;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GservicesIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction())) {
            int i = Build.VERSION.SDK_INT;
            Context baseContext = getBaseContext();
            boolean z = false;
            if (sse.m36205a(baseContext) && cfaz.f183554a.mo6606a().mo80789l()) {
                z = true;
            }
            LocationSharingSettingInjectorChimeraService.m67052a(baseContext, z);
        }
    }
}

package com.google.android.gms.security.snet;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.security.verifier.InternalApkUploadChimeraService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SnetChimeraReceiver extends IntentOperation {
    static {
        SnetChimeraReceiver.class.getSimpleName();
    }

    public final void onHandleIntent(Intent intent) {
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            SnetGcmSchedulerChimeraIntentService.m92427b(this);
            SnetGcmSchedulerChimeraIntentService.m92429d(this);
            SafeBrowsingUpdateChimeraIntentService.m92412b(this);
            InternalApkUploadChimeraService.m92443a(this);
            afzq.m53768e(this);
        }
    }
}

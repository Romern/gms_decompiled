package com.google.android.gms.security.verifier;

import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ApkUploadChimeraService extends Service {
    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null || intent.getAction() == null || !intent.getAction().equals("com.google.android.gms.security.verifyapps.UPLOAD_APK")) {
            aqgy.m71600a("Ignoring unrecognized intent: %s", intent.toString());
        } else {
            intent.setComponent(new ComponentName(this, apuh.m71023a(InternalApkUploadChimeraService.class)));
            startService(intent);
        }
        stopSelf(i2);
        return 3;
    }
}

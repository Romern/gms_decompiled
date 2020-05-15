package com.google.android.gms.security.snet;

import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class OperationLauncherIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final String f107554a = OperationLauncherIntentOperation.class.getSimpleName();

    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            try {
                if ("com.google.android.gms.security.apis.verifyapps.CONSENT_RESULT".equals(intent.getAction())) {
                    new apuc(this, intent).mo6502a(this);
                } else if ("com.google.android.gms.security.apis.verifyapps.PACKAGE_WARNING_RESULT".equals(intent.getAction())) {
                    new aqbi(this, intent).mo6502a(this);
                } else if ("com.google.android.gms.security.snet.XLB_UPDATE".equals(intent.getAction())) {
                    new aqcb(null, "com.google.android.gms").mo6502a(this);
                }
            } catch (aaaj | RemoteException e) {
                Log.e(f107554a, "Exception while starting operation");
            }
        }
    }
}

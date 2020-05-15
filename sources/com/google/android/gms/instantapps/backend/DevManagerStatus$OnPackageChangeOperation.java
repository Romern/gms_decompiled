package com.google.android.gms.instantapps.backend;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DevManagerStatus$OnPackageChangeOperation extends IntentOperation {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        return;
     */
    public final void onHandleIntent(Intent intent) {
        synchronized (adem.f61501c) {
            if (intent.getData() != null && "com.google.android.instantapps.devman".equals(intent.getData().getEncodedSchemeSpecificPart())) {
                if (intent.getAction().equals("android.intent.action.PACKAGE_ADDED")) {
                    adem.f61499a.mo33423a("DevManager installed", new Object[0]);
                    adem.f61500b = true;
                } else if (intent.getAction().equals("android.intent.action.PACKAGE_REMOVED")) {
                    adem.f61499a.mo33423a("DevManager uninstalled", new Object[0]);
                    adem.f61500b = false;
                }
            }
        }
    }
}

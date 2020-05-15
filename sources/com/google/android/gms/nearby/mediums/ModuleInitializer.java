package com.google.android.gms.nearby.mediums;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ModuleInitializer extends IntentOperation {

    /* renamed from: a */
    private static final String f80653a = ssv.m36267a("com.google.android.gms.nearby");

    public final void onHandleIntent(Intent intent) {
        if ((!"com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) && !f80653a.equals(intent.getAction())) || "com.google.android.gms.nearby".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            ahfm.m55645a(this, "com.google.android.gms.nearby.mediums.nearfieldcommunication.NfcAdvertisingService", cfnv.m140752N());
            if (cfnv.f184625a.mo6606a().mo81855w()) {
                aipd.m57627a().mo37797c(this);
            }
        }
    }
}

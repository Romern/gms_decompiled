package com.google.android.gms.mdi.download.service;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SystemEventIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final String f80023a = ssv.m36267a("com.google.android.gms.icing.mdd");

    public final void onHandleIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str : extras.keySet()) {
                extras.get(str);
            }
        }
        String action = intent.getAction();
        if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || f80023a.equals(action)) && "com.google.android.gms.icing.mdd".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            MddGcmTaskChimeraService.m67182b();
            if (ceni.m137522f()) {
                try {
                    aucu.m76782a(afkf.m53199b(this).mo24701a((rpa) new afkd()));
                } catch (InterruptedException | ExecutionException e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "null";
                    }
                    bbev.m87904a(message);
                }
            }
        }
    }
}

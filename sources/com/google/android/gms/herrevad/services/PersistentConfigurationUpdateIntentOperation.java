package com.google.android.gms.herrevad.services;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PersistentConfigurationUpdateIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final String f79062a = ssv.m36267a("com.google.android.gms.herrevad");

    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("com.google.android.gms.herrevad.ON_INIT".equals(action) || "com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action) || (("com.google.android.gms.phenotype.COMMITTED".equals(action) || f79062a.equals(action)) && "com.google.android.gms.herrevad".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME")))) {
                String valueOf = String.valueOf(action);
                if (valueOf.length() == 0) {
                    new String("Handling configuration update: ");
                } else {
                    "Handling configuration update: ".concat(valueOf);
                }
                int i = eoa.f15378a;
                Context applicationContext = getApplicationContext();
                int i2 = spn.f44932a;
                abod.m47984a().mo32233b();
                abnd.m47945b();
                abms.f57709a.mo32219a(applicationContext);
                aboj.f57790a.mo32243a(applicationContext);
                abnm.f57737a.mo32223a(applicationContext);
                abmz.f57718a.mo32220a(applicationContext);
            }
        }
    }
}

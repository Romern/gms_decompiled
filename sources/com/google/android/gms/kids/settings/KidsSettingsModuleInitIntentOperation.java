package com.google.android.gms.kids.settings;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class KidsSettingsModuleInitIntentOperation extends IntentOperation {

    /* renamed from: a */
    static sns f79262a = new sns("accountListener", 10);

    /* renamed from: b */
    private static final String f79263b = ssv.m36267a("com.google.android.gms.kids");

    static {
        new snr(f79262a);
    }

    public final void onHandleIntent(Intent intent) {
        int i = spn.f44932a;
        if ((!"com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) && !f79263b.equals(intent.getAction())) || "com.google.android.gms.kids".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            spn.m35855a(this, "com.google.android.gms.kids.settings.KidsSettingsActivity", 1);
            if (!ceqw.f183329a.mo6606a().mo79651d()) {
                spn.m35855a(this, "com.google.android.gms.kids.settings.KidsSettingsActivityAliasSuw", 2);
            } else {
                spn.m35855a(this, "com.google.android.gms.kids.settings.KidsSettingsActivityAliasSuw", 1);
            }
        }
    }
}

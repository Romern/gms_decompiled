package com.google.android.location.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhenotypeUpdateIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final String f150795a = ssv.m36267a("com.google.android.location");

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.location.internal.PhenotypeUpdateIntentOperation, java.lang.String, boolean]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.location.internal.PhenotypeUpdateIntentOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || f150795a.equals(action)) && "com.google.android.location".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            int i = Build.VERSION.SDK_INT;
            spn.m35856a((Context) this, "com.google.android.location.settings.DrivingConditionProvider", ceuz.m138278c());
            cevl.m138301c();
            if (cevi.m138288c()) {
                spn.m35856a((Context) this, "com.google.android.location.settings.EAlertSettingsActivity", false);
                spn.m35856a((Context) this, "com.google.android.location.service.EAlertSettingInjectorService", false);
                spn.m35856a((Context) this, "com.google.android.location.ealert.ux.EAlertSafetyInfoActivity", false);
            }
        }
    }
}

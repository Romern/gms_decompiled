package com.google.android.gms.phenotype.notification;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.phenotype.platform.PhenotypeBootCompleteIntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhenotypeModuleInitIntentOperation extends qlf {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6343a(Intent intent) {
        Context applicationContext = getApplicationContext();
        applicationContext.startService(IntentOperation.getStartIntent(applicationContext, PhenotypeBootCompleteIntentOperation.class, "android.intent.action.PHENOTYPE_BOOT_COMPLETED"));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.phenotype.notification.PhenotypeModuleInitIntentOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        spn.m35856a((Context) this, "com.google.android.gms.phenotype.service.FlagOverrideReceiver", true);
        if ((i & 12) != 0) {
            anij.m64476a(this);
        }
    }
}

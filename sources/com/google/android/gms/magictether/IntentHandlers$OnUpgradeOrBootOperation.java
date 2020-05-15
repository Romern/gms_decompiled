package com.google.android.gms.magictether;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IntentHandlers$OnUpgradeOrBootOperation extends qlf {

    /* renamed from: a */
    private static final String[] f79802a = {"com.google.android.gms.magictether.host.FirstTimeSetupDialogActivity", "com.google.android.gms.magictether.host.ProvisioningFailedDialogActivity", "com.google.android.gms.magictether.host.TetherListenerService", "com.google.android.gms.magictether.logging.DailyMetricsLoggerService"};

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.magictether.IntentHandlers$OnUpgradeOrBootOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        if (!aezu.m52751a(this)) {
            boolean z = false;
            for (String str : f79802a) {
                spn.m35856a((Context) this, str, true);
            }
            Context baseContext = getBaseContext();
            if ((i & 2) > 0) {
                z = true;
            }
            aezt.m52750a(baseContext, z);
        }
    }
}

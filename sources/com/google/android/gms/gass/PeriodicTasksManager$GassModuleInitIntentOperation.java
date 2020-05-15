package com.google.android.gms.gass;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PeriodicTasksManager$GassModuleInitIntentOperation extends qlf {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.gass.PeriodicTasksManager$GassModuleInitIntentOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        spn.m35856a((Context) this, "com.google.android.gms.gass.GassService", true);
        new Object[1][0] = intent.getAction();
        if (!aahe.f28111a || !aahe.f28112b || !aahe.f28113c) {
            if (!aahe.f28111a) {
                aahe.m21252a(getBaseContext());
                aahe.f28111a = true;
            }
            if (!aahe.f28112b) {
                aahe.m21254b(getBaseContext());
                aahe.f28112b = true;
            }
            if (!aahe.f28113c) {
                aahe.m21255c(getBaseContext());
                aahe.f28113c = true;
            }
        }
    }
}

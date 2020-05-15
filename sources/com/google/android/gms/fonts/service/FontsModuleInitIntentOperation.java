package com.google.android.gms.fonts.service;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FontsModuleInitIntentOperation extends qlf {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.fonts.service.FontsModuleInitIntentOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        boolean z;
        boolean z2;
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        zyh.m46683c("FontsModuleInitOp", "onInitRuntimeState(module update? %s container update? %s)", Boolean.valueOf(z), Boolean.valueOf(z2));
        zzi zzi = zzi.f56267a;
        Context applicationContext = getApplicationContext();
        zzi.mo31623a(applicationContext, new zyz());
        if (zzi.f56278l) {
            zzk.m46754a(zzi, applicationContext);
        }
        spn.m35856a((Context) this, "com.google.android.gms.fonts.provider.FontsProvider", true);
        try {
            spn.m35856a((Context) this, "com.google.android.gms.fonts.update.UpdateSchedulerService", true);
        } catch (Exception e) {
            zyh.m46681a("FontsModuleInitOp", e, "Unable to enable update scheduler", new Object[0]);
            zzi.mo31621a(applicationContext).mo31587a(9, 23505, "com.google.android.gms.fonts.service");
        }
    }
}

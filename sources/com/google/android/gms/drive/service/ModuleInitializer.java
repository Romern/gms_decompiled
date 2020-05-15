package com.google.android.gms.drive.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.drive.api.ApiChimeraService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ModuleInitializer extends qlf {

    /* renamed from: a */
    private static final bngx f31194a = bngx.m109356a("com.google.android.gms.drive.deprecation.UpgradeDialogActivity");

    /* renamed from: a */
    public final void mo6343a(Intent intent) {
        ApiChimeraService.m22938c(getApplicationContext());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.drive.service.ModuleInitializer, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        bnre i = f31194a.listIterator();
        while (i.hasNext()) {
            spn.m35856a((Context) this, (String) i.next(), true);
        }
    }
}

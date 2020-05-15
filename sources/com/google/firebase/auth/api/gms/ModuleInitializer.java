package com.google.firebase.auth.api.gms;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ModuleInitializer extends qlf {

    /* renamed from: a */
    private static final sek f152495a = new sek("FBAuthModuleInit", new String[0]);

    /* renamed from: b */
    private static final String[] f152496b = {"com.google.firebase.auth.api.gms.service.FirebaseAuthService", "com.google.firebase.auth.api.gms.ui.BrowserSignInStarterActivity", "com.google.firebase.auth.api.gms.ui.BrowserSignInResponseHandlerActivity"};

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.firebase.auth.api.gms.ModuleInitializer, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        String[] strArr = f152496b;
        for (String str : strArr) {
            sek sek = f152495a;
            String valueOf = String.valueOf(str);
            sek.mo25409a(valueOf.length() == 0 ? new String("onModuleUpdated, enabling: ") : "onModuleUpdated, enabling: ".concat(valueOf), new Object[0]);
            spn.m35856a((Context) this, str, true);
        }
    }
}

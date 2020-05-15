package com.google.android.gms.languageprofile.service;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NewModuleOperation extends qlf {

    /* renamed from: a */
    private static final String[] f79280a = {"com.google.android.gms.languageprofile.GcmReceiverService", "com.google.android.gms.languageprofile.GcmTaskService"};

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.languageprofile.service.NewModuleOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        int i2 = i & 4;
        int i3 = i & 8;
        if ((i & 2) + (i & 1) + i2 + i3 != 0) {
            if (i2 + i3 > 0) {
                String[] strArr = f79280a;
                for (String str : strArr) {
                    String valueOf = String.valueOf(str);
                    Log.i("NewModuleOp", valueOf.length() == 0 ? new String("Enable component: ") : "Enable component: ".concat(valueOf));
                    spn.m35856a((Context) this, str, true);
                }
            }
            if (spn.m35876d(this, "com.google.android.gms.languageprofile.GcmTaskService") == 1) {
                Log.i("NewModuleOp", "Schedule LanguageProfileGcmTaskChimeraService tasks.");
                LanguageProfileGcmTaskChimeraService.m66811a(aeat.m51532a(rpr.m34216b()), advu.m51251a());
            }
        }
    }
}

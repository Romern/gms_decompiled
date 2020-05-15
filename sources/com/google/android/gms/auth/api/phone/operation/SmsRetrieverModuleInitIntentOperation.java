package com.google.android.gms.auth.api.phone.operation;

import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SmsRetrieverModuleInitIntentOperation extends qlf {

    /* renamed from: a */
    static final bnic f10279a = bnic.m109490a("com.google.android.gms.auth.api.phone.ui.AutofillSettingsActivity", "com.google.android.gms.auth.api.phone.ui.AutofillConsentActivity");

    /* renamed from: b */
    private static final srn f10280b = srn.m36124a();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.auth.api.phone.operation.SmsRetrieverModuleInitIntentOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        if (cceb.m129359c()) {
            int i = Build.VERSION.SDK_INT;
            ((bnsl) f10280b.mo68390d()).mo68405a("enable autofill components");
            bnrd a = f10279a.iterator();
            while (a.hasNext()) {
                spn.m35856a((Context) this, (String) a.next(), true);
            }
        }
    }
}

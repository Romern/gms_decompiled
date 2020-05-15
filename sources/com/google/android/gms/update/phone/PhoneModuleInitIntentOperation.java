package com.google.android.gms.update.phone;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhoneModuleInitIntentOperation extends qlf {

    /* renamed from: a */
    private static final sek f109499a = avpq.m79022i("PhoneModuleInitIntentOperation");

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.update.phone.PhoneModuleInitIntentOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        if (!avma.m78773a(this)) {
            f109499a.mo25414c("Disabling the system update activity since it's not the main profile.", new Object[0]);
            spn.m35856a((Context) this, "com.google.android.gms.update.OtaSuggestionSummaryProvider", false);
            spn.m35856a((Context) this, "com.google.android.gms.update.SystemUpdateActivity", false);
            spn.m35856a((Context) this, "com.google.android.gms.update.UpdateFromSdCardActivity", false);
            return;
        }
        spn.m35856a((Context) this, "com.google.android.gms.update.OtaSuggestionSummaryProvider", true);
    }
}

package com.google.android.gms.setupservices;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SetupServicesInitIntentOperation extends qlf {

    /* renamed from: a */
    private static final sek f107645a = new sek("SetupServices", new String[0]);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.setupservices.SetupServicesInitIntentOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        if (cgll.f187253a.mo6606a().mo84093q()) {
            f107645a.mo25412b("Enabling component com.google.android.gms.setupservices.GoogleServicesActivity", new Object[0]);
            spn.m35856a((Context) this, "com.google.android.gms.setupservices.GoogleServicesActivity", true);
        }
    }
}

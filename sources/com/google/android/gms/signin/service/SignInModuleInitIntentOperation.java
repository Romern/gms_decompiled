package com.google.android.gms.signin.service;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SignInModuleInitIntentOperation extends qlf {

    /* renamed from: a */
    private static final sek f107713a = aqom.m71875b("SignInModuleInitIntentOperation");

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        try {
            spn.m35856a(getApplicationContext(), "com.google.android.gms.signin.activity.ConsentActivity", true);
        } catch (IllegalArgumentException e) {
            f107713a.mo25418e("com.google.android.gms.signin.activity.ConsentActivity not present yet.", new Object[0]);
        }
    }
}

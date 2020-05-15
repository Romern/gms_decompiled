package com.google.android.gms.auth.authzen;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthZenInitIntentOperation extends qlf {

    /* renamed from: a */
    private static final String[] f10370a = {"com.google.android.gms.auth.authzen.transaction.secondscreen.SecondScreenGetTokenActivity", "com.google.android.gms.auth.authzen.cryptauth.DialerSecretCodeReceiver", "com.google.android.gms.auth.authzen.AuthzenDeeplinkHandlerActivity", "com.google.android.gms.auth.authzen.magicwand.MagicWandBarcodeScannerActivity"};

    /* renamed from: b */
    private static final sek f10371b = new sek("AuthZenInitIntentOperation");

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        sek sek = f10371b;
        String action = intent.getAction();
        StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 62);
        sb.append("Initializing Authzen, action is ");
        sb.append(action);
        sb.append(" ,InitRuntimeState=");
        sb.append(i);
        sek.mo25412b(sb.toString(), new Object[0]);
        Intent a = GcmReceiverChimeraService.m6430a(this);
        a.setAction(intent.getAction());
        a.putExtra("flags", i);
        startService(a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.auth.authzen.AuthZenInitIntentOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        for (String str : f10370a) {
            spn.m35856a((Context) this, str, true);
        }
    }
}

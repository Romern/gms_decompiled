package com.google.android.gms.fido;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.fido.fido2.pollux.CableAuthenticatorChimeraService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FidoInitIntentOperation extends qlf {

    /* renamed from: a */
    private static final String[] f31626a = {"com.google.android.gms.fido.u2f.U2fService", "com.google.android.gms.fido.u2f.ui.AuthenticateActivity", "com.google.android.gms.fido.fido2.ui.Fido2FullScreenActivity"};

    /* renamed from: b */
    private static final String[] f31627b = {"com.google.android.gms.fido.fido2.pollux.CableAuthenticatorService", "com.google.android.gms.fido.fido2.ui.PolluxActivity"};

    /* renamed from: c */
    private static final sek f31628c = new sek(new String[]{"FidoInitIntentOperation"}, (short[]) null);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.fido.FidoInitIntentOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        sek sek = f31628c;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Initializing Fido module, InitRuntimeState=");
        sb.append(i);
        String sb2 = sb.toString();
        sek.mo25414c(sb2, new Object[0]);
        for (String str : f31626a) {
            spn.m35856a((Context) this, str, true);
        }
        if (((Boolean) xmn.f52751a.mo58455c()).booleanValue()) {
            for (String str2 : f31627b) {
                spn.m35856a((Context) this, str2, true);
            }
            startService(CableAuthenticatorChimeraService.m23548a(this));
        }
        xbx.m42627a(getApplicationContext(), getPackageName());
        new xby().mo29624a();
    }
}

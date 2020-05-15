package com.google.android.gms.fido;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.fido.fido2.pollux.CableAuthenticatorChimeraService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PhenotypeUpdateIntentOperation extends IntentOperation {

    /* renamed from: a */
    static final String[] f31629a = {"com.google.android.gms.fido.fido2.pollux.CableAuthenticatorService", "com.google.android.gms.fido.fido2.ui.PolluxActivity"};

    /* renamed from: b */
    public static final sek f31630b = new sek(new String[]{"PhenotypeUpdateIntentOperation"}, (short[]) null);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.fido.PhenotypeUpdateIntentOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    public final void onHandleIntent(Intent intent) {
        if (intent != null && "com.google.android.gms.phenotype.UPDATE".equals(intent.getAction()) && "com.google.android.gms.fido".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            if (cdvn.f181810a.mo6606a().mo78373a()) {
                xbx.m42627a(getApplicationContext(), getPackageName());
            }
            if (((Boolean) xmn.f52751a.mo58455c()).booleanValue()) {
                for (String str : f31629a) {
                    spn.m35856a((Context) this, str, true);
                }
                startService(CableAuthenticatorChimeraService.m23548a(this));
            }
            new xby().mo29624a();
            return;
        }
        f31630b.mo25412b("Received invalid intent: %s", intent);
    }
}

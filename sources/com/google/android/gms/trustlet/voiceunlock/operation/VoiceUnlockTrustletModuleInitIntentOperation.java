package com.google.android.gms.trustlet.voiceunlock.operation;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class VoiceUnlockTrustletModuleInitIntentOperation extends qlf {

    /* renamed from: a */
    static final String[] f109326a = new String[0];

    /* renamed from: b */
    private static final sek f109327b = new sek("Trustlet.Voiceunlock", "VoiceUnlockTrustletModuleInitIntentOperation");

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
        f109327b.mo25412b("onInitRuntimeState()", new Object[0]);
        if (chas.f188208a.mo6606a().mo84886c()) {
            Context applicationContext = getApplicationContext();
            int i2 = i & 8;
            if ((i & 4) != 0 || i2 != 0) {
                String[] strArr = f109326a;
                for (String str : strArr) {
                    f109327b.mo25412b("Enabling %s", str);
                    spn.m35856a(applicationContext, str, true);
                }
            }
        }
    }
}

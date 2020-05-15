package com.google.android.gms.lockbox.init;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LockboxInitChimeraIntentOperation extends qlf {

    /* renamed from: a */
    private static final String[] f79795a = {"com.google.android.gms.lockbox.LockboxAlarmReceiver", "com.google.android.gms.lockbox.LockboxService", "com.google.android.gms.lockbox.service.LockboxBrokerService"};

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        if ((i & 14) != 0) {
            startService(spn.m35893h("com.google.android.gms.lockbox.LockboxService"));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.lockbox.init.LockboxInitChimeraIntentOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        for (String str : f79795a) {
            spn.m35856a((Context) this, str, true);
        }
    }
}

package com.google.android.gms.clearcut.init;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ClearcutInitChimeraIntentService extends qlf {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6343a(Intent intent) {
        Context applicationContext = getApplicationContext();
        applicationContext.startService(IntentOperation.getStartIntent(applicationContext, ClearcutBootCompleteIntentOperation.class, "android.intent.action.CLEARCUT_BOOT_COMPLETED"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo17616b(Intent intent) {
        Context applicationContext = getApplicationContext();
        applicationContext.startService(IntentOperation.getStartIntent(applicationContext, ClearcutBootCompleteIntentOperation.class, "android.intent.action.CLEARCUT_LOCKED_BOOT_COMPLETED"));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.clearcut.init.ClearcutInitChimeraIntentService, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        spn.m35856a((Context) this, "com.google.android.gms.clearcut.debug.ClearcutDebugDumpService", true);
        getApplicationContext().startService(new Intent().setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.clearcut.debug.ClearcutDebugDumpService")));
        new anfb(anef.m64089a(this), "com.google.android.gms.playlog.uploader", "direct_boot:com.google.android.gms.playlog.uploader", this).mo25219a("");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        Context applicationContext = getApplicationContext();
        applicationContext.startService(IntentOperation.getStartIntent(applicationContext, raq.class, "android.intent.action.CLEARCUT_MODULE_UPDATE"));
    }
}

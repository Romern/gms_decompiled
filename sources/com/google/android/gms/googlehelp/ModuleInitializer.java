package com.google.android.gms.googlehelp;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ModuleInitializer extends qlf {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        mo43203a("com.google.android.gms.googlehelp.contact.chat.ChatSupportRequestFormActivity");
        mo43203a("com.google.android.gms.googlehelp.gcm.InvalidateGcmTokenGcmTaskService");
        mo43203a("com.google.android.gms.googlehelp.webview.GoogleHelpRenderingApiWebViewActivity");
        mo43203a("com.google.android.gms.googlehelp.GcmBroadcastReceiver");
        mo43203a("com.google.android.gms.googlehelp.helpactivities.OpenHelpRtcActivity");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.googlehelp.ModuleInitializer, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43203a(String str) {
        spn.m35856a((Context) this, str, true);
    }
}

package com.google.android.gms.smartdevice.common;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ModuleInitializer extends qlf {

    /* renamed from: a */
    private static final bngx f107785a = bngx.m109360a("com.google.android.gms.smartdevice.d2d.ui.SourceDirectTransferActivity", "com.google.android.gms.smartdevice.d2d.ui.TargetDirectTransferActivity", "com.google.android.gms.smartdevice.setup.ui.AccountChallengeActivity", "com.google.android.gms.smartdevice.d2d.ui.ForwardingActivity", "com.google.android.gms.smartdevice.magicwand.MagicWandActivity");

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.smartdevice.common.ModuleInitializer, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        bnre i = f107785a.listIterator();
        while (i.hasNext()) {
            spn.m35856a((Context) this, (String) i.next(), true);
        }
    }
}

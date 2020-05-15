package com.google.android.gms.octarine.operations;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ModuleInitializer extends qlf {

    /* renamed from: a */
    private static final String[] f81371a = {"com.google.android.gms.octarine.ui.OctarineWebviewActivity"};

    public ModuleInitializer() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.octarine.operations.ModuleInitializer, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        if (stu.m36322h() != 13) {
            for (String str : f81371a) {
                spn.m35856a((Context) this, str, true);
            }
        }
    }

    ModuleInitializer(Context context) {
        attachBaseContext(context);
    }
}

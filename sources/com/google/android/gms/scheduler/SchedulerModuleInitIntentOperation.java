package com.google.android.gms.scheduler;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SchedulerModuleInitIntentOperation extends qlf {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: spn.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.scheduler.SchedulerModuleInitIntentOperation, java.lang.String, int]
     candidates:
      spn.a(android.content.Context, android.content.Intent, int):android.app.PendingIntent
      spn.a(android.content.Context, java.lang.String, java.lang.String):java.lang.String
      spn.a(android.content.Context, java.lang.String, int):void
      spn.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        if (!aytw.m84813a(this) || (ceck.m135995e() && ceck.m135994d())) {
            aajg.m21335a((Context) this);
            if (aajg.m21343c()) {
                spn.m35856a((Context) this, "com.google.android.gms.gcm.nts.SchedulerService", true);
                Intent intent2 = new Intent(intent);
                String action = intent.getAction();
                if ("android.intent.action.BOOT_COMPLETED".equals(action)) {
                    intent2.setAction("com.google.android.gms.scheduler.intent.USER_UNLOCKED");
                } else if ("android.intent.action.LOCKED_BOOT_COMPLETED".equals(action)) {
                    intent2.setAction(null);
                }
                intent2.setClassName(this, "com.google.android.gms.gcm.nts.SchedulerService");
                startService(intent2);
            }
        }
    }
}

package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.gcm.gmsproc.GmsAutoStarter;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmModuleInitIntentOperation extends qlf {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        if (!aytw.m84813a(this) || (ceck.m135995e() && aaka.m21376a(this))) {
            aajg.m21335a((Context) this);
            if (aajg.m21343c()) {
                Intent intent2 = new Intent(intent);
                String action = intent.getAction();
                if ("android.intent.action.BOOT_COMPLETED".equals(action)) {
                    intent2.setAction("com.google.android.gcm.intent.USER_UNLOCKED");
                } else if ("android.intent.action.LOCKED_BOOT_COMPLETED".equals(action)) {
                    intent2.setAction(null);
                }
                intent2.setClassName(this, "com.google.android.gms.gcm.GcmService");
                startService(intent2);
            }
            if (!aytw.m84813a(this)) {
                GmsAutoStarter.m24332a(this, intent);
            }
        }
    }
}

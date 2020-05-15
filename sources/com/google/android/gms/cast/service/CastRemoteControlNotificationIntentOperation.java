package com.google.android.gms.cast.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CastRemoteControlNotificationIntentOperation extends IntentOperation {

    /* renamed from: a */
    public static final qav f29922a = new qav("RCNIntentOperation");

    /* renamed from: b */
    public Intent f29923b;

    public final void onCreate() {
        Intent intent = new Intent();
        this.f29923b = intent;
        intent.setClassName(getApplicationContext(), "com.google.android.gms.cast.service.CastPersistentService");
    }

    public final void onHandleIntent(Intent intent) {
        f29922a.mo23856a("onHandleIntent %s", intent);
        if (intent == null) {
            f29922a.mo23675c("onHandleIntent received a null intent", new Object[0]);
        } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            pqj.m31021a(this).mo24701a((rpa) new pqn()).mo50371a(new pxk(this));
        }
    }
}

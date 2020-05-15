package com.google.android.gms.plus.service;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class DefaultChimeraIntentService extends qkc {

    /* renamed from: i */
    private static qke f82606i = new qke();

    /* renamed from: a */
    public anru f82607a;

    public DefaultChimeraIntentService() {
        super("DefaultIntentService", f82606i);
    }

    /* renamed from: a */
    public static void m68555a(Context context, qkb qkb) {
        f82606i.add(qkb);
        context.startService(spn.m35889g("com.google.android.gms.plus.service.default.INTENT").setClassName(context, "com.google.android.gms.plus.service.DefaultIntentService"));
    }

    public final void onCreate() {
        super.onCreate();
        this.f82607a = anru.m65076a(this);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent.getBooleanExtra("isLoggingIntent", false)) {
            f82606i.addFirst(new anlo(this, intent));
        }
        return super.onStartCommand(intent, i, i2);
    }
}

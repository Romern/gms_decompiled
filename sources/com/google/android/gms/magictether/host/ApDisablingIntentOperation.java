package com.google.android.gms.magictether.host;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ApDisablingIntentOperation extends IntentOperation {
    public ApDisablingIntentOperation() {
    }

    /* renamed from: a */
    public static PendingIntent m67131a(Context context) {
        return IntentOperation.getPendingIntent(context, ApDisablingIntentOperation.class, new Intent("com.google.android.gms.magictether.DISABLE_SOFT_AP"), 0, 134217728);
    }

    public final void onHandleIntent(Intent intent) {
        if (cfcj.m138656c() && "com.google.android.gms.magictether.DISABLE_SOFT_AP".equals(intent.getAction())) {
            afal.m52785a(this).mo34712a();
        }
    }

    ApDisablingIntentOperation(Context context) {
        attachBaseContext(context);
    }
}

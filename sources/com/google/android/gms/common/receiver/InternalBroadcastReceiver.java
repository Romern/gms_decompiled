package com.google.android.gms.common.receiver;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class InternalBroadcastReceiver extends aacn {
    public InternalBroadcastReceiver() {
        super("common");
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("com.google.android.gms.common.SET_GMS_ACCOUNT".equals(intent.getAction())) {
            soz.m35789a(context, intent.getStringExtra("PACKAGE_NAME"), intent.getStringExtra("ACCOUNT_NAME"));
        }
    }
}

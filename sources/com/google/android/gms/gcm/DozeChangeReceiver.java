package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class DozeChangeReceiver extends aacn {
    public DozeChangeReceiver() {
        super("gcm");
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.os.action.DEVICE_IDLE_MODE_CHANGED".equals(action)) {
            aakb.m21381a().mo16918c().mo16948b(4);
        } else if ("android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED".equals(action)) {
            aakb.m21381a().mo16918c().mo16948b(5);
        }
    }
}

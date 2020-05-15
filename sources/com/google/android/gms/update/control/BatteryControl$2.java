package com.google.android.gms.update.control;

import android.content.Intent;
import android.os.Build;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BatteryControl$2 extends ActiveStateTrackingBroadcastReceiver {
    /* renamed from: a */
    public final void mo59675a(Intent intent) {
        avmi.f93387a.mo25414c("Received intent: %s.", intent);
        if (!"android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
            int i = Build.VERSION.SDK_INT;
            String action = intent.getAction();
            int i2 = Build.VERSION.SDK_INT;
            bmxy.m108588a(true);
            if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(action)) {
                ((avms) avms.f93422b.mo51589b()).mo51399a(8);
                return;
            }
            return;
        }
        ((avms) avms.f93422b.mo51589b()).mo51399a(4);
    }
}

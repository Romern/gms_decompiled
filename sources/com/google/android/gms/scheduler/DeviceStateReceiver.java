package com.google.android.gms.scheduler;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class DeviceStateReceiver extends aacn {

    /* renamed from: a */
    public apha f107332a = new apha();

    public DeviceStateReceiver() {
        super("scheduler");
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        if ("android.os.action.DEVICE_IDLE_MODE_CHANGED".equals(action)) {
            apht.m70315a().f84404d.mo16948b(4);
        } else if ("android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED".equals(action)) {
            apht.m70315a().f84404d.mo16948b(5);
        } else {
            apha apha = this.f107332a;
            if ((!action.equals("android.intent.action.DOCK_ACTIVE") && !action.equals("android.intent.action.DOCK_IDLE")) || apha.f84368a) {
                skc skc = new skc(context);
                if (action.equals("android.intent.action.SCREEN_ON") || action.equals("android.intent.action.DREAMING_STOPPED") || action.equals("android.intent.action.DOCK_ACTIVE")) {
                    apha.mo47209a(skc, action);
                } else if (action.equals("android.intent.action.SCREEN_OFF") || action.equals("android.intent.action.DREAMING_STARTED") || action.equals("android.intent.action.DOCK_IDLE")) {
                    apha.mo47210a(skc, action, context);
                } else if (action.equals("com.google.android.gms.gcm.TRIGGER_IDLE")) {
                    apha.mo47212b();
                }
            }
        }
    }
}

package com.google.android.gms.drive.networkcontrol;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BatteryStateChangeReceiver extends ChangeReceiver {

    /* renamed from: a */
    private static final sbw f31080a = new sbw("BatteryStateChangeRecei", "");

    public BatteryStateChangeReceiver(Context context) {
        super(context, "android.intent.action.ACTION_POWER_CONNECTED", "android.intent.action.ACTION_POWER_DISCONNECTED");
        mo18282a(new veb(vop.m40939a(context)));
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
            mo18282a(new veb(true));
        } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
            mo18282a(new veb(false));
        } else {
            f31080a.mo25374b("BatteryStateChangeRecei", "Received unexpected action %s", action);
        }
    }
}

package com.google.android.gms.update.control;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetworkControl$2 extends ActiveStateTrackingBroadcastReceiver {
    /* renamed from: a */
    public final void mo59675a(Intent intent) {
        avnb.f93486a.mo25414c("Received intent: %s.", intent);
        if ("android.net.wifi.supplicant.STATE_CHANGE".equals(intent.getAction())) {
            ((avms) avms.f93422b.mo51589b()).mo51399a(3);
        }
    }
}

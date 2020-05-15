package com.google.android.gms.tapandpay.notifications;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmBroadcastChimeraReceiver extends asfd {
    public final void onReceive(Context context, Intent intent) {
        String a = aakz.m21424a(context).mo16960a(intent);
        String str = null;
        atam.m75295a(context, str).mo49764e(2);
        if ("gcm".equals(a)) {
            Intent startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.tapandpay.notifications.TapAndPayNotificationIntentOperation", "com.google.android.gms.tapandpay.notifications.NOTIFICATION_ACTION");
            startIntent.putExtras(intent);
            asfd.m73947b(context, startIntent);
            return;
        }
        atam.m75295a(context, str).mo49764e(23);
    }
}

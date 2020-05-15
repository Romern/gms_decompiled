package com.google.android.gms.notifications;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmChimeraBroadcastReceiver extends asfd {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public final void onReceive(Context context, Intent intent) {
        Intent intent2;
        if (!cfqb.f185420a.mo6606a().mo82492e()) {
            String action = intent.getAction();
            if ("gcm".equals(aakz.m21424a(context).mo16960a(intent)) || "com.google.android.gms.notifications.intents.SHOW_NOTIFICATION".equals(action)) {
                intent2 = IntentOperation.getStartIntent(context, GunsIntentOperation.class, "com.google.android.gms.notifications.intents.START_SERVICE");
                intent2.putExtras(intent);
            } else if ("com.google.android.gms.notifications.intents.HANDLE_NOTIFICATION_ACTION".equals(action)) {
                intent2 = IntentOperation.getStartIntent(context, GunsIntentOperation.class, "com.google.android.gms.notifications.intents.HANDLE_NOTIFICATION_ACTION");
                intent2.putExtras(intent);
            } else {
                intent2 = null;
            }
            if (intent2 != null) {
                asfd.m73947b(context, intent2);
            }
        }
    }
}

package com.google.android.location.quake.notification;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NotificationListenerIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                action.equals("com.google.android.gms.location.EALERT_NOTIFICATION_DISMISS");
            }
        }
    }
}

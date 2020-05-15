package com.google.android.gms.auth.uiflows;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LocaleChangedIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        List<NotificationChannel> a;
        Context baseContext = getBaseContext();
        sex a2 = sex.m35104a(baseContext);
        if (kag.m17571a() && (a = a2.mo25439a()) != null) {
            for (NotificationChannel notificationChannel : a) {
                if ("com.google.android.gms.auth.base.Notifications.AuthGroup".equals(notificationChannel.getGroup())) {
                    kag.m17570a(a2, baseContext, notificationChannel.getId());
                }
            }
        }
    }
}

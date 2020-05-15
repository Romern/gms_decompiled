package com.google.android.gms.mobiledataplan.notification;

import android.content.Intent;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NotificationListenerIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final srn f80301a = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    public final void onHandleIntent(Intent intent) {
        long longExtra = intent.getLongExtra("NOTIFICATION_LOGGING_NOTIFICATION_ID", 0);
        int intExtra = intent.getIntExtra("NOTIFICATION_ACTION", 0);
        if (intExtra == 0) {
            agrl.m54942a().mo35990a(intent, boox.DISMISSED_BY_UESR, "MDP_Notification", bygd.DISMISSED_BY_USER);
        } else if (intExtra != 1) {
            ((bnsl) f80301a.mo68388c()).mo68424a("Invalid background intent for notification action type %s. ID: %s", bryx.m114908a(Integer.valueOf(intExtra)), bryx.m114908a(Long.valueOf(longExtra)));
        } else {
            agrl.m54942a().mo35990a(intent, boox.NOTIFICATION_ACTION_TAKEN, "MDP_UiAction", bygd.NOTIFICATION_ACTION_TAKEN);
            sex a = sex.m35104a(this);
            if (a != null && longExtra != 0) {
                a.mo25444a("com.google.android.gms.mobiledataplan.NOTIFICATION_TAG", (int) longExtra);
                int i = Build.VERSION.SDK_INT;
                StatusBarNotification[] b = a.mo25448b();
                boolean z = false;
                for (StatusBarNotification statusBarNotification : b) {
                    if (!(((long) statusBarNotification.getId()) == longExtra || statusBarNotification.getId() == 0)) {
                        z = true;
                    }
                }
                if (!z) {
                    a.mo25444a("com.google.android.gms.mobiledataplan.NOTIFICATION_TAG", 0);
                }
            }
        }
    }
}

package com.google.android.gms.pay.notifications;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmBroadcastChimeraReceiver extends asfd {

    /* renamed from: b */
    private static final srn f81674b = srn.m36127a(sgj.PAY);

    public final void onReceive(Context context, Intent intent) {
        if ("gcm".equals(aakz.m21424a(context).mo16960a(intent))) {
            Intent startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.pay.notifications.PayNotificationIntentOperation", "com.google.android.gms.pay.notifications.HANDLE_NOTIFICATION");
            if (startIntent == null) {
                bnsl bnsl = (bnsl) f81674b.mo68387b();
                bnsl.mo68432a("com.google.android.gms.pay.notifications.GcmBroadcastChimeraReceiver", "onReceive", 31, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("PayNotificationIntentOperation not found");
                return;
            }
            startIntent.putExtras(intent);
            asfd.m73947b(context, startIntent);
            return;
        }
        bnsl bnsl2 = (bnsl) f81674b.mo68388c();
        bnsl2.mo68432a("com.google.android.gms.pay.notifications.GcmBroadcastChimeraReceiver", "onReceive", 37, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("Not a GCM message");
    }
}

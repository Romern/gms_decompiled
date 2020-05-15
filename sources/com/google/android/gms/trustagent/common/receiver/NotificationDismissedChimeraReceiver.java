package com.google.android.gms.trustagent.common.receiver;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class NotificationDismissedChimeraReceiver extends BroadcastReceiver {

    /* renamed from: b */
    private static final aunx f109149b = new aunx("TrustAgent", "NotificationDismissedChimeraReceiver");

    public final void onReceive(Context context, Intent intent) {
        int i = intent.getExtras().getInt("notification_type_key");
        aunx aunx = f109149b;
        StringBuilder sb = new StringBuilder(34);
        sb.append("Notification dismissed:");
        sb.append(i);
        aunx.mo50711a(sb.toString(), new Object[0]).mo50708c();
        if (i >= 0) {
            bogj bogj = (bogj) bohi.f133070z.mo74144da();
            bxvd da = bogm.f133003e.mo74144da();
            bogq a = bogq.m111182a(i);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bogm bogm = (bogm) da.f164949b;
            bogm.f133006b = a.f133019h;
            int i2 = bogm.f133005a | 1;
            bogm.f133005a = i2;
            bogm.f133007c = 1;
            bogm.f133005a = i2 | 2;
            bogj.mo68908a((bogm) da.mo74062i());
            aupk.m77567a(context, (bohi) bogj.mo74062i());
        }
    }
}

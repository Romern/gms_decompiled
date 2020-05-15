package com.google.android.gms.icing.proxy;

import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SmsMonitorIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        acok c = acok.m49603c(this);
        if (c != null) {
            acnv.m49555d("Handling %s", intent.toString());
            String action = intent.getAction();
            int i = Build.VERSION.SDK_INT;
            if (!((Boolean) abzt.f58897al.mo58455c()).booleanValue() || "com.google.android.gms.icing.proxy.action.SMS_CHANGED".equals(action)) {
                boolean z = true;
                if (!"android.provider.Telephony.SMS_RECEIVED".equals(action) && !"android.provider.Telephony.WAP_PUSH_RECEIVED".equals(action)) {
                    z = false;
                }
                if (z || "com.google.android.gms.icing.proxy.action.SMS_CHANGED".equals(action)) {
                    c.mo32952a(z);
                }
            }
        }
    }
}

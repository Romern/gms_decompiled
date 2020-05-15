package com.google.android.gms.ipa.smsindexer;

import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SmsMonitorIntentOperation extends IntentOperation {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adta.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      adta.a(android.content.Context, boolean):void
      adta.a(boolean, boolean):void */
    public final void onHandleIntent(Intent intent) {
        adta c = adta.m51154c(this);
        if (c != null) {
            new Object[1][0] = intent.toString();
            String action = intent.getAction();
            int i = Build.VERSION.SDK_INT;
            if (ceqm.m137876g() && !"com.google.android.gms.ipa.smsindexer.SMS_CHANGED".equals(action)) {
                return;
            }
            if ("android.provider.Telephony.SMS_RECEIVED".equals(action) || "android.provider.Telephony.WAP_PUSH_RECEIVED".equals(action) || "com.google.android.gms.ipa.smsindexer.SMS_CHANGED".equals(action)) {
                c.mo33794a(false, false);
            }
        }
    }
}

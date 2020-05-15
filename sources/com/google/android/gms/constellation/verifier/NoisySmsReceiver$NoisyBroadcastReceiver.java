package com.google.android.gms.constellation.verifier;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import java.util.Collections;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NoisySmsReceiver$NoisyBroadcastReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ tep f30606a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoisySmsReceiver$NoisyBroadcastReceiver(tep tep) {
        super("constellation");
        this.f30606a = tep;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (intent == null) {
            tep.f45783a.mo25416d("Null intent received.", new Object[0]);
        } else if (!"android.provider.Telephony.SMS_RECEIVED".equals(intent.getAction())) {
            sek sek = tep.f45783a;
            String valueOf = String.valueOf(intent.getAction());
            sek.mo25409a(valueOf.length() == 0 ? new String("unexpected action:") : "unexpected action:".concat(valueOf), new Object[0]);
        } else {
            int i = Build.VERSION.SDK_INT;
            int i2 = Build.VERSION.SDK_INT;
            int intExtra = intent.getIntExtra("android.telephony.extra.SUBSCRIPTION_INDEX", -1);
            if (intExtra == -1) {
                int i3 = Build.VERSION.SDK_INT;
                intExtra = intent.getIntExtra("subscription", -1);
            }
            tep tep = this.f30606a;
            sek sek2 = tep.f45783a;
            int i4 = tep.f45785c;
            if (i4 == -1 || i4 == intExtra) {
                SmsMessage[] messagesFromIntent = Telephony.Sms.Intents.getMessagesFromIntent(intent);
                sek sek3 = tep.f45783a;
                int length = messagesFromIntent.length;
                sek3.mo25409a("received %d sms messages.", Integer.valueOf(length));
                Collections.addAll(this.f30606a.f45784b, messagesFromIntent);
                if (this.f30606a.f45786d != null) {
                    for (SmsMessage smsMessage : messagesFromIntent) {
                        tep tep2 = this.f30606a;
                        tep2.mo26446a(smsMessage, tep2.f45786d);
                    }
                }
            }
        }
    }
}

package com.google.android.gms.constellation.verifier;

import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.telephony.SmsMessage;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SilentSmsReceiver$SilentSmsPendingIntentReceiver extends aacn {

    /* renamed from: a */
    final /* synthetic */ ter f30607a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SilentSmsReceiver$SilentSmsPendingIntentReceiver(ter ter) {
        super("constellation");
        this.f30607a = ter;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (intent == null) {
            ter.f45794a.mo25416d("Null intent received.", new Object[0]);
        } else if (!"com.google.android.gms.constellation.SILENT_SMS_RECEIVED".equals(intent.getAction())) {
            sek sek = ter.f45794a;
            String valueOf = String.valueOf(intent.getAction());
            sek.mo25409a(valueOf.length() == 0 ? new String("unexpected action:") : "unexpected action:".concat(valueOf), new Object[0]);
        } else {
            ter ter = this.f30607a;
            SmsMessage smsMessage = Telephony.Sms.Intents.getMessagesFromIntent(intent)[0];
            sek sek2 = ter.f45794a;
            ter.f45795b = smsMessage;
            ter ter2 = this.f30607a;
            tem tem = ter2.f45796c;
            if (tem != null) {
                ter2.mo26450c(tem);
            }
        }
    }
}

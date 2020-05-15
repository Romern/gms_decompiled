package com.google.android.gms.appinvite.sms;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.telephony.PhoneNumberUtils;
import android.telephony.SmsManager;
import android.text.TextUtils;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SendSmsOperation extends IntentOperation {
    /* renamed from: a */
    public static void m6195a(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("phoneNumber");
        String stringExtra2 = intent.getStringExtra("message");
        String stringExtra3 = intent.getStringExtra("inviteId");
        if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra2) && !TextUtils.isEmpty(stringExtra3)) {
            String formatNumber = PhoneNumberUtils.formatNumber(stringExtra);
            SmsManager smsManager = SmsManager.getDefault();
            Intent intent2 = new Intent();
            intent2.setClassName(context, "com.google.android.gms.appinvite.sms.SendSmsReceiver");
            intent2.putExtras(intent);
            intent2.setData(new Uri.Builder().scheme("SendSmsOperation").appendEncodedPath(intent.getStringExtra("inviteId")).appendEncodedPath(intent.getStringExtra("phoneNumber")).build());
            smsManager.sendTextMessage(formatNumber, null, stringExtra2, PendingIntent.getBroadcast(context, 0, intent2, JGCastService.FLAG_PRIVATE_DISPLAY), null);
        }
    }

    public final void onHandleIntent(Intent intent) {
        m6195a(this, intent);
    }
}

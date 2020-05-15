package com.google.android.gms.auth.authzen.cryptauth;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SyncAlarmIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f10408a = new sek("SyncAlarmIntentOperation");

    /* renamed from: a */
    public static Intent m6437a(Context context) {
        return IntentOperation.getStartIntent(context, SyncAlarmIntentOperation.class, "com.google.android.gms.auth.authzen.cryptauth.SyncAlarmIntent");
    }

    public final void onHandleIntent(Intent intent) {
        f10408a.mo25414c("Received intent %s.", intent);
        ihe a = ihe.m15438a(getBaseContext());
        Uri data = intent.getData();
        if (data == null) {
            ihe.f21007c.mo25418e("no data URI in intent", new Object[0]);
            return;
        }
        String queryParameter = data.getQueryParameter("eventType");
        String queryParameter2 = data.getQueryParameter("accountName");
        String queryParameter3 = data.getQueryParameter("syncComponent");
        if (queryParameter == null || queryParameter2 == null || queryParameter3 == null) {
            ihe.f21007c.mo25418e("Could not get some required parameter from intent. eventTypeStr: %s; accountName: %s; syncComponentsStr: %s", queryParameter, queryParameter2, queryParameter3);
            return;
        }
        try {
            int parseInt = Integer.parseInt(queryParameter);
            int parseInt2 = Integer.parseInt(queryParameter3);
            int intExtra = intent.getIntExtra("invocationReason", 0);
            int intExtra2 = intent.getIntExtra("retryCount", 0);
            if (intExtra == 0) {
                ihe.f21007c.mo25416d("scheduled intent has no invocation reason", new Object[0]);
            }
            synchronized (a.f21010a) {
                a.mo13009a(parseInt, queryParameter2, parseInt2, intExtra, intExtra2);
            }
        } catch (NumberFormatException e) {
            ihe.f21007c.mo25417e("badly formatted uri integer parameters", e, new Object[0]);
        }
    }
}

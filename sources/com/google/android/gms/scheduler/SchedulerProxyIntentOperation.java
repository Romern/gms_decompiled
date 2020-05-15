package com.google.android.gms.scheduler;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SchedulerProxyIntentOperation extends IntentOperation {
    /* renamed from: a */
    public static void m92334a(Intent intent, int i) {
        boolean z;
        if (aajg.m21344d() == 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        if (i < 0) {
            Log.w("GCM", "Dispatching intent with invalid user serial");
            return;
        }
        String action = intent.getAction();
        if ("android.intent.action.PACKAGE_REPLACED".equals(action)) {
            aamh a = SchedulerPackageIntentOperation.m92333a(intent, i);
            if (a != null) {
                apht.m70315a().f84404d.mo16946a(a);
            }
        } else if ("android.intent.action.PACKAGE_FULLY_REMOVED".equals(action)) {
            aamh a2 = SchedulerPackageIntentOperation.m92333a(intent, i);
            if (a2 != null) {
                apht.m70315a().f84404d.mo16949b(a2);
            }
        } else {
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("Unexpected forwarded intent: ");
            sb.append(valueOf);
            Log.w("GCM", sb.toString());
        }
    }

    public final void onHandleIntent(Intent intent) {
        if (!"com.google.android.gms.gcm.nts.USER_FORWARD".equals(intent.getAction())) {
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
            sb.append("Unexpected intent: ");
            sb.append(valueOf);
            Log.w("GCM", sb.toString());
            return;
        }
        Intent intent2 = (Intent) intent.getParcelableExtra("intent");
        int intExtra = intent.getIntExtra("userSerial", -1);
        if (intent2 != null) {
            m92334a(intent2, intExtra);
        }
    }
}

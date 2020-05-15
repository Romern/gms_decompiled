package com.google.android.gms.wallet.intentoperation;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.wallet.dynamite.logging.C1675a;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CrashReportIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.wallet.CRASH_LOG");
        int i = spn.f44932a;
        C1675a a = C1675a.m93928a(stringExtra);
        if (a == null) {
            String valueOf = String.valueOf(stringExtra);
            Log.e("CrashReportIntentOperat", valueOf.length() == 0 ? new String("Uncaught exception: ") : "Uncaught exception: ".concat(valueOf));
            return;
        }
        Log.e("CrashReportIntentOperat", "Uncaught exception:\nPackage name: " + a.f110133c + "\n" + a.f110132b);
    }
}

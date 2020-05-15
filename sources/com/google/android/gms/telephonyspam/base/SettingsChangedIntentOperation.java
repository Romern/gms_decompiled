package com.google.android.gms.telephonyspam.base;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SettingsChangedIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final audg f109044a = audg.m76790a("SettingsChangedIntentOp");

    /* renamed from: b */
    private static final String f109045b = ssv.m36267a("com.google.android.gms.telephonyspam");

    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || f109045b.equals(action)) && "com.google.android.gms.telephonyspam".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            new Object[1][0] = intent.getAction();
            f109044a.mo50423b("telephonyspam phenotype flag changed");
            auey.m76969b();
        }
    }
}

package com.google.android.gms.languageprofile.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmInstanceIdChangedIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        adxt.m51334a();
        adxt.m51343e();
        rpr.m34216b().startService(AccountsChangedIntentOperation.m66808a(rpr.m34216b()));
    }
}

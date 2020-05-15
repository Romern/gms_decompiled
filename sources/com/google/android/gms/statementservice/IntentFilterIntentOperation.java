package com.google.android.gms.statementservice;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class IntentFilterIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        boolean z;
        Bundle extras = intent.getExtras();
        if (extras == null) {
            Log.e("IntentFilterIntentOp", "Invoked with null extras bundle.");
            return;
        }
        int i = extras.getInt("android.content.pm.extra.INTENT_FILTER_VERIFICATION_ID");
        String string = extras.getString("android.content.pm.extra.INTENT_FILTER_VERIFICATION_URI_SCHEME");
        String string2 = extras.getString("android.content.pm.extra.INTENT_FILTER_VERIFICATION_HOSTS");
        String string3 = extras.getString("android.content.pm.extra.INTENT_FILTER_VERIFICATION_PACKAGE_NAME");
        Integer valueOf = Integer.valueOf(i);
        int i2 = 1;
        Log.i("IntentFilterIntentOp", String.format("Verifying IntentFilter. verificationId:%d scheme:\"%s\" hosts:\"%s\" package:\"%s\".", valueOf, string, string2, string3));
        if (string == null || string2 == null || string3 == null) {
            Log.e("IntentFilterIntentOp", "Invoked with missing parameter.");
            return;
        }
        Context applicationContext = getApplicationContext();
        int myUid = Process.myUid();
        Account account = null;
        String packageName = applicationContext.getPackageName();
        new ClientContext(myUid, account, account, packageName, packageName);
        List a = new ased(applicationContext).mo49085a(string, Arrays.asList(string2.split(" ")), string3);
        int size = a.size();
        if (size == 0) {
            z = true;
        } else {
            z = false;
        }
        Log.i("IntentFilterIntentOp", String.format("Verification %d complete. Success:%b. Failed hosts:%s.", valueOf, Boolean.valueOf(z), TextUtils.join(",", a)));
        if (size != 0) {
            i2 = -1;
        }
        applicationContext.getPackageManager().verifyIntentFilter(i, i2, a);
    }
}

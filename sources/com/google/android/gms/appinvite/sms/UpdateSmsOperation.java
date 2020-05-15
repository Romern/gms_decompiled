package com.google.android.gms.appinvite.sms;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UpdateSmsOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        String stringExtra = intent.getStringExtra("accountName");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("sentSms");
        ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("notSentSms");
        Account account = new Account(stringExtra, "com.google");
        ClientContext clientContext = new ClientContext();
        clientContext.f30212b = Process.myUid();
        clientContext.f30214d = account;
        clientContext.f30213c = account;
        clientContext.f30215e = getPackageName();
        clientContext.f30216f = getPackageName();
        clientContext.mo17799a(new String[]{"https://www.googleapis.com/auth/plus.native"});
        Context applicationContext = getApplicationContext();
        try {
            new fvt(clientContext, fva.m12456a(applicationContext), new fuu(applicationContext), stringArrayListExtra, stringArrayListExtra2).mo11356a(applicationContext);
        } catch (RemoteException | sju e) {
            bqye.m113758a(e);
        }
    }
}

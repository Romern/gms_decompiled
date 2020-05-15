package com.google.android.gms.growth.watchdog.chimera;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountChangedIntentOperation extends IntentOperation {

    /* renamed from: a */
    ablh f79046a;

    public final void onCreate() {
        abli a = ablj.m47861a();
        a.mo32207a(abif.m47744a());
        ablh j = a.mo32206a().f57663a.mo32127j();
        cazf.m127593a(j, "Cannot return null from a non-@Nullable component method");
        this.f79046a = j;
    }

    public final void onHandleIntent(Intent intent) {
        if ("android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(intent.getAction())) {
            for (Account account : adyd.m51363a(this).mo33916a("com.google.android.apps.tachyon")) {
                if (account.name.equals("Duo")) {
                    this.f79046a.mo32200a();
                }
            }
        }
    }
}

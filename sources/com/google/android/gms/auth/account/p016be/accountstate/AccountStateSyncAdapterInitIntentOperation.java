package com.google.android.gms.auth.account.p016be.accountstate;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.gms.auth.account.be.accountstate.AccountStateSyncAdapterInitIntentOperation */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountStateSyncAdapterInitIntentOperation extends qlf {

    /* renamed from: a */
    private static final sek f9982a = ght.m13171a("AccountStateSyncAdapter");

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        f9982a.mo25412b("Initializing AccountStateSyncAdapter, IntentAction=%s, InitRuntimeState=%s", intent.getAction(), Integer.valueOf(i));
        Context baseContext = getBaseContext();
        String string = baseContext.getString(C0126R.string.auth_account_state_authority);
        Bundle bundle = new Bundle();
        bundle.putBoolean("force", true);
        bundle.putBoolean("initialize_only", true);
        for (Account account : soz.m35801d(baseContext, baseContext.getPackageName())) {
            ContentResolver.requestSync(account, string, bundle);
        }
    }
}

package com.google.android.gms.instantapps.routing;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountChangedIntentOperation extends IntentOperation {
    static {
        new adfs("AccountChangedIntentOperation");
    }

    public final void onHandleIntent(Intent intent) {
        new Object[1][0] = intent;
        if (intent != null && "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent.getAction()) && adfv.m50332a(this).f61593r.mo33605a()) {
            adkn adkn = adfv.m50332a(this).f61578c;
            Account a = adkn.mo33600a();
            if (a != null) {
                for (Account account : gre.m13768b(intent)) {
                    if (account.name.equals(a.name)) {
                        adkn.mo33602b();
                    }
                }
            }
            DomainFilterUpdateChimeraService.m66763a(camh.ONE_OFF_SYNC_AT_ACCOUNT_CHANGE);
        }
    }
}

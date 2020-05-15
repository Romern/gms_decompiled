package com.google.android.gms.drive.api.operations;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountsChangedIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sbw f30761a = new sbw("AccountsChangedIntentOp", "");

    public final void onHandleIntent(Intent intent) {
        boolean z = false;
        if (!"com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent.getAction())) {
            f30761a.mo25375b("Invalid action: %s", intent.getAction());
            return;
        }
        List<Account> b = gre.m13768b(intent);
        if (b != null && !b.isEmpty()) {
            try {
                tws.m37569b(getApplicationContext());
                vpu a = vpu.m41034a();
                uho uho = new uho(a.f49757d, a.f49761h, a.f49755b);
                if (!b.isEmpty()) {
                    for (Account account : b) {
                        uho.f47649b.mo27412a(uho.f47649b.mo27428c(account.name));
                        z = true;
                    }
                    if (z) {
                        a.f49769p.mo27275a();
                    }
                }
            } catch (InterruptedException e) {
                f30761a.mo25378c("AccountsChangedIntentOp", "Interrupted while handling GOOGLE_ACCOUNT_CHANGE intent", e);
            }
        }
    }
}

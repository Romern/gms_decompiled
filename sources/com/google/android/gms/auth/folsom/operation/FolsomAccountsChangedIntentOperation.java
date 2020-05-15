package com.google.android.gms.auth.folsom.operation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FolsomAccountsChangedIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f10908a = jdh.m16547a("RecoverableKeyStoreAccountChangeIntentOperation");

    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            f10908a.mo25412b("Intent received was null.", new Object[0]);
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            f10908a.mo25412b("Intent action was null.", new Object[0]);
        } else if (!"android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(action)) {
            f10908a.mo25412b("Unsupported intent operation action=%s", action);
        } else if (ccgb.m129584c()) {
            jar.m16427a(this);
        }
    }
}

package com.google.android.gms.backup.settings.component;

import android.accounts.Account;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BackupAccountApiHelperIntentOperation extends lvz {
    /* renamed from: a */
    public final void mo17242a(Intent intent) {
        new lsp(this).mo19592a((Account) intent.getParcelableExtra("account"));
    }
}

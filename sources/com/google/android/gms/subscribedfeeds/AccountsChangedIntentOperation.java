package com.google.android.gms.subscribedfeeds;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AccountsChangedIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if (!cgvi.m147139d()) {
            List<Account> a = gre.m13766a(intent);
            List<Account> b = gre.m13768b(intent);
            for (Account account : a) {
                ContentResolver.setSyncAutomatically(account, "com.google.android.gms.subscribedfeeds", true);
            }
            ContentResolver contentResolver = rpr.m34216b().getContentResolver();
            for (Account account2 : b) {
                contentResolver.delete(ashq.f88987a, "_sync_account=? AND _sync_account_type=?", new String[]{account2.name, account2.type});
            }
        }
    }
}

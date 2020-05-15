package com.google.android.gms.auth.authzen.cryptauth;

import android.accounts.Account;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.authzen.Permit;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountChangeProcessingIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final sek f10406a = new sek("AccountChangeProcessingIntentOperation");

    public final void onHandleIntent(Intent intent) {
        f10406a.mo25414c("Received onHandleIntent() call: %s", intent);
        if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED")) {
            Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("accountsAdded");
            for (Parcelable parcelable : parcelableArrayExtra) {
                f10406a.mo25414c("Handling added account: %s", sek.m35081a(parcelable));
                ihe.m15438a(this).mo13008a(100, ((Account) parcelable).name, 7);
            }
        }
        if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_MUTATED")) {
            Parcelable[] parcelableArrayExtra2 = intent.getParcelableArrayExtra("accountsMutated");
            for (Parcelable parcelable2 : parcelableArrayExtra2) {
                f10406a.mo25414c("Handling mutated account: %s", sek.m35081a(parcelable2));
                ihe.m15438a(this).mo13008a(100, ((Account) parcelable2).name, 8);
            }
        }
        if (intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED")) {
            f10406a.mo25414c("Handling account removal event.", new Object[0]);
            List<Account> b = gre.m13768b(intent);
            iiz a = iix.m15497a(this);
            for (Account account : b) {
                try {
                    List b2 = a.mo13054b(account.name);
                    int size = b2.size();
                    for (int i = 0; i < size; i++) {
                        Permit permit = (Permit) b2.get(i);
                        try {
                            a.mo13055c(permit.f10382b);
                            sendBroadcast(iha.m15432a(permit.f10382b, 8), "com.google.android.gms.auth.authzen.permission.DEVICE_SYNC_FINISHED");
                        } catch (iiy e) {
                            f10406a.mo25418e("Failed to remove permit for account %s.", sek.m35081a(account.name), e);
                        }
                    }
                } catch (iiy e2) {
                    f10406a.mo25418e("Failed to get permits for account: %s", sek.m35081a(account));
                }
            }
        }
    }
}

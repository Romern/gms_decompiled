package p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.content.Context;
import android.text.TextUtils;

/* renamed from: sez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sez {
    static {
        String[] strArr = sam.f43928G;
    }

    /* renamed from: a */
    public static void m35132a(Context context, String str, String[] strArr, AccountManagerCallback accountManagerCallback) {
        sdo.m34975b(!TextUtils.isEmpty(str), "The accountName is required");
        sdo.m34975b(true, "The requiredFeatures parameter is required");
        AccountManager accountManager = AccountManager.get(context);
        boolean z = false;
        for (Account account : accountManager.getAccountsByType("com.google")) {
            if (str.equals(account.name)) {
                z = true;
            }
        }
        if (z) {
            accountManager.hasFeatures(new Account(str, "com.google"), strArr, accountManagerCallback, null);
            return;
        }
        throw new IllegalStateException("Given account does not exist on the device");
    }
}

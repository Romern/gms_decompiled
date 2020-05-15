package com.google.android.gms.wallet.intentoperation;

import android.accounts.Account;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WarmUpUiIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        int intExtra = intent.getIntExtra("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", 1);
        if (intent.hasExtra("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT")) {
            Account account = new Account(intent.getStringExtra("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT"), "com.google");
            String a = awyd.m81488a(intExtra);
            if (chkc.f188704a.mo6606a().mo85296a()) {
                try {
                    gik.m13216d(getApplicationContext(), account, a);
                } catch (IOException e) {
                    Log.e("WarmUpUi", "WarmUpUiIntentOperation IOException", e);
                } catch (UserRecoverableAuthException e2) {
                    Log.e("WarmUpUi", "WarmUpUiIntentOperation UserRecoverableAuthException", e2);
                } catch (gid e3) {
                    Log.e("WarmUpUi", "WarmUpUiIntentOperation GoogleAuthException", e3);
                }
            }
        }
    }
}

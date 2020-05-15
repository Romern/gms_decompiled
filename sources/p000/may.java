package p000;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: may */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class may {
    /* renamed from: a */
    public static String m24780a(Context context, Account account, String str) {
        sdo.m34959a(account);
        try {
            String a = m24781a(context, account, str, cckt.m130239b());
            if (a != null) {
                return a;
            }
            throw new mbb();
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            mbb mbb = new mbb();
            mbb.initCause(e);
            throw mbb;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.accounts.AccountManager.getAuthToken(android.accounts.Account, java.lang.String, android.os.Bundle, boolean, android.accounts.AccountManagerCallback<android.os.Bundle>, android.os.Handler):android.accounts.AccountManagerFuture<android.os.Bundle>}
     arg types: [android.accounts.Account, java.lang.String, ?[OBJECT, ARRAY], int, ?[OBJECT, ARRAY], ?[OBJECT, ARRAY]]
     candidates:
      ClspMth{android.accounts.AccountManager.getAuthToken(android.accounts.Account, java.lang.String, android.os.Bundle, android.app.Activity, android.accounts.AccountManagerCallback<android.os.Bundle>, android.os.Handler):android.accounts.AccountManagerFuture<android.os.Bundle>}
      ClspMth{android.accounts.AccountManager.getAuthToken(android.accounts.Account, java.lang.String, android.os.Bundle, boolean, android.accounts.AccountManagerCallback<android.os.Bundle>, android.os.Handler):android.accounts.AccountManagerFuture<android.os.Bundle>} */
    /* renamed from: a */
    public static String m24781a(Context context, Account account, String str, long j) {
        adyd a = adyd.m51363a(context);
        bljb a2 = blkh.m107281a("AccountManager.getAuthTokenNotifyAuthFailure");
        try {
            AccountManagerFuture<Bundle> authToken = a.f62893a.getAuthToken(account, str, (Bundle) null, true, (AccountManagerCallback<Bundle>) null, (Handler) null);
            if (a2 != null) {
                a2.close();
            }
            Bundle result = authToken.getResult(j, TimeUnit.MILLISECONDS);
            if (result != null) {
                return result.getString("authtoken");
            }
            return null;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public static String m24782a(Context context, String str) {
        Account a = new lsp(context).mo19591a();
        if (a != null) {
            return m24780a(context, a, str);
        }
        throw new mbh();
    }
}

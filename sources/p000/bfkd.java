package p000;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: bfkd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfkd extends bfke implements OnAccountsUpdateListener {

    /* renamed from: c */
    private static bfkd f114279c = null;

    /* renamed from: a */
    public final adyd f114280a;

    /* renamed from: b */
    public Account[] f114281b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adyd.a(android.accounts.OnAccountsUpdateListener, android.os.Handler, boolean):void
     arg types: [bfkd, ?[OBJECT, ARRAY], int]
     candidates:
      adyd.a(android.accounts.Account, java.util.ArrayList, java.lang.String[]):android.content.Intent
      adyd.a(android.accounts.Account, java.lang.String[], android.accounts.AccountManagerCallback):android.accounts.AccountManagerFuture
      adyd.a(android.accounts.Account, java.lang.String, int):boolean
      adyd.a(android.accounts.Account, java.lang.String, android.os.Bundle):boolean
      adyd.a(android.accounts.OnAccountsUpdateListener, android.os.Handler, boolean):void */
    private bfkd(Context context) {
        Account[] accountArr;
        adyd a = adyd.m51363a(context.getApplicationContext());
        try {
            accountArr = gie.m13199d(context.getApplicationContext(), "com.google");
        } catch (RemoteException | rfv | rfw e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() == 0) {
                new String("Failed to obtain accounts: ");
            } else {
                "Failed to obtain accounts: ".concat(valueOf);
            }
            accountArr = new Account[0];
        }
        this.f114280a = a;
        this.f114281b = accountArr;
        a.mo33912a((OnAccountsUpdateListener) this, (Handler) null, false);
    }

    /* renamed from: a */
    public static synchronized bfkd m97106a(Context context) {
        bfkd bfkd;
        synchronized (bfkd.class) {
            if (f114279c == null) {
                f114279c = new bfkd(context);
            }
            bfkd = f114279c;
        }
        return bfkd;
    }

    /* renamed from: a */
    public final Account[] mo61822a() {
        return this.f114281b;
    }

    public final void onAccountsUpdated(Account[] accountArr) {
        if (accountArr != null) {
            ArrayList arrayList = new ArrayList();
            for (Account account : accountArr) {
                if ("com.google".equals(account.type)) {
                    arrayList.add(account);
                }
            }
            Account[] accountArr2 = (Account[]) arrayList.toArray(new Account[arrayList.size()]);
            Arrays.sort(accountArr2, new bfkc());
            this.f114281b = accountArr2;
        }
    }
}

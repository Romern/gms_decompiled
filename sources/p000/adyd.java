package p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorDescription;
import android.accounts.OnAccountsUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

/* renamed from: adyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adyd {

    /* renamed from: a */
    public final AccountManager f62893a;

    static {
        new Random();
    }

    private adyd(AccountManager accountManager) {
        this.f62893a = accountManager;
    }

    /* renamed from: a */
    public static adyd m51362a(AccountManager accountManager) {
        return new adyd(accountManager);
    }

    /* renamed from: b */
    public final int mo33919b(Account account, String str) {
        bljb a = blkh.m107281a("AccountManager.getAccountVisibility");
        try {
            int accountVisibility = this.f62893a.getAccountVisibility(account, str);
            if (a != null) {
                a.close();
            }
            return accountVisibility;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    public final AccountManagerFuture mo33923c(Account account) {
        bljb a = blkh.m107281a("AccountManager.removeAccount");
        try {
            AccountManagerFuture<Bundle> removeAccount = this.f62893a.removeAccount(account, null, null, null);
            if (a != null) {
                a.close();
            }
            return removeAccount;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: d */
    public final void mo33925d(Account account) {
        bljb a = blkh.m107281a("AccountManager.removeAccountExplicitly");
        try {
            this.f62893a.removeAccountExplicitly(account);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public static adyd m51363a(Context context) {
        return new adyd(AccountManager.get(context));
    }

    /* renamed from: b */
    public final Map mo33920b(Account account) {
        bljb a = blkh.m107281a("AccountManager.getPackagesAndVisibilityForAccount");
        try {
            Map<String, Integer> packagesAndVisibilityForAccount = this.f62893a.getPackagesAndVisibilityForAccount(account);
            if (a != null) {
                a.close();
            }
            return packagesAndVisibilityForAccount;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    public final String mo33924c(Account account, String str) {
        bljb a = blkh.m107281a("AccountManager.blockingGetAuthToken");
        try {
            String blockingGetAuthToken = this.f62893a.blockingGetAuthToken(account, str, true);
            if (a != null) {
                a.close();
            }
            return blockingGetAuthToken;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public static Intent m51364a(Account account, ArrayList arrayList, String[] strArr) {
        bljb a = blkh.m107281a("AccountManager.newChooseAccountIntentPreM");
        try {
            Intent newChooseAccountIntent = AccountManager.newChooseAccountIntent(account, arrayList, strArr, false, null, null, null, null);
            if (a != null) {
                a.close();
            }
            return newChooseAccountIntent;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public final void mo33921b(String str, String str2) {
        bljb a = blkh.m107281a("AccountManager.invalidateAuthToken");
        try {
            this.f62893a.invalidateAuthToken(str, str2);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public final Account[] mo33922b() {
        bljb a = blkh.m107281a("AccountManager.getAccounts");
        try {
            Account[] accounts = this.f62893a.getAccounts();
            if (a != null) {
                a.close();
            }
            return accounts;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final AccountManagerFuture mo33906a(Account account, String[] strArr, AccountManagerCallback accountManagerCallback) {
        bljb a = blkh.m107281a("AccountManager.hasFeatures");
        try {
            AccountManagerFuture<Boolean> hasFeatures = this.f62893a.hasFeatures(account, strArr, accountManagerCallback, null);
            if (a != null) {
                a.close();
            }
            return hasFeatures;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final AccountManagerFuture mo33907a(String str, String[] strArr) {
        bljb a = blkh.m107281a("AccountManager.getAccountsByTypeAndFeatures");
        try {
            AccountManagerFuture<Account[]> accountsByTypeAndFeatures = this.f62893a.getAccountsByTypeAndFeatures(str, strArr, null, null);
            if (a != null) {
                a.close();
            }
            return accountsByTypeAndFeatures;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final String mo33908a(Account account) {
        bljb a = blkh.m107281a("AccountManager.getPassword");
        try {
            String password = this.f62893a.getPassword(account);
            if (a != null) {
                a.close();
            }
            return password;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo33909a(Account account, Bundle bundle, Activity activity, AccountManagerCallback accountManagerCallback, Handler handler) {
        bljb a = blkh.m107281a("AccountManager.confirmCredentials");
        try {
            this.f62893a.confirmCredentials(account, bundle, activity, accountManagerCallback, handler);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo33910a(Account account, String str) {
        bljb a = blkh.m107281a("AccountManager.setPassword");
        try {
            this.f62893a.setPassword(account, str);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo33911a(Account account, String str, Bundle bundle, Activity activity, AccountManagerCallback accountManagerCallback) {
        bljb a = blkh.m107281a("AccountManager.updateCredentials");
        try {
            this.f62893a.updateCredentials(account, str, bundle, activity, accountManagerCallback, null);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo33912a(OnAccountsUpdateListener onAccountsUpdateListener, Handler handler, boolean z) {
        bljb a = blkh.m107281a("AccountManager.addOnAccountsUpdatedListener");
        try {
            this.f62893a.addOnAccountsUpdatedListener(onAccountsUpdateListener, handler, z);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo33913a(String str, String str2, String[] strArr, Bundle bundle, Activity activity, AccountManagerCallback accountManagerCallback) {
        bljb a = blkh.m107281a("AccountManager.addAccount");
        try {
            this.f62893a.addAccount(str, str2, strArr, bundle, activity, accountManagerCallback, null);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final boolean mo33914a(Account account, String str, int i) {
        bljb a = blkh.m107281a("AccountManager.setAccountVisibility");
        try {
            boolean accountVisibility = this.f62893a.setAccountVisibility(account, str, i);
            if (a != null) {
                a.close();
            }
            return accountVisibility;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final boolean mo33915a(Account account, String str, Bundle bundle) {
        bljb a = blkh.m107281a("AccountManager.addAccountExplicitly");
        try {
            boolean addAccountExplicitly = this.f62893a.addAccountExplicitly(account, str, bundle);
            if (a != null) {
                a.close();
            }
            return addAccountExplicitly;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final Account[] mo33916a(String str) {
        bljb a = blkh.m107281a("AccountManager.getAccountsByType");
        try {
            Account[] accountsByType = this.f62893a.getAccountsByType(str);
            if (a != null) {
                a.close();
            }
            return accountsByType;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final Account[] mo33917a(String str, String str2) {
        bljb a = blkh.m107281a("AccountManager.getAccountsByTypeForPackage");
        try {
            Account[] accountsByTypeForPackage = this.f62893a.getAccountsByTypeForPackage(str, str2);
            if (a != null) {
                a.close();
            }
            return accountsByTypeForPackage;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final AuthenticatorDescription[] mo33918a() {
        bljb a = blkh.m107281a("AccountManager.getAuthenticatorType");
        try {
            AuthenticatorDescription[] authenticatorTypes = this.f62893a.getAuthenticatorTypes();
            if (a != null) {
                a.close();
            }
            return authenticatorTypes;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}

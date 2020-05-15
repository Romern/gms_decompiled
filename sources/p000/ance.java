package p000;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.IOException;

/* renamed from: ance */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ance implements ancd {

    /* renamed from: a */
    static final String[] f76618a = {"service_googleme"};

    /* renamed from: b */
    private final ancw f76619b = anbx.INSTANCE;

    /* renamed from: a */
    public final boolean mo41687a(Context context, Account account) {
        bmxy.m108581a(context);
        bmxy.m108581a(account);
        if ("com.google".equals(account.type)) {
            return mo41688a(context, account.name);
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo41688a(Context context, String str) {
        Account a;
        bmxy.m108581a(context);
        bmxy.m108581a(str);
        andm andm = new andm(context);
        int i = Build.VERSION.SDK_INT;
        if (andm.f76699a.mo25481a("android.permission.GET_ACCOUNTS") != 0 || (a = this.f76619b.mo41676a(context, str)) == null) {
            return false;
        }
        try {
            return ((Boolean) adyd.m51363a(context).mo33906a(a, f76618a, (AccountManagerCallback) null).getResult()).booleanValue();
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            Log.e("GooglePlusCheckerImpl", "Unable to get account features.", e);
            return false;
        }
    }
}

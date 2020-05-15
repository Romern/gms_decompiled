package p000;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.wallet.shared.ApplicationParameters;

/* renamed from: awfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awfl {
    /* renamed from: a */
    public static awxz m79846a(Bundle bundle) {
        Account account;
        int b = m79847b(bundle);
        if (bundle != null) {
            account = (Account) bundle.getParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT");
        } else {
            account = null;
        }
        int i = 1;
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.wallet.EXTRA_ALLOW_ACCOUNT_SELECTION", false)) {
            z = true;
        }
        if (bundle != null) {
            i = bundle.getInt("com.google.android.gms.wallet.EXTRA_THEME", 1);
        }
        awxz a = ApplicationParameters.m94173a();
        a.mo52744b(b);
        a.mo52739a(account);
        a.mo52740a(bundle);
        a.mo52742a(z);
        a.mo52745c(i);
        return a;
    }

    /* renamed from: b */
    public static int m79847b(Bundle bundle) {
        if (bundle != null) {
            return bundle.getInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", 1);
        }
        return 1;
    }
}

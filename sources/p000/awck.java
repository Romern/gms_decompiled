package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* renamed from: awck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awck {
    /* renamed from: a */
    public static BuyFlowConfig m79676a(Object obj) {
        if (obj instanceof awcl) {
            return ((awcl) obj).mo51881h();
        }
        return null;
    }

    /* renamed from: b */
    public static String m79677b(Object obj) {
        Account account;
        if (obj instanceof bjel) {
            account = ((bjel) obj).mo51878cn();
        } else {
            account = null;
        }
        if (account != null) {
            return account.name;
        }
        return null;
    }
}

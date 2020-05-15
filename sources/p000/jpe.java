package p000;

import android.accounts.Account;
import android.content.Context;
import java.util.List;

/* renamed from: jpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jpe {

    /* renamed from: a */
    private static final Logger f22967a = jsy.m17256a("FeatureUtils");

    /* renamed from: a */
    public static boolean m17064a(Context context) {
        List<Account> d = soz.m35801d(context, "com.google.android.gms");
        if (d.isEmpty()) {
            f22967a.mo25416d("Accounts list is empty", new Object[0]);
            return false;
        }
        jlg a = jlf.m16865a(context);
        for (Account account : d) {
            if (a.mo13851a(account, bsni.BETTER_TOGETHER_HOST)) {
                return true;
            }
        }
        return false;
    }
}

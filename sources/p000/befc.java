package p000;

import android.accounts.Account;
import java.util.Collections;
import java.util.Map;

/* renamed from: befc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class befc {
    /* renamed from: a */
    static Integer m94934a(byeg byeg, Account account) {
        String str = account.name;
        String str2 = account.type;
        for (Map.Entry entry : Collections.unmodifiableMap(byeg.f165903c).entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            byee byee = (byee) entry.getValue();
            if (byee.f165896b.equals(str) && byee.f165897c.equals(str2)) {
                return Integer.valueOf(intValue);
            }
        }
        return null;
    }
}

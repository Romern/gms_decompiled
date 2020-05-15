package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: aoyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoyd {

    /* renamed from: a */
    final aoye f83837a;

    static {
        aoyh.m69805a("DasherAccountLookup");
    }

    public aoyd(Context context) {
        if (!cgiw.f187009a.mo6606a().mo83849c()) {
            this.f83837a = new aoyi();
        } else {
            this.f83837a = new aoyf(adyd.m51363a(context));
        }
    }

    /* renamed from: a */
    public final boolean mo46976a(Context context) {
        Account[] a = aoxs.m69789a(context);
        for (Account account : a) {
            if (account != null && mo46977a(account.name)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo46977a(String str) {
        return this.f83837a.mo46978a(str);
    }
}

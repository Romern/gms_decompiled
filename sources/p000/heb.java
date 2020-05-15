package p000;

import android.accounts.Account;

/* renamed from: heb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class heb {
    /* renamed from: a */
    public static acyr m14255a(Account account) {
        try {
            return acyr.m50017a(rpr.m34216b(), account);
        } catch (gid e) {
            throw adbe.m50107a(e);
        }
    }

    /* renamed from: a */
    public static bngx m14256a() {
        bngs j = bngx.m109377j();
        for (Account account : adyd.m51363a(rpr.m34216b()).mo33916a("com.google")) {
            j.mo67668c(m14255a(account));
        }
        return j.mo67664a();
    }
}

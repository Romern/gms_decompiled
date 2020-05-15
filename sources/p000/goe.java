package p000;

import android.accounts.Account;
import android.content.Context;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: goe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class goe implements gnw {

    /* renamed from: a */
    private final Set f18765a = new HashSet(Arrays.asList(gqd.f18807a, gqd.f18810d, gqd.f18821o));

    /* renamed from: b */
    private final gkj f18766b;

    public goe(Context context) {
        gkj gkj = new gkj(context);
        this.f18766b = gkj;
    }

    /* renamed from: a */
    public final void mo12082a(goa goa, Account account, gnz gnz, Object obj) {
        if (this.f18765a.contains(gnz)) {
            gkj.f18395a.mo25414c("OnDataChanged check: %s", sek.m35081a(account));
            this.f18766b.mo11985a(goa, account);
        }
    }
}

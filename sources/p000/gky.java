package p000;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: gky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gky {

    /* renamed from: a */
    public static final sek f18442a = ght.m13171a("AccountStateSyncher");

    /* renamed from: b */
    public final Context f18443b;

    /* renamed from: c */
    private final gkx f18444c;

    /* renamed from: d */
    private final goa f18445d = ((goa) goa.f18759a.mo13145b());

    public gky(Context context) {
        new rtg(context);
        gkx gkx = new gkx(context);
        this.f18443b = context;
        this.f18444c = gkx;
    }

    /* renamed from: a */
    public final boolean mo12003a(Account account) {
        try {
            bzxk a = this.f18444c.mo12001a(account, gnv.m13523aE());
            HashSet hashSet = new HashSet(a.f171765b);
            if (hashSet.isEmpty()) {
                f18442a.mo25418e("Something bad went wrong. Don't unset all the services in this case.", new Object[0]);
            } else if (!hashSet.equals((Set) this.f18445d.mo12090a(account, gqd.f18812f))) {
                this.f18445d.mo12095b(account, gqd.f18812f, hashSet);
            }
            if (TextUtils.equals(account.name, a.f171764a)) {
                f18442a.mo25414c("Skipping rename because the lookup contains the same email.", new Object[0]);
                return true;
            }
            f18442a.mo25414c("Renaming account as primary email different from existing account", new Object[0]);
            return this.f18444c.mo12002b(account, a.f171764a);
        } catch (IOException e) {
            f18442a.mo25415d("Unable to look up account state from server.", e, new Object[0]);
            return false;
        }
    }
}

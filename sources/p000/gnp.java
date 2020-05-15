package p000;

import android.accounts.Account;

/* renamed from: gnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gnp {

    /* renamed from: a */
    public static final imo f18711a = new gno();

    /* renamed from: b */
    public final goa f18712b;

    /* renamed from: c */
    private final gko f18713c;

    static {
        gnz gnz = gqd.f18807a;
    }

    public gnp() {
        goa goa = (goa) goa.f18759a.mo13145b();
        gko gko = (gko) gko.f18416b.mo13145b();
        sdo.m34959a(goa);
        this.f18712b = goa;
        sdo.m34959a(gko);
        this.f18713c = gko;
    }

    /* renamed from: a */
    public final String mo12077a(String str, String str2) {
        try {
            String str3 = this.f18713c.mo11990a(str).f18411b;
            return str + ":" + str3 + ":" + str2;
        } catch (gkn e) {
            throw new gnn("Unable to get package signature.", e);
        }
    }

    /* renamed from: a */
    public final boolean mo12078a(Account account, String str, String str2) {
        return ((Boolean) this.f18712b.mo12091a(account, gqb.m13700a(mo12077a(str, str2)), false)).booleanValue();
    }
}

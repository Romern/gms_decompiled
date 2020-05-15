package p000;

import android.accounts.Account;

/* renamed from: afsw */
final /* synthetic */ class afsw implements bqeh {

    /* renamed from: a */
    private final aftc f64693a;

    public afsw(aftc aftc) {
        this.f64693a = aftc;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        aftc aftc = this.f64693a;
        Account account = (Account) obj;
        return bqdf.m112619a(bqdx.m112674a(bqfl.m112747c(account != null ? aftc.f64701b.mo34080b(afyd.PROFILE_SYNC, account) : aftc.f64701b.mo34086d(afyd.PROFILE_SYNC)), afsz.f64697a, bqfb.INSTANCE), Exception.class, new afta(aftc), bqfb.INSTANCE);
    }
}

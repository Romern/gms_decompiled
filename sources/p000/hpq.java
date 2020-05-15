package p000;

import android.accounts.Account;

/* renamed from: hpq */
public final /* synthetic */ class hpq implements bqeh {

    /* renamed from: a */
    private final Account f20188a;

    /* renamed from: b */
    private final hik f20189b;

    public hpq(hik hik, Account account) {
        this.f20189b = hik;
        this.f20188a = account;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        hik hik = this.f20189b;
        Account account = this.f20188a;
        hln a = hln.m14581a(hik.f19829a);
        adbj adbj = adbj.AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_GET_ALL_SETTINGS;
        acyr a2 = heb.m14255a(account);
        bqgg a3 = bqdx.m112673a(adbb.m50100a(qqs.m32661a().mo24210a(a2.mo33252a()).mo24750i()), hlf.f19978a, bqfb.INSTANCE);
        bqgg a4 = a.f19985a.mo12614a(a2, hmu.f20045a);
        bqgg a5 = bqdx.m112673a(a.f19985a.mo12617b(a2), hlj.f19980a, bqfb.INSTANCE);
        bqgg a6 = bqga.m112786c(a3, a4, a5).mo69216a(new hlk(a4, a5, a3), bqfb.INSTANCE);
        ((hez) obj).mo12448a(adbj, a6);
        return adax.m50092a(a6);
    }
}

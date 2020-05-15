package p000;

import android.accounts.Account;

/* renamed from: hpr */
public final /* synthetic */ class hpr implements bqeh {

    /* renamed from: a */
    private final Account f20190a;

    /* renamed from: b */
    private final boolean f20191b;

    /* renamed from: c */
    private final hik f20192c;

    public hpr(hik hik, Account account, boolean z) {
        this.f20192c = hik;
        this.f20190a = account;
        this.f20191b = z;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        hik hik = this.f20192c;
        Account account = this.f20190a;
        boolean z = this.f20191b;
        hln a = hln.m14581a(hik.f19829a);
        adbj adbj = adbj.AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_SET_SERVICE_ENABLED;
        acyr a2 = heb.m14255a(account);
        bqgg a3 = bqdx.m112674a(a.f19985a.mo12616a(a2, hmu.m14620a("credentials_enable_service", z)), new hla(a, a2, z), bqfb.INSTANCE);
        ((hez) obj).mo12448a(adbj, a3);
        return a3;
    }
}

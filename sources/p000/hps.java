package p000;

import android.accounts.Account;

/* renamed from: hps */
public final /* synthetic */ class hps implements bqeh {

    /* renamed from: a */
    private final Account f20193a;

    /* renamed from: b */
    private final boolean f20194b;

    /* renamed from: c */
    private final hik f20195c;

    public hps(hik hik, Account account, boolean z) {
        this.f20195c = hik;
        this.f20193a = account;
        this.f20194b = z;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        hik hik = this.f20195c;
        Account account = this.f20193a;
        boolean z = this.f20194b;
        hln a = hln.m14581a(hik.f19829a);
        adbj adbj = adbj.AUTH_API_CREDENTIALS_ACCOUNT_SETTINGS_DATA_PROVIDER_SET_AUTO_SIGNIN_ENABLED;
        bqgg a2 = adax.m50093a(a.f19985a.mo12616a(heb.m14255a(account), hmu.m14620a("credentials_enable_autosignin", z)), Boolean.valueOf(z));
        ((hez) obj).mo12448a(adbj, a2);
        return a2;
    }
}

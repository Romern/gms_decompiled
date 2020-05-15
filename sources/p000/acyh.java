package p000;

import com.google.android.gms.identity.accounts.api.AccountData;
import com.google.android.gms.identity.accounts.service.AccountDataApiService;

/* renamed from: acyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acyh extends acyl implements aaai {

    /* renamed from: a */
    private final AccountDataApiService f61076a;

    /* renamed from: b */
    private final aaag f61077b;

    public acyh(AccountDataApiService accountDataApiService, aaag aaag) {
        this.f61076a = accountDataApiService;
        this.f61077b = aaag;
    }

    /* renamed from: a */
    public final void mo33239a(acyk acyk, AccountData accountData) {
        this.f61077b.mo16659a(this.f61076a, new acyj(acyk, accountData));
    }

    /* renamed from: a */
    public final void mo33240a(acyk acyk, byte[] bArr) {
        this.f61077b.mo16659a(this.f61076a, new acyi(acyk, bArr));
    }
}

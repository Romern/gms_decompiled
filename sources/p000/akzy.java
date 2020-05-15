package p000;

import android.accounts.Account;

/* renamed from: akzy */
final /* synthetic */ class akzy implements C0038ax {

    /* renamed from: a */
    private final alaf f73196a;

    public akzy(alaf alaf) {
        this.f73196a = alaf;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        alaf alaf = this.f73196a;
        Account account = (Account) obj;
        if (account != null) {
            alaf.mo40048e();
            alaf.mo40041a(alaf.f73215i, account.name, alaf.f73210d.mo40022b());
        }
    }
}

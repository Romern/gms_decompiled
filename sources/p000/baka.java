package p000;

import android.accounts.Account;

/* renamed from: baka */
public final /* synthetic */ class baka implements bmxj {

    /* renamed from: a */
    private final bakd f101101a;

    /* renamed from: b */
    private final Account f101102b;

    public baka(bakd bakd, Account account) {
        this.f101101a = bakd;
        this.f101102b = account;
    }

    public final Object apply(Object obj) {
        byie byie;
        bakd bakd = this.f101101a;
        Account account = this.f101102b;
        Void voidR = (Void) obj;
        synchronized (bakd.f101111f) {
            byie = (byie) bakd.f101107b.get(account);
        }
        return byie;
    }
}

package p000;

import android.accounts.Account;

/* renamed from: bajz */
final /* synthetic */ class bajz implements bmxj {

    /* renamed from: a */
    private final bakd f101099a;

    /* renamed from: b */
    private final byie f101100b;

    public bajz(bakd bakd, byie byie) {
        this.f101099a = bakd;
        this.f101100b = byie;
    }

    public final Object apply(Object obj) {
        Account account;
        bakd bakd = this.f101099a;
        byie byie = this.f101100b;
        Void voidR = (Void) obj;
        synchronized (bakd.f101111f) {
            account = (Account) bakd.f101106a.get(byie);
        }
        return account;
    }
}

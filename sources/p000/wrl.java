package p000;

import android.accounts.Account;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;

/* renamed from: wrl */
public final /* synthetic */ class wrl implements Callable {

    /* renamed from: a */
    private final wrn f51183a;

    /* renamed from: b */
    private final Account f51184b;

    /* renamed from: c */
    private final String f51185c;

    public wrl(wrn wrn, Account account, String str) {
        this.f51183a = wrn;
        this.f51184b = account;
        this.f51185c = str;
    }

    public final Object call() {
        wrn wrn = this.f51183a;
        Account account = this.f51184b;
        String str = this.f51185c;
        bniq b = bniq.m109556b(wrn.f51190a.mo11918a(account, str));
        synchronized (wrn) {
            wrn.f51193d = b;
            bniq bniq = wrn.f51193d;
            CookieManager cookieManager = wrn.f51192c;
            bngs j = bngx.m109377j();
            bnrd a = bniq.iterator();
            while (a.hasNext()) {
                String str2 = (String) a.next();
                for (wrm wrm : wrn.m42182a(str2, cookieManager)) {
                    j.mo67668c(wrn.m42181a(str2, wrm.f51186a));
                }
            }
            wrn.f51194e = j.mo67664a();
            wrn.mo29317a(account);
        }
        return null;
    }
}

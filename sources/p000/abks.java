package p000;

import android.accounts.Account;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;

/* renamed from: abks */
final /* synthetic */ class abks implements Callable {

    /* renamed from: a */
    private final abku f57636a;

    /* renamed from: b */
    private final Account f57637b;

    /* renamed from: c */
    private final String f57638c;

    public abks(abku abku, Account account, String str) {
        this.f57636a = abku;
        this.f57637b = account;
        this.f57638c = str;
    }

    public final Object call() {
        abku abku = this.f57636a;
        Account account = this.f57637b;
        String str = this.f57638c;
        bniq b = bniq.m109556b(abku.f57643a.mo11918a(account, str));
        synchronized (abku) {
            abku.f57645c = b;
            bniq bniq = abku.f57645c;
            CookieManager cookieManager = abku.f57644b;
            bngs j = bngx.m109377j();
            bnrd a = bniq.iterator();
            while (a.hasNext()) {
                String str2 = (String) a.next();
                for (abkt abkt : abku.m47824a(str2, cookieManager)) {
                    j.mo67668c(abku.m47823a(str2, abkt.f57639a));
                }
            }
            abku.f57646d = j.mo67664a();
            abku.mo32189a(account);
        }
        return null;
    }
}

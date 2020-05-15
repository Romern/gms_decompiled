package p000;

import android.accounts.Account;
import android.webkit.CookieManager;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: akzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akzo implements Callable {

    /* renamed from: a */
    final /* synthetic */ Account f73171a;

    /* renamed from: b */
    final /* synthetic */ String f73172b;

    /* renamed from: c */
    final /* synthetic */ akzq f73173c;

    public akzo(akzq akzq, Account account, String str) {
        this.f73173c = akzq;
        this.f73171a = account;
        this.f73172b = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        bniq b = bniq.m109556b(this.f73173c.f73179a.mo11918a(this.f73171a, this.f73172b));
        synchronized (this.f73173c) {
            akzq akzq = this.f73173c;
            akzq.f73182d = b;
            bniq bniq = akzq.f73182d;
            CookieManager cookieManager = akzq.f73181c;
            int i = akzq.f73176g;
            bngs j = bngx.m109377j();
            bnrd a = bniq.iterator();
            while (a.hasNext()) {
                String str = (String) a.next();
                List a2 = akzq.m60717a(str, cookieManager);
                int size = a2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    j.mo67668c(akzq.m60716a(str, ((akzp) a2.get(i2)).f73174a));
                }
            }
            akzq.f73184f = j.mo67664a();
            this.f73173c.mo40027a(this.f73171a);
        }
        return null;
    }
}

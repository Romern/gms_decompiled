package p000;

import android.accounts.Account;
import java.util.concurrent.Executor;

/* renamed from: aedw */
final /* synthetic */ class aedw implements bmxj {

    /* renamed from: a */
    private final aeed f63237a;

    /* renamed from: b */
    private final bxvp f63238b;

    /* renamed from: c */
    private final bbjb f63239c;

    /* renamed from: d */
    private final Executor f63240d;

    /* renamed from: e */
    private final int f63241e;

    public aedw(aeed aeed, bxvp bxvp, int i, bbjb bbjb, Executor executor) {
        this.f63237a = aeed;
        this.f63238b = bxvp;
        this.f63241e = i;
        this.f63239c = bbjb;
        this.f63240d = executor;
    }

    public final Object apply(Object obj) {
        aeed aeed = this.f63237a;
        bxvp bxvp = this.f63238b;
        int i = this.f63241e;
        bbjb bbjb = this.f63239c;
        Executor executor = this.f63240d;
        bngx bngx = (bngx) obj;
        bxvp.mo3214a();
        bngx.size();
        bngs j = bngx.m109377j();
        bnre i2 = bngx.listIterator();
        while (i2.hasNext()) {
            Account account = (Account) i2.next();
            j.mo67668c(aeed.mo34085d(bxvp, account).mo34068a(new aedo(bbjb, account), i, executor));
        }
        return j.mo67664a();
    }
}

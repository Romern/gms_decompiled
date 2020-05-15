package p000;

import android.accounts.Account;
import java.util.concurrent.Callable;

/* renamed from: akcr */
final /* synthetic */ class akcr implements Callable {

    /* renamed from: a */
    private final akcv f71610a;

    /* renamed from: b */
    private final Account f71611b;

    public akcr(akcv akcv, Account account) {
        this.f71610a = akcv;
        this.f71611b = account;
    }

    public final Object call() {
        akcv akcv = this.f71610a;
        Account account = this.f71611b;
        return Boolean.valueOf(akcv.mo39230a(account, akcv.f71618c.mo39436b(account)));
    }
}

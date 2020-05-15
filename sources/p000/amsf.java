package p000;

import android.accounts.Account;
import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: amsf */
final /* synthetic */ class amsf implements Callable {

    /* renamed from: a */
    private final amsg f75847a;

    public amsf(amsg amsg) {
        this.f75847a = amsg;
    }

    public final Object call() {
        amsg amsg = this.f75847a;
        amsh amsh = amsg.f75850h;
        List d = soz.m35801d(amsh.f75853a, amsh.f75854b);
        if (d.isEmpty()) {
            return null;
        }
        if (!stm.m36302d(amsg.f75849g)) {
            Account account = new Account(amsg.f75849g, "com.google");
            if (d.contains(account)) {
                amsg.f75849g = null;
                return account;
            }
        }
        String a = amsg.f75848a.mo41354a();
        if (TextUtils.isEmpty(a)) {
            return (Account) d.get(0);
        }
        Account account2 = new Account(a, "com.google");
        if (d.contains(account2)) {
            return account2;
        }
        return (Account) d.get(0);
    }
}

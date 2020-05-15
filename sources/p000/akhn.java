package p000;

import android.accounts.Account;
import java.util.concurrent.Callable;

/* renamed from: akhn */
final /* synthetic */ class akhn implements Callable {

    /* renamed from: a */
    private final Callable f72015a;

    /* renamed from: b */
    private final Account f72016b;

    public akhn(Callable callable, Account account) {
        this.f72015a = callable;
        this.f72016b = account;
    }

    public final Object call() {
        Callable callable = this.f72015a;
        Account account = this.f72016b;
        butj butj = new butj(cfov.f185185a.mo6606a().mo82325ah());
        butj.f154850b = 5;
        akht akht = (akht) butl.m120433a(callable, "GetAccountOwner", butj.mo73110a());
        if (akht != null) {
            return akht;
        }
        String str = account.name;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 57);
        sb.append("Failed to find account ");
        sb.append(str);
        sb.append(" in the list of on device accounts");
        throw new Exception(sb.toString());
    }
}

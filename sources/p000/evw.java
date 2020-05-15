package p000;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;

/* renamed from: evw */
final /* synthetic */ class evw implements AccountManagerCallback {

    /* renamed from: a */
    private final ewf f15906a;

    public evw(ewf ewf) {
        this.f15906a = ewf;
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        this.f15906a.mo10549a(accountManagerFuture);
    }
}

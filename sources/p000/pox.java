package p000;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;

/* renamed from: pox */
final /* synthetic */ class pox implements OnAccountsUpdateListener {

    /* renamed from: a */
    private final ppa f39960a;

    public pox(ppa ppa) {
        this.f39960a = ppa;
    }

    public final void onAccountsUpdated(Account[] accountArr) {
        pes.m30266a().execute(new poz(this.f39960a));
    }
}

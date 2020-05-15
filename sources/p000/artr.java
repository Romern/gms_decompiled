package p000;

import android.accounts.Account;
import com.google.android.gms.smartdevice.setup.accounts.UserBootstrapInfo;

/* renamed from: artr */
final /* synthetic */ class artr implements aubg {

    /* renamed from: a */
    private final Account f88283a;

    public artr(Account account) {
        this.f88283a = account;
    }

    /* renamed from: a */
    public final Object mo7031a(aucb aucb) {
        Account account = this.f88283a;
        sek sek = aruc.f88303a;
        return new UserBootstrapInfo(account.name, (byte[]) aucb.mo50386d());
    }
}

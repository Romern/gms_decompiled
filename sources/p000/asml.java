package p000;

import android.accounts.Account;
import com.google.android.gms.tapandpay.internal.firstparty.GetAllCardsRequest;

/* renamed from: asml */
public final /* synthetic */ class asml implements roo {

    /* renamed from: a */
    private final Account f89249a;

    public asml(Account account) {
        this.f89249a = account;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        ((aswj) ((aswp) obj).mo25289B()).mo49561a(new GetAllCardsRequest(false, this.f89249a), new asnh((aucf) obj2));
    }
}

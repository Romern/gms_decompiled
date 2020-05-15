package p000;

import android.accounts.Account;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.wallet.p084ow.RootChimeraActivity;

/* renamed from: awnv */
public final /* synthetic */ class awnv implements aubw {

    /* renamed from: a */
    private final RootChimeraActivity f94676a;

    public awnv(RootChimeraActivity rootChimeraActivity) {
        this.f94676a = rootChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        String str;
        RootChimeraActivity rootChimeraActivity = this.f94676a;
        AccountInfo accountInfo = (AccountInfo) obj;
        if (!(accountInfo == null || (str = accountInfo.f108326b) == null)) {
            rootChimeraActivity.f110291i = new Account(str, "com.google");
            rootChimeraActivity.f110290h.mo59893a(rootChimeraActivity.f110291i);
        }
        rootChimeraActivity.mo59955e();
    }
}

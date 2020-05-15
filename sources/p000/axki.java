package p000;

import android.accounts.Account;
import com.google.android.gms.walletp2p.feature.transfer.TransferMoneyChimeraActivity;
import com.google.android.gms.walletp2p.internal.zeroparty.GetTransactionResponse;
import java.util.ArrayList;

/* renamed from: axki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axki extends axkn {

    /* renamed from: a */
    final /* synthetic */ TransferMoneyChimeraActivity f96076a;

    public axki(TransferMoneyChimeraActivity transferMoneyChimeraActivity) {
        this.f96076a = transferMoneyChimeraActivity;
    }

    /* renamed from: a */
    public final void mo53196a(GetTransactionResponse getTransactionResponse) {
        if (getTransactionResponse.f110818b.size() == 1) {
            this.f96076a.mo53238P(19);
            this.f96076a.f110726n = ((Account) getTransactionResponse.f110818b.get(0)).name;
            this.f96076a.f110725m.mo60151a(getTransactionResponse.f110817a);
            this.f96076a.mo60192g();
        } else if (getTransactionResponse.f110818b.size() > 1) {
            this.f96076a.mo53238P(20);
            this.f96076a.mo60189a(new ArrayList(getTransactionResponse.f110818b), true, false);
        } else {
            this.f96076a.mo53238P(21);
            this.f96076a.mo60201p();
        }
    }
}

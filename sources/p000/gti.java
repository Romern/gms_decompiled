package p000;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.common.api.Status;

/* renamed from: gti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gti extends gtk {

    /* renamed from: a */
    final /* synthetic */ gtj f18989a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gti(gtj gtj, gtl gtl) {
        super(gtl);
        this.f18989a = gtj;
    }

    /* renamed from: a */
    public final void mo12195a(Status status, AccountTransferMsg accountTransferMsg) {
        if (status.mo17710c()) {
            this.f18989a.mo12198a(accountTransferMsg);
        } else {
            this.f18989a.mo12197a(status);
        }
    }
}

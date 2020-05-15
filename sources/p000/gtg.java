package p000;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.common.api.Status;

/* renamed from: gtg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gtg extends gtk {

    /* renamed from: a */
    final /* synthetic */ gth f18987a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gtg(gth gth, gtl gtl) {
        super(gtl);
        this.f18987a = gth;
    }

    /* renamed from: a */
    public final void mo12195a(Status status, AccountTransferMsg accountTransferMsg) {
        if (status.mo17710c()) {
            this.f18987a.mo12198a(accountTransferMsg);
        } else {
            this.f18987a.mo12197a(status);
        }
    }
}

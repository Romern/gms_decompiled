package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.service.orchestration.PurchaseManagerSubmitRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awvv extends awpe {

    /* renamed from: b */
    final /* synthetic */ bwka f95186b;

    /* renamed from: c */
    final /* synthetic */ PurchaseManagerSubmitRequest f95187c;

    /* renamed from: e */
    final /* synthetic */ awvy f95188e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awvv(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bwka bwka, PurchaseManagerSubmitRequest purchaseManagerSubmitRequest) {
        super(buyFlowConfig, account);
        this.f95188e = awvy;
        this.f95186b = bwka;
        this.f95187c = purchaseManagerSubmitRequest;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        awvy awvy = this.f95188e;
        String b = awvy.m81220b(this.f94799a);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 59);
        sb.append(b);
        sb.append("/payments/apis-secure/purchasemanager/submit?s7e_mode=proto");
        return awvy.mo52652a(sb.toString(), bjev, this.f95186b, this.f95187c.f110329c, 41);
    }
}

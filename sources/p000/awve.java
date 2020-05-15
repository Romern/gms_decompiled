package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.service.orchestration.BuyflowRefreshRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awve extends awpe {

    /* renamed from: b */
    final /* synthetic */ blyo f95140b;

    /* renamed from: c */
    final /* synthetic */ BuyflowRefreshRequest f95141c;

    /* renamed from: e */
    final /* synthetic */ awvy f95142e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awve(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, blyo blyo, BuyflowRefreshRequest buyflowRefreshRequest) {
        super(buyFlowConfig, account);
        this.f95142e = awvy;
        this.f95140b = blyo;
        this.f95141c = buyflowRefreshRequest;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        awvy awvy = this.f95142e;
        String b = awvy.m81220b(this.f94799a);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 59);
        sb.append(b);
        sb.append("/payments/apis-secure/buyflowservice/refresh?s7e_mode=proto");
        return awvy.mo52652a(sb.toString(), bjev, this.f95140b, this.f95141c.f110329c, 35);
    }
}

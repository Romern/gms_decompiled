package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.service.orchestration.BuyflowSubmitRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awut extends awpe {

    /* renamed from: b */
    final /* synthetic */ BuyflowSubmitRequest f95112b;

    /* renamed from: c */
    final /* synthetic */ awvy f95113c;

    /* renamed from: e */
    final /* synthetic */ bxvd f95114e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awut(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bxvd bxvd, BuyflowSubmitRequest buyflowSubmitRequest) {
        super(buyFlowConfig, account);
        this.f95113c = awvy;
        this.f95114e = bxvd;
        this.f95112b = buyflowSubmitRequest;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        awvy awvy = this.f95113c;
        String b = awvy.m81220b(this.f94799a);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 58);
        sb.append(b);
        sb.append("/payments/apis-secure/buyflowservice/submit?s7e_mode=proto");
        return awvy.mo52652a(sb.toString(), bjev, this.f95114e.mo74062i(), this.f95112b.f110329c, 34);
    }
}

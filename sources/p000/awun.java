package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.service.orchestration.PaymentMethodsSubmitRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awun extends awpe {

    /* renamed from: b */
    final /* synthetic */ bmsn f95096b;

    /* renamed from: c */
    final /* synthetic */ PaymentMethodsSubmitRequest f95097c;

    /* renamed from: e */
    final /* synthetic */ awvy f95098e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awun(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bmsn bmsn, PaymentMethodsSubmitRequest paymentMethodsSubmitRequest) {
        super(buyFlowConfig, account);
        this.f95098e = awvy;
        this.f95096b = bmsn;
        this.f95097c = paymentMethodsSubmitRequest;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        awvy awvy = this.f95098e;
        String b = awvy.m81220b(this.f94799a);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 65);
        sb.append(b);
        sb.append("/payments/apis-secure/paymentmethodsservice/submit?s7e_mode=proto");
        return awvy.mo52652a(sb.toString(), bjev, this.f95096b, this.f95097c.f110329c, 48);
    }
}

package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.service.orchestration.IdCreditSubmitRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awuk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awuk extends awpe {

    /* renamed from: b */
    final /* synthetic */ bmrq f95088b;

    /* renamed from: c */
    final /* synthetic */ IdCreditSubmitRequest f95089c;

    /* renamed from: e */
    final /* synthetic */ awvy f95090e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awuk(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bmrq bmrq, IdCreditSubmitRequest idCreditSubmitRequest) {
        super(buyFlowConfig, account);
        this.f95090e = awvy;
        this.f95088b = bmrq;
        this.f95089c = idCreditSubmitRequest;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        awvy awvy = this.f95090e;
        String b = awvy.m81220b(this.f94799a);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 61);
        sb.append(b);
        sb.append("/payments/apis-secure/identityandcredit/submit?s7e_mode=proto");
        return awvy.mo52652a(sb.toString(), bjev, this.f95088b, this.f95089c.f110329c, 45);
    }
}

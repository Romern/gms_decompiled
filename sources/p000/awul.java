package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.service.orchestration.IdCreditRefreshRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awul extends awpe {

    /* renamed from: b */
    final /* synthetic */ bmro f95091b;

    /* renamed from: c */
    final /* synthetic */ IdCreditRefreshRequest f95092c;

    /* renamed from: e */
    final /* synthetic */ awvy f95093e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awul(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bmro bmro, IdCreditRefreshRequest idCreditRefreshRequest) {
        super(buyFlowConfig, account);
        this.f95093e = awvy;
        this.f95091b = bmro;
        this.f95092c = idCreditRefreshRequest;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        awvy awvy = this.f95093e;
        String b = awvy.m81220b(this.f94799a);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 62);
        sb.append(b);
        sb.append("/payments/apis-secure/identityandcredit/refresh?s7e_mode=proto");
        return awvy.mo52652a(sb.toString(), bjev, this.f95091b, this.f95092c.f110329c, 46);
    }
}

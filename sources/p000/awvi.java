package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.service.orchestration.StatementsViewSubmitRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awvi extends awpe {

    /* renamed from: b */
    final /* synthetic */ bwkn f95150b;

    /* renamed from: c */
    final /* synthetic */ StatementsViewSubmitRequest f95151c;

    /* renamed from: e */
    final /* synthetic */ awvy f95152e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awvi(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bwkn bwkn, StatementsViewSubmitRequest statementsViewSubmitRequest) {
        super(buyFlowConfig, account);
        this.f95152e = awvy;
        this.f95150b = bwkn;
        this.f95151c = statementsViewSubmitRequest;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        awvy awvy = this.f95152e;
        String b = awvy.m81220b(this.f94799a);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 58);
        sb.append(b);
        sb.append("/payments/apis-secure/statementsview/submit?s7e_mode=proto");
        return awvy.mo52652a(sb.toString(), bjev, this.f95150b, this.f95151c.f110329c, 72);
    }
}

package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.service.orchestration.InvoiceSummarySubmitRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awvg extends awpe {

    /* renamed from: b */
    final /* synthetic */ bwjt f95145b;

    /* renamed from: c */
    final /* synthetic */ InvoiceSummarySubmitRequest f95146c;

    /* renamed from: e */
    final /* synthetic */ awvy f95147e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awvg(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bwjt bwjt, InvoiceSummarySubmitRequest invoiceSummarySubmitRequest) {
        super(buyFlowConfig, account);
        this.f95147e = awvy;
        this.f95145b = bwjt;
        this.f95146c = invoiceSummarySubmitRequest;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        awvy awvy = this.f95147e;
        String b = awvy.m81220b(this.f94799a);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 58);
        sb.append(b);
        sb.append("/payments/apis-secure/invoicesummary/submit?s7e_mode=proto");
        return awvy.mo52652a(sb.toString(), bjev, this.f95145b, this.f95146c.f110329c, 70);
    }
}

package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.intentoperation.p083ib.ReportFacilitatedTransactionChimeraIntentOperation;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awnc extends awpf {

    /* renamed from: a */
    final /* synthetic */ BuyFlowConfig f94659a;

    /* renamed from: b */
    final /* synthetic */ blwc f94660b;

    /* renamed from: c */
    final /* synthetic */ ReportFacilitatedTransactionChimeraIntentOperation f94661c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awnc(ReportFacilitatedTransactionChimeraIntentOperation reportFacilitatedTransactionChimeraIntentOperation, Account account, BuyFlowConfig buyFlowConfig, blwc blwc) {
        super(account);
        this.f94661c = reportFacilitatedTransactionChimeraIntentOperation;
        this.f94659a = buyFlowConfig;
        this.f94660b = blwc;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        return this.f94661c.f110273a.mo52125a(awyd.m81491c(this.f94659a.f110418b.f110406a).concat("/payments/apis/instantbuy/serving/facilitated-transaction"), bjev, this.f94660b.serializeToBytes(), 59);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo52307a() {
        return awyd.m81488a(this.f94659a.f110418b.f110406a);
    }
}

package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.intentoperation.p083ib.ReportErrorChimeraIntentOperation;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awnb extends awpf {

    /* renamed from: a */
    final /* synthetic */ BuyFlowConfig f94656a;

    /* renamed from: b */
    final /* synthetic */ blwa f94657b;

    /* renamed from: c */
    final /* synthetic */ ReportErrorChimeraIntentOperation f94658c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awnb(ReportErrorChimeraIntentOperation reportErrorChimeraIntentOperation, Account account, BuyFlowConfig buyFlowConfig, blwa blwa) {
        super(account);
        this.f94658c = reportErrorChimeraIntentOperation;
        this.f94656a = buyFlowConfig;
        this.f94657b = blwa;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        return this.f94658c.f110268a.mo52125a(awyd.m81491c(this.f94656a.f110418b.f110406a).concat("/payments/apis/instantbuy/serving/error-reporting"), bjev, this.f94657b.mo73642k(), 58);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo52307a() {
        return awyd.m81488a(this.f94656a.f110418b.f110406a);
    }
}

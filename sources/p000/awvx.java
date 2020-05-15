package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.service.orchestration.SetupWizardSubmitRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awvx extends awpe {

    /* renamed from: b */
    final /* synthetic */ bwgq f95191b;

    /* renamed from: c */
    final /* synthetic */ SetupWizardSubmitRequest f95192c;

    /* renamed from: e */
    final /* synthetic */ awvy f95193e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awvx(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bwgq bwgq, SetupWizardSubmitRequest setupWizardSubmitRequest) {
        super(buyFlowConfig, account);
        this.f95193e = awvy;
        this.f95191b = bwgq;
        this.f95192c = setupWizardSubmitRequest;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        awvy awvy = this.f95193e;
        String b = awvy.m81220b(this.f94799a);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 69);
        sb.append(b);
        sb.append("/payments/apis-secure/androidsetupwizardservice/submit?s7e_mode=proto");
        return awvy.mo52652a(sb.toString(), bjev, this.f95191b, this.f95192c.f110329c, 43);
    }
}

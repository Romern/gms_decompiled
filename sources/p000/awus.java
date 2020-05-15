package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.service.orchestration.AddInstrumentSubmitRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awus extends awpe {

    /* renamed from: b */
    final /* synthetic */ blxq f95109b;

    /* renamed from: c */
    final /* synthetic */ AddInstrumentSubmitRequest f95110c;

    /* renamed from: e */
    final /* synthetic */ awvy f95111e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awus(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, blxq blxq, AddInstrumentSubmitRequest addInstrumentSubmitRequest) {
        super(buyFlowConfig, account);
        this.f95111e = awvy;
        this.f95109b = blxq;
        this.f95110c = addInstrumentSubmitRequest;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        awvy awvy = this.f95111e;
        String b = awvy.m81220b(this.f94799a);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 64);
        sb.append(b);
        sb.append("/payments/apis-secure/addinstrumentservice/submit?s7e_mode=proto");
        return awvy.mo52652a(sb.toString(), bjev, this.f95109b, this.f95110c.f110329c, 55);
    }
}

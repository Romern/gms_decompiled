package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.service.orchestration.InstrumentManagerSubmitRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awvp extends awpe {

    /* renamed from: b */
    final /* synthetic */ bmsb f95168b;

    /* renamed from: c */
    final /* synthetic */ InstrumentManagerSubmitRequest f95169c;

    /* renamed from: e */
    final /* synthetic */ awvy f95170e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awvp(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bmsb bmsb, InstrumentManagerSubmitRequest instrumentManagerSubmitRequest) {
        super(buyFlowConfig, account);
        this.f95170e = awvy;
        this.f95168b = bmsb;
        this.f95169c = instrumentManagerSubmitRequest;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        awvy awvy = this.f95170e;
        String b = awvy.m81220b(this.f94799a);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 63);
        sb.append(b);
        sb.append("/payments/apis-secure/InstrumentManager/SavePage?s7e_mode=proto");
        return awvy.mo52652a(sb.toString(), bjev, this.f95168b, this.f95169c.f110329c, 36);
    }
}

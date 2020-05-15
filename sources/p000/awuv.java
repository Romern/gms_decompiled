package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.service.orchestration.FixInstrumentSubmitRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awuv extends awpe {

    /* renamed from: b */
    final /* synthetic */ bwjo f95117b;

    /* renamed from: c */
    final /* synthetic */ FixInstrumentSubmitRequest f95118c;

    /* renamed from: e */
    final /* synthetic */ awvy f95119e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awuv(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bwjo bwjo, FixInstrumentSubmitRequest fixInstrumentSubmitRequest) {
        super(buyFlowConfig, account);
        this.f95119e = awvy;
        this.f95117b = bwjo;
        this.f95118c = fixInstrumentSubmitRequest;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        awvy awvy = this.f95119e;
        String b = awvy.m81220b(this.f94799a);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 64);
        sb.append(b);
        sb.append("/payments/apis-secure/fixinstrumentservice/submit?s7e_mode=proto");
        return awvy.mo52652a(sb.toString(), bjev, this.f95117b, this.f95118c.f110329c, 57);
    }
}

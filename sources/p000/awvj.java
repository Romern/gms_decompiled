package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awvj extends awpe {

    /* renamed from: b */
    final /* synthetic */ bmru f95153b;

    /* renamed from: c */
    final /* synthetic */ awvy f95154c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awvj(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bmru bmru) {
        super(buyFlowConfig, account);
        this.f95154c = awvy;
        this.f95153b = bmru;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        return this.f95154c.mo52651a(String.valueOf(awvy.m81220b(this.f94799a)).concat("/payments/apis-secure/InstrumentManager/Initialize"), bjev, this.f95153b, 68);
    }
}

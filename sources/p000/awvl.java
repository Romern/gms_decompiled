package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awvl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awvl extends awpe {

    /* renamed from: b */
    final /* synthetic */ bwkw f95157b;

    /* renamed from: c */
    final /* synthetic */ awvy f95158c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awvl(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bwkw bwkw) {
        super(buyFlowConfig, account);
        this.f95158c = awvy;
        this.f95157b = bwkw;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        return this.f95158c.mo52651a(String.valueOf(awvy.m81220b(this.f94799a)).concat("/payments/apis-secure/upstreamservice/initialize"), bjev, this.f95157b, 74);
    }
}

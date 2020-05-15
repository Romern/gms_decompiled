package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awuw extends awpe {

    /* renamed from: b */
    final /* synthetic */ bwiy f95120b;

    /* renamed from: c */
    final /* synthetic */ awvy f95121c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awuw(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bwiy bwiy) {
        super(buyFlowConfig, account);
        this.f95121c = awvy;
        this.f95120b = bwiy;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        return this.f95121c.mo52651a(String.valueOf(awvy.m81220b(this.f94799a)).concat("/payments/apis-secure/embeddedlandingpageservice/initialize"), bjev, this.f95120b, 60);
    }
}

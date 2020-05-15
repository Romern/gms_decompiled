package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awuy extends awpe {

    /* renamed from: b */
    final /* synthetic */ bwkp f95125b;

    /* renamed from: c */
    final /* synthetic */ awvy f95126c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awuy(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bwkp bwkp) {
        super(buyFlowConfig, account);
        this.f95126c = awvy;
        this.f95125b = bwkp;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        return this.f95126c.mo52651a(String.valueOf(awvy.m81220b(this.f94799a)).concat("/payments/apis-secure/timelineview/initialize"), bjev, this.f95125b, 62);
    }
}

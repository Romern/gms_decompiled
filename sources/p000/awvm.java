package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awvm extends awpe {

    /* renamed from: b */
    final /* synthetic */ bwlj f95159b;

    /* renamed from: c */
    final /* synthetic */ awvy f95160c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awvm(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bwlj bwlj) {
        super(buyFlowConfig, account);
        this.f95160c = awvy;
        this.f95159b = bwlj;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        return this.f95160c.mo52651a(String.valueOf(awvy.m81220b(this.f94799a)).concat("/payments/apis-secure/webviewservice/initialize"), bjev, this.f95159b, 73);
    }
}

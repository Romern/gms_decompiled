package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awum extends awpe {

    /* renamed from: b */
    final /* synthetic */ bmsi f95094b;

    /* renamed from: c */
    final /* synthetic */ awvy f95095c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awum(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bmsi bmsi) {
        super(buyFlowConfig, account);
        this.f95095c = awvy;
        this.f95094b = bmsi;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        return this.f95095c.mo52651a(String.valueOf(awvy.m81220b(this.f94799a)).concat("/payments/apis-secure/paymentmethodsservice/initialize"), bjev, this.f95094b, 47);
    }
}

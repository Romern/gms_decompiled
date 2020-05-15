package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awur extends awpe {

    /* renamed from: b */
    final /* synthetic */ blxm f95107b;

    /* renamed from: c */
    final /* synthetic */ awvy f95108c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awur(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, blxm blxm) {
        super(buyFlowConfig, account);
        this.f95108c = awvy;
        this.f95107b = blxm;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        return this.f95108c.mo52651a(String.valueOf(awvy.m81220b(this.f94799a)).concat("/payments/apis-secure/addinstrumentservice/initialize"), bjev, this.f95107b, 54);
    }
}

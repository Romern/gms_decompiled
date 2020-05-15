package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awup extends awpe {

    /* renamed from: b */
    final /* synthetic */ bmrh f95102b;

    /* renamed from: c */
    final /* synthetic */ awvy f95103c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awup(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bmrh bmrh) {
        super(buyFlowConfig, account);
        this.f95103c = awvy;
        this.f95102b = bmrh;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        return this.f95103c.mo52651a(String.valueOf(awvy.m81220b(this.f94799a)).concat("/payments/apis-secure/genericselector/submit"), bjev, this.f95102b, 77);
    }
}

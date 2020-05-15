package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awvw extends awpe {

    /* renamed from: b */
    final /* synthetic */ bwgk f95189b;

    /* renamed from: c */
    final /* synthetic */ awvy f95190c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awvw(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bwgk bwgk) {
        super(buyFlowConfig, account);
        this.f95190c = awvy;
        this.f95189b = bwgk;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        return this.f95190c.mo52651a(String.valueOf(awvy.m81220b(this.f94799a)).concat("/payments/apis-secure/androidsetupwizardservice/initialize"), bjev, this.f95189b, 42);
    }
}

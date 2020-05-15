package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awuu extends awpe {

    /* renamed from: b */
    final /* synthetic */ bwjk f95115b;

    /* renamed from: c */
    final /* synthetic */ awvy f95116c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awuu(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bwjk bwjk) {
        super(buyFlowConfig, account);
        this.f95116c = awvy;
        this.f95115b = bwjk;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        return this.f95116c.mo52651a(String.valueOf(awvy.m81220b(this.f94799a)).concat("/payments/apis-secure/fixinstrumentservice/initialize"), bjev, this.f95115b, 56);
    }
}

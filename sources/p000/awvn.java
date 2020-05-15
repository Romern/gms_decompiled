package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awvn extends awpe {

    /* renamed from: b */
    final /* synthetic */ awvy f95161b;

    /* renamed from: c */
    final /* synthetic */ bxvd f95162c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awvn(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bxvd bxvd) {
        super(buyFlowConfig, account);
        this.f95161b = awvy;
        this.f95162c = bxvd;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        return this.f95161b.mo52651a(String.valueOf(awvy.m81220b(this.f94799a)).concat("/payments/apis-secure/readytopayservice/getinstrumentavailability"), bjev, this.f95162c.mo74062i(), 76);
    }
}

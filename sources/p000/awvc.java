package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awvc extends awpe {

    /* renamed from: b */
    final /* synthetic */ bwld f95135b;

    /* renamed from: c */
    final /* synthetic */ awvy f95136c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awvc(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bwld bwld) {
        super(buyFlowConfig, account);
        this.f95136c = awvy;
        this.f95135b = bwld;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        return this.f95136c.mo52651a(String.valueOf(awvy.m81220b(this.f94799a)).concat("/payments/apis-secure/usermanagementservice/initialize"), bjev, this.f95135b, 66);
    }
}

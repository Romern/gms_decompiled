package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awvh extends awpe {

    /* renamed from: b */
    final /* synthetic */ bwkl f95148b;

    /* renamed from: c */
    final /* synthetic */ awvy f95149c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awvh(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bwkl bwkl) {
        super(buyFlowConfig, account);
        this.f95149c = awvy;
        this.f95148b = bwkl;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        return this.f95149c.mo52651a(String.valueOf(awvy.m81220b(this.f94799a)).concat("/payments/apis-secure/statementsview/initialize"), bjev, this.f95148b, 71);
    }
}

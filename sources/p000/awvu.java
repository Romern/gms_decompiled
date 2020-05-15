package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awvu extends awpe {

    /* renamed from: b */
    final /* synthetic */ bwjw f95184b;

    /* renamed from: c */
    final /* synthetic */ awvy f95185c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awvu(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bwjw bwjw) {
        super(buyFlowConfig, account);
        this.f95185c = awvy;
        this.f95184b = bwjw;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        return this.f95185c.mo52651a(String.valueOf(awvy.m81220b(this.f94799a)).concat("/payments/apis-secure/purchasemanager/initialize"), bjev, this.f95184b, 51);
    }
}

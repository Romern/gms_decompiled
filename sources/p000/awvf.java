package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awvf extends awpe {

    /* renamed from: b */
    final /* synthetic */ bwjq f95143b;

    /* renamed from: c */
    final /* synthetic */ awvy f95144c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awvf(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bwjq bwjq) {
        super(buyFlowConfig, account);
        this.f95144c = awvy;
        this.f95143b = bwjq;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        return this.f95144c.mo52651a(String.valueOf(awvy.m81220b(this.f94799a)).concat("/payments/apis-secure/invoicesummary/initialize"), bjev, this.f95143b, 69);
    }
}

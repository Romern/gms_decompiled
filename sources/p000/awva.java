package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awva extends awpe {

    /* renamed from: b */
    final /* synthetic */ bwje f95130b;

    /* renamed from: c */
    final /* synthetic */ awvy f95131c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awva(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bwje bwje) {
        super(buyFlowConfig, account);
        this.f95131c = awvy;
        this.f95130b = bwje;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        return this.f95131c.mo52651a(String.valueOf(awvy.m81220b(this.f94799a)).concat("/payments/apis-secure/embeddedsettingsservice/initialize"), bjev, this.f95130b, 64);
    }
}

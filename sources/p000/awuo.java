package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.service.orchestration.GenericSelectorInitializeRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awuo extends awpe {

    /* renamed from: b */
    final /* synthetic */ bmrb f95099b;

    /* renamed from: c */
    final /* synthetic */ GenericSelectorInitializeRequest f95100c;

    /* renamed from: e */
    final /* synthetic */ awvy f95101e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awuo(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bmrb bmrb, GenericSelectorInitializeRequest genericSelectorInitializeRequest) {
        super(buyFlowConfig, account);
        this.f95101e = awvy;
        this.f95099b = bmrb;
        this.f95100c = genericSelectorInitializeRequest;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        return this.f95101e.mo52652a(String.valueOf(awvy.m81220b(this.f94799a)).concat("/payments/apis-secure/genericselector/initialize"), bjev, this.f95099b, this.f95100c.f110329c, 52);
    }
}

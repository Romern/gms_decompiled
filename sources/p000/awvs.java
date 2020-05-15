package p000;

import android.accounts.Account;
import com.google.android.gms.wallet.service.orchestration.InstrumentManagerRefreshRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.shared.service.ServerResponse;

/* renamed from: awvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awvs extends awpe {

    /* renamed from: b */
    final /* synthetic */ bmrz f95179b;

    /* renamed from: c */
    final /* synthetic */ InstrumentManagerRefreshRequest f95180c;

    /* renamed from: e */
    final /* synthetic */ awvy f95181e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awvs(awvy awvy, BuyFlowConfig buyFlowConfig, Account account, bmrz bmrz, InstrumentManagerRefreshRequest instrumentManagerRefreshRequest) {
        super(buyFlowConfig, account);
        this.f95181e = awvy;
        this.f95179b = bmrz;
        this.f95180c = instrumentManagerRefreshRequest;
    }

    /* renamed from: a */
    public final ServerResponse mo52306a(bjev bjev) {
        awvy awvy = this.f95181e;
        String b = awvy.m81220b(this.f94799a);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 66);
        sb.append(b);
        sb.append("/payments/apis-secure/InstrumentManager/RefreshPage?s7e_mode=proto");
        return awvy.mo52652a(sb.toString(), bjev, this.f95179b, this.f95180c.f110329c, 37);
    }
}
